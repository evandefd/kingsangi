package exchangecalculator.api;

import okhttp3.OkHttpClient;
import org.joda.time.DateTime;
import retrofit2.Retrofit;

/**
 * The {@code ExchangeAPIClient} class is an API Client that offer to exchange rate.
 * <p>Note that this class is based on Retrofit2.</p>
 *
 * @see Retrofit
 * @see ExchangeFactory
 */
public class ExchangeAPIClient {
    private static Retrofit retrofit = null;

    private static Retrofit getClient() {
        OkHttpClient client = new OkHttpClient.Builder().build();

        if (retrofit == null)
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.exchangeratesapi.io/")
                    .addConverterFactory(new CurrencyConvertFactory())
                    .client(client)
                    .build();

        return retrofit;
    }

    /**
     * Get @{code ExchangeFactory} instance that is used to get proper {@code Exchange} object.
     *
     * @return {@code ExchangeFactory} instance
     */
    public static ExchangeFactory getExchangeFactory() {
        return getClient().create(ExchangeFactory.class);
    }
}

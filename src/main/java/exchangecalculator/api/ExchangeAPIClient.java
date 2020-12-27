package exchangecalculator.api;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public class ExchangeAPIClient {
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        OkHttpClient client = new OkHttpClient.Builder().build();

        if (retrofit == null)
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.exchangeratesapi.io/")
                    .addConverterFactory(new CurrencyConvertFactory())
                    .client(client)
                    .build();

        return retrofit;
    }

    public static ExchangeFactory getExchangeFactory() {
        return getClient().create(ExchangeFactory.class);
    }
}

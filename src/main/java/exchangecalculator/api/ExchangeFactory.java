package exchangecalculator.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * The {@code ExchangeFactory} interface is used to get proper {@code Exchange} object.
 *
 * <p>Based on Retrofit2</p>
 *
 * @see Exchange
 */
public interface ExchangeFactory {
    @GET("/latest")
    Call<Exchange> getLatestExchange();

    @GET("/base={baseCurrency}")
    Call<Exchange> getLatestExchangeWithBaseCurrency(
            @Path("baseCurrency") String baseCurrency
    );
}

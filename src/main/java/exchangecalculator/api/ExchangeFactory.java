package exchangecalculator.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * The {@code ExchangeFactory} interface is used to get proper {@code Exchange} object.
 *
 * <p>Based on Retrofit2</p>
 *
 * @see Exchange
 */
public interface ExchangeFactory {

    /**
     * Get latest(today) EUR based {@code Exchange} object.
     *
     * @return latest(today) EUR based {@code Exchange} object
     */
    @GET("/latest")
    Call<Exchange> getLatestExchange();

    /**
     * Get latest(today) custom BaseCurrency based {@code Exchange} object.
     *
     * @param baseCurrency custom baseCurrency. You must set the value in Currency enumeration.
     * @return latest(today) custom BaseCurrency based {@code Exchange} object
     * @see exchangecalculator.Currency
     */
    @GET("/latest")
    Call<Exchange> getLatestExchange(
            @Query("base") String baseCurrency
    );

    @GET("/{date}")
    Call<Exchange> getSpecificDateExchange(@Path("date") String date);

    @GET("/{date}")
    Call<Exchange> getSpecificDateExchange(@Path("date") String date, @Query("base") String baseCurrency);
}

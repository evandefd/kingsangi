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
     * @param baseCurrency custom baseCurrency. We strongly recommend set the value from Currency enumeration.
     * @return latest(today) custom BaseCurrency based {@code Exchange} object
     * @see exchangecalculator.Currency
     */
    @GET("/latest")
    Call<Exchange> getLatestExchange(@Query("base") String baseCurrency);

    /**
     * Get specific date EUR based {@code Exchange} objects.
     * @param date String date expression. That must be yyyy-MM-dd format.
     * @return specific date EUR based {@code Exchange} objects
     */
    @GET("/{date}")
    Call<Exchange> getSpecificDateExchange(@Path("date") String date);

    /**
     * Get specific date custom base currency based {@code Exchange} objects.
     * @param date String date expression. That must be yyyy-MM-dd format.
     * @param baseCurrency custom baseCurrency. We strongly recommend set the value from Currency enumeration.
     * @return specific date custom base currency based {@code Exchange} objects.
     */
    @GET("/{date}")
    Call<Exchange> getSpecificDateExchange(@Path("date") String date, @Query("base") String baseCurrency);
}

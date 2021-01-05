package exchangecalculator.api;

import exchangecalculator.Currency;
import org.joda.time.DateTime;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ExchangeFactory {

    private static ExchangeListener exchangeListener;

    private static Callback<Exchange> callback = new Callback<>() {
        @Override
        public void onResponse(Call<Exchange> call, Response<Exchange> response) {
            if (response.isSuccessful()) {
                exchangeListener.onSuccess(response.body());
            } else {
                exchangeListener.onFailure(new Exception());
            }
        }

        @Override
        public void onFailure(Call<Exchange> call, Throwable t) {
            exchangeListener.onFailure(t);
        }
    };

    /**
     * Get latest(today) EUR based {@code Exchange} object.
     *
     * @param exchangeListener an ExchangeListener interface.
     * @see ExchangeListener
     */
    public static void getLatestExchange(ExchangeListener exchangeListener) {
        ExchangeFactory.exchangeListener = exchangeListener;
        ExchangeAPIClient.getAPIExchangeFactory().getLatestExchange().enqueue(callback);
    }

    /**
     * Get latest(today) custom BaseCurrency based {@code Exchange} object.
     *
     * @param baseCurrency Currency enum
     * @param exchangeListener an ExchangeListener interface.
     * @see ExchangeListener
     * @see exchangecalculator.Currency
     */
    public static void getLatestExchange(Currency baseCurrency, ExchangeListener exchangeListener) {
        ExchangeFactory.exchangeListener = exchangeListener;
        ExchangeAPIClient.getAPIExchangeFactory().getLatestExchange(baseCurrency.name()).enqueue(callback);
    }

    /**
     * Get specific date EUR based {@code Exchange} objects.
     * @param date Joda-Time Date instance
     * @param exchangeListener an ExchangeListener interface.
     * @see ExchangeListener
     */
    public static void getSpecificDateExchange(DateTime date, ExchangeListener exchangeListener) {
        ExchangeFactory.exchangeListener = exchangeListener;
        ExchangeAPIClient.getAPIExchangeFactory().getSpecificDateExchange(ExchangeUtil.dateTimeToString(date)).enqueue(callback);
    }

    /**
     * Get specific date custom base currency based {@code Exchange} objects.
     * @param date Joda-Time Date instance
     * @param baseCurrency Currency enum
     * @param exchangeListener an ExchangeListener interface.
     * @see ExchangeListener
     */
    public static void getSpecificDateExchange(DateTime date, Currency baseCurrency, ExchangeListener exchangeListener) {
        ExchangeFactory.exchangeListener = exchangeListener;
        ExchangeAPIClient.getAPIExchangeFactory().getSpecificDateExchange(ExchangeUtil.dateTimeToString(date), baseCurrency.name()).enqueue(callback);
    }
}

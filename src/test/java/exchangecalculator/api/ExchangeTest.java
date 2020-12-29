package exchangecalculator.api;

import exchangecalculator.Currency;
import junit.framework.AssertionFailedError;
import org.joda.time.DateTime;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static org.junit.Assert.assertEquals;

public class ExchangeTest {

    @Test
    public void testGetBaseCurrency() {
        ExchangeAPIClient.getExchangeFactory().getSpecificDateExchange("2010-01-12", Currency.USD.name())
                .enqueue(new Callback<>() {
                    @Override
                    public void onResponse(Call<Exchange> call, Response<Exchange> response) {
                        Exchange exchange = response.body();

                        if (exchange == null)
                            throw new AssertionFailedError("Exchange is null.");

                        assertEquals(Currency.USD, exchange.getBaseCurrency());
                    }

                    @Override
                    public void onFailure(Call<Exchange> call, Throwable t) {
                        throw new AssertionFailedError("Could not get exchange rate from API server.");
                    }
                });
    }

    @Test
    public void testGetExchangeRate() {
        ExchangeAPIClient.getExchangeFactory().getSpecificDateExchange("2010-01-12", Currency.USD.name())
                .enqueue(new Callback<>() {
                    @Override
                    public void onResponse(Call<Exchange> call, Response<Exchange> response) {
                        Exchange exchange = response.body();

                        if (exchange == null)
                            throw new AssertionFailedError("Exchange is null.");

                        assertEquals(1123.8174159243, exchange.getExchangeRate(Currency.KRW), 0.0000000001);
                    }

                    @Override
                    public void onFailure(Call<Exchange> call, Throwable t) {
                        throw new AssertionFailedError("Could not get exchange rate from API server.");
                    }
                });
    }

    @Test
    public void testConvertWithExchangeRate() {
        ExchangeAPIClient.getExchangeFactory().getSpecificDateExchange("2010-01-12", Currency.USD.name())
                .enqueue(new Callback<>() {
                    @Override
                    public void onResponse(Call<Exchange> call, Response<Exchange> response) {
                        Exchange exchange = response.body();

                        if (exchange == null)
                            throw new AssertionFailedError("Exchange is null.");

                        assertEquals(11238174159243.0, exchange.convertWithExchangeRate(10000000000.0, Currency.KRW), 0.1);
                    }

                    @Override
                    public void onFailure(Call<Exchange> call, Throwable t) {
                        throw new AssertionFailedError("Could not get exchange rate from API server.");
                    }
                });
    }

    @Test
    public void testGetDateTime() {
        ExchangeAPIClient.getExchangeFactory().getSpecificDateExchange("2010-01-12", Currency.USD.name())
                .enqueue(new Callback<>() {
                    @Override
                    public void onResponse(Call<Exchange> call, Response<Exchange> response) {
                        Exchange exchange = response.body();

                        if (exchange == null)
                            throw new AssertionFailedError("Exchange is null.");

                        assertEquals(
                                new DateTime(2010, 1, 12, 0, 0),
                                exchange.getDateTime());
                    }

                    @Override
                    public void onFailure(Call<Exchange> call, Throwable t) {
                        throw new AssertionFailedError("Could not get exchange rate from API server.");
                    }
                });
    }
}
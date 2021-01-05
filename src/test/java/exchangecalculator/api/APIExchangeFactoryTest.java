package exchangecalculator.api;

import exchangecalculator.Currency;
import org.junit.Assert;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class APIExchangeFactoryTest {
    private static final double[] ratesUSD100112 = new double[]{
            1.0330087701, 7.7550583523, 0.4898142393, 45.6501622816, 5.1381120088, 185.1943926524, 18.1327256405, 0.6195704717, 2.859263863, 7.0585594917, 9171.4246253712, 45.7219805262, 1.7477384159, 29.485118431, 2.3843657206, 10.8049167875, 91.437055452, 33.0357019543, 1.0180926732, 0.6905600442, 3.343967958, 1.3505973344, 1.4559767972, 6.8270837649, 5.6505075616, 1.3516331745, 7.4762792625, 1.0, 12.7750155376, 1.390304537, 1.0819694772, 1123.8174159243, 2.8201091085, 5.0240314895
    };
    private static final Currency[] currencies = new Currency[]{
            Currency.CAD, Currency.HKD, Currency.ISK, Currency.PHP, Currency.DKK, Currency.HUF, Currency.CZK, Currency.AUD, Currency.RON, Currency.SEK, Currency.IDR, Currency.INR, Currency.BRL, Currency.RUB, Currency.HRK, Currency.JPY, Currency.THB, Currency.CHF, Currency.SGD, Currency.PLN, Currency.BGN, Currency.TRY, Currency.CNY, Currency.NOK, Currency.NZD, Currency.ZAR, Currency.USD, Currency.MXN, Currency.ILS, Currency.GBP, Currency.KRW, Currency.MYR, Currency.EUR
    };

    @Test
    public void testGettingUSDExchange() {
        APIExchangeFactory APIExchangeFactory = ExchangeAPIClient.getAPIExchangeFactory();
        APIExchangeFactory.getSpecificDateExchange(ExchangeUtil.generateSimpleFormattedStringDate(2010, 1, 12), Currency.USD.name()).enqueue(new Callback<>() {
            @Override
            public void onResponse(Call<Exchange> call, Response<Exchange> response) {
                Exchange exchange = response.body();
                for(int i = 0; i < currencies.length; i++) {
                    Assert.assertEquals(ratesUSD100112[i], exchange.getExchangeRate(currencies[i]), 0.0000000001);
                }
            }

            @Override
            public void onFailure(Call<Exchange> call, Throwable t) {
                throw new AssertionError();
            }
        });
    }
}
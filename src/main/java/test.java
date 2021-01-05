import exchangecalculator.Currency;
import exchangecalculator.api.Exchange;
import exchangecalculator.api.ExchangeFactory;
import exchangecalculator.api.ExchangeListener;

public class test {
    public static void main(String[] args) {
        ExchangeFactory.getLatestExchange(Currency.USD, new ExchangeListener() {
            @Override
            public void onSuccess(Exchange exchange) {
                System.out.println(exchange.getExchangeRate(Currency.KRW));
            }

            @Override
            public void onFailure(Throwable throwable) {
                throwable.printStackTrace();
            }
        });
    }
}

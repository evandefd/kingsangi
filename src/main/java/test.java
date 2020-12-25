import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        System.out.println(ExchangeRate.get(Currency.USD).convertWithExchangeRate(10, Currency.KRW));
    }
}

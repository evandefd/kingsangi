package exchangecalculator;

import exchangecalculator.exception.NetworkException;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class ExchangeRate {

    private final Currency baseCurrency;
    private final Map<Currency, Double> exchangeRateMap;

    private ExchangeRate(Currency baseCurrency, Map<Currency, Double> exchangeRateMap) throws IOException {
        this.baseCurrency = baseCurrency;
        this.exchangeRateMap = exchangeRateMap;
    }

    public Currency getBaseCurrency() {
        return baseCurrency;
    }

    public double getExchangeRate(Currency targetCurrency) {
        return exchangeRateMap.get(targetCurrency);
    }

    public double convertWithExchangeRate(double value, Currency targetCurrency) {
        return value * getExchangeRate(targetCurrency);
    }

    public static ExchangeRate get(Currency baseCurrency) throws IOException, NetworkException {
        URL url = new URL("https://api.exchangeratesapi.io/latest?base=" + baseCurrency.getCurrencyName());

        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();

        if (connection.getResponseCode() == 200) {
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream())
            );
            StringBuilder stringBuilder = new StringBuilder();
            String line = "";
            while((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }

            String[] rates = stringBuilder.toString().split("\\{")[2].split("}")[0].split(",");
            Map<Currency, Double> exchangeRateMap = new HashMap<>();
            for(String rate : rates) {
                String[] rateSplit = rate.split(":");
                exchangeRateMap.put(Currency.valueOf(rateSplit[0].replaceAll("\"", "")), Double.parseDouble(rateSplit[1]));
            }

            return new ExchangeRate(baseCurrency, exchangeRateMap);
        } else {
            throw new NetworkException("Can't get data from server: " + connection.getResponseCode());
        }
    }
}

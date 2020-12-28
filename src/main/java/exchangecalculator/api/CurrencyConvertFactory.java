package exchangecalculator.api;

import exchangecalculator.Currency;
import okhttp3.ResponseBody;
import org.joda.time.DateTime;
import retrofit2.Converter;
import retrofit2.Retrofit;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

class CurrencyConvertFactory extends Converter.Factory {
    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        return JsonConverter.instance;
    }

    final static class JsonConverter implements Converter<ResponseBody, Exchange> {
        final static JsonConverter instance = new JsonConverter();

        @Override
        public Exchange convert(ResponseBody value) throws IOException {
            String[] strings = value.string().split("\\{")[2].split("}");
            String[] rates = strings[0].split(",");
            Map<Currency, Double> exchangeRateMap = new HashMap<>();

            for (String rate : rates) {
                String[] rateSplit = rate.split(":");
                exchangeRateMap.put(Currency.valueOf(rateSplit[0].replaceAll("\"", "")), Double.parseDouble(rateSplit[1]));
            }

            Currency baseCurrency =
                    Currency.valueOf(
                            strings[1].split(",")[1].split(":")[1].replaceAll("\"", ""));
            String dateStr = strings[1].split(",")[2].split(":")[1].replaceAll("\"", "");

            DateTime dateTime = ExchangeUtil.stringToDateTime(dateStr);

            fillMap(exchangeRateMap, baseCurrency);

            return new Exchange(dateTime, baseCurrency, exchangeRateMap);
        }

        /**
         * If the map is not contains all declared Currencies. put the exchange rate value 1.0 if currency is same as base currency else -1.0.
         *
         * @param exchangeRateMap Exchange rate map
         * @param baseCurrency    Base currency
         */
        private void fillMap(Map<Currency, Double> exchangeRateMap, Currency baseCurrency) {
            for (Currency currency : Currency.values()) {
                if (!exchangeRateMap.containsKey(currency)) {
                    if (currency == baseCurrency) exchangeRateMap.put(currency, 1.0);
                    else exchangeRateMap.put(currency, -1.0);
                }

            }
        }
    }
}

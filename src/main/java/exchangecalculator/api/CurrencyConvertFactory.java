package exchangecalculator.api;

import exchangecalculator.Currency;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class CurrencyConvertFactory extends Converter.Factory {
    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        return JsonConverter.instance;
    }

    final static class JsonConverter implements Converter<ResponseBody, Exchange> {

        final static JsonConverter instance = new JsonConverter();

        @Override
        public Exchange convert(ResponseBody value) throws IOException {
            String bodyString = value.string();
            String[] rates = bodyString.split("\\{")[2].split("}")[0].split(",");
            Map<Currency, Double> exchangeRateMap = new HashMap<>();
            for (String rate : rates) {
                String[] rateSplit = rate.split(":");
                exchangeRateMap.put(Currency.valueOf(rateSplit[0].replaceAll("\"", "")), Double.parseDouble(rateSplit[1]));
            }

            Currency baseCurrency =
                    Currency.valueOf(
                            bodyString.split("\\{")[2].split("}")[1].split(",")[1].split(":")[1].replaceAll("\"", ""));

            return new Exchange(baseCurrency, exchangeRateMap);
        }
    }

}

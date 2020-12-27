package exchangecalculator;

import exchangecalculator.api.Exchange;
import exchangecalculator.api.ExchangeAPIClient;
import exchangecalculator.api.ExchangeFactory;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class test {
    public static void main(String[] args) {
        ExchangeFactory exchangeFactory = ExchangeAPIClient.getExchangeFactory();
        Call<Exchange> exchangeCall = exchangeFactory.getLatestExchange(Currency.USD.name());
        exchangeCall.enqueue(new Callback<>() {
            @Override
            public void onResponse(Call<Exchange> call, Response<Exchange> response) {
                System.out.println(response.body().getExchangeRate(Currency.KRW));
            }

            @Override
            public void onFailure(Call<Exchange> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}

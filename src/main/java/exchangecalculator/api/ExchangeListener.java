package exchangecalculator.api;

public interface ExchangeListener {
    void onSuccess(Exchange exchange);
    void onFailure(Throwable throwable);
}

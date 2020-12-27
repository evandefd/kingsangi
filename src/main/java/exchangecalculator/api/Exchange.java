package exchangecalculator.api;

import exchangecalculator.Currency;

import java.io.IOException;
import java.util.Map;

/**
 * The {@code Exchange} class is the exchange rate for base currency.
 * <p>You can only access from ExchangeFactory</p>
 * <p>e.g)If base currency is USD, target currency is KRW, it works like 1 USD to 1100 KRW
 * If you want to change base currency, you must get other base currency {@code Exchange} object from ExchangeFactory.</p>
 *
 * @see ExchangeFactory
 */
public class Exchange {
    private final Currency baseCurrency;
    private final Map<Currency, Double> exchangeRateMap;

    Exchange(Currency baseCurrency, Map<Currency, Double> exchangeRateMap) throws IOException {
        this.baseCurrency = baseCurrency;
        this.exchangeRateMap = exchangeRateMap;
    }

    /**
     * Get current base currency.
     *
     * @return Current base currency
     */
    public Currency getBaseCurrency() {
        return baseCurrency;
    }

    /**
     * Get exchange rate for base currency.
     *
     * @param targetCurrency Target currency
     * @return Target currency exchange rate for base currency
     */
    public double getExchangeRate(Currency targetCurrency) {
        return exchangeRateMap.get(targetCurrency);
    }

    /**
     * Convert currency value directly to target currency.
     *
     * @param value          Currency value(e.g. '10' USD)
     * @param targetCurrency Target currency
     * @return Converted currency value
     */
    public double convertWithExchangeRate(double value, Currency targetCurrency) {
        return value * getExchangeRate(targetCurrency);
    }
}

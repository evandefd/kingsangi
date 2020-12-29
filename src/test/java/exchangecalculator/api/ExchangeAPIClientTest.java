package exchangecalculator.api;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExchangeAPIClientTest {
    @Test
    public void testGetExchangeFactory() {
        assertNotEquals(ExchangeAPIClient.getExchangeFactory(), null);
    }
}
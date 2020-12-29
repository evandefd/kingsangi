package exchangecalculator.api;

import org.joda.time.DateTime;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExchangeUtilTest {

    @Test
    public void testStringToDateTime() {
        DateTime dateTime201225 = new DateTime(2020, 12, 25, 0, 0);
        assertEquals(dateTime201225, ExchangeUtil.stringToDateTime("2020-12-25"));
    }

    @Test
    public void testDateTimeToString() {
        DateTime dateTime201225 = new DateTime(2020, 12, 25, 0, 0);
        assertEquals("2020-12-25", ExchangeUtil.dateTimeToString(dateTime201225));
    }

    @Test
    public void testGenerateSimpleDateTime() {
        DateTime dateTime201225 = new DateTime(2020, 12, 25, 0, 0);
        assertEquals(dateTime201225, ExchangeUtil.generateSimpleDateTime(2020, 12, 25));
    }

    @Test
    public void testGenerateSimpleFormattedStringDate() {
        String stringDate201225 = "2020-12-25";
        assertEquals(stringDate201225, ExchangeUtil.generateSimpleFormattedStringDate(2020, 12, 25));
    }
}
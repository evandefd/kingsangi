package exchangecalculator.api;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

/**
 * The {@code ExchangeUtil} class is the util class that contains some useful method.
 */
public class ExchangeUtil {
    private static final String PATTERN = "yyyy-MM-dd";

    /**
     * Returns a Joda-Time DateTime instance.<br>
     * Note that parameter string must be yyyy-MM-dd pattern.
     * @param stringDate String date expression thar has yyyy-MM-dd pattern
     * @return Joda-Time DateTime instance
     */
    public static DateTime stringToDateTime(String stringDate) {
        return DateTime.parse(stringDate, DateTimeFormat.forPattern(PATTERN));
    }

    /**
     * Returns a parsed string date from DateTime.<br>
     * The pattern of the returned string is yyyy-MM-dd
     * @param dateTime Joda-Time DateTime instance
     * @return String date expression thar has yyyy-MM-dd pattern
     */
    public static String dateTimeToString(DateTime dateTime) {
        return dateTime.toString(DateTimeFormat.forPattern(PATTERN));
    }

    /**
     * Generate DateTime instance.
     * @param year Year
     * @param monthOfYear Month of year
     * @param dayOfMonth Day of month
     * @return Joda-Time DateTime instance
     */
    public static DateTime generateSimpleDateTime(
            int year,
            int monthOfYear,
            int dayOfMonth) {
        return new DateTime(year, monthOfYear, dayOfMonth, 0, 0);
    }

    /**
     * Generate a string date expression that has yyyy-MM-dd pattern.
     * @param year Year
     * @param monthOfYear Month of year
     * @param dayOfMonth Day of month
     * @return String date expression thar has yyyy-MM-dd pattern
     */
    public static String generateSimpleFormattedStringDate(
            int year,
            int monthOfYear,
            int dayOfMonth) {
        return dateTimeToString(generateSimpleDateTime(year, monthOfYear, dayOfMonth));
    }

}

package datecalculator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DayToWeek {
    public static String dateToWeek(long millisecond) {
        DateFormat outputDataFormat = SimpleDateFormat.getDateInstance(DateFormat.FULL);

        Date millisecondToDate = new Date(millisecond);

        String dateToString = outputDataFormat.format(millisecondToDate);

        return dateToString;
    }
}

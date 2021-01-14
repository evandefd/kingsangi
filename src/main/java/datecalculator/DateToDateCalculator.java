package datecalculator;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToDateCalculator {
    public static long dateToDateCalculator(long millisecondOne,long millisecondTwo){

        long milliSecDifferent = (millisecondTwo-millisecondOne);
        long milliDifferentToDay = milliSecDifferent/(1000*60*60*24);
        return milliDifferentToDay;

    }

    public static long todayToDateCalculator(long millisecond) throws ParseException {
        DateFormat dateFormat = SimpleDateFormat.getDateInstance(DateFormat.DEFAULT);
        Calendar todayCalendar = Calendar.getInstance();
        String todayString = dateFormat.format(todayCalendar.getTime());
        Date today = dateFormat.parse(todayString);

        long milliSecToday = today.getTime();
        long milliDifferent = millisecond-milliSecToday;
        long milliDifferentToDay = milliDifferent/(1000*60*60*24);

        return milliDifferentToDay;

    }
}

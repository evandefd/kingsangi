package main.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TodayToDateCalculator {
    public static long todayToDateCalculator(String strDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");

        Calendar todayCalendar = Calendar.getInstance();
        String todayString = dateFormat.format(todayCalendar.getTime());

        Date today = dateFormat.parse(todayString);
        Date date = dateFormat.parse(strDate);

        long miliSecToday = today.getTime();
        long miliSecDate = date.getTime();

        long miliDifferent = miliSecDate-miliSecToday;

        long miliDifferntToDay = miliDifferent/(1000*60*60*24);

        return miliDifferntToDay;

    }

}

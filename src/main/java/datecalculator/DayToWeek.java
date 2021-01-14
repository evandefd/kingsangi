package datecalculator;

import java.util.Calendar;

public class DayToWeek {
    public static int dateToWeek(long millisecond) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millisecond);
        int week = calendar.get(Calendar.DAY_OF_WEEK);

        return week;
    }
}

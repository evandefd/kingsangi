package datecalculator;

import java.util.Calendar;

public class TodayAddDay {
    public static long todayAddDay(int addDayNumber){
        Calendar today = Calendar.getInstance();
        today.add(Calendar.DATE,addDayNumber);
        long millisecond = today.getTimeInMillis();

        return millisecond;
    }

}

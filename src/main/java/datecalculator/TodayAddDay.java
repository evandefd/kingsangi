package datecalculator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TodayAddDay {
    public static String todayAddDay(int addDayNumber){
        DateFormat dateFormat = SimpleDateFormat.getDateInstance(DateFormat.DEFAULT);

        Calendar today = Calendar.getInstance();

        today.add(Calendar.DATE,addDayNumber);

        String todayAddDay = dateFormat.format(today.getTime());

        return todayAddDay;

    }

}

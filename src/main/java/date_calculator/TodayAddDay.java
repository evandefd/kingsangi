package main.java;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TodayAddDay {
    public static String todayAddDay(int addDayNumber){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd(E)");

        Calendar today = Calendar.getInstance();

        today.add(Calendar.DATE,addDayNumber);

        String todayAddDay = dateFormat.format(today.getTime());

        return todayAddDay;

    }

}

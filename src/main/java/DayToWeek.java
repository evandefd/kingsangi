package main.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DayToWeek {
    public static String dateToWeek(String strDate) throws ParseException {
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("yyyy.MM.dd");

        Date stringToDate = inputDateFormat.parse(strDate);

        SimpleDateFormat outputDataFormat = new SimpleDateFormat("yyyy.MM.dd(E요일)");
        String dateToString = outputDataFormat.format(stringToDate);

        return dateToString;
    }
}

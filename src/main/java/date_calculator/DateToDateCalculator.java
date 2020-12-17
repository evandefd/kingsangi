package main.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToDateCalculator {
    public static long dateToDateCalculator(String strDateOne,String strDateTwo) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");

        Date dateOne=dateFormat.parse(strDateOne);
        Date dateTwo=dateFormat.parse(strDateTwo);

        long miliSecToDateOne = dateOne.getTime();
        long miliSecToDateTwo = dateTwo.getTime();

        long miliSecDifferent = (miliSecToDateTwo-miliSecToDateOne);

        long miliDifferentToDay = miliSecDifferent/(1000*60*60*24);

        return miliDifferentToDay;


    }
}

package datecalculator;

import com.ibm.icu.util.ChineseCalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateToLunarDate {

    public static final int different = 2637; //음력과 양력간 년수 차이

    public static long dateToLunarDate(long millisecond){
        DateFormat dfm = SimpleDateFormat.getDateInstance(DateFormat.DEFAULT);

        Calendar cal = Calendar.getInstance();
        ChineseCalendar chineseCalendar = new ChineseCalendar();

        cal.setTimeInMillis(millisecond);

        chineseCalendar.setTimeInMillis(cal.getTimeInMillis());

        int year= chineseCalendar.get(ChineseCalendar.EXTENDED_YEAR)-different;
        int month = chineseCalendar.get(ChineseCalendar.MONTH);
        int day = chineseCalendar.get(ChineseCalendar.DAY_OF_MONTH);

        cal.set(year,month,day);

        return cal.getTimeInMillis();
    }

    public static long lunarDateToDate (long millisecond){ //음력을 양력으로 변환
        DateFormat dfm = SimpleDateFormat.getDateInstance(DateFormat.DEFAULT);

        Calendar cal = Calendar.getInstance();
        ChineseCalendar chineseCalendar = new ChineseCalendar();

        cal.setTimeInMillis(millisecond);

        chineseCalendar.set(ChineseCalendar.EXTENDED_YEAR,cal.get(Calendar.YEAR)+different);
        chineseCalendar.set(ChineseCalendar.MONTH,cal.get(Calendar.MONTH));
        chineseCalendar.set(ChineseCalendar.DAY_OF_MONTH,cal.get(Calendar.DAY_OF_MONTH));

        cal.setTimeInMillis(chineseCalendar.getTimeInMillis());
        return cal.getTimeInMillis();

    }
}


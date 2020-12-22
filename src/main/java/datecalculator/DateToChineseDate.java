package datecalculator;

import com.ibm.icu.util.ChineseCalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateToChineseDate {

    public static final int different = 2637; //음력과 양력간 년수 차이

    public static String dateToChineseDate(long millisecond){
        DateFormat dfm = SimpleDateFormat.getDateInstance(DateFormat.DEFAULT);

        Calendar cal = Calendar.getInstance();
        ChineseCalendar chineseCalendar = new ChineseCalendar();

        cal.setTimeInMillis(millisecond); //날짜 설정

        chineseCalendar.setTimeInMillis(cal.getTimeInMillis()); //chineseCalendar 에 날짜설정

        int year= chineseCalendar.get(ChineseCalendar.EXTENDED_YEAR)-different; //chineseCalendar 에서 년도 추줄
        int month = chineseCalendar.get(ChineseCalendar.MONTH); //chineseCalendar 에서 월 추줄
        int day = chineseCalendar.get(ChineseCalendar.DAY_OF_MONTH); //chineseCalendar 일 추줄

        cal.set(year,month,day);

        String str = dfm.format(cal.getTime());

        return str;
    }

    public static String chineseDateToDate (long millisecond){ //음력을 양력으로 변환
        DateFormat dfm = SimpleDateFormat.getDateInstance(DateFormat.DEFAULT);

        Calendar cal = Calendar.getInstance();
        ChineseCalendar chineseCalendar = new ChineseCalendar();

        cal.setTimeInMillis(millisecond);

        chineseCalendar.set(ChineseCalendar.EXTENDED_YEAR,cal.get(Calendar.YEAR)+different);
        chineseCalendar.set(ChineseCalendar.MONTH,cal.get(Calendar.MONTH));
        chineseCalendar.set(ChineseCalendar.DAY_OF_MONTH,cal.get(Calendar.DAY_OF_MONTH));

        cal.setTimeInMillis(chineseCalendar.getTimeInMillis());

        String str = dfm.format(cal.getTime());

        return str;

    }
}



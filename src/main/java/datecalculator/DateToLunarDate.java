package datecalculator;

import com.ibm.icu.util.DangiCalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateToLunarDate {

    public static final int different = 2333; //음력과 양력간 년수 차이

    public static long getLunarDate(long millisecond){
        DateFormat dfm = SimpleDateFormat.getDateInstance(DateFormat.DEFAULT);

        Calendar cal = Calendar.getInstance();
        DangiCalendar dangiCalendar = new DangiCalendar();

        cal.setTimeInMillis(millisecond);

        dangiCalendar.setTimeInMillis(cal.getTimeInMillis());

        int year= dangiCalendar.get(DangiCalendar.EXTENDED_YEAR)-different;
        int month = dangiCalendar.get(DangiCalendar.MONTH);
        int day = dangiCalendar.get(DangiCalendar.DAY_OF_MONTH);

        cal.set(year,month,day);

        return cal.getTimeInMillis();
    }

    public static long getSolarDate(long millisecond){ //음력을 양력으로 변환
        DateFormat dfm = SimpleDateFormat.getDateInstance(DateFormat.DEFAULT);

        Calendar cal = Calendar.getInstance();
        DangiCalendar dangiCalendar = new DangiCalendar();

        cal.setTimeInMillis(millisecond);

        dangiCalendar.set(DangiCalendar.EXTENDED_YEAR,cal.get(Calendar.YEAR)+different);
        dangiCalendar.set(DangiCalendar.MONTH,cal.get(Calendar.MONTH));
        dangiCalendar.set(DangiCalendar.DAY_OF_MONTH,cal.get(Calendar.DAY_OF_MONTH));

        cal.setTimeInMillis(dangiCalendar.getTimeInMillis());
        return cal.getTimeInMillis();

    }

    public static long getLeapMonth(long lunarDate) {
        Calendar cal = Calendar.getInstance();
        DangiCalendar dangicalendar = new DangiCalendar();

        cal.setTimeInMillis(lunarDate);
        dangicalendar.set(DangiCalendar.MONTH, cal.get(Calendar.MONTH));

        long milliSolar = DateToLunarDate.getSolarDate(cal.getTimeInMillis());
        cal.setTimeInMillis(milliSolar);
        int maxDay = dangicalendar.getActualMaximum(DangiCalendar.DAY_OF_MONTH);

        cal.add(Calendar.DAY_OF_MONTH, maxDay);
        dangicalendar.setTimeInMillis(cal.getTimeInMillis());
        int leapMonth = dangicalendar.get(DangiCalendar.IS_LEAP_MONTH);

        if (leapMonth == 1) return cal.getTimeInMillis();
        else return 0;
    }
}


import com.ibm.icu.util.ChineseCalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateToChineseDate {

    public static String dateToChineseDate(long millisecond){
        DateFormat dfm = SimpleDateFormat.getDateInstance(DateFormat.DEFAULT);

        Calendar cal = Calendar.getInstance();
        ChineseCalendar chineseCalendar = new ChineseCalendar();

        cal.setTimeInMillis(millisecond);

        chineseCalendar.setTimeInMillis(cal.getTimeInMillis());

        int year= chineseCalendar.get(ChineseCalendar.EXTENDED_YEAR)-2637;
        int month = chineseCalendar.get(ChineseCalendar.MONTH);
        int day = chineseCalendar.get(ChineseCalendar.DAY_OF_MONTH);

        cal.set(year,month,day);

        String str = dfm.format(cal.getTime());

        return str;
    }
}

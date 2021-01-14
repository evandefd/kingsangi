package datecalculator;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayOff {
    public static final int NEWYEAR = 0;
    public static final int LUNARNEWYEAR = 1;
    public static final int INDEPENDENCEMOVEMENTDAY = 2;
    public static final int CHILDRENSDAY = 3;
    public static final int BUDDHASDAY = 4;
    public static final int MEMORIALDAY = 5;
    public static final int LIBERATIONDAY = 6;
    public static final int THANKSGIVING = 7;
    public static final int NATIONALFOUNDATIONDAY = 8;
    public static final int HANGULDAY = 9;
    public static final int CHRISTMAS = 10;
    public static final int LUNARNEWYEAREVE = 11;
    public static final int LUNARNEWYEARNEXT = 12;
    public static final int THANKSGIVINGEVE = 13;
    public static final int THAKSGIVINGNEXT = 14;

    public static long getPublicHoliday(int year, int type) {
        Calendar calendar = Calendar.getInstance();
        long millisecond=0;
        switch (type) {
            case NEWYEAR: {
                calendar.set(year, 0, 1);
                millisecond=calendar.getTimeInMillis();
                break;
            }
            case LUNARNEWYEAR: {
                millisecond=getLunarNewYear(year);
                break;
            }
            case INDEPENDENCEMOVEMENTDAY: {
                calendar.set(year,2,1);
                millisecond=calendar.getTimeInMillis();
                break;
            }
            case CHILDRENSDAY:{
                calendar.set(year,4,5);
                millisecond=calendar.getTimeInMillis();
                break;
            }
            case BUDDHASDAY:{
                millisecond=getBuddhasDay(year);
                break;
            }
            case MEMORIALDAY:{
                calendar.set(year,5,6);
                millisecond=calendar.getTimeInMillis();
                break;
            }
            case LIBERATIONDAY:{
                calendar.set(year,7,15);
                millisecond=calendar.getTimeInMillis();
                break;
            }case THANKSGIVING:{
                millisecond=getThanksgiving(year);
                break;
            }case NATIONALFOUNDATIONDAY:{
                calendar.set(year,9,3);
                millisecond=calendar.getTimeInMillis();
                break;
            }case HANGULDAY:{
                calendar.set(year,9,9);
                millisecond=calendar.getTimeInMillis();
                break;
            }case CHRISTMAS:{
                calendar.set(year,11,25);
                millisecond=calendar.getTimeInMillis();
                break;
            }case LUNARNEWYEAREVE:{
                calendar.setTimeInMillis(getEve(getLunarNewYear(year)));
                millisecond=calendar.getTimeInMillis();
                break;
            }case LUNARNEWYEARNEXT:{
                calendar.setTimeInMillis(getNextDay(getLunarNewYear(year)));
                millisecond=calendar.getTimeInMillis();
                break;
            }case THANKSGIVINGEVE:{
                calendar.setTimeInMillis(getEve(getThanksgiving(year)));
                millisecond=calendar.getTimeInMillis();
                break;
            }case THAKSGIVINGNEXT:{
                calendar.setTimeInMillis(getNextDay(getThanksgiving(year)));
                millisecond=calendar.getTimeInMillis();
                break;
            } default: break;
        }
        return millisecond;
    }

    public static long getEve(long millisecond){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millisecond);
        calendar.add(Calendar.DAY_OF_MONTH,-1);
        return calendar.getTimeInMillis();
    }

    public static long getLunarNewYear(int year) {
        Calendar calendar = Calendar.getInstance();
        Date lunarNewYear=new Date();
        calendar.set(year,0,1);
        lunarNewYear.setTime(datecalculator.DateToLunarDate.getLunarDate(calendar.getTimeInMillis()));
        calendar.setTime(lunarNewYear);
        return calendar.getTimeInMillis();
    }

    public static long getNextDay(long millisecond){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millisecond);
        calendar.add(Calendar.DAY_OF_MONTH,1);
        return calendar.getTimeInMillis();
    }

    public static long getThanksgiving(int year) {
        Calendar calendar = Calendar.getInstance();
        Date thanksgiving=new Date();
        calendar.set(year,7,15);
        thanksgiving.setTime(datecalculator.DateToLunarDate.getLunarDate(calendar.getTimeInMillis()));
        calendar.setTime(thanksgiving);
        return calendar.getTimeInMillis();
    }

    public static long getBuddhasDay(int year) {
        Calendar calendar = Calendar.getInstance();
        Date buddhasDay=new Date();
        calendar.set(year,3,8);
        buddhasDay.setTime(datecalculator.DateToLunarDate.getLunarDate(calendar.getTimeInMillis()));
        calendar.setTime(buddhasDay);
        return calendar.getTimeInMillis();
    }

    public static void getPresidentVote(int year){
        Calendar calendar = Calendar.getInstance();
        DateFormat dfm = SimpleDateFormat.getDateInstance(DateFormat.FULL);
        int president=0;
        Date date = new Date();
        calendar.set(year,02,1); //삼일절
        date = calendar.getTime();

        if((year-2022)%5==0&&year>2017){
            calendar.set(year,04,9);
            calendar.add(Calendar.DAY_OF_MONTH,-70);
            while(calendar.get(Calendar.DAY_OF_WEEK)!=Calendar.WEDNESDAY){
                calendar.add(Calendar.DAY_OF_MONTH,1);
            } if(date.getDay()==Calendar.THURSDAY||date.getDay()==Calendar.WEDNESDAY||date.getDay()==Calendar.THURSDAY){
                calendar.add(Calendar.DAY_OF_MONTH,7);
            }System.out.println(dfm.format(calendar.getTime()));
        }
    }

    public static void getLocalVote(int year){
        Calendar calendar = Calendar.getInstance();
        DateFormat dfm = SimpleDateFormat.getDateInstance(DateFormat.FULL);

        if((year-2022)%4==0){
            calendar.set(year,05,30);
            calendar.add(Calendar.DAY_OF_MONTH,-30);
            while(calendar.get(Calendar.DAY_OF_WEEK)!=Calendar.WEDNESDAY){
                calendar.add(Calendar.DAY_OF_MONTH,1);
            }if(calendar.get(Calendar.DAY_OF_MONTH)==5 || calendar.get(Calendar.DAY_OF_MONTH)==6){
                calendar.add(Calendar.DAY_OF_MONTH,7);
            }System.out.println(dfm.format(calendar.getTime()));
        }
    }

    public static void getCongressmanVote(int year){
        Calendar calendar=Calendar.getInstance();
        DateFormat dfm = SimpleDateFormat.getDateInstance(DateFormat.FULL);

        if((year-2024)%4==0){
            calendar.set(year,04,29);
            calendar.add(Calendar.DAY_OF_MONTH,-50);
            while(calendar.get(Calendar.DAY_OF_WEEK)!=Calendar.WEDNESDAY){
                calendar.add(Calendar.DAY_OF_MONTH,1);
            }System.out.println(dfm.format(calendar.getTime()));
        }
    }

    public static void getAlternativeHoliday(int year,int field) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        DateFormat dfm = SimpleDateFormat.getDateInstance(DateFormat.FULL);
        Date date = new Date();
        int week;
        int month,day;

        switch (field){
            case LUNARNEWYEAR:{
                calendar.setTimeInMillis(getLunarNewYear(year));
                week=calendar.get(Calendar.DAY_OF_WEEK);
                if(week==Calendar.SUNDAY||week==Calendar.SATURDAY||week==Calendar.MONDAY){
                    calendar.add(Calendar.DAY_OF_MONTH,2);
                    System.out.println("대체공휴일: "+dfm.format(calendar.getTime()));
                }else System.out.println("대체공휴일은 없습니다");
                break;
            }
            case THANKSGIVING:{
                calendar.setTimeInMillis(getThanksgiving(year));
                week=calendar.get(Calendar.DAY_OF_WEEK);
                month=calendar.get(Calendar.MONTH);
                day=calendar.get(Calendar.DAY_OF_MONTH);

                if(month==9&&(day==4||day==3||day==2)){
                    calendar.add(Calendar.DAY_OF_MONTH,2);
                    date=calendar.getTime();
                    week=date.getDay();
                    day=date.getDate();
                    month=date.getMonth();
                }else if(month==9&&(day==10||day==9||day==8)){
                    calendar.add(Calendar.DAY_OF_MONTH,2);
                    date=calendar.getTime();
                    week=date.getDay();
                    day=date.getDate();
                    month=date.getMonth();
                }else if(week==Calendar.MONDAY||week==Calendar.SUNDAY||week==Calendar.SATURDAY){
                    calendar.add(Calendar.DAY_OF_MONTH,2);
                    date=calendar.getTime();
                    week=date.getDay();
                    day=date.getDate();
                    month=date.getMonth();
                }else {
                    System.out.println("대체공휴일은 없습니다.");
                    break;
                }

                if(month==9&&day==3){
                    calendar.add(Calendar.DAY_OF_MONTH,1);
                    date=calendar.getTime();
                    week=date.getDay();
                    day=date.getDate();
                    month=date.getMonth();
                }else if(month==9&&day==9){
                    calendar.add(Calendar.DAY_OF_MONTH,1);
                    date=calendar.getTime();
                    week=date.getDay();
                    day=date.getDate();
                    month=date.getMonth();
                }else if(week==Calendar.SUNDAY){
                    calendar.add(Calendar.DAY_OF_MONTH,1);
                    date=calendar.getTime();
                    week=date.getDay();
                    day=date.getDate();
                    month=date.getMonth();
                }System.out.println(dfm.format(calendar.getTime()));
                break;
            }
            case CHILDRENSDAY: {
                calendar.set(year,4,5);
                week=calendar.get(Calendar.DAY_OF_WEEK);
                date.setTime(getBuddhasDay(year));
                month=calendar.get(Calendar.MONTH);
                day=calendar.get(Calendar.DAY_OF_MONTH);

                if(week==Calendar.SUNDAY||week==Calendar.SATURDAY){
                    calendar.add(Calendar.DAY_OF_MONTH,1);
                    week=calendar.get(Calendar.DAY_OF_WEEK);
                    day=calendar.get(Calendar.DAY_OF_MONTH);
                }else if(month==4&&day==date.getDate()){
                    calendar.add(Calendar.DAY_OF_MONTH,1);
                    week=calendar.get(Calendar.DAY_OF_WEEK);
                    day=calendar.get(Calendar.DAY_OF_MONTH);
                } else {
                    System.out.println("대체공휴일은 없습니다.");
                    break;
                }

                if(month==date.getMonth()&&day==date.getDate()){
                    calendar.add(Calendar.DAY_OF_MONTH,1);
                    date=calendar.getTime();
                    week=date.getDay();
                    day=date.getDate();
                    month=date.getMonth();
                }else if(week==Calendar.SUNDAY){
                    calendar.add(Calendar.DAY_OF_MONTH,1);
                    date=calendar.getTime();
                    week=date.getDay();
                    day=date.getDate();
                    month=date.getMonth();
                }System.out.println(dfm.format(calendar.getTime()));
                break;
            }
            default: break;
        }
    }
}

# kingsangi
King + 계산기 = 킹산기



#### Support List
-오늘부터 특정일까지 차이 (todayToDateCalculator)

-기준일 부터 특정일 까지 차이 (dateToDateCalculator)

-오늘부터 N일 후의 날 계산 (todayAddDay)

-특정 날짜의 요일 구하기 (dayToWeek)

-양력을 음력으로 변환 (dateToLunarDate)

-음력을 양력으로 변환 (lunarDateToDate)

-특정 년도의 공휴일을 반환 (getHoliday)

-특정 년도의 대체공휴일을 반환 (getAlternativeHoliday)

#### Usage
-todayAddDay를 제외한 함수들은 long millisecond를 parameter로 갖는다.
-getHoliday메소드는 parameter로 (int)year과 (int)holidayType을 받는다.
 holidayType은 Holiday class에 정의 되어있다.
 
 대부분의 메소드가 millisecond를 반환하여 이를 사용할 시 Calendar를 선언하여 사용하는 것이 편하다.
 또한 이를 출력할 경우 DateFormat을 사용하여 표현해준다.
 자세한 내용은 예시를 참고.
 
 ex)
```
String date = TodayAddDay.todayAddDay(3); //오늘은 2020년 12월 22일
System.out.println(date);

>>> 2020. 12. 25

Calendar cal = Calendar.getInstance();
DateFormat dateFormat = SimpleDateFormat.getDateInstance(DateFormat.FULL);
long christmas = DayOff.getPublicHoliday(2021,DayOff.CHRISTMAS);
cal.setTimeInMillis(christmas);
System.out.println(dateFormat.format(cal.getTime()));

>>>2022년 12월 25일 일요일
```

#### Caution
-음력을 양력으로 계산하는 DateToLunarDate 클래스의 함수들은 ChineseCalendar라는 클래스를 사용하는데

  이 클래스는 icu4j라는 외부라이브러리를 프로젝트 classpath에 추가시켜주어야 사용가능하다.
 
 -icu4j 링크 : http://site.icu-project.org/download/68#TOC-ICU4J-Download
              
  
 -icu4j licenses
  링크: https://www.unicode.org/copyright.html
  
-getAlternativeHoliday 사용시 대체공휴일은 설날, 추석, 어린이날에만 해당됨으로 parameter에 LUNARNEWYEAR, THANKSGIVING, CHILDRENSDAY만 사용가능
  
  #### Improvements
  -DayOff 클래스의 vote메소드들 현재 void형으로 되어있음. (좀 더 다듬을 예정)
  -여성용 계산기 (생리주기, 배란일, 가임기간 계산기)
  AND SO ON...
  

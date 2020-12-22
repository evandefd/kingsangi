# kingsangi
King + 계산기 = 킹산기



#### Support List
-오늘부터 특정일까지 차이 (todayToDateCalculator)

-기준일 부터 특정일 까지 차이 (dateToDateCalculator)

-오늘부터 N일 후의 날 계산 (todayAddDay)

-특정 날짜의 요일 구하기 (dayToWeek)

-양력을 음력으로 변환 (dateToLunarDate)

-음력을 양력으로 변환 (lunarDateToDate)

#### Usage
-todayAddDay를 제외한 함수들은 long millisecond를 parameter로 갖는다.
 ex)
```
String date = TodayAddDay.todayAddDay(3); //오늘은 2020년 12월 22일
System.out.println(date);

>>> 2020. 12. 25
```

#### Caution
-음력을 양력으로 계산하는 DateToLunarDate 클래스의 함수들은 ChineseCalendar라는 클래스를 사용하는데
 이 클래스는 icu4j라는 외부라이브러리를 프로젝트 classpath에 추가시켜주어야 사용가능하다.
 
 -icu4j 링크 : http://site.icu-project.org/download/68#TOC-ICU4J-Download
              
  
 -icu4j licenses
  링크: https://www.unicode.org/copyright.html

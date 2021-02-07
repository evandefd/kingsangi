# kingsangi
단위변환계산기  
  
### Support expression for calculation    
- AreaUnit{ACRE(에이커), ARE(아르), HECTARE(헥타르), SQUARECENTIMETER(제곱센티미터), SQUAREFEET(제곱피트), SQUAREINCH(제곱인치), SQUAREMETER(제곱미터), PYEONG(평)}  
- DataUnit{BIT(비트), BYTE(바이트), KILOBYTE(킬로바이트), MEGABYTE(메가바이트), GIGABYTE(기가바이트), TERABYTE(테라바이트), PETABYTE(페타바이트)}  
- FrequencyUnit{HERTZ(헤르츠), KILOHERTZ(킬로헤르츠), MEGAHERTZ(메가헤르츠), GIGAHERTZ(기가헤르츠), TERAHERTZ(테라헤르츠)}  
- LengthUnit{MILLIMETER(밀리미터), CENTIMETER(센티미터), METER(미터), KILOMETER(킬로미터), INCH(인치), FEET(피트), YARD(야드), MILE(마일), NMILE(해리), MIL(밀)}  
- PressureUnit{ATOMASPHERICPRESSURE(기압), BAR(바), POUNDFORCEPERSQUAREINCH(제곱인치 당 파운드힘), TORR(토르), PASCAL(파스칼)}  
- SpeedUnit{METERPERSECOND(초당 미터), METERPERHOUR(시간당 미터), KILOMETERPERSECOND(초당 킬로미터), KILOMETERPERHOUR(시간당 킬로미터), INCHPERSECOND(초당 인치),   
  INCHPERHOUR(시간당 인치), FEETPERSECOND(초당 피트), FEETPERHOUR(시간 당 피트), MILEPERSECOND(초당 마일), MILEPERHOUR(시간당 마일), KNOT(노트)}  
- TemperatureUnit{CELSIUS(섭씨), FAHRENHEIT(화씨), KELVIN(켈빈온도)}  
- TimeUnit{SECOND(초), MINUTE(분), HOUR(시간), DAY(일), WEEK(주)}  
- VolumeUnit{BRITISHGALLON(영국갤런), USGALLON(미국갤런), LITER(리터), MILLILITER(밀리리터), CUBICCENTIMETER(세제곱센티미터), CUBICMETER(세제곱미터), CUBICINCH(세제곱인치), 
  CUBICFEET(세제곱피트)}  
- WeightUnit{TON(미터톤), BRITISHTON(영국식 톤), USTON(미국식 톤), POUND(파운드), OUNCE(온스), KILOGRAM(킬로그램), GRAM(그램)}  

### Usage  
- 변환 전 단위, 변환 후 단위를 보기에서 선택 후 변환할 값을 입력하면된다.  
```  
System.out.println(AreaUnit.ACRE.convert(10, AreaUnit.ARE));  
>>> 404.68564224  
System.out.println(DataUnit.BIT.convert(14, DataUnit.BYTE));  
>>> 1.75  
System.out.println(LengthUnit.MILLIMETER.convert(20, LengthUnit.CENTIMETER));  
>>> 2  
```  
  
### Caution  
큰 범위의 단위는 첫단어와 unit의 첫단어를 대문자로 시작하고, 그 안의 작은 단위는 전부 대문자로 입력하여야한다.  
> AREAUNIT.acre.convert("값", AREAUNUT.acre) (x)  
> AreaUnit.ACRE.convert("값", AreaUnit.ACRE) (o)  
> Timeunit.SECOND.convert("값", Timeunit.MINUTE) (x)  
> TimeUnit.SECOND.convert("값", TimeUnit.MINUTE) (o)


# kingsangi
King + 계산기 = 킹산기

### (공학용) 계산기
#### Simple Usage
```
Calculator calculator = new Calculator();
System.out.println(calculator.calculate("3 + 7"));

>>> 10
```
##### Caution
String expression은 각 요소 사이에 공백이 무조건 있어야 한다. 그렇지 않을 경우 IllegalArgumentException 예외를 발생시킨다.  
> "1+4" (x)  
> "3sin 90" (x)  
> "e^2" (x)  
> "3! * 7" (x)  
> "1 + 4" (o)  
> "3 sin 90" (o)  
> "e ^ 2" (o)  
> "3 ! * 7" (o)  

#### Support expression for calculation
- 양수, 음수, 실수, Pi(3.14...), e(2,72...) 예약어 지원
- 사칙연산(+, -, *, /)
- 괄호 ('(', ')')
- 지수승(pow, ^)
- 제곱근(sqrt)
- 퍼센트(%, e.g. 100% = 1.0)
- 팩토리얼(!)
- 로그(자연로그, 상용로그)
- 삼각함수, 역 삼각함수 및 라디안 연산

#### Use calculator with Radian or Degree
##### Usage 1. Constructor
```
Calculator calculator = new Calculator(CalculateMode.RAD); //Set calculation mode to Radian.
```
기본값은 ```CalculatorMode.DEG```임.
##### Usage 2. Setter
```
calculator.setCalculateMode(CalculateMode.RAD); //Set calculation mode to Radian.
calculator.setCalculateMode(CalculateMode.DEG); //Set calculation mode to Degree.
```

#### 추가 예정
- nPr, nCr
- 일반 로그(log3(4)...)
- n제곱근



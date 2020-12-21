# kingsangi
King + 계산기 = 킹산기

### (공학용) 계산기
#### Simple Usage
```
Calculator calculator = new Calculator();
System.out.println(calculator.calculate("3 + 7"));

>>> 10.0
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

#### Use calculator with postfix
Postfix 연산을 사용하려면 postfixCalculate 메소드를 CalculatorList 객체를 파라미터로 실행한다.
```
Calculator calculator = new Calculator();
CalculatorList calculatorList = new CalculatorList();
calculatorList.add(4);
calculatorList.add(6);
calculatorList.add(2);
calculatorList.add(Operator.SUB);
calculatorList.add(Operator.MUL);
//POSTFIX : 4 6 2 - *
//INFIX : 4 * ( 6 - 2 )

System.out.println(calculator.postfixCalculate(calculatorList));

>>> 16.0
```

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

#### Infix to postfix
Infix String expression 을 postfix CalculatorList 객체로 변환할 수 있다.
```
calculator.infixToPostfix("4 * ( 6 - 2 )");
```

#### Formatting
결과물을 쉽게 포맷팅할 수 있는 DecimalFormat을 제공한다.
```
Calculator.getDefaultDecimalFormat() //소수점 아래 최대 10자리까지 표시하는 DecimalFormat을 반환
Calculator.getDefaultDecimalFormat(int digits) //Custom digits, digits가 음수일 경우 digits가 0일 때와 동일한 DecimalFormat을 반환
```
```
Calculator calculator = new Calculator();
DecimalFormat decimalFormat = Calculator.getDefaultDecimalFormat();

String result1 = decimalFormat.format(calculator.calculate("2 * ( 6 - 4 )"));
String result2 = decimalFormat.format(calculator.calculate("pi"));

System.out.println(result1);
System.out.println(result2);

>>> 4
3.1415926536
```

#### 추가 예정
- nPr, nCr
- 일반 로그(log3(4)...)
- n제곱근



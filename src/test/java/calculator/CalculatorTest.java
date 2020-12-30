package calculator;

import calculator.enums.CalculateMode;
import calculator.enums.Operator;
import calculator.list.PostfixList;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private static final double delta = 0.0000000001;

    @Test
    public void testPostfixAdd() {
        Calculator calculator = new Calculator();

        PostfixList list1 = new PostfixList();
        list1.add(3);
        list1.add(5);
        list1.add(Operator.ADD);

        Assert.assertEquals(8.0, calculator.postfixCalculate(list1), delta);
    }

    @Test
    public void testPostfixSub() {
        Calculator calculator = new Calculator();

        PostfixList list1 = new PostfixList();
        list1.add(3);
        list1.add(5);
        list1.add(Operator.SUB);

        Assert.assertEquals(-2.0, calculator.postfixCalculate(list1), delta);
    }

    @Test
    public void testPostfixMul() {
        Calculator calculator = new Calculator();

        PostfixList list1 = new PostfixList();
        list1.add(3);
        list1.add(5);
        list1.add(Operator.MUL);

        Assert.assertEquals(15.0, calculator.postfixCalculate(list1), delta);
    }

    @Test
    public void testPostfixDiv() {
        Calculator calculator = new Calculator();

        PostfixList list1 = new PostfixList();
        list1.add(3);
        list1.add(5);
        list1.add(Operator.DIV);

        Assert.assertEquals(0.6, calculator.postfixCalculate(list1), delta);
    }

    @Test
    public void testPostfixAddSubMul() {
        Calculator calculator = new Calculator();

        PostfixList list1 = new PostfixList();
        list1.add(3);
        list1.add(5);
        list1.add(8);
        list1.add(Operator.MUL);
        list1.add(Operator.ADD);
        list1.add(6);
        list1.add(Operator.SUB);

        Assert.assertEquals(37.0, calculator.postfixCalculate(list1), delta);
    }

    @Test
    public void testPostfixAddSubMulDiv() {
        Calculator calculator = new Calculator();

        PostfixList list1 = new PostfixList();
        list1.add(3);
        list1.add(5);
        list1.add(8);
        list1.add(Operator.MUL);
        list1.add(7);
        list1.add(Operator.DIV);
        list1.add(Operator.ADD);
        list1.add(6);
        list1.add(Operator.SUB);

        Assert.assertEquals(2.7142857142, calculator.postfixCalculate(list1), delta);
    }

    @Test
    public void testPostfixSqrt() {
        Calculator calculator = new Calculator();

        PostfixList list1 = new PostfixList();
        list1.add(2);
        list1.add(Operator.SQRT);

        Assert.assertEquals(1.4142135623, calculator.postfixCalculate(list1), delta);
    }

    @Test
    public void testPostfixFact() {
        Calculator calculator = new Calculator();

        PostfixList list1 = new PostfixList();
        list1.add(6);
        list1.add(Operator.FACT);

        Assert.assertEquals(720.0, calculator.postfixCalculate(list1), delta);
    }

    @Test
    public void testPostfixSinDeg() {
        Calculator calculator = new Calculator();

        PostfixList list1 = new PostfixList();
        list1.add(0);
        list1.add(Operator.SIN);

        PostfixList list2 = new PostfixList();
        list2.add(30);
        list2.add(Operator.SIN);

        PostfixList list3 = new PostfixList();
        list3.add(45);
        list3.add(Operator.SIN);

        PostfixList list4 = new PostfixList();
        list4.add(60);
        list4.add(Operator.SIN);

        PostfixList list5 = new PostfixList();
        list5.add(90);
        list5.add(Operator.SIN);

        PostfixList list6 = new PostfixList();
        list6.add(180);
        list6.add(Operator.SIN);

        PostfixList list7 = new PostfixList();
        list7.add(270);
        list7.add(Operator.SIN);

        PostfixList list8 = new PostfixList();
        list8.add(360);
        list8.add(Operator.SIN);


        Assert.assertEquals(0.0, calculator.postfixCalculate(list1), delta);
        Assert.assertEquals(0.5, calculator.postfixCalculate(list2), delta);
        Assert.assertEquals(0.7071067811, calculator.postfixCalculate(list3), delta);
        Assert.assertEquals(0.8660254037, calculator.postfixCalculate(list4), delta);
        Assert.assertEquals(1.0, calculator.postfixCalculate(list5), delta);
        Assert.assertEquals(0.0, calculator.postfixCalculate(list6), delta);
        Assert.assertEquals(-1, calculator.postfixCalculate(list7), delta);
        Assert.assertEquals(0.0, calculator.postfixCalculate(list8), delta);
    }

    @Test
    public void testPostfixSinRad() {
        Calculator calculator = new Calculator(CalculateMode.RAD);

        PostfixList list1 = new PostfixList();
        list1.add(0);
        list1.add(Operator.SIN);

        PostfixList list2 = new PostfixList();
        list2.add(Math.PI / 6);
        list2.add(Operator.SIN);

        PostfixList list3 = new PostfixList();
        list3.add(Math.PI / 4);
        list3.add(Operator.SIN);

        PostfixList list4 = new PostfixList();
        list4.add(Math.PI / 3);
        list4.add(Operator.SIN);

        PostfixList list5 = new PostfixList();
        list5.add(Math.PI / 2);
        list5.add(Operator.SIN);

        PostfixList list6 = new PostfixList();
        list6.add(Math.PI);
        list6.add(Operator.SIN);

        PostfixList list7 = new PostfixList();
        list7.add(Math.PI * 1.5);
        list7.add(Operator.SIN);

        PostfixList list8 = new PostfixList();
        list8.add(Math.PI * 2);
        list8.add(Operator.SIN);


        Assert.assertEquals(0.0, calculator.postfixCalculate(list1), delta);
        Assert.assertEquals(0.5, calculator.postfixCalculate(list2), delta);
        Assert.assertEquals(0.7071067811, calculator.postfixCalculate(list3), delta);
        Assert.assertEquals(0.8660254037, calculator.postfixCalculate(list4), delta);
        Assert.assertEquals(1.0, calculator.postfixCalculate(list5), delta);
        Assert.assertEquals(0.0, calculator.postfixCalculate(list6), delta);
        Assert.assertEquals(-1, calculator.postfixCalculate(list7), delta);
        Assert.assertEquals(0.0, calculator.postfixCalculate(list8), delta);
    }

    @Test
    public void testPostfixCosDeg() {
        Calculator calculator = new Calculator();

        PostfixList list1 = new PostfixList();
        list1.add(0);
        list1.add(Operator.COS);

        PostfixList list2 = new PostfixList();
        list2.add(30);
        list2.add(Operator.COS);

        PostfixList list3 = new PostfixList();
        list3.add(45);
        list3.add(Operator.COS);

        PostfixList list4 = new PostfixList();
        list4.add(60);
        list4.add(Operator.COS);

        PostfixList list5 = new PostfixList();
        list5.add(90);
        list5.add(Operator.COS);

        PostfixList list6 = new PostfixList();
        list6.add(180);
        list6.add(Operator.COS);

        PostfixList list7 = new PostfixList();
        list7.add(270);
        list7.add(Operator.COS);

        PostfixList list8 = new PostfixList();
        list8.add(360);
        list8.add(Operator.COS);


        Assert.assertEquals(1.0, calculator.postfixCalculate(list1), delta);
        Assert.assertEquals(0.8660254037, calculator.postfixCalculate(list2), delta);
        Assert.assertEquals(0.7071067811, calculator.postfixCalculate(list3), delta);
        Assert.assertEquals(0.5, calculator.postfixCalculate(list4), delta);
        Assert.assertEquals(0, calculator.postfixCalculate(list5), delta);
        Assert.assertEquals(-1.0, calculator.postfixCalculate(list6), delta);
        Assert.assertEquals(0, calculator.postfixCalculate(list7), delta);
        Assert.assertEquals(1.0, calculator.postfixCalculate(list8), delta);
    }

    @Test
    public void testPostfixCosRad() {
        Calculator calculator = new Calculator(CalculateMode.RAD);

        PostfixList list1 = new PostfixList();
        list1.add(0);
        list1.add(Operator.COS);

        PostfixList list2 = new PostfixList();
        list2.add(Math.PI / 6);
        list2.add(Operator.COS);

        PostfixList list3 = new PostfixList();
        list3.add(Math.PI / 4);
        list3.add(Operator.COS);

        PostfixList list4 = new PostfixList();
        list4.add(Math.PI / 3);
        list4.add(Operator.COS);

        PostfixList list5 = new PostfixList();
        list5.add(Math.PI / 2);
        list5.add(Operator.COS);

        PostfixList list6 = new PostfixList();
        list6.add(Math.PI);
        list6.add(Operator.COS);

        PostfixList list7 = new PostfixList();
        list7.add(Math.PI * 1.5);
        list7.add(Operator.COS);

        PostfixList list8 = new PostfixList();
        list8.add(Math.PI * 2);
        list8.add(Operator.COS);


        Assert.assertEquals(1.0, calculator.postfixCalculate(list1), delta);
        Assert.assertEquals(0.8660254037, calculator.postfixCalculate(list2), delta);
        Assert.assertEquals(0.7071067811, calculator.postfixCalculate(list3), delta);
        Assert.assertEquals(0.5, calculator.postfixCalculate(list4), delta);
        Assert.assertEquals(0, calculator.postfixCalculate(list5), delta);
        Assert.assertEquals(-1.0, calculator.postfixCalculate(list6), delta);
        Assert.assertEquals(0, calculator.postfixCalculate(list7), delta);
        Assert.assertEquals(1.0, calculator.postfixCalculate(list8), delta);
    }

    @Test
    public void testPostfixTanDeg() {
        Calculator calculator = new Calculator();

        PostfixList list1 = new PostfixList();
        list1.add(0);
        list1.add(Operator.TAN);

        PostfixList list2 = new PostfixList();
        list2.add(30);
        list2.add(Operator.TAN);

        PostfixList list3 = new PostfixList();
        list3.add(45);
        list3.add(Operator.TAN);

        PostfixList list4 = new PostfixList();
        list4.add(60);
        list4.add(Operator.TAN);

        PostfixList list5 = new PostfixList();
        list5.add(90);
        list5.add(Operator.TAN);

        PostfixList list6 = new PostfixList();
        list6.add(180);
        list6.add(Operator.TAN);

        PostfixList list7 = new PostfixList();
        list7.add(270);
        list7.add(Operator.TAN);

        PostfixList list8 = new PostfixList();
        list8.add(360);
        list8.add(Operator.TAN);


        Assert.assertEquals(0, calculator.postfixCalculate(list1), delta);
        Assert.assertEquals(0.5773502691, calculator.postfixCalculate(list2), delta);
        Assert.assertEquals(1.0, calculator.postfixCalculate(list3), delta);
        Assert.assertEquals(1.7320508075, calculator.postfixCalculate(list4), delta);
        Assert.assertEquals(0, calculator.postfixCalculate(list6), delta);
        Assert.assertEquals(0, calculator.postfixCalculate(list8), delta);
    }

    @Test
    public void testPostfixTanRad() {
        Calculator calculator = new Calculator(CalculateMode.RAD);

        PostfixList list1 = new PostfixList();
        list1.add(0);
        list1.add(Operator.TAN);

        PostfixList list2 = new PostfixList();
        list2.add(Math.PI / 6);
        list2.add(Operator.TAN);

        PostfixList list3 = new PostfixList();
        list3.add(Math.PI / 4);
        list3.add(Operator.TAN);

        PostfixList list4 = new PostfixList();
        list4.add(Math.PI / 3);
        list4.add(Operator.TAN);

        PostfixList list5 = new PostfixList();
        list5.add(Math.PI / 2);
        list5.add(Operator.TAN);

        PostfixList list6 = new PostfixList();
        list6.add(Math.PI);
        list6.add(Operator.TAN);

        PostfixList list7 = new PostfixList();
        list7.add(Math.PI * 1.5);
        list7.add(Operator.TAN);

        PostfixList list8 = new PostfixList();
        list8.add(Math.PI * 2);
        list8.add(Operator.TAN);


        Assert.assertEquals(0, calculator.postfixCalculate(list1), delta);
        Assert.assertEquals(0.5773502691, calculator.postfixCalculate(list2), delta);
        Assert.assertEquals(1.0, calculator.postfixCalculate(list3), delta);
        Assert.assertEquals(1.7320508075, calculator.postfixCalculate(list4), delta);
        Assert.assertEquals(0, calculator.postfixCalculate(list6), delta);
        Assert.assertEquals(0, calculator.postfixCalculate(list8), delta);
    }

    @Test
    public void testPostfixAsinDeg() {
        Calculator calculator = new Calculator();

        PostfixList list1 = new PostfixList();
        list1.add(1.0);
        list1.add(Operator.ASIN);

        PostfixList list4 = new PostfixList();
        list4.add(0.5);
        list4.add(Operator.ASIN);

        PostfixList list5 = new PostfixList();
        list5.add(0);
        list5.add(Operator.ASIN);

        PostfixList list6 = new PostfixList();
        list6.add(-1.0);
        list6.add(Operator.ASIN);

        Assert.assertEquals(90, calculator.postfixCalculate(list1), delta);
        Assert.assertEquals(30, calculator.postfixCalculate(list4), delta);
        Assert.assertEquals(0, calculator.postfixCalculate(list5), delta);
        Assert.assertEquals(-90, calculator.postfixCalculate(list6), delta);
    }

    @Test
    public void testPostfixAsinRad() {
        Calculator calculator = new Calculator(CalculateMode.RAD);

        PostfixList list1 = new PostfixList();
        list1.add(1.0);
        list1.add(Operator.ASIN);

        PostfixList list4 = new PostfixList();
        list4.add(0.5);
        list4.add(Operator.ASIN);

        PostfixList list5 = new PostfixList();
        list5.add(0);
        list5.add(Operator.ASIN);

        PostfixList list6 = new PostfixList();
        list6.add(-1.0);
        list6.add(Operator.ASIN);

        Assert.assertEquals(Math.PI / 2, calculator.postfixCalculate(list1), delta);
        Assert.assertEquals(Math.PI / 6, calculator.postfixCalculate(list4), delta);
        Assert.assertEquals(0, calculator.postfixCalculate(list5), delta);
        Assert.assertEquals(-Math.PI / 2, calculator.postfixCalculate(list6), delta);
    }

    @Test
    public void testPostfixAcosDeg() {
        Calculator calculator = new Calculator();

        PostfixList list1 = new PostfixList();
        list1.add(1.0);
        list1.add(Operator.ACOS);

        PostfixList list4 = new PostfixList();
        list4.add(0.5);
        list4.add(Operator.ACOS);

        PostfixList list5 = new PostfixList();
        list5.add(0);
        list5.add(Operator.ACOS);

        PostfixList list6 = new PostfixList();
        list6.add(-1.0);
        list6.add(Operator.ACOS);

        Assert.assertEquals(0, calculator.postfixCalculate(list1), delta);
        Assert.assertEquals(60, calculator.postfixCalculate(list4), delta);
        Assert.assertEquals(90, calculator.postfixCalculate(list5), delta);
        Assert.assertEquals(180, calculator.postfixCalculate(list6), delta);
    }

    @Test
    public void testPostfixAcosRad() {
        Calculator calculator = new Calculator(CalculateMode.RAD);

        PostfixList list1 = new PostfixList();
        list1.add(1.0);
        list1.add(Operator.ACOS);

        PostfixList list4 = new PostfixList();
        list4.add(0.5);
        list4.add(Operator.ACOS);

        PostfixList list5 = new PostfixList();
        list5.add(0);
        list5.add(Operator.ACOS);

        PostfixList list6 = new PostfixList();
        list6.add(-1.0);
        list6.add(Operator.ACOS);

        Assert.assertEquals(0, calculator.postfixCalculate(list1), delta);
        Assert.assertEquals(Math.PI / 3, calculator.postfixCalculate(list4), delta);
        Assert.assertEquals(Math.PI / 2, calculator.postfixCalculate(list5), delta);
        Assert.assertEquals(Math.PI, calculator.postfixCalculate(list6), delta);
    }

    @Test
    public void testPostfixAtanDeg() {
        Calculator calculator = new Calculator(CalculateMode.DEG);

        PostfixList list1 = new PostfixList();
        list1.add(0);
        list1.add(Operator.ATAN);

        PostfixList list2 = new PostfixList();
        list2.add(Double.MAX_VALUE);
        list2.add(Operator.ATAN);

        PostfixList list3 = new PostfixList();
        list3.add(1);
        list3.add(Operator.ATAN);

        Assert.assertEquals(0, calculator.postfixCalculate(list1), delta);
        Assert.assertEquals(90.0, calculator.postfixCalculate(list2), delta);
        Assert.assertEquals(45.0, calculator.postfixCalculate(list3), delta);
    }

    @Test
    public void testPostfixAtanRad() {
        Calculator calculator = new Calculator(CalculateMode.RAD);

        PostfixList list1 = new PostfixList();
        list1.add(0);
        list1.add(Operator.ATAN);

        PostfixList list2 = new PostfixList();
        list2.add(Double.MAX_VALUE);
        list2.add(Operator.ATAN);

        PostfixList list3 = new PostfixList();
        list3.add(1);
        list3.add(Operator.ATAN);

        Assert.assertEquals(0, calculator.postfixCalculate(list1), delta);
        Assert.assertEquals(Math.PI / 2, calculator.postfixCalculate(list2), delta);
        Assert.assertEquals(Math.PI / 4, calculator.postfixCalculate(list3), delta);
    }

    @Test
    public void testPostfixLog() {
        Calculator calculator = new Calculator();

        PostfixList list1 = new PostfixList();
        list1.add(1000);
        list1.add(Operator.LOG);

        Assert.assertEquals(3.0, calculator.postfixCalculate(list1), delta);
    }

    @Test
    public void testPostfixLn() {
        Calculator calculator = new Calculator();

        PostfixList list1 = new PostfixList();
        list1.add(Math.E * Math.E * Math.E * Math.E);
        list1.add(Operator.LN);

        PostfixList list2 = new PostfixList();
        list2.add(Math.pow(2.7182818284, 4));
        list2.add(Operator.LN);

        Assert.assertEquals(4, calculator.postfixCalculate(list1), delta);
        Assert.assertEquals(4, calculator.postfixCalculate(list2), delta);
    }

    @Test
    public void testPostfixPer() {
        Calculator calculator = new Calculator();

        PostfixList list1 = new PostfixList();
        list1.add(45.6);
        list1.add(Operator.PER);

        Assert.assertEquals(0.456, calculator.postfixCalculate(list1), delta);
    }

    @Test
    public void textInfixToPostfix() {
        Calculator calculator = new Calculator(CalculateMode.DEG);

        // 1 + 5 * sin ( 30 + 45 )
        PostfixList postfixList = new PostfixList();
        postfixList.add(1.0);
        postfixList.add(5.0);
        postfixList.add(45.0);
        postfixList.add(45.0);
        postfixList.add(Operator.ADD);
        postfixList.add(Operator.SIN);
        postfixList.add(Operator.MUL);
        postfixList.add(Operator.ADD);

        Assert.assertEquals(postfixList, calculator.infixToPostfix("1 + 5 * sin ( 45 + 45 )"));

        //3 sin ( pi / 2 ) ln e ^ 2
        PostfixList postfixList1 = new PostfixList();
        postfixList1.add(3.0);
        postfixList1.add(Math.PI);
        postfixList1.add(2.0);
        postfixList1.add(Operator.DIV);
        postfixList1.add(Operator.SIN);
        postfixList1.add(Operator.MUL);
        postfixList1.add(Math.E);
        postfixList1.add(2.0);
        postfixList1.add(Operator.POW);
        postfixList1.add(Operator.LN);
        postfixList1.add(Operator.MUL);

        calculator.setCalculateMode(CalculateMode.RAD);

        Assert.assertEquals(postfixList1, calculator.infixToPostfix("3 sin ( pi / 2 ) ln e ^ 2"));
        
        //( 3 + 5 ) ( 4 + 6 )
        PostfixList postfixList2 = new PostfixList();
        postfixList2.add(3.0);
        postfixList2.add(5.0);
        postfixList2.add(Operator.ADD);
        postfixList2.add(4.0);
        postfixList2.add(6.0);
        postfixList2.add(Operator.ADD);
        postfixList2.add(Operator.MUL);

        Assert.assertEquals(postfixList2, calculator.infixToPostfix("( 3 + 5 ) ( 4 + 6 )"));
    }

    @Test
    public void testCalculate() {
        Calculator calculator = new Calculator();

        Assert.assertEquals(6.0, calculator.calculate("1 + 5 * sin ( 45 + 45 )"), delta);

        calculator.setCalculateMode(CalculateMode.RAD);
        Assert.assertEquals(6.0, calculator.calculate("3 sin ( pi / 2 ) ln e ^ 2"), delta);
        Assert.assertEquals(80.0, calculator.calculate("( 3 + 5 ) ( 4 + 6 )"), delta);
    }
}
package calculator;

import calculator.enums.CalculateMode;
import calculator.enums.Operator;
import calculator.list.CalculatorList;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testPostfixAdd() {
        Calculator calculator = new Calculator();

        CalculatorList list1 = new CalculatorList();
        list1.add(3);
        list1.add(5);
        list1.add(Operator.ADD);

        Assert.assertEquals(8.0, calculator.postfixCalculate(list1), 0.0000000001);
    }

    @Test
    public void testPostfixSub() {
        Calculator calculator = new Calculator();

        CalculatorList list1 = new CalculatorList();
        list1.add(3);
        list1.add(5);
        list1.add(Operator.SUB);

        Assert.assertEquals(-2.0, calculator.postfixCalculate(list1), 0.0000000001);
    }

    @Test
    public void testPostfixMul() {
        Calculator calculator = new Calculator();

        CalculatorList list1 = new CalculatorList();
        list1.add(3);
        list1.add(5);
        list1.add(Operator.MUL);

        Assert.assertEquals(15.0, calculator.postfixCalculate(list1), 0.0000000001);
    }

    @Test
    public void testPostfixDiv() {
        Calculator calculator = new Calculator();

        CalculatorList list1 = new CalculatorList();
        list1.add(3);
        list1.add(5);
        list1.add(Operator.DIV);

        Assert.assertEquals(0.6, calculator.postfixCalculate(list1), 0.0000000001);
    }

    @Test
    public void testPostfixAddSubMul() {
        Calculator calculator = new Calculator();

        CalculatorList list1 = new CalculatorList();
        list1.add(3);
        list1.add(5);
        list1.add(8);
        list1.add(Operator.MUL);
        list1.add(Operator.ADD);
        list1.add(6);
        list1.add(Operator.SUB);

        Assert.assertEquals(37.0, calculator.postfixCalculate(list1), 0.0000000001);
    }

    @Test
    public void testPostfixAddSubMulDiv() {
        Calculator calculator = new Calculator();

        CalculatorList list1 = new CalculatorList();
        list1.add(3);
        list1.add(5);
        list1.add(8);
        list1.add(Operator.MUL);
        list1.add(7);
        list1.add(Operator.DIV);
        list1.add(Operator.ADD);
        list1.add(6);
        list1.add(Operator.SUB);

        Assert.assertEquals(2.7142857142, calculator.postfixCalculate(list1), 0.0000000001);
    }

    @Test
    public void testPostfixSqrt() {
        Calculator calculator = new Calculator();

        CalculatorList list1 = new CalculatorList();
        list1.add(2);
        list1.add(Operator.SQRT);

        Assert.assertEquals(1.4142135623, calculator.postfixCalculate(list1), 0.0000000001);
    }

    @Test
    public void testPostfixFact() {
        Calculator calculator = new Calculator();

        CalculatorList list1 = new CalculatorList();
        list1.add(6);
        list1.add(Operator.FACT);

        Assert.assertEquals(720.0, calculator.postfixCalculate(list1), 0.0000000001);
    }

    @Test
    public void testPostfixSinDeg() {
        Calculator calculator = new Calculator();

        CalculatorList list1 = new CalculatorList();
        list1.add(0);
        list1.add(Operator.SIN);

        CalculatorList list2 = new CalculatorList();
        list2.add(30);
        list2.add(Operator.SIN);

        CalculatorList list3 = new CalculatorList();
        list3.add(45);
        list3.add(Operator.SIN);

        CalculatorList list4 = new CalculatorList();
        list4.add(60);
        list4.add(Operator.SIN);

        CalculatorList list5 = new CalculatorList();
        list5.add(90);
        list5.add(Operator.SIN);

        CalculatorList list6 = new CalculatorList();
        list6.add(180);
        list6.add(Operator.SIN);

        CalculatorList list7 = new CalculatorList();
        list7.add(270);
        list7.add(Operator.SIN);

        CalculatorList list8 = new CalculatorList();
        list8.add(360);
        list8.add(Operator.SIN);


        Assert.assertEquals(0.0, calculator.postfixCalculate(list1), 0.0000000001);
        Assert.assertEquals(0.5, calculator.postfixCalculate(list2), 0.0000000001);
        Assert.assertEquals(0.7071067811, calculator.postfixCalculate(list3), 0.0000000001);
        Assert.assertEquals(0.8660254037, calculator.postfixCalculate(list4), 0.0000000001);
        Assert.assertEquals(1.0, calculator.postfixCalculate(list5), 0.0000000001);
        Assert.assertEquals(0.0, calculator.postfixCalculate(list6), 0.0000000001);
        Assert.assertEquals(-1, calculator.postfixCalculate(list7), 0.0000000001);
        Assert.assertEquals(0.0, calculator.postfixCalculate(list8), 0.0000000001);
    }

    @Test
    public void testPostfixSinRad() {
        Calculator calculator = new Calculator(CalculateMode.RAD);

        CalculatorList list1 = new CalculatorList();
        list1.add(0);
        list1.add(Operator.SIN);

        CalculatorList list2 = new CalculatorList();
        list2.add(Math.PI / 6);
        list2.add(Operator.SIN);

        CalculatorList list3 = new CalculatorList();
        list3.add(Math.PI / 4);
        list3.add(Operator.SIN);

        CalculatorList list4 = new CalculatorList();
        list4.add(Math.PI / 3);
        list4.add(Operator.SIN);

        CalculatorList list5 = new CalculatorList();
        list5.add(Math.PI / 2);
        list5.add(Operator.SIN);

        CalculatorList list6 = new CalculatorList();
        list6.add(Math.PI);
        list6.add(Operator.SIN);

        CalculatorList list7 = new CalculatorList();
        list7.add(Math.PI * 1.5);
        list7.add(Operator.SIN);

        CalculatorList list8 = new CalculatorList();
        list8.add(Math.PI * 2);
        list8.add(Operator.SIN);


        Assert.assertEquals(0.0, calculator.postfixCalculate(list1), 0.0000000001);
        Assert.assertEquals(0.5, calculator.postfixCalculate(list2), 0.0000000001);
        Assert.assertEquals(0.7071067811, calculator.postfixCalculate(list3), 0.0000000001);
        Assert.assertEquals(0.8660254037, calculator.postfixCalculate(list4), 0.0000000001);
        Assert.assertEquals(1.0, calculator.postfixCalculate(list5), 0.0000000001);
        Assert.assertEquals(0.0, calculator.postfixCalculate(list6), 0.0000000001);
        Assert.assertEquals(-1, calculator.postfixCalculate(list7), 0.0000000001);
        Assert.assertEquals(0.0, calculator.postfixCalculate(list8), 0.0000000001);
    }

    @Test
    public void testPostfixCosDeg() {
        Calculator calculator = new Calculator();

        CalculatorList list1 = new CalculatorList();
        list1.add(0);
        list1.add(Operator.COS);

        CalculatorList list2 = new CalculatorList();
        list2.add(30);
        list2.add(Operator.COS);

        CalculatorList list3 = new CalculatorList();
        list3.add(45);
        list3.add(Operator.COS);

        CalculatorList list4 = new CalculatorList();
        list4.add(60);
        list4.add(Operator.COS);

        CalculatorList list5 = new CalculatorList();
        list5.add(90);
        list5.add(Operator.COS);

        CalculatorList list6 = new CalculatorList();
        list6.add(180);
        list6.add(Operator.COS);

        CalculatorList list7 = new CalculatorList();
        list7.add(270);
        list7.add(Operator.COS);

        CalculatorList list8 = new CalculatorList();
        list8.add(360);
        list8.add(Operator.COS);


        Assert.assertEquals(1.0, calculator.postfixCalculate(list1), 0.0000000001);
        Assert.assertEquals(0.8660254037, calculator.postfixCalculate(list2), 0.0000000001);
        Assert.assertEquals(0.7071067811, calculator.postfixCalculate(list3), 0.0000000001);
        Assert.assertEquals(0.5, calculator.postfixCalculate(list4), 0.0000000001);
        Assert.assertEquals(0, calculator.postfixCalculate(list5), 0.0000000001);
        Assert.assertEquals(-1.0, calculator.postfixCalculate(list6), 0.0000000001);
        Assert.assertEquals(0, calculator.postfixCalculate(list7), 0.0000000001);
        Assert.assertEquals(1.0, calculator.postfixCalculate(list8), 0.0000000001);
    }

    @Test
    public void testPostfixCosRad() {
        Calculator calculator = new Calculator(CalculateMode.RAD);

        CalculatorList list1 = new CalculatorList();
        list1.add(0);
        list1.add(Operator.COS);

        CalculatorList list2 = new CalculatorList();
        list2.add(Math.PI / 6);
        list2.add(Operator.COS);

        CalculatorList list3 = new CalculatorList();
        list3.add(Math.PI / 4);
        list3.add(Operator.COS);

        CalculatorList list4 = new CalculatorList();
        list4.add(Math.PI / 3);
        list4.add(Operator.COS);

        CalculatorList list5 = new CalculatorList();
        list5.add(Math.PI / 2);
        list5.add(Operator.COS);

        CalculatorList list6 = new CalculatorList();
        list6.add(Math.PI);
        list6.add(Operator.COS);

        CalculatorList list7 = new CalculatorList();
        list7.add(Math.PI * 1.5);
        list7.add(Operator.COS);

        CalculatorList list8 = new CalculatorList();
        list8.add(Math.PI * 2);
        list8.add(Operator.COS);


        Assert.assertEquals(1.0, calculator.postfixCalculate(list1), 0.0000000001);
        Assert.assertEquals(0.8660254037, calculator.postfixCalculate(list2), 0.0000000001);
        Assert.assertEquals(0.7071067811, calculator.postfixCalculate(list3), 0.0000000001);
        Assert.assertEquals(0.5, calculator.postfixCalculate(list4), 0.0000000001);
        Assert.assertEquals(0, calculator.postfixCalculate(list5), 0.0000000001);
        Assert.assertEquals(-1.0, calculator.postfixCalculate(list6), 0.0000000001);
        Assert.assertEquals(0, calculator.postfixCalculate(list7), 0.0000000001);
        Assert.assertEquals(1.0, calculator.postfixCalculate(list8), 0.0000000001);
    }

    @Test
    public void testPostfixTanDeg() {
        Calculator calculator = new Calculator();

        CalculatorList list1 = new CalculatorList();
        list1.add(0);
        list1.add(Operator.TAN);

        CalculatorList list2 = new CalculatorList();
        list2.add(30);
        list2.add(Operator.TAN);

        CalculatorList list3 = new CalculatorList();
        list3.add(45);
        list3.add(Operator.TAN);

        CalculatorList list4 = new CalculatorList();
        list4.add(60);
        list4.add(Operator.TAN);

        CalculatorList list5 = new CalculatorList();
        list5.add(90);
        list5.add(Operator.TAN);

        CalculatorList list6 = new CalculatorList();
        list6.add(180);
        list6.add(Operator.TAN);

        CalculatorList list7 = new CalculatorList();
        list7.add(270);
        list7.add(Operator.TAN);

        CalculatorList list8 = new CalculatorList();
        list8.add(360);
        list8.add(Operator.TAN);


        Assert.assertEquals(0, calculator.postfixCalculate(list1), 0.0000000001);
        Assert.assertEquals(0.5773502691, calculator.postfixCalculate(list2), 0.0000000001);
        Assert.assertEquals(1.0, calculator.postfixCalculate(list3), 0.0000000001);
        Assert.assertEquals(1.7320508075, calculator.postfixCalculate(list4), 0.0000000001);
        Assert.assertEquals(0, calculator.postfixCalculate(list6), 0.0000000001);
        Assert.assertEquals(0, calculator.postfixCalculate(list8), 0.0000000001);
    }

    @Test
    public void testPostfixTanRad() {
        Calculator calculator = new Calculator(CalculateMode.RAD);

        CalculatorList list1 = new CalculatorList();
        list1.add(0);
        list1.add(Operator.TAN);

        CalculatorList list2 = new CalculatorList();
        list2.add(Math.PI / 6);
        list2.add(Operator.TAN);

        CalculatorList list3 = new CalculatorList();
        list3.add(Math.PI / 4);
        list3.add(Operator.TAN);

        CalculatorList list4 = new CalculatorList();
        list4.add(Math.PI / 3);
        list4.add(Operator.TAN);

        CalculatorList list5 = new CalculatorList();
        list5.add(Math.PI / 2);
        list5.add(Operator.TAN);

        CalculatorList list6 = new CalculatorList();
        list6.add(Math.PI);
        list6.add(Operator.TAN);

        CalculatorList list7 = new CalculatorList();
        list7.add(Math.PI * 1.5);
        list7.add(Operator.TAN);

        CalculatorList list8 = new CalculatorList();
        list8.add(Math.PI * 2);
        list8.add(Operator.TAN);


        Assert.assertEquals(0, calculator.postfixCalculate(list1), 0.0000000001);
        Assert.assertEquals(0.5773502691, calculator.postfixCalculate(list2), 0.0000000001);
        Assert.assertEquals(1.0, calculator.postfixCalculate(list3), 0.0000000001);
        Assert.assertEquals(1.7320508075, calculator.postfixCalculate(list4), 0.0000000001);
        Assert.assertEquals(0, calculator.postfixCalculate(list6), 0.0000000001);
        Assert.assertEquals(0, calculator.postfixCalculate(list8), 0.0000000001);
    }

    //TODO asin, acos, atan

    @Test
    public void testPostfixLog() {
        Calculator calculator = new Calculator();

        CalculatorList list1 = new CalculatorList();
        list1.add(1000);
        list1.add(Operator.LOG);

        Assert.assertEquals(3.0, calculator.postfixCalculate(list1), 0.0000000001);
    }

    @Test
    public void testPostfixLn() {
        Calculator calculator = new Calculator();

        CalculatorList list1 = new CalculatorList();
        list1.add(Math.E * Math.E * Math.E * Math.E);
        list1.add(Operator.LN);

        CalculatorList list2 = new CalculatorList();
        list2.add(Math.pow(2.7182818284, 4));
        list2.add(Operator.LN);

        Assert.assertEquals(4, calculator.postfixCalculate(list1), 0.0000000001);
    }

    @Test
    public void testPostfixPer() {
        Calculator calculator = new Calculator();

        CalculatorList list1 = new CalculatorList();
        list1.add(45.6);
        list1.add(Operator.PER);

        Assert.assertEquals(0.456, calculator.postfixCalculate(list1), 0.0000000001);
    }
}
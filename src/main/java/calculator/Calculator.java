package calculator;

import calculator.enums.CalculateMode;
import calculator.enums.Operator;
import calculator.list.CalculatorList;

import java.util.Stack;

/**
 * <p>The calculator class that supports Four arithmetic operation and scientific calculation.</p>
 *
 * @author Seungmin Yang
 */
public class Calculator {

    private CalculateMode calculateMode;

    private Stack<Double> numberStack;
    private Stack<Operator> operatorStack;

    public Calculator() {
        calculateMode = CalculateMode.DEG;
    }

    public Calculator(CalculateMode calculateMode) {
        this.calculateMode = calculateMode;
    }

    public static void main(String[] args) {

        CalculatorList list = new CalculatorList();

        list.add(3);
        list.add(7);
        list.add(4);
        list.add(Operator.ADD);
        list.add(Operator.MUL);

        CalculatorList list2 = new CalculatorList();
        list2.add(3.14159265358979);
        list2.add(Operator.SIN);

        Calculator calculator = new Calculator(CalculateMode.RAD);
        System.out.println(calculator.postfixCalculate(list2));
    }

    public double postfixCalculate(CalculatorList expr) throws ClassCastException {
        numberStack = new Stack<>();
        operatorStack = new Stack<>();

        for (Object value : expr) {
            if (value instanceof Number) {
                numberStack.add(Double.parseDouble(value.toString()));
            } else if (value instanceof Operator) {
                switch ((Operator) value) {
                    case ADD:
                    case SUB:
                    case MUL:
                    case DIV:
                    case POW:
                        numberStack.push(calcWithTwoOperands(
                                numberStack.pop(),
                                numberStack.pop(),
                                (Operator) value));
                        break;
                    case SQRT:
                    case FACT:
                    case SIN:
                    case COS:
                    case TAN:
                    case ASIN:
                    case ACOS:
                    case ATAN:
                    case LOG:
                    case LN:
                    case PER:
                        numberStack.push(calcWithOneOperands(
                                numberStack.pop(),
                                (Operator) value));
                        break;
                }
            } else throw new ClassCastException("Not an Number or Operator object");
        }

        return numberStack.pop();
    }

    private double calcWithTwoOperands(double right, double left, Operator operator) {
        double result = 0;
        switch (operator) {
            case ADD:
                result = left + right;
                break;
            case SUB:
                result = left - right;
                break;
            case MUL:
                result = left * right;
                break;
            case DIV:
                result = left / right;
                break;
            case POW:
                result = Math.pow(left, right);
                break;
        }
        return result;
    }

    private double calcWithOneOperands(double value, Operator operator) {
        double radValue = value;
        double result = 0;
        switch (operator) {
            case SIN:
            case COS:
            case TAN:
            case ASIN:
            case ACOS:
            case ATAN:
                if (calculateMode == CalculateMode.DEG)
                    radValue = Math.toRadians(radValue);
                break;
        }
        switch (operator) {
            case SQRT:
                result = Math.sqrt(value);
                break;
            case FACT:
                if (value == (int) value)
                    result = MathUtil.factorial((int) value);
                else
                    throw new ArithmeticException("Factorial can only be calculated when a given number is positive number.");
                break;
            case SIN:
                result = Math.sin(radValue);
                break;
            case COS:
                result = Math.cos(radValue);
                break;
            case TAN:
                result = Math.tan(radValue);
                break;
            case ASIN:
                result = Math.asin(radValue);
                break;
            case ACOS:
                result = Math.acos(radValue);
                break;
            case ATAN:
                result = Math.atan(radValue);
                break;
            case LOG:
                result = Math.log10(value);
                break;
            case LN:
                result = Math.log(value);
                break;
            case PER:
                result = value / 100;
        }
        return result;
    }
}

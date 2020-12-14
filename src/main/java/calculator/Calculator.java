package calculator;

import calculator.enums.CalculateMode;
import calculator.enums.Operator;
import calculator.list.CalculatorList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

/**
 * <p>The calculator class that supports Four arithmetic operation and scientific calculation.</p>
 *
 * @author Seungmin Yang
 */
public class Calculator {

    private CalculateMode calculateMode;

    private Stack<Double> numberStack;

    CalculatorList calculatorList;
    LinkedList<Operator> operatorStack;

    public Calculator() {
        calculateMode = CalculateMode.DEG;
    }

    public Calculator(CalculateMode calculateMode) {
        this.calculateMode = calculateMode;
    }

    public CalculatorList infixToPostfix(String infixExpr) throws IllegalArgumentException {
        calculatorList = new CalculatorList();
        operatorStack = new LinkedList<>();
        for (String expr : infixExpr.split(" ")) {
            if (MathUtil.isNumeric(expr)) { //When the expr is numeric
                calculatorList.push(Double.parseDouble(expr));
            } else {
                switch (expr) {
                    //When the expr is numeric but included non-number
                    case "PI":
                        calculatorList.push(Math.PI);
                        break;
                    case "e":
                        calculatorList.push(Math.E);
                        break;
                    case "(": //When the expr is (
                        operatorStack.push(Operator.OPENBR);
                        break;
                    case ")": //When the expr is )
                        while (operatorStack.peek() != Operator.OPENBR) {
                            calculatorList.push(operatorStack.pop());
                        }
                        operatorStack.pop();
                        break;
                    //When the expr is operators
                    case "+":
                        infixToPostfixOperator(Operator.ADD);
                        break;
                    case "-":
                        infixToPostfixOperator(Operator.SUB);
                        break;
                    case "×":
                    case "*":
                        infixToPostfixOperator(Operator.MUL);
                        break;
                    case "÷":
                    case "/":
                        infixToPostfixOperator(Operator.DIV);
                        break;
                    case "^":
                        infixToPostfixOperator(Operator.POW);
                        break;
                    case "\u221A":
                        infixToPostfixOperator(Operator.SQRT);
                        break;
                    case "!":
                        infixToPostfixOperator(Operator.FACT);
                        break;
                    case "sin":
                        infixToPostfixOperator(Operator.SIN);
                        break;
                    case "cos":
                        infixToPostfixOperator(Operator.COS);
                        break;
                    case "tan":
                        infixToPostfixOperator(Operator.TAN);
                        break;
                    case "sin\u207b\u00b9":
                        infixToPostfixOperator(Operator.ASIN);
                        break;
                    case "cos\u207b\u00b9":
                        infixToPostfixOperator(Operator.ACOS);
                        break;
                    case "tan\u207b\u00b9":
                        infixToPostfixOperator(Operator.ATAN);
                        break;
                    case "log":
                        infixToPostfixOperator(Operator.LOG);
                        break;
                    case "ln":
                        infixToPostfixOperator(Operator.LN);
                        break;
                    case "%":
                        infixToPostfixOperator(Operator.PER);
                        break;
                    default: //When the expr is not supported, throws IllegalArgumentException
                        throw new IllegalArgumentException("Unsupported expression. Did you put a space between numbers and operators?");
                }
            }
        }

        while (operatorStack.size() != 0) {
            calculatorList.push(operatorStack.pop());
        }

        Collections.reverse(calculatorList);

        return calculatorList;
    }

    private void infixToPostfixOperator(Operator operator) {
        if (operatorStack.size() == 0) operatorStack.push(operator);
        else {
            while (operatorStack.size() > 0 && operatorStack.peek() != Operator.OPENBR && operatorStack.peek().getPriority() >= operator.getPriority()) {
                calculatorList.push(operatorStack.pop());
            }
            operatorStack.push(operator);
        }
    }

    public double postfixCalculate(CalculatorList expr) throws ClassCastException {
        numberStack = new Stack<>();

        for (Object value : expr) {
            if (value instanceof Number) {
                numberStack.add(Double.parseDouble(value.toString()));
            } else if (value instanceof Operator) {
                switch ((Operator) value) {
                    //This is an operator that requires 2 operands.
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
                    //This is an operator that requires 1 operand.
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
                //Throw when the value of the list is not Number or Operator object
            } else throw new ClassCastException("Not an Number or Operator object");
        }

        return numberStack.pop();
    }

    private double calcWithTwoOperands(double right, double left, Operator operator) {
        double result = 0;
        //Calculation part
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
        //deg2rad part
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
        //Calculation part
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

package calculator;

import calculator.enums.CalculateMode;
import calculator.enums.Operator;
import calculator.list.PostfixList;
import org.jetbrains.annotations.NotNull;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Stack;

/**
 * <p>The calculator class that supports Four arithmetic operation and scientific calculation.</p>
 *
 * <h3>Supported expression</h3>
 * <p>
 * - Number (positive, negative, decimal, and reserved words such as PI(3.14...), e(2.72...))<br>
 * - Four arithmetic operation ( + - * / )<br>
 * - Braces ( '(' ')' )<br>
 * - Pow ( ^ )<br>
 * - Sqrt<br>
 * - Percentage ( % )<br>
 * - Factorial ( ! )<br>
 * - Log (log10, loge[ln])<br>
 * - Trigonometric operation ( sin cos tan asin acos atan ) with Degree or Radian calculation<br>
 * </p>
 *
 * @author Seungmin Yang
 */
public class Calculator {
    private CalculateMode calculateMode;

    private Stack<Double> numberStack;

    private PostfixList postfixList;
    private LinkedList<Operator> operatorStack;

    /**
     * <p>
     * The public constructor contains no parameter.
     * Set {@code calculateMode} to Degree. It will calculate trigonometric function as Degree.
     * </p>
     *
     * @see CalculateMode
     */
    public Calculator() {
        calculateMode = CalculateMode.DEG;
    }

    /**
     * <p>The public constructor contains {@code calculateMode} parameter.</p>
     * <p>You can initialize with {@code calculateMode}.</p>
     *
     * @param calculateMode <p>{@code CalculateMode.DEG} : Calculate trigonometric function as Degree.<br>
     *                      {@code CalculateMode.RAD} : Calculate trigonometric function as Radian.</p>
     * @see CalculateMode
     */
    public Calculator(CalculateMode calculateMode) {
        this.calculateMode = calculateMode;
    }

    /**
     * <p>Returns a {@code DecimalFormat} with maximum 10 digits.</p>
     *
     * @return {@code DecimalFormat} object with maximum 10 digits.
     */
    public static DecimalFormat getDefaultDecimalFormat() {
        return getDefaultDecimalFormat(10);
    }

    /**
     * <p>Returns a {@code DecimalFormat} that will be used to format double to string.</p>
     *
     * @param digits Maximum number of digits.
     * @return {@code DecimalFormat} object. It will be used to format calculation double value
     */
    public static DecimalFormat getDefaultDecimalFormat(int digits) {
        StringBuilder pattern = new StringBuilder("0");
        for (int i = 0; i < digits; i++) {
            if (i == 0) pattern.append(".");
            pattern.append("#");
        }
        return new DecimalFormat(pattern.toString());
    }

    /**
     * <p>Convert infix string math expression to Postfix Calculator list.<br>
     * Note that you must be make a space each element of expression like<br>
     * {@code "1 + 5 * sin ( 30 + 45 )"}<br>
     * {@code "3 sin ( pi / 2 ) ln e ^ 2"}</p>
     *
     * @param infixExpression Infix string math expression.
     * @return postfix expression list inside {@code PostfixList} object
     * @throws IllegalArgumentException When the given expression contains not supported element, or space of each element of expression.
     * @throws ClassCastException       If the element inside PostfixList is not supported element.
     * @see PostfixList
     */
    public PostfixList infixToPostfix(@NotNull String infixExpression) throws IllegalArgumentException, ClassCastException {
        postfixList = new PostfixList();
        operatorStack = new LinkedList<>();
        String before = null;
        infixExpression = infixExpression.replaceAll(" {2,}", " ");
        for (String expr : infixExpression.split(" ")) {
            //If the first expr is '-', insert 0 before being inserted '-'
            if (before == null && expr.equals("-")) {
                postfixList.push(0.0);
            }

            if (MathUtil.isNumeric(expr)) { //When the expr is numeric
                postfixList.push(Double.parseDouble(expr));
            } else {
                switch (expr.toLowerCase(Locale.ROOT)) {
                    //When the expr is numeric but included non-number
                    case "pi":
                        putMulIfMoj(before);
                        postfixList.push(Math.PI);
                        break;
                    case "e":
                        putMulIfMoj(before);
                        postfixList.push(Math.E);
                        break;

                    case "(": //When the expr is (
                        putMulIfMoj(before);
                        operatorStack.push(Operator.OPENBR);
                        break;
                    case ")": //When the expr is )
                        while (operatorStack.peek() != Operator.OPENBR) {
                            postfixList.push(operatorStack.pop());
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
                    case "sqrt":
                        putMulIfMoj(before);
                        infixToPostfixOperator(Operator.SQRT);
                        break;
                    case "!":
                        infixToPostfixOperator(Operator.FACT);
                        break;
                    case "sin":
                        putMulIfMoj(before);
                        infixToPostfixOperator(Operator.SIN);
                        break;
                    case "cos":
                        putMulIfMoj(before);
                        infixToPostfixOperator(Operator.COS);
                        break;
                    case "tan":
                        putMulIfMoj(before);
                        infixToPostfixOperator(Operator.TAN);
                        break;
                    case "sin\u207b\u00b9":
                    case "asin":
                    case "arcsin":
                        putMulIfMoj(before);
                        infixToPostfixOperator(Operator.ASIN);
                        break;
                    case "cos\u207b\u00b9":
                    case "acos":
                    case "arccos":
                        putMulIfMoj(before);
                        infixToPostfixOperator(Operator.ACOS);
                        break;
                    case "tan\u207b\u00b9":
                    case "atan":
                    case "arctan":
                        putMulIfMoj(before);
                        infixToPostfixOperator(Operator.ATAN);
                        break;
                    case "log":
                        putMulIfMoj(before);
                        infixToPostfixOperator(Operator.LOG);
                        break;
                    case "ln":
                        putMulIfMoj(before);
                        infixToPostfixOperator(Operator.LN);
                        break;
                    case "%":
                        infixToPostfixOperator(Operator.PER);
                        break;

                    //When the expr is not supported, throws IllegalArgumentException
                    default:
                        throw new IllegalArgumentException("Unsupported expression. Did you put a space between numbers and operators?");
                }
            }
            before = expr;
        }

        while (operatorStack.size() != 0) {
            postfixList.push(operatorStack.pop());
        }

        Collections.reverse(postfixList);

        return postfixList;
    }

    private void infixToPostfixOperator(Operator operator) {
        while (operatorStack.size() > 0 && operatorStack.peek() != Operator.OPENBR && operatorStack.peek().getPriority() >= operator.getPriority()) {
            postfixList.push(operatorStack.pop());
        }

        operatorStack.push(operator);
    }

    private void putMulIfMoj(String before) {
        if (before != null)
            if (MathUtil.isNumeric(before)) {
                infixToPostfixOperator(Operator.MUL);
            } else {
                switch (before.toLowerCase(Locale.ROOT)) {
                    case "pi":
                    case "e":
                    case ")":
                        infixToPostfixOperator(Operator.MUL);
                }
            }
    }

    /**
     * Calculate infix string expression.
     *
     * <p>
     * Note that you must be make a space each element of expression like<br>
     * {@code "1 + 5 * sin ( 30 + 45 )"}<br>
     * {@code "3 sin ( pi / 2 ) ln e ^ 2"}
     * </p>
     *
     * @param infixExpression Infix string math expression.
     * @return The result of calculation
     * @throws IllegalArgumentException When the given expression contains not supported element, or space of each element of expression.
     * @throws ClassCastException       If the element inside PostfixList is not supported element.
     */
    public double calculate(@NotNull String infixExpression) throws IllegalArgumentException, ClassCastException {
        return postfixCalculate(infixToPostfix(infixExpression));
    }

    /**
     * <p>Calculate postfix expression {@code PostfixList}</p>
     *
     * @param expr postfix expression {@code PostfixList} object
     * @return The result of calculation
     * @throws ClassCastException If the element inside PostfixList is not supported element.
     */
    public double postfixCalculate(@NotNull PostfixList expr) throws ClassCastException {
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

    private double calcWithTwoOperands(double right, double left, @NotNull Operator operator) {
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

    private double calcWithOneOperands(double value, @NotNull Operator operator) {
        double radValue = value;
        double result = 0;
        //deg2rad part
        switch (operator) {
            case SIN:
            case COS:
            case TAN:
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
                if (calculateMode == CalculateMode.DEG)
                    result = Math.toDegrees(result);
                break;
            case ACOS:
                result = Math.acos(radValue);
                if (calculateMode == CalculateMode.DEG)
                    result = Math.toDegrees(result);
                break;
            case ATAN:
                result = Math.atan(radValue);
                if (calculateMode == CalculateMode.DEG)
                    result = Math.toDegrees(result);
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

    /**
     * <p>Returns current calculate mode.</p>
     *
     * @return current calculate mode. this can be {@code CalculatorMode.DEG} or {@code CalculatorMode.DEG}.
     */
    public CalculateMode getCalculateMode() {
        return calculateMode;
    }

    /**
     * Set calculate mode to {@code CalculatorMode.DEG} or {@code CalculatorMode.DEG}.
     *
     * @param calculateMode <p>{@code CalculateMode.DEG} : Calculate trigonometric function as Degree.<br>
     *                      {@code CalculateMode.RAD} : Calculate trigonometric function as Radian.</p>
     */
    public void setCalculateMode(CalculateMode calculateMode) {
        this.calculateMode = calculateMode;
    }
}

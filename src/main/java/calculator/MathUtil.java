package calculator;

public class MathUtil {
    public static double factorial(int n) {
        double result = 1.0;
        for(int i = n; i > 1; i--) {
            result *= i;
        }

        return result;
    }
}

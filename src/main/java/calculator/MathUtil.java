package calculator;

import java.util.regex.Pattern;

public class MathUtil {
    private static final Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    public static double factorial(int n) {
        double result = 1.0;
        for(int i = n; i > 1; i--) {
            result *= i;
        }

        return result;
    }

    public static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        return pattern.matcher(str).matches();
    }
}

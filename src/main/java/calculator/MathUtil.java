package calculator;

import java.util.regex.Pattern;

/**
 * <p>{@code MathUtil} is the util class related to math that is not supported the original {@code java.util.Math} class.</p>
 */
public class MathUtil {
    private static final Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    /**
     * Calculate factorial of n
     *
     * @param n positive integer number
     * @return n factorial double value
     */
    public static double factorial(int n) {
        double result = 1.0;
        for (int i = n; i > 1; i--) {
            result *= i;
        }

        return result;
    }

    /**
     * Check if a given string is numeric.
     *
     * @param str String to check
     * @return true if str is numeric.
     */
    public static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }

        return pattern.matcher(str).matches();
    }
}

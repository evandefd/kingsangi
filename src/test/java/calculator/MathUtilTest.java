package calculator;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MathUtilTest {

    @Test
    public void testFactorial() {
        Assert.assertEquals(720, MathUtil.factorial(6), 0.0000000001);
    }

    @Test
    public void testIsNumeric() {
        Assert.assertTrue(MathUtil.isNumeric("0"));
        Assert.assertTrue(MathUtil.isNumeric("-10"));
        Assert.assertTrue(MathUtil.isNumeric("10"));
        Assert.assertTrue(MathUtil.isNumeric("0.0"));
        Assert.assertTrue(MathUtil.isNumeric("-10.0"));
        Assert.assertTrue(MathUtil.isNumeric("10.0"));

        Assert.assertFalse(MathUtil.isNumeric("+"));
        Assert.assertFalse(MathUtil.isNumeric("-"));
        Assert.assertFalse(MathUtil.isNumeric("*"));
        Assert.assertFalse(MathUtil.isNumeric("/"));
        Assert.assertFalse(MathUtil.isNumeric("\u221A"));
        Assert.assertFalse(MathUtil.isNumeric("%"));

    }

}
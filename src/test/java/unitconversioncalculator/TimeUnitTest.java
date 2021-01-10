package unitconversioncalculator;

import org.junit.Assert;
import org.junit.Test;

public class TimeUnitTest {
    private static final double suitable = 10.0;
    private static final double bigger = 10000000000.0;
    private static final double smaller = -0.00000000001;
    private static final double delta = 0.00000001;

    // SECOND, MINUTE, HOUR, DAY, WEEK
    // Second, Minute, Hour, Day, Week

    @Test
    public void testSECONDToSecond() {
        Assert.assertEquals(10.0, TimeUnit.SECOND.convert(suitable, TimeUnit.SECOND), delta);
        Assert.assertEquals(10000000000.0, TimeUnit.SECOND.convert(bigger, TimeUnit.SECOND), delta);
        Assert.assertEquals(-0.00000000001, TimeUnit.SECOND.convert(smaller, TimeUnit.SECOND), delta);
    }
    @Test
    public void testSECONDToMinute() {
        Assert.assertEquals(0.16666666666667, TimeUnit.SECOND.convert(suitable, TimeUnit.MINUTE), delta);
        Assert.assertEquals(1.6666666666666666 * Math.pow(10, 8), TimeUnit.SECOND.convert(bigger, TimeUnit.MINUTE), delta);
        Assert.assertEquals(-1.6666666666667 * Math.pow(10, -13), TimeUnit.SECOND.convert(smaller, TimeUnit.MINUTE), delta);
    }
    @Test
    public void testSECONDToHour() {
        Assert.assertEquals(0.0027777777777778, TimeUnit.SECOND.convert(suitable, TimeUnit.HOUR), delta);
        Assert.assertEquals(2.7777777777777778 * Math.pow(10, 6), TimeUnit.SECOND.convert(bigger, TimeUnit.HOUR), delta);
        Assert.assertEquals(-2.7777777777778 * Math.pow(10, -15), TimeUnit.SECOND.convert(smaller, TimeUnit.HOUR), delta);
    }
    @Test
    public void testSECONDToDay() {
        Assert.assertEquals(0.00011574074074074, TimeUnit.SECOND.convert(suitable, TimeUnit.DAY), delta);
        Assert.assertEquals(1.1574074074074074 * Math.pow(10, 5), TimeUnit.SECOND.convert(bigger, TimeUnit.DAY), delta);
        Assert.assertEquals(-1.1574074074074 * Math.pow(10, -16), TimeUnit.SECOND.convert(smaller, TimeUnit.DAY), delta);
    }
    @Test
    public void testSECONDToWeek() {
        Assert.assertEquals(1.6534391534392 * Math.pow(10, -5), TimeUnit.SECOND.convert(suitable, TimeUnit.WEEK), delta);
        Assert.assertEquals(1.6534391534391536 * Math.pow(10, 4), TimeUnit.SECOND.convert(bigger, TimeUnit.WEEK), delta);
        Assert.assertEquals(-1.6534391534392 * Math.pow(10, -17), TimeUnit.SECOND.convert(smaller, TimeUnit.WEEK), delta);
    }
    @Test
    public void testMINUTEToSecond() {
        Assert.assertEquals(600, TimeUnit.MINUTE.convert(suitable, TimeUnit.SECOND), delta);
        Assert.assertEquals(6 * Math.pow(10, 11), TimeUnit.MINUTE.convert(bigger, TimeUnit.SECOND), delta);
        Assert.assertEquals(-6.0 * Math.pow(10, -10), TimeUnit.MINUTE.convert(smaller, TimeUnit.SECOND), delta);
    }
    @Test
    public void testMINUTEToMinute() {
        Assert.assertEquals(10, TimeUnit.MINUTE.convert(suitable, TimeUnit.MINUTE), delta);
        Assert.assertEquals(10000000000.0, TimeUnit.MINUTE.convert(bigger, TimeUnit.MINUTE), delta);
        Assert.assertEquals(-0.00000000001, TimeUnit.MINUTE.convert(smaller, TimeUnit.MINUTE), delta);
    }
    @Test
    public void testMINUTEToHour() {
        Assert.assertEquals(0.16666666666667, TimeUnit.MINUTE.convert(suitable, TimeUnit.HOUR), delta);
        Assert.assertEquals(1.6666666666666666 * Math.pow(10, 8), TimeUnit.MINUTE.convert(bigger, TimeUnit.HOUR), delta);
        Assert.assertEquals(-1.6666666666667 * Math.pow(10, -13), TimeUnit.MINUTE.convert(smaller, TimeUnit.HOUR), delta);
    }
    @Test
    public void testMINUTEToDay() {
        Assert.assertEquals(0.0069444444444444, TimeUnit.MINUTE.convert(suitable, TimeUnit.DAY), delta);
        Assert.assertEquals(6.94444444444444 * Math.pow(10, 6), TimeUnit.MINUTE.convert(bigger, TimeUnit.DAY), delta);
        Assert.assertEquals(-6.9444444444444 * Math.pow(10, -15), TimeUnit.MINUTE.convert(smaller, TimeUnit.DAY), delta);
    }
    @Test
    public void testMINUTEToWeek() {
        Assert.assertEquals(0.00099206349206349, TimeUnit.MINUTE.convert(suitable, TimeUnit.WEEK), delta);
        Assert.assertEquals(9.920634920634921 * Math.pow(10, 5), TimeUnit.MINUTE.convert(bigger, TimeUnit.WEEK), delta);
        Assert.assertEquals(-9.9206349206349 * Math.pow(10, -16), TimeUnit.MINUTE.convert(smaller, TimeUnit.WEEK), delta);
    }
    @Test
    public void testHOURToSecond() {
        Assert.assertEquals(3.6 * Math.pow(10, 4), TimeUnit.HOUR.convert(suitable, TimeUnit.SECOND), delta);
        Assert.assertEquals(3.6 * Math.pow(10, 13), TimeUnit.HOUR.convert(bigger, TimeUnit.SECOND), delta);
        Assert.assertEquals(-3.6 * Math.pow(10, -8), TimeUnit.HOUR.convert(smaller, TimeUnit.SECOND), delta);
    }
    @Test
    public void testHOURToMinute() {
        Assert.assertEquals(600, TimeUnit.HOUR.convert(suitable, TimeUnit.MINUTE), delta);
        Assert.assertEquals(6 * Math.pow(10, 11), TimeUnit.HOUR.convert(bigger, TimeUnit.MINUTE), delta);
        Assert.assertEquals(-6 * Math.pow(10, -10), TimeUnit.HOUR.convert(smaller, TimeUnit.MINUTE), delta);
    }
    @Test
    public void testHOURToHour() {
        Assert.assertEquals(10, TimeUnit.HOUR.convert(suitable, TimeUnit.HOUR), delta);
        Assert.assertEquals(10000000000.0, TimeUnit.HOUR.convert(bigger, TimeUnit.HOUR), delta);
        Assert.assertEquals(-0.00000000001, TimeUnit.HOUR.convert(smaller, TimeUnit.HOUR), delta);
    }
    @Test
    public void testHOURToDay() {
        Assert.assertEquals(0.41666666666667, TimeUnit.HOUR.convert(suitable, TimeUnit.DAY), delta);
        Assert.assertEquals(4.1666666666666667 * Math.pow(10, 8), TimeUnit.HOUR.convert(bigger, TimeUnit.DAY), delta);
        Assert.assertEquals(-4.1666666666667 * Math.pow(10, -13), TimeUnit.HOUR.convert(smaller, TimeUnit.DAY), delta);
    }
    @Test
    public void testHOURToWeek() {
        Assert.assertEquals(0.05952380952381, TimeUnit.HOUR.convert(suitable, TimeUnit.WEEK), delta);
        Assert.assertEquals(5.952380952380952 * Math.pow(10, 7), TimeUnit.HOUR.convert(bigger, TimeUnit.WEEK), delta);
        Assert.assertEquals(-5.952380952381 * Math.pow(10, -14), TimeUnit.HOUR.convert(smaller, TimeUnit.WEEK), delta);
    }
    @Test
    public void testDAYToSecond() {
        Assert.assertEquals(8.64 * Math.pow(10, 5), TimeUnit.DAY.convert(suitable, TimeUnit.SECOND), delta);
        Assert.assertEquals(8.64 * Math.pow(10, 14), TimeUnit.DAY.convert(bigger, TimeUnit.SECOND), delta);
        Assert.assertEquals(-8.64 * Math.pow(10, -7), TimeUnit.DAY.convert(smaller, TimeUnit.SECOND), delta);
    }
    @Test
    public void testDAYToMinute() {
        Assert.assertEquals(1.44 * Math.pow(10, 4), TimeUnit.DAY.convert(suitable, TimeUnit.MINUTE), delta);
        Assert.assertEquals(1.44 * Math.pow(10, 13), TimeUnit.DAY.convert(bigger, TimeUnit.MINUTE), delta);
        Assert.assertEquals(-1.44 * Math.pow(10, -8), TimeUnit.DAY.convert(smaller, TimeUnit.MINUTE), delta);
    }
    @Test
    public void testDAYToHour() {
        Assert.assertEquals(2.4 * Math.pow(10, 2), TimeUnit.DAY.convert(suitable, TimeUnit.HOUR), delta);
        Assert.assertEquals(2.4 * Math.pow(10, 11), TimeUnit.DAY.convert(bigger, TimeUnit.HOUR), delta);
        Assert.assertEquals(-2.4 * Math.pow(10, -10), TimeUnit.DAY.convert(smaller, TimeUnit.HOUR), delta);
    }
    @Test
    public void testDAYToDay() {
        Assert.assertEquals(10.0, TimeUnit.DAY.convert(suitable, TimeUnit.DAY), delta);
        Assert.assertEquals(10000000000.0, TimeUnit.DAY.convert(bigger, TimeUnit.DAY), delta);
        Assert.assertEquals(-0.00000000001, TimeUnit.DAY.convert(smaller, TimeUnit.DAY), delta);
    }
    @Test
    public void testDAYToWeek() {
        Assert.assertEquals(1.4285714285714, TimeUnit.DAY.convert(suitable, TimeUnit.WEEK), delta);
        Assert.assertEquals(1.4285714285714285 * Math.pow(10, 9), TimeUnit.DAY.convert(bigger, TimeUnit.WEEK), delta);
        Assert.assertEquals(-1.4285714285714 * Math.pow(10, -12), TimeUnit.DAY.convert(smaller, TimeUnit.WEEK), delta);
    }
    @Test
    public void testWEEKToSecond() {
        Assert.assertEquals(6.048 * Math.pow(10, 6), TimeUnit.WEEK.convert(suitable, TimeUnit.SECOND), delta);
        Assert.assertEquals(6.048 * Math.pow(10, 15), TimeUnit.WEEK.convert(bigger, TimeUnit.SECOND), delta);
        Assert.assertEquals(-6.048 * Math.pow(10, -6), TimeUnit.WEEK.convert(smaller, TimeUnit.SECOND), delta);
    }
    @Test
    public void testWEEKToMinute() {
        Assert.assertEquals(1.008 * Math.pow(10, 5), TimeUnit.WEEK.convert(suitable, TimeUnit.MINUTE), delta);
        Assert.assertEquals(1.008 * Math.pow(10, 14), TimeUnit.WEEK.convert(bigger, TimeUnit.MINUTE), delta);
        Assert.assertEquals(-1.008 * Math.pow(10, -7), TimeUnit.WEEK.convert(smaller, TimeUnit.MINUTE), delta);
    }
    @Test
    public void testWEEKToHour() {
        Assert.assertEquals(1.68 * Math.pow(10, 3), TimeUnit.WEEK.convert(suitable, TimeUnit.HOUR), delta);
        Assert.assertEquals(1.68 * Math.pow(10, 12), TimeUnit.WEEK.convert(bigger, TimeUnit.HOUR), delta);
        Assert.assertEquals(-1.68 * Math.pow(10, -9), TimeUnit.WEEK.convert(smaller, TimeUnit.HOUR), delta);
    }
    @Test
    public void testWEEKToDay() {
        Assert.assertEquals(70, TimeUnit.WEEK.convert(suitable, TimeUnit.DAY), delta);
        Assert.assertEquals(7 * Math.pow(10, 10), TimeUnit.WEEK.convert(bigger, TimeUnit.DAY), delta);
        Assert.assertEquals(-7 * Math.pow(10, -11), TimeUnit.WEEK.convert(smaller, TimeUnit.DAY), delta);
    }
    @Test
    public void testWEEKToWeek() {
        Assert.assertEquals(10.0, TimeUnit.WEEK.convert(suitable, TimeUnit.WEEK), delta);
        Assert.assertEquals(10000000000.0, TimeUnit.WEEK.convert(bigger, TimeUnit.WEEK), delta);
        Assert.assertEquals(-0.00000000001, TimeUnit.WEEK.convert(smaller, TimeUnit.WEEK), delta);
    }
}
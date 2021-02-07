package unitconversioncalculator;

import org.junit.Assert;
import org.junit.Test;

public class SpeedUnitTest {
    private static final double suitable = 10.0;
    private static final double bigger = 10000000000.0;
    private static final double delta = 0.00000001;

    /*METERPERSECOND, METERPERHOUR, KILOMETERPERSECOND, KILOMETERPERHOUR, INCHPERSECOND, INCHPERHOUR, FEETPERSECOND, FEETPERHOUR, MILEPERSECOND,
    MILEPERHOUR, KNOT*/
    /*MeterPerSecond, MeterPerHour, KilometerPerSecond, KilometerPerHour, InchPerSecond, InchPerHour, FeetPerSecond, FeetPerHour, MilePerSecond,
    MilePerHour, Knot*/

    @Test
    public void testMETERPERSECONDToMeterPerSecond() {
        Assert.assertEquals(10.0, SpeedUnit.METERPERSECOND.convert(suitable, SpeedUnit.METERPERSECOND), delta);
        Assert.assertEquals(10000000000.0, SpeedUnit.METERPERSECOND.convert(bigger, SpeedUnit.METERPERSECOND), delta);
    }
    @Test
    public void testMETERPERSECONDToMeterPerHour() {
        Assert.assertEquals(3.6 * Math.pow(10, 4), SpeedUnit.METERPERSECOND.convert(suitable, SpeedUnit.METERPERHOUR), delta);
        Assert.assertEquals(3.6 * Math.pow(10, 13), SpeedUnit.METERPERSECOND.convert(bigger, SpeedUnit.METERPERHOUR), delta);
    }
    @Test
    public void testMETERPERSECONDToKilometerPerSecond() {
        Assert.assertEquals(0.01, SpeedUnit.METERPERSECOND.convert(suitable, SpeedUnit.KILOMETERPERSECOND), delta);
        Assert.assertEquals(Math.pow(10, 7), SpeedUnit.METERPERSECOND.convert(bigger, SpeedUnit.KILOMETERPERSECOND), delta);
    }
    @Test
    public void testMETERPERSECONDToKilometerPerHour() {
        Assert.assertEquals(36, SpeedUnit.METERPERSECOND.convert(suitable, SpeedUnit.KILOMETERPERHOUR), delta);
        Assert.assertEquals(3.6 * Math.pow(10, 10), SpeedUnit.METERPERSECOND.convert(bigger, SpeedUnit.KILOMETERPERHOUR), delta);
    }
    @Test
    public void testMETERPERSECONDToInchPerSecond() {
        Assert.assertEquals(393.70078740157, SpeedUnit.METERPERSECOND.convert(suitable, SpeedUnit.INCHPERSECOND), delta);
        Assert.assertEquals(3.9370078740157 * Math.pow(10, 11), SpeedUnit.METERPERSECOND.convert(bigger, SpeedUnit.INCHPERSECOND), delta);
    }
    @Test
    public void testMETERPERSECONDToInchPerHour() {
        Assert.assertEquals(1.4173228346457 * Math.pow(10, 6), SpeedUnit.METERPERSECOND.convert(suitable, SpeedUnit.INCHPERHOUR), delta);
        Assert.assertEquals(1.4173228346457 * Math.pow(10, 15), SpeedUnit.METERPERSECOND.convert(bigger, SpeedUnit.INCHPERHOUR), delta);
    }
    @Test
    public void testMETERPERSECONDToFeetPerSecond() {
        Assert.assertEquals(32.808398950131, SpeedUnit.METERPERSECOND.convert(suitable, SpeedUnit.FEETPERSECOND), delta);
        Assert.assertEquals(3.2808398950131 * Math.pow(10, 10), SpeedUnit.METERPERSECOND.convert(bigger, SpeedUnit.FEETPERSECOND), delta);
    }
    @Test
    public void testMETERPERSECONDToFeetPerHour() {
        Assert.assertEquals(1.181102362204 * Math.pow(10, 5), SpeedUnit.METERPERSECOND.convert(suitable, SpeedUnit.FEETPERHOUR), delta);
        Assert.assertEquals(1.181102362204 * Math.pow(10, 14), SpeedUnit.METERPERSECOND.convert(bigger, SpeedUnit.FEETPERHOUR), delta);
    }
    @Test
    public void testMETERPERSECONDToMilePerSecond() {
        Assert.assertEquals(0.0062137119223733, SpeedUnit.METERPERSECOND.convert(suitable, SpeedUnit.MILEPERSECOND), delta);
        Assert.assertEquals(6.2137119223733 * Math.pow(10, 6), SpeedUnit.METERPERSECOND.convert(bigger, SpeedUnit.MILEPERSECOND), delta);
    }
    @Test
    public void testMETERPERSECONDToMilePerHour() {
        Assert.assertEquals(22.369362920544, SpeedUnit.METERPERSECOND.convert(suitable, SpeedUnit.MILEPERHOUR), delta);
        Assert.assertEquals(2.2369362920544 * Math.pow(10, 10), SpeedUnit.METERPERSECOND.convert(bigger, SpeedUnit.MILEPERHOUR), delta);
    }
    @Test
    public void testMETERPERSECONDToKnot() {
        Assert.assertEquals(19.438461717893, SpeedUnit.METERPERSECOND.convert(suitable, SpeedUnit.KNOT), delta);
        Assert.assertEquals(1.9438461717893 * Math.pow(10, 10), SpeedUnit.METERPERSECOND.convert(bigger, SpeedUnit.KNOT), delta);
    }
    @Test
    public void testMETERPERHOURToMeterPerSecond() {
        Assert.assertEquals(0.0027777777777778, SpeedUnit.METERPERHOUR.convert(suitable, SpeedUnit.METERPERSECOND), delta);
        Assert.assertEquals(2.7777777777778 * Math.pow(10, 6), SpeedUnit.METERPERHOUR.convert(bigger, SpeedUnit.METERPERSECOND), delta);
    }
    @Test
    public void testMETERPERHOURToMeterPerHour() {
        Assert.assertEquals(10.0, SpeedUnit.METERPERHOUR.convert(suitable, SpeedUnit.METERPERHOUR), delta);
        Assert.assertEquals(10000000000.0, SpeedUnit.METERPERHOUR.convert(bigger, SpeedUnit.METERPERHOUR), delta);
    }
    @Test
    public void testMETERPERHOURToKilometerPerSecond() {
        Assert.assertEquals(2.7777777777778 * Math.pow(10, -6), SpeedUnit.METERPERHOUR.convert(suitable, SpeedUnit.KILOMETERPERSECOND), delta);
        Assert.assertEquals(2777.7777777778, SpeedUnit.METERPERHOUR.convert(bigger, SpeedUnit.KILOMETERPERSECOND), delta);
    }
    @Test
    public void testMETERPERHOURToKilometerPerHour() {
        Assert.assertEquals(0.01, SpeedUnit.METERPERHOUR.convert(suitable, SpeedUnit.KILOMETERPERHOUR), delta);
        Assert.assertEquals(Math.pow(10, 7), SpeedUnit.METERPERHOUR.convert(bigger, SpeedUnit.KILOMETERPERHOUR), delta);
    }
    @Test
    public void testMETERPERHOURToInchPerSecond() {
        Assert.assertEquals(0.10936132983377, SpeedUnit.METERPERHOUR.convert(suitable, SpeedUnit.INCHPERSECOND), delta);
        Assert.assertEquals(1.0936132983377 * Math.pow(10, 8), SpeedUnit.METERPERHOUR.convert(bigger, SpeedUnit.INCHPERSECOND), delta);
    }
    @Test
    public void testMETERPERHOURToInchPerHour() {
        Assert.assertEquals(393.70078740157, SpeedUnit.METERPERHOUR.convert(suitable, SpeedUnit.INCHPERHOUR), delta);
        Assert.assertEquals(3.9370078740157 * Math.pow(10, 11), SpeedUnit.METERPERHOUR.convert(bigger, SpeedUnit.INCHPERHOUR), delta);
    }
    @Test
    public void testMETERPERHOURToFeetPerSecond() {
        Assert.assertEquals(0.0091134441528142, SpeedUnit.METERPERHOUR.convert(suitable, SpeedUnit.FEETPERSECOND), delta);
        Assert.assertEquals(9.1134441528142 * Math.pow(10, 6), SpeedUnit.METERPERHOUR.convert(bigger, SpeedUnit.FEETPERSECOND), delta);
    }
    @Test
    public void testMETERPERHOURToFeetPerHour() {
        Assert.assertEquals(32.808398950131, SpeedUnit.METERPERHOUR.convert(suitable, SpeedUnit.FEETPERHOUR), delta);
        Assert.assertEquals(3.2808398950131 * Math.pow(10, 10), SpeedUnit.METERPERHOUR.convert(bigger, SpeedUnit.FEETPERHOUR), delta);
    }
    @Test
    public void testMETERPERHOURToMilePerSecond() {
        Assert.assertEquals(1.7260310895481 * Math.pow(10, -6), SpeedUnit.METERPERHOUR.convert(suitable, SpeedUnit.MILEPERSECOND), delta);
        Assert.assertEquals(1726.0310895481, SpeedUnit.METERPERHOUR.convert(bigger, SpeedUnit.MILEPERSECOND), delta);
    }
    @Test
    public void testMETERPERHOURToMilePerHour() {
        Assert.assertEquals(0.0062137119223733, SpeedUnit.METERPERHOUR.convert(suitable, SpeedUnit.MILEPERHOUR), delta);
        Assert.assertEquals(6.2137119223733 * Math.pow(10, 6), SpeedUnit.METERPERHOUR.convert(bigger, SpeedUnit.MILEPERHOUR), delta);
    }
    @Test
    public void testMETERPERHOURToKnot() {
        Assert.assertEquals(0.0053995726994149, SpeedUnit.METERPERHOUR.convert(suitable, SpeedUnit.KNOT), delta);
        Assert.assertEquals(5.3995726994149 * Math.pow(10, 6), SpeedUnit.METERPERHOUR.convert(bigger, SpeedUnit.KNOT), delta);
    }
    @Test
    public void testKILOMETERPERSECONDToMeterPerSecond() {
        Assert.assertEquals(Math.pow(10, 4), SpeedUnit.KILOMETERPERSECOND.convert(suitable, SpeedUnit.METERPERSECOND), delta);
        Assert.assertEquals(Math.pow(10, 13), SpeedUnit.KILOMETERPERSECOND.convert(bigger, SpeedUnit.METERPERSECOND), delta);
    }
    @Test
    public void testKILOMETERPERSECONDToMeterPerHour() {
        Assert.assertEquals(3.6 * Math.pow(10, 7), SpeedUnit.KILOMETERPERSECOND.convert(suitable, SpeedUnit.METERPERHOUR), delta);
        Assert.assertEquals(3.6 * Math.pow(10, 16), SpeedUnit.KILOMETERPERSECOND.convert(bigger, SpeedUnit.METERPERHOUR), delta);
    }
    @Test
    public void testKILOMETERPERSECONDToKilometerPerSecond() {
        Assert.assertEquals(10.0, SpeedUnit.KILOMETERPERSECOND.convert(suitable, SpeedUnit.KILOMETERPERSECOND), delta);
        Assert.assertEquals(10000000000.0, SpeedUnit.KILOMETERPERSECOND.convert(bigger, SpeedUnit.KILOMETERPERSECOND), delta);
    }
    @Test
    public void testKILOMETERPERSECONDToKilometerPerHour() {
        Assert.assertEquals(3.6 * Math.pow(10, 4), SpeedUnit.KILOMETERPERSECOND.convert(suitable, SpeedUnit.KILOMETERPERHOUR), delta);
        Assert.assertEquals(3.6 * Math.pow(10, 13), SpeedUnit.KILOMETERPERSECOND.convert(bigger, SpeedUnit.KILOMETERPERHOUR), delta);
    }
    @Test
    public void testKILOMETERPERSECONDToInchPerSecond() {
        Assert.assertEquals(3.9370078740157 * Math.pow(10, 5), SpeedUnit.KILOMETERPERSECOND.convert(suitable, SpeedUnit.INCHPERSECOND), delta);
        Assert.assertEquals(3.9370078740157 * Math.pow(10, 14), SpeedUnit.KILOMETERPERSECOND.convert(bigger, SpeedUnit.INCHPERSECOND), delta);
    }
    @Test
    public void testKILOMETERPERSECONDToInchPerHour() {
        Assert.assertEquals(1.417322834 * Math.pow(10, 9), SpeedUnit.KILOMETERPERSECOND.convert(suitable, SpeedUnit.INCHPERHOUR), delta);
        Assert.assertEquals(1.417322834 * Math.pow(10, 18), SpeedUnit.KILOMETERPERSECOND.convert(bigger, SpeedUnit.INCHPERHOUR), delta);
    }
    @Test
    public void testKILOMETERPERSECONDToFeetPerSecond() {
        Assert.assertEquals(3.2808398950131 * Math.pow(10, 4), SpeedUnit.KILOMETERPERSECOND.convert(suitable, SpeedUnit.FEETPERSECOND), delta);
        Assert.assertEquals(3.2808398950131 * Math.pow(10, 13), SpeedUnit.KILOMETERPERSECOND.convert(bigger, SpeedUnit.FEETPERSECOND), delta);
    }
    @Test
    public void testKILOMETERPERSECONDToFeetPerHour() {
        Assert.assertEquals(118110236.22047, SpeedUnit.KILOMETERPERSECOND.convert(suitable, SpeedUnit.FEETPERHOUR), delta);
        Assert.assertEquals(118110236220470000.0, SpeedUnit.KILOMETERPERSECOND.convert(bigger, SpeedUnit.FEETPERHOUR), delta);
    }
    @Test
    public void testKILOMETERPERSECONDToMilePerSecond() {
        Assert.assertEquals(6.213711922373, SpeedUnit.KILOMETERPERSECOND.convert(suitable, SpeedUnit.MILEPERSECOND), delta);
        Assert.assertEquals(6.213711922373 * Math.pow(10, 9), SpeedUnit.KILOMETERPERSECOND.convert(bigger, SpeedUnit.MILEPERSECOND), delta);
    }
    @Test
    public void testKILOMETERPERSECONDToMilePerHour() {
        Assert.assertEquals(2.2369362920544 * Math.pow(10, 4), SpeedUnit.KILOMETERPERSECOND.convert(suitable, SpeedUnit.MILEPERHOUR), delta);
        Assert.assertEquals(2.2369362920544 * Math.pow(10, 13), SpeedUnit.KILOMETERPERSECOND.convert(bigger, SpeedUnit.MILEPERHOUR), delta);
    }
    @Test
    public void testKILOMETERPERSECONDToKnot() {
        Assert.assertEquals(1.9438461717893 * Math.pow(10, 4), SpeedUnit.KILOMETERPERSECOND.convert(suitable, SpeedUnit.KNOT), delta);
        Assert.assertEquals(1.9438461717893 * Math.pow(10, 13), SpeedUnit.KILOMETERPERSECOND.convert(bigger, SpeedUnit.KNOT), delta);
    }
    @Test
    public void testKILOMETERPERHOURToMeterPerSecond() {
        Assert.assertEquals(2.7777777777778, SpeedUnit.KILOMETERPERHOUR.convert(suitable, SpeedUnit.METERPERSECOND), delta);
        Assert.assertEquals(2.7777777777778 * Math.pow(10, 9), SpeedUnit.KILOMETERPERHOUR.convert(bigger, SpeedUnit.METERPERSECOND), delta);
    }
    @Test
    public void testKILOMETERPERHOURToMeterPerHour() {
        Assert.assertEquals(Math.pow(10, 4), SpeedUnit.KILOMETERPERHOUR.convert(suitable, SpeedUnit.METERPERHOUR), delta);
        Assert.assertEquals(Math.pow(10, 13), SpeedUnit.KILOMETERPERHOUR.convert(bigger, SpeedUnit.METERPERHOUR), delta);
    }
    @Test
    public void testKILOMETERPERHOURToKilometerPerSecond() {
        Assert.assertEquals(0.0027777777777778, SpeedUnit.KILOMETERPERHOUR.convert(suitable, SpeedUnit.KILOMETERPERSECOND), delta);
        Assert.assertEquals(2.7777777777778 * Math.pow(10, 6), SpeedUnit.KILOMETERPERHOUR.convert(bigger, SpeedUnit.KILOMETERPERSECOND), delta);
    }
    @Test
    public void testKILOMETERPERHOURToKilometerPerHour() {
        Assert.assertEquals(10.0, SpeedUnit.KILOMETERPERHOUR.convert(suitable, SpeedUnit.KILOMETERPERHOUR), delta);
        Assert.assertEquals(10000000000.0, SpeedUnit.KILOMETERPERHOUR.convert(bigger, SpeedUnit.KILOMETERPERHOUR), delta);
    }
    @Test
    public void testKILOMETERPERHOURToInchPerSecond() {
        Assert.assertEquals(109.36132983377, SpeedUnit.KILOMETERPERHOUR.convert(suitable, SpeedUnit.INCHPERSECOND), delta);
        Assert.assertEquals(1.0936132983377 * Math.pow(10, 11), SpeedUnit.KILOMETERPERHOUR.convert(bigger, SpeedUnit.INCHPERSECOND), delta);
    }
    @Test
    public void testKILOMETERPERHOURToInchPerHour() {
        Assert.assertEquals(3.9370078740157 * Math.pow(10, 5), SpeedUnit.KILOMETERPERHOUR.convert(suitable, SpeedUnit.INCHPERHOUR), delta);
        Assert.assertEquals(3.9370078740157 * Math.pow(10, 14), SpeedUnit.KILOMETERPERHOUR.convert(bigger, SpeedUnit.INCHPERHOUR), delta);
    }
    @Test
    public void testKILOMETERPERHOURToFeetPerSecond() {
        Assert.assertEquals(9.1134441528142, SpeedUnit.KILOMETERPERHOUR.convert(suitable, SpeedUnit.FEETPERSECOND), delta);
        Assert.assertEquals(9.1134441528142 * Math.pow(10, 9), SpeedUnit.KILOMETERPERHOUR.convert(bigger, SpeedUnit.FEETPERSECOND), delta);
    }
    @Test
    public void testKILOMETERPERHOURToFeetPerHour() {
        Assert.assertEquals(3.2808398950131 * Math.pow(10, 4), SpeedUnit.KILOMETERPERHOUR.convert(suitable, SpeedUnit.FEETPERHOUR), delta);
        Assert.assertEquals(3.2808398950131 * Math.pow(10, 13), SpeedUnit.KILOMETERPERHOUR.convert(bigger, SpeedUnit.FEETPERHOUR), delta);
    }
    @Test
    public void testKILOMETERPERHOURToMilePerSecond() {
        Assert.assertEquals(0.0017260310895481, SpeedUnit.KILOMETERPERHOUR.convert(suitable, SpeedUnit.MILEPERSECOND), delta);
        Assert.assertEquals(1.7260310895481 * Math.pow(10, 6), SpeedUnit.KILOMETERPERHOUR.convert(bigger, SpeedUnit.MILEPERSECOND), delta);
    }
    @Test
    public void testKILOMETERPERHOURToMilePerHour() {
        Assert.assertEquals(6.213711922373, SpeedUnit.KILOMETERPERHOUR.convert(suitable, SpeedUnit.MILEPERHOUR), delta);
        Assert.assertEquals(6.213711922373 * Math.pow(10, 9), SpeedUnit.KILOMETERPERHOUR.convert(bigger, SpeedUnit.MILEPERHOUR), delta);
    }
    @Test
    public void testKILOMETERPERHOURToKnot() {
        Assert.assertEquals(5.3995726994149, SpeedUnit.KILOMETERPERHOUR.convert(suitable, SpeedUnit.KNOT), delta);
        Assert.assertEquals(5.3995726994149 * Math.pow(10, 9), SpeedUnit.KILOMETERPERHOUR.convert(bigger, SpeedUnit.KNOT), delta);
    }
    @Test
    public void testINCHPERSECONDToMeterPerSecond() {
        Assert.assertEquals(0.254, SpeedUnit.INCHPERSECOND.convert(suitable, SpeedUnit.METERPERSECOND), delta);
        Assert.assertEquals(2.54 * Math.pow(10, 8), SpeedUnit.INCHPERSECOND.convert(bigger, SpeedUnit.METERPERSECOND), delta);
    }
    @Test
    public void testINCHPERSECONDToMeterPerHour() {
        Assert.assertEquals(914.4, SpeedUnit.INCHPERSECOND.convert(suitable, SpeedUnit.METERPERHOUR), delta);
        Assert.assertEquals(9.144 * Math.pow(10, 11), SpeedUnit.INCHPERSECOND.convert(bigger, SpeedUnit.METERPERHOUR), delta);
    }
    @Test
    public void testINCHPERSECONDToKilometerPerSecond() {
        Assert.assertEquals(0.000254, SpeedUnit.INCHPERSECOND.convert(suitable, SpeedUnit.KILOMETERPERSECOND), delta);
        Assert.assertEquals(2.54 * Math.pow(10, 5), SpeedUnit.INCHPERSECOND.convert(bigger, SpeedUnit.KILOMETERPERSECOND), delta);
    }
    @Test
    public void testINCHPERSECONDToKilometerPerHour() {
        Assert.assertEquals(0.914, SpeedUnit.INCHPERSECOND.convert(suitable, SpeedUnit.KILOMETERPERHOUR), delta);
        Assert.assertEquals(9.14 * Math.pow(10, 8), SpeedUnit.INCHPERSECOND.convert(bigger, SpeedUnit.KILOMETERPERHOUR), delta);
    }
    @Test
    public void testINCHPERSECONDToInchPerSecond() {
        Assert.assertEquals(10.0, SpeedUnit.INCHPERSECOND.convert(suitable, SpeedUnit.INCHPERSECOND), delta);
        Assert.assertEquals(10000000000.0, SpeedUnit.INCHPERSECOND.convert(bigger, SpeedUnit.INCHPERSECOND), delta);
    }
    @Test
    public void testINCHPERSECONDToInchPerHour() {
        Assert.assertEquals(3.6 * Math.pow(10, 4), SpeedUnit.INCHPERSECOND.convert(suitable, SpeedUnit.INCHPERHOUR), delta);
        Assert.assertEquals(3.6 * Math.pow(10, 13), SpeedUnit.INCHPERSECOND.convert(bigger, SpeedUnit.INCHPERHOUR), delta);
    }
    @Test
    public void testINCHPERSECONDToFeetPerSecond() {
        Assert.assertEquals(0.8333333333333, SpeedUnit.INCHPERSECOND.convert(suitable, SpeedUnit.FEETPERSECOND), delta);
        Assert.assertEquals(8.333333333333 * Math.pow(10, 8), SpeedUnit.INCHPERSECOND.convert(bigger, SpeedUnit.FEETPERSECOND), delta);
    }
    @Test
    public void testINCHPERSECONDToFeetPerHour() {
        Assert.assertEquals(3000, SpeedUnit.INCHPERSECOND.convert(suitable, SpeedUnit.FEETPERHOUR), delta);
        Assert.assertEquals(3 * Math.pow(10, 12), SpeedUnit.INCHPERSECOND.convert(bigger, SpeedUnit.FEETPERHOUR), delta);
    }
    @Test
    public void testINCHPERSECONDToMilePerSecond() {
        Assert.assertEquals(0.00015782828282828, SpeedUnit.INCHPERSECOND.convert(suitable, SpeedUnit.MILEPERSECOND), delta);
        Assert.assertEquals(1.5782828282828 * Math.pow(10, 5), SpeedUnit.INCHPERSECOND.convert(bigger, SpeedUnit.MILEPERSECOND), delta);
    }
    @Test
    public void testINCHPERSECONDToMilePerHour() {
        Assert.assertEquals(0.5681818181818, SpeedUnit.INCHPERSECOND.convert(suitable, SpeedUnit.MILEPERHOUR), delta);
        Assert.assertEquals(5.681818181818 * Math.pow(10, 8), SpeedUnit.INCHPERSECOND.convert(bigger, SpeedUnit.MILEPERHOUR), delta);
    }
    @Test
    public void testINCHPERSECONDToKnot() {
        Assert.assertEquals(0.49373692763449, SpeedUnit.INCHPERSECOND.convert(suitable, SpeedUnit.KNOT), delta);
        Assert.assertEquals(4.9373692763449 * Math.pow(10, 8), SpeedUnit.INCHPERSECOND.convert(bigger, SpeedUnit.KNOT), delta);
    }
    @Test
    public void testINCHPERHOURToMeterPerSecond() {
        Assert.assertEquals(7.0555555555556 * Math.pow(10, -5), SpeedUnit.INCHPERHOUR.convert(suitable, SpeedUnit.METERPERSECOND), delta);
        Assert.assertEquals(7.0555555555556 * Math.pow(10, 4), SpeedUnit.INCHPERHOUR.convert(bigger, SpeedUnit.METERPERSECOND), delta);
    }
    @Test
    public void testINCHPERHOURToMeterPerHour() {
        Assert.assertEquals(0.254, SpeedUnit.INCHPERHOUR.convert(suitable, SpeedUnit.METERPERHOUR), delta);
        Assert.assertEquals(2.54 * Math.pow(10, 8), SpeedUnit.INCHPERHOUR.convert(bigger, SpeedUnit.METERPERHOUR), delta);
    }
    @Test
    public void testINCHPERHOURToKilometerPerSecond() {
        Assert.assertEquals(7.0555555555556 * Math.pow(10, -8), SpeedUnit.INCHPERHOUR.convert(suitable, SpeedUnit.KILOMETERPERSECOND), delta);
        Assert.assertEquals(70.555555555556, SpeedUnit.INCHPERHOUR.convert(bigger, SpeedUnit.KILOMETERPERSECOND), delta);
    }
    @Test
    public void testINCHPERHOURToKilometerPerHour() {
        Assert.assertEquals(0.000254, SpeedUnit.INCHPERHOUR.convert(suitable, SpeedUnit.KILOMETERPERHOUR), delta);
        Assert.assertEquals(2.54 * Math.pow(10, 5), SpeedUnit.INCHPERHOUR.convert(bigger, SpeedUnit.KILOMETERPERHOUR), delta);
    }
    @Test
    public void testINCHPERHOURToInchPerSecond() {
        Assert.assertEquals(0.0070555555555556, SpeedUnit.INCHPERHOUR.convert(suitable, SpeedUnit.INCHPERSECOND), delta);
        Assert.assertEquals(7.0555555555556 * Math.pow(10, 6), SpeedUnit.INCHPERHOUR.convert(bigger, SpeedUnit.INCHPERSECOND), delta);
    }
    @Test
    public void testINCHPERHOURToInchPerHour() {
        Assert.assertEquals(10.0, SpeedUnit.INCHPERHOUR.convert(suitable, SpeedUnit.INCHPERHOUR), delta);
        Assert.assertEquals(10000000000.0, SpeedUnit.INCHPERHOUR.convert(bigger, SpeedUnit.INCHPERHOUR), delta);
    }
    @Test
    public void testINCHPERHOURToFeetPerSecond() {
        Assert.assertEquals(0.00023148148148148, SpeedUnit.INCHPERHOUR.convert(suitable, SpeedUnit.FEETPERSECOND), delta);
        Assert.assertEquals(2.3148148148148 * Math.pow(10, 5), SpeedUnit.INCHPERHOUR.convert(bigger, SpeedUnit.FEETPERSECOND), delta);
    }
    @Test
    public void testINCHPERHOURToFeetPerHour() {
        Assert.assertEquals(0.8333333333333, SpeedUnit.INCHPERHOUR.convert(suitable, SpeedUnit.FEETPERHOUR), delta);
        Assert.assertEquals(8.333333333333 * Math.pow(10, 8), SpeedUnit.INCHPERHOUR.convert(bigger, SpeedUnit.FEETPERHOUR), delta);
    }
    @Test
    public void testINCHPERHOURToMilePerSecond() {
        Assert.assertEquals(4.3841189674523 * Math.pow(10, -8), SpeedUnit.INCHPERHOUR.convert(suitable, SpeedUnit.MILEPERSECOND), delta);
        Assert.assertEquals(43.841189674523, SpeedUnit.INCHPERHOUR.convert(bigger, SpeedUnit.MILEPERSECOND), delta);
    }
    @Test
    public void testINCHPERHOURToMilePerHour() {
        Assert.assertEquals(0.00015782828282828, SpeedUnit.INCHPERHOUR.convert(suitable, SpeedUnit.MILEPERHOUR), delta);
        Assert.assertEquals(1.5782828282828 * Math.pow(10, 5), SpeedUnit.INCHPERHOUR.convert(bigger, SpeedUnit.MILEPERHOUR), delta);
    }
    @Test
    public void testINCHPERHOURToKnot() {
        Assert.assertEquals(0.00013714914656514, SpeedUnit.INCHPERHOUR.convert(suitable, SpeedUnit.KNOT), delta);
        Assert.assertEquals(1.3714914656514 * Math.pow(10, 5), SpeedUnit.INCHPERHOUR.convert(bigger, SpeedUnit.KNOT), delta);
    }
    @Test
    public void testFEETPERSECONDToMeterPerSecond() {
        Assert.assertEquals(3.048, SpeedUnit.FEETPERSECOND.convert(suitable, SpeedUnit.METERPERSECOND), delta);
        Assert.assertEquals(3.048 * Math.pow(10, 9), SpeedUnit.FEETPERSECOND.convert(bigger, SpeedUnit.METERPERSECOND), delta);
    }
    @Test
    public void testFEETPERSECONDToMeterPerHour() {
        Assert.assertEquals(1.09728 * Math.pow(10, 4), SpeedUnit.FEETPERSECOND.convert(suitable, SpeedUnit.METERPERHOUR), delta);
        Assert.assertEquals(1.09728 * Math.pow(10, 13), SpeedUnit.FEETPERSECOND.convert(bigger, SpeedUnit.METERPERHOUR), delta);
    }
    @Test
    public void testFEETPERSECONDToKilometerPerSecond() {
        Assert.assertEquals(0.003048, SpeedUnit.FEETPERSECOND.convert(suitable, SpeedUnit.KILOMETERPERSECOND), delta);
        Assert.assertEquals(3.048 * Math.pow(10, 6), SpeedUnit.FEETPERSECOND.convert(bigger, SpeedUnit.KILOMETERPERSECOND), delta);
    }
    @Test
    public void testFEETPERSECONDToKilometerPerHour() {
        Assert.assertEquals(10.9728, SpeedUnit.FEETPERSECOND.convert(suitable, SpeedUnit.KILOMETERPERHOUR), delta);
        Assert.assertEquals(1.09728 * Math.pow(10, 10), SpeedUnit.FEETPERSECOND.convert(bigger, SpeedUnit.KILOMETERPERHOUR), delta);
    }
    @Test
    public void testFEETPERSECONDToInchPerSecond() {
        Assert.assertEquals(120, SpeedUnit.FEETPERSECOND.convert(suitable, SpeedUnit.INCHPERSECOND), delta);
        Assert.assertEquals(1.2 * Math.pow(10, 11), SpeedUnit.FEETPERSECOND.convert(bigger, SpeedUnit.INCHPERSECOND), delta);
    }
    @Test
    public void testFEETPERSECONDToInchPerHour() {
        Assert.assertEquals(4.32 * Math.pow(10, 5), SpeedUnit.FEETPERSECOND.convert(suitable, SpeedUnit.INCHPERHOUR), delta);
        Assert.assertEquals(4.32 * Math.pow(10, 14), SpeedUnit.FEETPERSECOND.convert(bigger, SpeedUnit.INCHPERHOUR), delta);
    }
    @Test
    public void testFEETPERSECONDToFeetPerSecond() {
        Assert.assertEquals(10.0, SpeedUnit.FEETPERSECOND.convert(suitable, SpeedUnit.FEETPERSECOND), delta);
        Assert.assertEquals(10000000000.0, SpeedUnit.FEETPERSECOND.convert(bigger, SpeedUnit.FEETPERSECOND), delta);
    }
    @Test
    public void testFEETPERSECONDToFeetPerHour() {
        Assert.assertEquals(3.6 * Math.pow(10, 4), SpeedUnit.FEETPERSECOND.convert(suitable, SpeedUnit.FEETPERHOUR), delta);
        Assert.assertEquals(3.6 * Math.pow(10, 13), SpeedUnit.FEETPERSECOND.convert(bigger, SpeedUnit.FEETPERHOUR), delta);
    }
    @Test
    public void testFEETPERSECONDToMilePerSecond() {
        Assert.assertEquals(0.0018939393939394, SpeedUnit.FEETPERSECOND.convert(suitable, SpeedUnit.MILEPERSECOND), delta);
        Assert.assertEquals(1.8939393939394 * Math.pow(10, 6), SpeedUnit.FEETPERSECOND.convert(bigger, SpeedUnit.MILEPERSECOND), delta);
    }
    @Test
    public void testFEETPERSECONDToMilePerHour() {
        Assert.assertEquals(6.8181818181818, SpeedUnit.FEETPERSECOND.convert(suitable, SpeedUnit.MILEPERHOUR), delta);
        Assert.assertEquals(6.8181818181818 * Math.pow(10, 9), SpeedUnit.FEETPERSECOND.convert(bigger, SpeedUnit.MILEPERHOUR), delta);
    }
    @Test
    public void testFEETPERSECONDToKnot() {
        Assert.assertEquals(5.9248431316139, SpeedUnit.FEETPERSECOND.convert(suitable, SpeedUnit.KNOT), delta);
        Assert.assertEquals(5.9248431316139 * Math.pow(10, 9), SpeedUnit.FEETPERSECOND.convert(bigger, SpeedUnit.KNOT), delta);
    }
    @Test
    public void testFEETPERHOURToMeterPerSecond() {
        Assert.assertEquals(0.00084666666666667, SpeedUnit.FEETPERHOUR.convert(suitable, SpeedUnit.METERPERSECOND), delta);
        Assert.assertEquals(8.4666666666667 * Math.pow(10, 5), SpeedUnit.FEETPERHOUR.convert(bigger, SpeedUnit.METERPERSECOND), delta);
    }
    @Test
    public void testFEETPERHOURToMeterPerHour() {
        Assert.assertEquals(3.048, SpeedUnit.FEETPERHOUR.convert(suitable, SpeedUnit.METERPERHOUR), delta);
        Assert.assertEquals(3.048 * Math.pow(10, 9), SpeedUnit.FEETPERHOUR.convert(bigger, SpeedUnit.METERPERHOUR), delta);
    }
    @Test
    public void testFEETPERHOURToKilometerPerSecond() {
        Assert.assertEquals(8.4666666666667 * Math.pow(10, -7), SpeedUnit.FEETPERHOUR.convert(suitable, SpeedUnit.KILOMETERPERSECOND), delta);
        Assert.assertEquals(846.66666666667, SpeedUnit.FEETPERHOUR.convert(bigger, SpeedUnit.KILOMETERPERSECOND), delta);
    }
    @Test
    public void testFEETPERHOURToKilometerPerHour() {
        Assert.assertEquals(0.003048, SpeedUnit.FEETPERHOUR.convert(suitable, SpeedUnit.KILOMETERPERHOUR), delta);
        Assert.assertEquals(3.048 * Math.pow(10, 6), SpeedUnit.FEETPERHOUR.convert(bigger, SpeedUnit.KILOMETERPERHOUR), delta);
    }
    @Test
    public void testFEETPERHOURToInchPerSecond() {
        Assert.assertEquals(0.033333333333333, SpeedUnit.FEETPERHOUR.convert(suitable, SpeedUnit.INCHPERSECOND), delta);
        Assert.assertEquals(3.3333333333333 * Math.pow(10, 7), SpeedUnit.FEETPERHOUR.convert(bigger, SpeedUnit.INCHPERSECOND), delta);
    }
    @Test
    public void testFEETPERHOURToInchPerHour() {
        Assert.assertEquals(120, SpeedUnit.FEETPERHOUR.convert(suitable, SpeedUnit.INCHPERHOUR), delta);
        Assert.assertEquals(1.2 * Math.pow(10, 11), SpeedUnit.FEETPERHOUR.convert(bigger, SpeedUnit.INCHPERHOUR), delta);
    }
    @Test
    public void testFEETPERHOURToFeetPerSecond() {
        Assert.assertEquals(0.0027777777777778, SpeedUnit.FEETPERHOUR.convert(suitable, SpeedUnit.FEETPERSECOND), delta);
        Assert.assertEquals(2.7777777777778 * Math.pow(10, 6), SpeedUnit.FEETPERHOUR.convert(bigger, SpeedUnit.FEETPERSECOND), delta);
    }
    @Test
    public void testFEETPERHOURToFeetPerHour() {
        Assert.assertEquals(10.0, SpeedUnit.FEETPERHOUR.convert(suitable, SpeedUnit.FEETPERHOUR), delta);
        Assert.assertEquals(10000000000.0, SpeedUnit.FEETPERHOUR.convert(bigger, SpeedUnit.FEETPERHOUR), delta);
    }
    @Test
    public void testFEETPERHOURToMilePerSecond() {
        Assert.assertEquals(5.2609427609428 * Math.pow(10, -7), SpeedUnit.FEETPERHOUR.convert(suitable, SpeedUnit.MILEPERSECOND), delta);
        Assert.assertEquals(526.09427609428, SpeedUnit.FEETPERHOUR.convert(bigger, SpeedUnit.MILEPERSECOND), delta);
    }
    @Test
    public void testFEETPERHOURToMilePerHour() {
        Assert.assertEquals(0.0018939393939394, SpeedUnit.FEETPERHOUR.convert(suitable, SpeedUnit.MILEPERHOUR), delta);
        Assert.assertEquals(1.8939393939394 * Math.pow(10, 6), SpeedUnit.FEETPERHOUR.convert(bigger, SpeedUnit.MILEPERHOUR), delta);
    }
    @Test
    public void testFEETPERHOURToKnot() {
        Assert.assertEquals(0.0016457897587816, SpeedUnit.FEETPERHOUR.convert(suitable, SpeedUnit.KNOT), delta);
        Assert.assertEquals(1.6457897587816 * Math.pow(10, 6), SpeedUnit.FEETPERHOUR.convert(bigger, SpeedUnit.KNOT), delta);
    }
    @Test
    public void testMILEPERSECONDToMeterPerSecond() {
        Assert.assertEquals(1.609344 * Math.pow(10, 4), SpeedUnit.MILEPERSECOND.convert(suitable, SpeedUnit.METERPERSECOND), delta);
        Assert.assertEquals(16093440000000.0, SpeedUnit.MILEPERSECOND.convert(bigger, SpeedUnit.METERPERSECOND), delta);
    }
    @Test
    public void testMILEPERSECONDToMeterPerHour() {
        Assert.assertEquals(5.7936384 * Math.pow(10, 7), SpeedUnit.MILEPERSECOND.convert(suitable, SpeedUnit.METERPERHOUR), delta);
        Assert.assertEquals(5.7936384 * Math.pow(10, 16), SpeedUnit.MILEPERSECOND.convert(bigger, SpeedUnit.METERPERHOUR), delta);
    }
    @Test
    public void testMILEPERSECONDToKilometerPerSecond() {
        Assert.assertEquals(16.09344, SpeedUnit.MILEPERSECOND.convert(suitable, SpeedUnit.KILOMETERPERSECOND), delta);
        Assert.assertEquals(1.609344 * Math.pow(10, 10), SpeedUnit.MILEPERSECOND.convert(bigger, SpeedUnit.KILOMETERPERSECOND), delta);
    }
    @Test
    public void testMILEPERSECONDToKilometerPerHour() {
        Assert.assertEquals(5.7936384 * Math.pow(10, 4), SpeedUnit.MILEPERSECOND.convert(suitable, SpeedUnit.KILOMETERPERHOUR), delta);
        Assert.assertEquals(5.7936384 * Math.pow(10, 13), SpeedUnit.MILEPERSECOND.convert(bigger, SpeedUnit.KILOMETERPERHOUR), delta);
    }
    @Test
    public void testMILEPERSECONDToInchPerSecond() {
        Assert.assertEquals(6.336 * Math.pow(10, 5), SpeedUnit.MILEPERSECOND.convert(suitable, SpeedUnit.INCHPERSECOND), delta);
        Assert.assertEquals(6.336 * Math.pow(10, 14), SpeedUnit.MILEPERSECOND.convert(bigger, SpeedUnit.INCHPERSECOND), delta);
    }
    @Test
    public void testMILEPERSECONDToInchPerHour() {
        Assert.assertEquals(2.28096 * Math.pow(10, 9), SpeedUnit.MILEPERSECOND.convert(suitable, SpeedUnit.INCHPERHOUR), delta);
        Assert.assertEquals(2.28096 * Math.pow(10, 18), SpeedUnit.MILEPERSECOND.convert(bigger, SpeedUnit.INCHPERHOUR), delta);
    }
    @Test
    public void testMILEPERSECONDToFeetPerSecond() {
        Assert.assertEquals(5.28 * Math.pow(10, 4), SpeedUnit.MILEPERSECOND.convert(suitable, SpeedUnit.FEETPERSECOND), delta);
        Assert.assertEquals(5.28 * Math.pow(10, 13), SpeedUnit.MILEPERSECOND.convert(bigger, SpeedUnit.FEETPERSECOND), delta);
    }
    @Test
    public void testMILEPERSECONDToFeetPerHour() {
        Assert.assertEquals(1.9008 * Math.pow(10, 8), SpeedUnit.MILEPERSECOND.convert(suitable, SpeedUnit.FEETPERHOUR), delta);
        Assert.assertEquals(1.9008 * Math.pow(10, 17), SpeedUnit.MILEPERSECOND.convert(bigger, SpeedUnit.FEETPERHOUR), delta);
    }
    @Test
    public void testMILEPERSECONDToMilePerSecond() {
        Assert.assertEquals(10.0, SpeedUnit.MILEPERSECOND.convert(suitable, SpeedUnit.MILEPERSECOND), delta);
        Assert.assertEquals(10000000000.0, SpeedUnit.MILEPERSECOND.convert(bigger, SpeedUnit.MILEPERSECOND), delta);
    }
    @Test
    public void testMILEPERSECONDToMilePerHour() {
        Assert.assertEquals(3.6 * Math.pow(10, 4), SpeedUnit.MILEPERSECOND.convert(suitable, SpeedUnit.MILEPERHOUR), delta);
        Assert.assertEquals(3.6 * Math.pow(10, 13), SpeedUnit.MILEPERSECOND.convert(bigger, SpeedUnit.MILEPERHOUR), delta);
    }
    @Test
    public void testMILEPERSECONDToKnot() {
        Assert.assertEquals(3.128317173492 * Math.pow(10, 4), SpeedUnit.MILEPERSECOND.convert(suitable, SpeedUnit.KNOT), delta);
        Assert.assertEquals(3.128317173492 * Math.pow(10, 13), SpeedUnit.MILEPERSECOND.convert(bigger, SpeedUnit.KNOT), delta);
    }
    @Test
    public void testMILEPERHOURToMeterPerSecond() {
        Assert.assertEquals(4.4704, SpeedUnit.MILEPERHOUR.convert(suitable, SpeedUnit.METERPERSECOND), delta);
        Assert.assertEquals(4.4704 * Math.pow(10, 9), SpeedUnit.MILEPERHOUR.convert(bigger, SpeedUnit.METERPERSECOND), delta);
    }
    @Test
    public void testMILEPERHOURToMeterPerHour() {
        Assert.assertEquals(1.609344 * Math.pow(10, 4), SpeedUnit.MILEPERHOUR.convert(suitable, SpeedUnit.METERPERHOUR), delta);
        Assert.assertEquals(16093440000000.0, SpeedUnit.MILEPERHOUR.convert(bigger, SpeedUnit.METERPERHOUR), delta);
    }
    @Test
    public void testMILEPERHOURToKilometerPerSecond() {
        Assert.assertEquals(4.4704 * Math.pow(10, -3), SpeedUnit.MILEPERHOUR.convert(suitable, SpeedUnit.KILOMETERPERSECOND), delta);
        Assert.assertEquals(4.4704 * Math.pow(10, 6), SpeedUnit.MILEPERHOUR.convert(bigger, SpeedUnit.KILOMETERPERSECOND), delta);
    }
    @Test
    public void testMILEPERHOURToKilometerPerHour() {
        Assert.assertEquals(16.09344, SpeedUnit.MILEPERHOUR.convert(suitable, SpeedUnit.KILOMETERPERHOUR), delta);
        Assert.assertEquals(1.609344 * Math.pow(10, 10), SpeedUnit.MILEPERHOUR.convert(bigger, SpeedUnit.KILOMETERPERHOUR), delta);
    }
    @Test
    public void testMILEPERHOURToInchPerSecond() {
        Assert.assertEquals(176, SpeedUnit.MILEPERHOUR.convert(suitable, SpeedUnit.INCHPERSECOND), delta);
        Assert.assertEquals(1.76 * Math.pow(10, 11), SpeedUnit.MILEPERHOUR.convert(bigger, SpeedUnit.INCHPERSECOND), delta);
    }
    @Test
    public void testMILEPERHOURToInchPerHour() {
        Assert.assertEquals(6.336 * Math.pow(10, 5), SpeedUnit.MILEPERHOUR.convert(suitable, SpeedUnit.INCHPERHOUR), delta);
        Assert.assertEquals(6.336 * Math.pow(10, 14), SpeedUnit.MILEPERHOUR.convert(bigger, SpeedUnit.INCHPERHOUR), delta);
    }
    @Test
    public void testMILEPERHOURToFeetPerSecond() {
        Assert.assertEquals(14.666666666667, SpeedUnit.MILEPERHOUR.convert(suitable, SpeedUnit.FEETPERSECOND), delta);
        Assert.assertEquals(1.4666666666667 * Math.pow(10, 10), SpeedUnit.MILEPERHOUR.convert(bigger, SpeedUnit.FEETPERSECOND), delta);
    }
    @Test
    public void testMILEPERHOURToFeetPerHour() {
        Assert.assertEquals(5.28 * Math.pow(10, 4), SpeedUnit.MILEPERHOUR.convert(suitable, SpeedUnit.FEETPERHOUR), delta);
        Assert.assertEquals(5.28 * Math.pow(10, 13), SpeedUnit.MILEPERHOUR.convert(bigger, SpeedUnit.FEETPERHOUR), delta);
    }
    @Test
    public void testMILEPERHOURToMilePerSecond() {
        Assert.assertEquals(2.7777777777778 * Math.pow(10, -3), SpeedUnit.MILEPERHOUR.convert(suitable, SpeedUnit.MILEPERSECOND), delta);
        Assert.assertEquals(2.7777777777778 * Math.pow(10, 6), SpeedUnit.MILEPERHOUR.convert(bigger, SpeedUnit.MILEPERSECOND), delta);
    }
    @Test
    public void testMILEPERHOURToMilePerHour() {
        Assert.assertEquals(10.0, SpeedUnit.MILEPERHOUR.convert(suitable, SpeedUnit.MILEPERHOUR), delta);
        Assert.assertEquals(10000000000.0, SpeedUnit.MILEPERHOUR.convert(bigger, SpeedUnit.MILEPERHOUR), delta);
    }
    @Test
    public void testMILEPERHOURToKnot() {
        Assert.assertEquals(8.6897699263671, SpeedUnit.MILEPERHOUR.convert(suitable, SpeedUnit.KNOT), delta);
        Assert.assertEquals(8.6897699263671 * Math.pow(10, 9), SpeedUnit.MILEPERHOUR.convert(bigger, SpeedUnit.KNOT), delta);
    }
    @Test
    public void testKNOTToMeterPerSecond() {
        Assert.assertEquals(5.14444, SpeedUnit.KNOT.convert(suitable, SpeedUnit.METERPERSECOND), delta);
        Assert.assertEquals(5.14444 * Math.pow(10, 9), SpeedUnit.KNOT.convert(bigger, SpeedUnit.METERPERSECOND), delta);
    }
    @Test
    public void testKNOTToMeterPerHour() {
        Assert.assertEquals(1.8519984 * Math.pow(10, 4), SpeedUnit.KNOT.convert(suitable, SpeedUnit.METERPERHOUR), delta);
        Assert.assertEquals(1.8519984 * Math.pow(10, 13), SpeedUnit.KNOT.convert(bigger, SpeedUnit.METERPERHOUR), delta);
    }
    @Test
    public void testKNOTToKilometerPerSecond() {
        Assert.assertEquals(5.14444 * Math.pow(10, -3), SpeedUnit.KNOT.convert(suitable, SpeedUnit.KILOMETERPERSECOND), delta);
        Assert.assertEquals(5.14444 * Math.pow(10, 6), SpeedUnit.KNOT.convert(bigger, SpeedUnit.KILOMETERPERSECOND), delta);
    }
    @Test
    public void testKNOTToKilometerPerHour() {
        Assert.assertEquals(18.519984, SpeedUnit.KNOT.convert(suitable, SpeedUnit.KILOMETERPERHOUR), delta);
        Assert.assertEquals(1.8519984 * Math.pow(10, 10), SpeedUnit.KNOT.convert(bigger, SpeedUnit.KILOMETERPERHOUR), delta);
    }
    @Test
    public void testKNOTToInchPerSecond() {
        Assert.assertEquals(202.53700787402, SpeedUnit.KNOT.convert(suitable, SpeedUnit.INCHPERSECOND), delta);
        Assert.assertEquals(2.0253700787402 * Math.pow(10, 11), SpeedUnit.KNOT.convert(bigger, SpeedUnit.INCHPERSECOND), delta);
    }
    @Test
    public void testKNOTToInchPerHour() {
        Assert.assertEquals(7.2913322834646 * Math.pow(10, 5), SpeedUnit.KNOT.convert(suitable, SpeedUnit.INCHPERHOUR), delta);
        Assert.assertEquals(7.2913322834646 * Math.pow(10, 14), SpeedUnit.KNOT.convert(bigger, SpeedUnit.INCHPERHOUR), delta);
    }
    @Test
    public void testKNOTToFeetPerSecond() {
        Assert.assertEquals(16.878083989501, SpeedUnit.KNOT.convert(suitable, SpeedUnit.FEETPERSECOND), delta);
        Assert.assertEquals(1.6878083989501 * Math.pow(10, 10), SpeedUnit.KNOT.convert(bigger, SpeedUnit.FEETPERSECOND), delta);
    }
    @Test
    public void testKNOTToFeetPerHour() {
        Assert.assertEquals(6.0761102362205 * Math.pow(10, 4), SpeedUnit.KNOT.convert(suitable, SpeedUnit.FEETPERHOUR), delta);
        Assert.assertEquals(6.0761102362205 * Math.pow(10, 13), SpeedUnit.KNOT.convert(bigger, SpeedUnit.FEETPERHOUR), delta);
    }
    @Test
    public void testKNOTToMilePerSecond() {
        Assert.assertEquals(3.1966068161934 * Math.pow(10, -3), SpeedUnit.KNOT.convert(suitable, SpeedUnit.MILEPERSECOND), delta);
        Assert.assertEquals(3.1966068161934 * Math.pow(10, 6), SpeedUnit.KNOT.convert(bigger, SpeedUnit.MILEPERSECOND), delta);
    }
    @Test
    public void testKNOTToMilePerHour() {
        Assert.assertEquals(11.507784538296, SpeedUnit.KNOT.convert(suitable, SpeedUnit.MILEPERHOUR), delta);
        Assert.assertEquals(1.1507784538296 * Math.pow(10, 10), SpeedUnit.KNOT.convert(bigger, SpeedUnit.MILEPERHOUR), delta);
    }
    @Test
    public void testKNOTToKnot() {
        Assert.assertEquals(10.0, SpeedUnit.KNOT.convert(suitable, SpeedUnit.KNOT), delta);
        Assert.assertEquals(10000000000.0, SpeedUnit.KNOT.convert(bigger, SpeedUnit.KNOT), delta);
    }
}
package unitconversioncalculator;

import org.junit.Assert;
import org.junit.Test;

public class LengthUnitTest {
    private static final double suitable = 10.0;
    private static final double bigger = 10000000000.0;
    private static final double smaller = -0.00000000001;
    private static final double delta = 0.00000001;

    // MILLIMETER, CENTIMETER, METER, KILOMETER, INCH, FEET, YARD, MILE, NMILE, MIL
    // Millimeter, Centimeter, Meter, Kilometer, Inch, Feet, Yard, Mile, Nmile, Mil

    @Test
    public void testMILLIMETERToMillimeter() {
        Assert.assertEquals(10.0, LengthUnit.MILLIMETER.convert(suitable, LengthUnit.MILLIMETER), delta);
        Assert.assertEquals(10000000000.0, LengthUnit.MILLIMETER.convert(bigger, LengthUnit.MILLIMETER), delta);
        Assert.assertEquals(-0.00000000001, LengthUnit.MILLIMETER.convert(smaller, LengthUnit.MILLIMETER), delta);
    }
    @Test
    public void testMILLIMETERToCentimeter() {
        Assert.assertEquals(1, LengthUnit.MILLIMETER.convert(suitable, LengthUnit.CENTIMETER), delta);
        Assert.assertEquals(Math.pow(10, 9), LengthUnit.MILLIMETER.convert(bigger, LengthUnit.CENTIMETER), delta);
        Assert.assertEquals(-Math.pow(10, -12), LengthUnit.MILLIMETER.convert(smaller, LengthUnit.CENTIMETER), delta);
    }
    @Test
    public void testMILLIMETERToMeter() {
        Assert.assertEquals(0.01, LengthUnit.MILLIMETER.convert(suitable, LengthUnit.METER), delta);
        Assert.assertEquals(Math.pow(10, 7), LengthUnit.MILLIMETER.convert(bigger, LengthUnit.METER), delta);
        Assert.assertEquals(-Math.pow(10, -14), LengthUnit.MILLIMETER.convert(smaller, LengthUnit.METER), delta);
    }
    @Test
    public void testMILLIMETERToKilometer() {
        Assert.assertEquals(Math.pow(10, -5), LengthUnit.MILLIMETER.convert(suitable, LengthUnit.KILOMETER), delta);
        Assert.assertEquals(Math.pow(10, 4), LengthUnit.MILLIMETER.convert(bigger, LengthUnit.KILOMETER), delta);
        Assert.assertEquals(-Math.pow(10, -17), LengthUnit.MILLIMETER.convert(smaller, LengthUnit.KILOMETER), delta);
    }
    @Test
    public void testMILLIMETERToInch() {
        Assert.assertEquals(0.39370078740157, LengthUnit.MILLIMETER.convert(suitable, LengthUnit.INCH), delta);
        Assert.assertEquals(3.9370078740157 * Math.pow(10, 8), LengthUnit.MILLIMETER.convert(bigger, LengthUnit.INCH), delta);
        Assert.assertEquals(-3.9370078740157 * Math.pow(10, -13), LengthUnit.MILLIMETER.convert(smaller, LengthUnit.INCH), delta);
    }
    @Test
    public void testMILLIMETERToFeet() {
        Assert.assertEquals(0.032808398950131, LengthUnit.MILLIMETER.convert(suitable, LengthUnit.FEET), delta);
        Assert.assertEquals(3.2808398950131 * Math.pow(10, 7), LengthUnit.MILLIMETER.convert(bigger, LengthUnit.FEET), delta);
        Assert.assertEquals(-3.2808398950131 * Math.pow(10, -14), LengthUnit.MILLIMETER.convert(smaller, LengthUnit.FEET), delta);
    }
    @Test
    public void testMILLIMETERToYard() {
        Assert.assertEquals(0.010936132983377, LengthUnit.MILLIMETER.convert(suitable, LengthUnit.YARD), delta);
        Assert.assertEquals(1.0936132983377 * Math.pow(10, 7), LengthUnit.MILLIMETER.convert(bigger, LengthUnit.YARD), delta);
        Assert.assertEquals(-1.0936132983377 * Math.pow(10, -14), LengthUnit.MILLIMETER.convert(smaller, LengthUnit.YARD), delta);
    }
    @Test
    public void testMILLIMETERToMile() {
        Assert.assertEquals(6.2137119223733 * Math.pow(10, -6), LengthUnit.MILLIMETER.convert(suitable, LengthUnit.MILE), delta);
        Assert.assertEquals(6213.7119223733, LengthUnit.MILLIMETER.convert(bigger, LengthUnit.MILE), delta);
        Assert.assertEquals(-6.2137119223733 * Math.pow(10, -18), LengthUnit.MILLIMETER.convert(smaller, LengthUnit.MILE), delta);
    }
    @Test
    public void testMILLIMETERToNMile() {
        Assert.assertEquals(5.3995680345572 * Math.pow(10, -6), LengthUnit.MILLIMETER.convert(suitable, LengthUnit.NMILE), delta);
        Assert.assertEquals(5399.5680345572, LengthUnit.MILLIMETER.convert(bigger, LengthUnit.NMILE), delta);
        Assert.assertEquals(-5.3995680345572 * Math.pow(10, -18), LengthUnit.MILLIMETER.convert(smaller, LengthUnit.NMILE), delta);
    }
    @Test
    public void testMILLIMETERToMil() {
        Assert.assertEquals(393.70078740157, LengthUnit.MILLIMETER.convert(suitable, LengthUnit.MIL), delta);
        Assert.assertEquals(3.9370078740157 * Math.pow(10, 11), LengthUnit.MILLIMETER.convert(bigger, LengthUnit.MIL), delta);
        Assert.assertEquals(-3.9370078740157 * Math.pow(10, -10), LengthUnit.MILLIMETER.convert(smaller, LengthUnit.MIL), delta);
    }
    @Test
    public void testCENTIMETERToMillimeter() {
        Assert.assertEquals(100, LengthUnit.CENTIMETER.convert(suitable, LengthUnit.MILLIMETER), delta);
        Assert.assertEquals(Math.pow(10, 11), LengthUnit.CENTIMETER.convert(bigger, LengthUnit.MILLIMETER), delta);
        Assert.assertEquals(-Math.pow(10, -10), LengthUnit.CENTIMETER.convert(smaller, LengthUnit.MILLIMETER), delta);
    }
    @Test
    public void tesCENTIMETERToCentimeter() {
        Assert.assertEquals(10.0, LengthUnit.CENTIMETER.convert(suitable, LengthUnit.CENTIMETER), delta);
        Assert.assertEquals(10000000000.0, LengthUnit.CENTIMETER.convert(bigger, LengthUnit.CENTIMETER), delta);
        Assert.assertEquals(-0.00000000001, LengthUnit.CENTIMETER.convert(smaller, LengthUnit.CENTIMETER), delta);
    }
    @Test
    public void testCENTIMETERToMeter() {
        Assert.assertEquals(0.1, LengthUnit.CENTIMETER.convert(suitable, LengthUnit.METER), delta);
        Assert.assertEquals(Math.pow(10, 8), LengthUnit.CENTIMETER.convert(bigger, LengthUnit.METER), delta);
        Assert.assertEquals(-Math.pow(10, -13), LengthUnit.CENTIMETER.convert(smaller, LengthUnit.METER), delta);
    }
    @Test
    public void testCENTIMETERToKilometer() {
        Assert.assertEquals(0.0001, LengthUnit.CENTIMETER.convert(suitable, LengthUnit.KILOMETER), delta);
        Assert.assertEquals(Math.pow(10, 5), LengthUnit.CENTIMETER.convert(bigger, LengthUnit.KILOMETER), delta);
        Assert.assertEquals(-Math.pow(10, -16), LengthUnit.CENTIMETER.convert(smaller, LengthUnit.KILOMETER), delta);
    }
    @Test
    public void testCENTIMETERToInch() {
        Assert.assertEquals(3.9370078740157, LengthUnit.CENTIMETER.convert(suitable, LengthUnit.INCH), delta);
        Assert.assertEquals(3937007874.0157, LengthUnit.CENTIMETER.convert(bigger, LengthUnit.INCH), delta);
        Assert.assertEquals(-3.9370078740157 * Math.pow(10, -12), LengthUnit.CENTIMETER.convert(smaller, LengthUnit.INCH), delta);
    }
    @Test
    public void testCENTIMETERToFeet() {
        Assert.assertEquals(0.32808398950131, LengthUnit.CENTIMETER.convert(suitable, LengthUnit.FEET), delta);
        Assert.assertEquals(3.2808398950131 * Math.pow(10, 8), LengthUnit.CENTIMETER.convert(bigger, LengthUnit.FEET), delta);
        Assert.assertEquals(-3.2808398950131 * Math.pow(10, -13), LengthUnit.CENTIMETER.convert(smaller, LengthUnit.FEET), delta);
    }
    @Test
    public void testCENTIMETERToYard() {
        Assert.assertEquals(0.10936132983377, LengthUnit.CENTIMETER.convert(suitable, LengthUnit.YARD), delta);
        Assert.assertEquals(1.0936132983377 * Math.pow(10, 8), LengthUnit.CENTIMETER.convert(bigger, LengthUnit.YARD), delta);
        Assert.assertEquals(-1.0936132983377 * Math.pow(10, -13), LengthUnit.CENTIMETER.convert(smaller, LengthUnit.YARD), delta);
    }
    @Test
    public void testCENTIMETERToMile() {
        Assert.assertEquals(6.2137119223733 * Math.pow(10, -5), LengthUnit.CENTIMETER.convert(suitable, LengthUnit.MILE), delta);
        Assert.assertEquals(62137.119223733, LengthUnit.CENTIMETER.convert(bigger, LengthUnit.MILE), delta);
        Assert.assertEquals(-6.2137119223733 * Math.pow(10, -17), LengthUnit.CENTIMETER.convert(smaller, LengthUnit.MILE), delta);
    }
    @Test
    public void testCENTIMETERToNMile() {
        Assert.assertEquals(5.3995680345572 * Math.pow(10, -5), LengthUnit.CENTIMETER.convert(suitable, LengthUnit.NMILE), delta);
        Assert.assertEquals(53995.680345572, LengthUnit.CENTIMETER.convert(bigger, LengthUnit.NMILE), delta);
        Assert.assertEquals(-5.3995680345572 * Math.pow(10, -17), LengthUnit.CENTIMETER.convert(smaller, LengthUnit.NMILE), delta);
    }
    @Test
    public void testCENTIMETERToMil() {
        Assert.assertEquals(3937.0078740156997, LengthUnit.CENTIMETER.convert(suitable, LengthUnit.MIL), delta);
        Assert.assertEquals(3.9370078740156997 * Math.pow(10, 12), LengthUnit.CENTIMETER.convert(bigger, LengthUnit.MIL), delta);
        Assert.assertEquals(-3.9370078740156997 * Math.pow(10, -9), LengthUnit.CENTIMETER.convert(smaller, LengthUnit.MIL), delta);
    }
    @Test
    public void testMETERToMillimeter() {
        Assert.assertEquals(Math.pow(10, 4), LengthUnit.METER.convert(suitable, LengthUnit.MILLIMETER), delta);
        Assert.assertEquals(Math.pow(10, 13), LengthUnit.METER.convert(bigger, LengthUnit.MILLIMETER), delta);
        Assert.assertEquals(-Math.pow(10, -8), LengthUnit.METER.convert(smaller, LengthUnit.MILLIMETER), delta);
    }
    @Test
    public void testMETERToCentimeter() {
        Assert.assertEquals(1000, LengthUnit.METER.convert(suitable, LengthUnit.CENTIMETER), delta);
        Assert.assertEquals(Math.pow(10, 12), LengthUnit.METER.convert(bigger, LengthUnit.CENTIMETER), delta);
        Assert.assertEquals(-Math.pow(10, -9), LengthUnit.METER.convert(smaller, LengthUnit.CENTIMETER), delta);
    }
    @Test
    public void testMETERToMeter() {
        Assert.assertEquals(10.0, LengthUnit.METER.convert(suitable, LengthUnit.METER), delta);
        Assert.assertEquals(10000000000.0, LengthUnit.METER.convert(bigger, LengthUnit.METER), delta);
        Assert.assertEquals(-0.00000000001, LengthUnit.METER.convert(smaller, LengthUnit.METER), delta);
    }
    @Test
    public void testMETERToKilometer() {
        Assert.assertEquals(0.01, LengthUnit.METER.convert(suitable, LengthUnit.KILOMETER), delta);
        Assert.assertEquals(Math.pow(10, 7), LengthUnit.METER.convert(bigger, LengthUnit.KILOMETER), delta);
        Assert.assertEquals(-Math.pow(10, -14), LengthUnit.METER.convert(smaller, LengthUnit.KILOMETER), delta);
    }
    @Test
    public void testMETERToInch() {
        Assert.assertEquals(393.70078740157, LengthUnit.METER.convert(suitable, LengthUnit.INCH), delta);
        Assert.assertEquals(3.93700787402 * Math.pow(10, 11), LengthUnit.METER.convert(bigger, LengthUnit.INCH), delta);
        Assert.assertEquals(-3.9370078740157 * Math.pow(10, -10), LengthUnit.METER.convert(smaller, LengthUnit.INCH), delta);
    }
    @Test
    public void testMETERToFeet() {
        Assert.assertEquals(32.808398950131, LengthUnit.METER.convert(suitable, LengthUnit.FEET), delta);
        Assert.assertEquals(3.2808398950131 * Math.pow(10, 10), LengthUnit.METER.convert(bigger, LengthUnit.FEET), delta);
        Assert.assertEquals(-3.2808398950131 * Math.pow(10, -11), LengthUnit.METER.convert(smaller, LengthUnit.FEET), delta);
    }
    @Test
    public void testMETERToYard() {
        Assert.assertEquals(10.936132983377, LengthUnit.METER.convert(suitable, LengthUnit.YARD), delta);
        Assert.assertEquals(1.0936132983377 * Math.pow(10, 10), LengthUnit.METER.convert(bigger, LengthUnit.YARD), delta);
        Assert.assertEquals(-1.0936132983377 * Math.pow(10, -11), LengthUnit.METER.convert(smaller, LengthUnit.YARD), delta);
    }
    @Test
    public void testMETERToMile() {
        Assert.assertEquals(0.0062137119223733, LengthUnit.METER.convert(suitable, LengthUnit.MILE), delta);
        Assert.assertEquals(6.2137119223733 * Math.pow(10, 6), LengthUnit.METER.convert(bigger, LengthUnit.MILE), delta);
        Assert.assertEquals(-6.2137119223733 * Math.pow(10, -15), LengthUnit.METER.convert(smaller, LengthUnit.MILE), delta);
    }
    @Test
    public void testMETERToNMile() {
        Assert.assertEquals(0.0053995680345572, LengthUnit.METER.convert(suitable, LengthUnit.NMILE), delta);
        Assert.assertEquals(5.3995680345572 * Math.pow(10, 6), LengthUnit.METER.convert(bigger, LengthUnit.NMILE), delta);
        Assert.assertEquals(-5.3995680345572 * Math.pow(10, -15), LengthUnit.METER.convert(smaller, LengthUnit.NMILE), delta);
    }
    @Test
    public void testMETERToMil() {
        Assert.assertEquals(3.9370078740156997 * Math.pow(10, 5), LengthUnit.METER.convert(suitable, LengthUnit.MIL), delta);
        Assert.assertEquals(3.9370078740156997 * Math.pow(10, 14), LengthUnit.METER.convert(bigger, LengthUnit.MIL), delta);
        Assert.assertEquals(-3.9370078740156997 * Math.pow(10, -7), LengthUnit.METER.convert(smaller, LengthUnit.MIL), delta);
    }
    @Test
    public void testKILOMETERToMillimeter() {
        Assert.assertEquals(Math.pow(10, 7), LengthUnit.KILOMETER.convert(suitable, LengthUnit.MILLIMETER), delta);
        Assert.assertEquals(Math.pow(10, 16), LengthUnit.KILOMETER.convert(bigger, LengthUnit.MILLIMETER), delta);
        Assert.assertEquals(-Math.pow(10, -5), LengthUnit.KILOMETER.convert(smaller, LengthUnit.MILLIMETER), delta);
    }
    @Test
    public void testKILOMETERToCentimeter() {
        Assert.assertEquals(Math.pow(10, 6), LengthUnit.KILOMETER.convert(suitable, LengthUnit.CENTIMETER), delta);
        Assert.assertEquals(Math.pow(10, 15), LengthUnit.KILOMETER.convert(bigger, LengthUnit.CENTIMETER), delta);
        Assert.assertEquals(-Math.pow(10, -6), LengthUnit.KILOMETER.convert(smaller, LengthUnit.CENTIMETER), delta);
    }
    @Test
    public void testKILOMETERToMeter() {
        Assert.assertEquals(Math.pow(10, 4), LengthUnit.KILOMETER.convert(suitable, LengthUnit.METER), delta);
        Assert.assertEquals(Math.pow(10, 13), LengthUnit.KILOMETER.convert(bigger, LengthUnit.METER), delta);
        Assert.assertEquals(-Math.pow(10, -8), LengthUnit.KILOMETER.convert(smaller, LengthUnit.METER), delta);
    }
    @Test
    public void testKILOMETERToKilometer() {
        Assert.assertEquals(10.0, LengthUnit.KILOMETER.convert(suitable, LengthUnit.KILOMETER), delta);
        Assert.assertEquals(10000000000.0, LengthUnit.KILOMETER.convert(bigger, LengthUnit.KILOMETER), delta);
        Assert.assertEquals(-0.00000000001, LengthUnit.KILOMETER.convert(smaller, LengthUnit.KILOMETER), delta);
    }
    @Test
    public void testKILOMETERToInch() {
        Assert.assertEquals(3.9370078740157 * Math.pow(10, 5), LengthUnit.KILOMETER.convert(suitable, LengthUnit.INCH), delta);
        Assert.assertEquals(3.9370078740157 * Math.pow(10, 14), LengthUnit.KILOMETER.convert(bigger, LengthUnit.INCH), delta);
        Assert.assertEquals(-3.9370078740157 * Math.pow(10, -7), LengthUnit.KILOMETER.convert(smaller, LengthUnit.INCH), delta);
    }
    @Test
    public void testKILOMETERToFeet() {
        Assert.assertEquals(3.2808398950131 * Math.pow(10, 4), LengthUnit.KILOMETER.convert(suitable, LengthUnit.FEET), delta);
        Assert.assertEquals(3.2808398950131 * Math.pow(10, 13), LengthUnit.KILOMETER.convert(bigger, LengthUnit.FEET), delta);
        Assert.assertEquals(-3.2808398950131 * Math.pow(10, -8), LengthUnit.KILOMETER.convert(smaller, LengthUnit.FEET), delta);
    }
    @Test
    public void testKILOMETERToYard() {
        Assert.assertEquals(10936.132983377, LengthUnit.KILOMETER.convert(suitable, LengthUnit.YARD), delta);
        Assert.assertEquals(1.0936132983377 * Math.pow(10, 13), LengthUnit.KILOMETER.convert(bigger, LengthUnit.YARD), delta);
        Assert.assertEquals(-1.0936132983377 * Math.pow(10, -8), LengthUnit.KILOMETER.convert(smaller, LengthUnit.YARD), delta);
    }
    @Test
    public void testKILOMETERToMile() {
        Assert.assertEquals(6.2137119223733, LengthUnit.KILOMETER.convert(suitable, LengthUnit.MILE), delta);
        Assert.assertEquals(6213711922.3733, LengthUnit.KILOMETER.convert(bigger, LengthUnit.MILE), delta);
        Assert.assertEquals(-6.2137119223733 * Math.pow(10, -12), LengthUnit.KILOMETER.convert(smaller, LengthUnit.MILE), delta);
    }
    @Test
    public void testKILOMETERToNMile() {
        Assert.assertEquals(5.3995680345572, LengthUnit.KILOMETER.convert(suitable, LengthUnit.NMILE), delta);
        Assert.assertEquals(5399568034.5571995, LengthUnit.KILOMETER.convert(bigger, LengthUnit.NMILE), delta);
        Assert.assertEquals(-5.3995680345572 * Math.pow(10, -12), LengthUnit.KILOMETER.convert(smaller, LengthUnit.NMILE), delta);
    }
    @Test
    public void testKILOMETERToMil() {
        Assert.assertEquals(393700787.40157, LengthUnit.KILOMETER.convert(suitable, LengthUnit.MIL), delta);
        Assert.assertEquals(3.9370078740156997 * Math.pow(10, 17), LengthUnit.KILOMETER.convert(bigger, LengthUnit.MIL), delta);
        Assert.assertEquals(-0.00039370078740157, LengthUnit.KILOMETER.convert(smaller, LengthUnit.MIL), delta);
    }
    @Test
    public void testINCHToMillimeter() {
        Assert.assertEquals(254, LengthUnit.INCH.convert(suitable, LengthUnit.MILLIMETER), delta);
        Assert.assertEquals(2.54 * Math.pow(10, 11), LengthUnit.INCH.convert(bigger, LengthUnit.MILLIMETER), delta);
        Assert.assertEquals(-2.4 * Math.pow(10, -10), LengthUnit.INCH.convert(smaller, LengthUnit.MILLIMETER), delta);
    }
    @Test
    public void testINCHToCentimeter() {
        Assert.assertEquals(25.4, LengthUnit.INCH.convert(suitable, LengthUnit.CENTIMETER), delta);
        Assert.assertEquals(2.54 * Math.pow(10, 10), LengthUnit.INCH.convert(bigger, LengthUnit.CENTIMETER), delta);
        Assert.assertEquals(-2.54 * Math.pow(10, -11), LengthUnit.INCH.convert(smaller, LengthUnit.CENTIMETER), delta);
    }
    @Test
    public void testINCHERToMeter() {
        Assert.assertEquals(0.254, LengthUnit.INCH.convert(suitable, LengthUnit.METER), delta);
        Assert.assertEquals(2.54 * Math.pow(10, 8), LengthUnit.INCH.convert(bigger, LengthUnit.METER), delta);
        Assert.assertEquals(-2.54 * Math.pow(10, -16), LengthUnit.INCH.convert(smaller, LengthUnit.METER), delta);
    }
    @Test
    public void testINCHToKilometer() {
        Assert.assertEquals(0.000254, LengthUnit.INCH.convert(suitable, LengthUnit.KILOMETER), delta);
        Assert.assertEquals(2.54 * Math.pow(10, 5), LengthUnit.INCH.convert(bigger, LengthUnit.KILOMETER), delta);
        Assert.assertEquals(-2.54 * Math.pow(10, -16), LengthUnit.INCH.convert(smaller, LengthUnit.KILOMETER), delta);
    }
    @Test
    public void testINCHToInch() {
        Assert.assertEquals(10.0, LengthUnit.INCH.convert(suitable, LengthUnit.INCH), delta);
        Assert.assertEquals(10000000000.0, LengthUnit.INCH.convert(bigger, LengthUnit.INCH), delta);
        Assert.assertEquals(-0.00000000001, LengthUnit.INCH.convert(smaller, LengthUnit.INCH), delta);
    }
    @Test
    public void testINCHoFeet() {
        Assert.assertEquals(0.8333333333, LengthUnit.INCH.convert(suitable, LengthUnit.FEET), delta);
        Assert.assertEquals(833333333.3, LengthUnit.INCH.convert(bigger, LengthUnit.FEET), delta);
        Assert.assertEquals(-8.333333333 * Math.pow(10, -13), LengthUnit.INCH.convert(smaller, LengthUnit.FEET), delta);
    }
    @Test
    public void testINCHToYard() {
        Assert.assertEquals(0.27777777777778, LengthUnit.INCH.convert(suitable, LengthUnit.YARD), delta);
        Assert.assertEquals(2.7777777777778 * Math.pow(10, 8), LengthUnit.INCH.convert(bigger, LengthUnit.YARD), delta);
        Assert.assertEquals(-2.7777777777778 * Math.pow(10, -13), LengthUnit.INCH.convert(smaller, LengthUnit.YARD), delta);
    }
    @Test
    public void testINCHToMile() {
        Assert.assertEquals(0.00015782828282828, LengthUnit.INCH.convert(suitable, LengthUnit.MILE), delta);
        Assert.assertEquals(1.5782828282828 * Math.pow(10, 5), LengthUnit.INCH.convert(bigger, LengthUnit.MILE), delta);
        Assert.assertEquals(-1.5782828282828 * Math.pow(10, -16), LengthUnit.INCH.convert(smaller, LengthUnit.MILE), delta);
    }
    @Test
    public void testINCHToNMile() {
        Assert.assertEquals(0.00013714902807775, LengthUnit.INCH.convert(suitable, LengthUnit.NMILE), delta);
        Assert. assertEquals(1.37149 * Math.pow(10, 5), LengthUnit.INCH.convert(bigger, LengthUnit.NMILE), delta);
        Assert.assertEquals(-1.3714902807775 * Math.pow(10, -16), LengthUnit.INCH.convert(smaller, LengthUnit.NMILE), delta);
    }
    @Test
    public void testINCHToMil() {
        Assert.assertEquals(Math.pow(10, 4), LengthUnit.INCH.convert(suitable, LengthUnit.MIL), delta);
        Assert.assertEquals(Math.pow(10, 13), LengthUnit.INCH.convert(bigger, LengthUnit.MIL), delta);
        Assert.assertEquals(-Math.pow(10, -8), LengthUnit.INCH.convert(smaller, LengthUnit.MIL), delta);
    }
    @Test
    public void testFEETToMillimeter() {
        Assert.assertEquals(3048, LengthUnit.FEET.convert(suitable, LengthUnit.MILLIMETER), delta);
        Assert.assertEquals(3.048 * Math.pow(10, 12), LengthUnit.FEET.convert(bigger, LengthUnit.MILLIMETER), delta);
        Assert.assertEquals(-3.048 * Math.pow(10, -9), LengthUnit.FEET.convert(smaller, LengthUnit.MILLIMETER), delta);
    }
    @Test
    public void testFEETToCentimeter() {
        Assert.assertEquals(304.8, LengthUnit.FEET.convert(suitable, LengthUnit.CENTIMETER), delta);
        Assert.assertEquals(3.048 * Math.pow(10, 11), LengthUnit.FEET.convert(bigger, LengthUnit.CENTIMETER), delta);
        Assert.assertEquals(-3.048 * Math.pow(10, -10), LengthUnit.FEET.convert(smaller, LengthUnit.CENTIMETER), delta);
    }
    @Test
    public void testFEETERToMeter() {
        Assert.assertEquals(3.048, LengthUnit.FEET.convert(suitable, LengthUnit.METER), delta);
        Assert.assertEquals(3.048 * Math.pow(10, 9), LengthUnit.FEET.convert(bigger, LengthUnit.METER), delta);
        Assert.assertEquals(-3.048 * Math.pow(10, -12), LengthUnit.FEET.convert(smaller, LengthUnit.METER), delta);
    }
    @Test
    public void testFEETToKilometer() {
        Assert.assertEquals(0.003048, LengthUnit.FEET.convert(suitable, LengthUnit.KILOMETER), delta);
        Assert.assertEquals(3.048 * Math.pow(10, 6), LengthUnit.FEET.convert(bigger, LengthUnit.KILOMETER), delta);
        Assert.assertEquals(-3.048 * Math.pow(10, -15), LengthUnit.FEET.convert(smaller, LengthUnit.KILOMETER), delta);
    }
    @Test
    public void testFEETToInch() {
        Assert.assertEquals(120, LengthUnit.FEET.convert(suitable, LengthUnit.INCH), delta);
        Assert.assertEquals(1.2 * Math.pow(10, 11), LengthUnit.FEET.convert(bigger, LengthUnit.INCH), delta);
        Assert.assertEquals(-1.2 * Math.pow(10, -10), LengthUnit.FEET.convert(smaller, LengthUnit.INCH), delta);
    }
    @Test
    public void testFEEToFeet() {
        Assert.assertEquals(10.0, LengthUnit.FEET.convert(suitable, LengthUnit.FEET), delta);
        Assert.assertEquals(10000000000.0, LengthUnit.FEET.convert(bigger, LengthUnit.FEET), delta);
        Assert.assertEquals(-0.00000000001, LengthUnit.FEET.convert(smaller, LengthUnit.FEET), delta);
    }
    @Test
    public void testFEETToYard() {
        Assert.assertEquals(3.333333, LengthUnit.FEET.convert(suitable, LengthUnit.YARD), delta);
        Assert.assertEquals(3.333333 * Math.pow(10, 9), LengthUnit.FEET.convert(bigger, LengthUnit.YARD), delta);
        Assert.assertEquals(-3.333333 * Math.pow(10, -12), LengthUnit.FEET.convert(smaller, LengthUnit.YARD), delta);
    }
    @Test
    public void testFEETToMile() {
        Assert.assertEquals(0.0018939393939394, LengthUnit.FEET.convert(suitable, LengthUnit.MILE), delta);
        Assert.assertEquals(1.8939393939394 * Math.pow(10, 6), LengthUnit.FEET.convert(bigger, LengthUnit.MILE), delta);
        Assert.assertEquals(-1.8939393939394 * Math.pow(10, -15), LengthUnit.FEET.convert(smaller, LengthUnit.MILE), delta);
    }
    @Test
    public void testFEETToNMile() {
        Assert.assertEquals(0.001645788336933, LengthUnit.FEET.convert(suitable, LengthUnit.NMILE), delta);
        Assert. assertEquals(1.645788336933 * Math.pow(10, 6), LengthUnit.FEET.convert(bigger, LengthUnit.NMILE), delta);
        Assert.assertEquals(-1.645788336933 * Math.pow(10, -15), LengthUnit.FEET.convert(smaller, LengthUnit.NMILE), delta);
    }
    @Test
    public void testFEETToMil() {
        Assert.assertEquals(1.2 * Math.pow(10, 5), LengthUnit.FEET.convert(suitable, LengthUnit.MIL), delta);
        Assert.assertEquals(1.2 * Math.pow(10, 14), LengthUnit.FEET.convert(bigger, LengthUnit.MIL), delta);
        Assert.assertEquals(-1.2 * Math.pow(10, -7), LengthUnit.FEET.convert(smaller, LengthUnit.MIL), delta);
    }
    @Test
    public void testYARDToMillimeter() {
        Assert.assertEquals(9144, LengthUnit.YARD.convert(suitable, LengthUnit.MILLIMETER), delta);
        Assert.assertEquals(9.144 * Math.pow(10, 12), LengthUnit.YARD.convert(bigger, LengthUnit.MILLIMETER), delta);
        Assert.assertEquals(-9.144 * Math.pow(10, -9), LengthUnit.YARD.convert(smaller, LengthUnit.MILLIMETER), delta);
    }
    @Test
    public void testYARDToCentimeter() {
        Assert.assertEquals(914.4, LengthUnit.YARD.convert(suitable, LengthUnit.CENTIMETER), delta);
        Assert.assertEquals(9.144 * Math.pow(10, 11), LengthUnit.YARD.convert(bigger, LengthUnit.CENTIMETER), delta);
        Assert.assertEquals(-9.144 * Math.pow(10, -10), LengthUnit.YARD.convert(smaller, LengthUnit.CENTIMETER), delta);
    }
    @Test
    public void testYARDERToMeter() {
        Assert.assertEquals(9.144, LengthUnit.YARD.convert(suitable, LengthUnit.METER), delta);
        Assert.assertEquals(9.144 * Math.pow(10, 9), LengthUnit.YARD.convert(bigger, LengthUnit.METER), delta);
        Assert.assertEquals(-9.144 * Math.pow(10, -12), LengthUnit.YARD.convert(smaller, LengthUnit.METER), delta);
    }
    @Test
    public void testYARDToKilometer() {
        Assert.assertEquals(0.009144, LengthUnit.YARD.convert(suitable, LengthUnit.KILOMETER), delta);
        Assert.assertEquals(9.144 * Math.pow(10, 6), LengthUnit.YARD.convert(bigger, LengthUnit.KILOMETER), delta);
        Assert.assertEquals(-9.144 * Math.pow(10, -15), LengthUnit.YARD.convert(smaller, LengthUnit.KILOMETER), delta);
    }
    @Test
    public void testYARDToInch() {
        Assert.assertEquals(360, LengthUnit.YARD.convert(suitable, LengthUnit.INCH), delta);
        Assert.assertEquals(3.6 * Math.pow(10, 11), LengthUnit.YARD.convert(bigger, LengthUnit.INCH), delta);
        Assert.assertEquals(-3.6 * Math.pow(10, -10), LengthUnit.YARD.convert(smaller, LengthUnit.INCH), delta);
    }
    @Test
    public void testYARDoFeet() {
        Assert.assertEquals(30, LengthUnit.YARD.convert(suitable, LengthUnit.FEET), delta);
        Assert.assertEquals(3 * Math.pow(10, 10), LengthUnit.YARD.convert(bigger, LengthUnit.FEET), delta);
        Assert.assertEquals(-3 * Math.pow(10, -11), LengthUnit.YARD.convert(smaller, LengthUnit.FEET), delta);
    }
    @Test
    public void testYARDToYard() {
        Assert.assertEquals(10.0, LengthUnit.YARD.convert(suitable, LengthUnit.YARD), delta);
        Assert.assertEquals(10000000000.0, LengthUnit.YARD.convert(bigger, LengthUnit.YARD), delta);
        Assert.assertEquals(-0.00000000001, LengthUnit.YARD.convert(smaller, LengthUnit.YARD), delta);
    }
    @Test
    public void testYARDToMile() {
        Assert.assertEquals(0.0056818181818182, LengthUnit.YARD.convert(suitable, LengthUnit.MILE), delta);
        Assert.assertEquals(5.6818181818182 * Math.pow(10, 6), LengthUnit.YARD.convert(bigger, LengthUnit.MILE), delta);
        Assert.assertEquals(-5.6818181818182 * Math.pow(10, -15), LengthUnit.YARD.convert(smaller, LengthUnit.MILE), delta);
    }
    @Test
    public void testYARDToNMile() {
        Assert.assertEquals(0.0049373650107991, LengthUnit.YARD.convert(suitable, LengthUnit.NMILE), delta);
        Assert. assertEquals(4.9373650107991 * Math.pow(10, 6), LengthUnit.YARD.convert(bigger, LengthUnit.NMILE), delta);
        Assert.assertEquals(-4.9373650107991 * Math.pow(10, -15), LengthUnit.YARD.convert(smaller, LengthUnit.NMILE), delta);
    }
    @Test
    public void testYARDToMil() {
        Assert.assertEquals(3.6 * Math.pow(10, 5), LengthUnit.YARD.convert(suitable, LengthUnit.MIL), delta);
        Assert.assertEquals(3.6 * Math.pow(10, 14), LengthUnit.YARD.convert(bigger, LengthUnit.MIL), delta);
        Assert.assertEquals(-3.6 * Math.pow(10, -7), LengthUnit.YARD.convert(smaller, LengthUnit.MIL), delta);
    }
    @Test
    public void testMILEToMillimeter() {
        Assert.assertEquals(1.609344 * Math.pow(10, 7), LengthUnit.MILE.convert(suitable, LengthUnit.MILLIMETER), delta);
        Assert.assertEquals(16093440000000000.0, LengthUnit.MILE.convert(bigger, LengthUnit.MILLIMETER), delta);
        Assert.assertEquals(-1.609344 * Math.pow(10, -5), LengthUnit.MILE.convert(smaller, LengthUnit.MILLIMETER), delta);
    }
    @Test
    public void testMILEToCentimeter() {
        Assert.assertEquals(1.609344 * Math.pow(10, 6), LengthUnit.MILE.convert(suitable, LengthUnit.CENTIMETER), delta);
        Assert.assertEquals(1.609344 * Math.pow(10, 15), LengthUnit.MILE.convert(bigger, LengthUnit.CENTIMETER), delta);
        Assert.assertEquals(-1.609344 * Math.pow(10, -6), LengthUnit.MILE.convert(smaller, LengthUnit.CENTIMETER), delta);
    }
    @Test
    public void testMILEERToMeter() {
        Assert.assertEquals(1.609344 * Math.pow(10, 4), LengthUnit.MILE.convert(suitable, LengthUnit.METER), delta);
        Assert.assertEquals(16093440000000.0, LengthUnit.MILE.convert(bigger, LengthUnit.METER), delta);
        Assert.assertEquals(-1.609344 * Math.pow(10, -8), LengthUnit.MILE.convert(smaller, LengthUnit.METER), delta);
    }
    @Test
    public void testMILEToKilometer() {
        Assert.assertEquals(16.09344, LengthUnit.MILE.convert(suitable, LengthUnit.KILOMETER), delta);
        Assert.assertEquals(1.609344 * Math.pow(10, 10), LengthUnit.MILE.convert(bigger, LengthUnit.KILOMETER), delta);
        Assert.assertEquals(-1.609344 * Math.pow(10, -11), LengthUnit.MILE.convert(smaller, LengthUnit.KILOMETER), delta);
    }
    @Test
    public void testMILEToInch() {
        Assert.assertEquals(6.336 * Math.pow(10, 5), LengthUnit.MILE.convert(suitable, LengthUnit.INCH), delta);
        Assert.assertEquals(6.336 * Math.pow(10, 14), LengthUnit.MILE.convert(bigger, LengthUnit.INCH), delta);
        Assert.assertEquals(-6.336 * Math.pow(10, -7), LengthUnit.MILE.convert(smaller, LengthUnit.INCH), delta);
    }
    @Test
    public void testMILEoFeet() {
        Assert.assertEquals(5.28 * Math.pow(10, 4), LengthUnit.MILE.convert(suitable, LengthUnit.FEET), delta);
        Assert.assertEquals(5.28 * Math.pow(10, 13), LengthUnit.MILE.convert(bigger, LengthUnit.FEET), delta);
        Assert.assertEquals(-5.28 * Math.pow(10, -8), LengthUnit.MILE.convert(smaller, LengthUnit.FEET), delta);
    }
    @Test
    public void testMILEToYard() {
        Assert.assertEquals(1.76 * Math.pow(10, 4), LengthUnit.MILE.convert(suitable, LengthUnit.YARD), delta);
        Assert.assertEquals(1.76 * Math.pow(10, 13), LengthUnit.MILE.convert(bigger, LengthUnit.YARD), delta);
        Assert.assertEquals(-1.76 * Math.pow(10, -8), LengthUnit.MILE.convert(smaller, LengthUnit.YARD), delta);
    }
    @Test
    public void testMILEToMile() {
        Assert.assertEquals(10.0, LengthUnit.MILE.convert(suitable, LengthUnit.MILE), delta);
        Assert.assertEquals(10000000000.0, LengthUnit.MILE.convert(bigger, LengthUnit.MILE), delta);
        Assert.assertEquals(-0.00000000001, LengthUnit.MILE.convert(smaller, LengthUnit.MILE), delta);
    }
    @Test
    public void testMILEToNMile() {
        Assert.assertEquals(8.6897624190065, LengthUnit.MILE.convert(suitable, LengthUnit.NMILE), delta);
        Assert. assertEquals(8.6897624190065 * Math.pow(10, 9), LengthUnit.MILE.convert(bigger, LengthUnit.NMILE), delta);
        Assert.assertEquals(-8.6897624190065 * Math.pow(10, -12), LengthUnit.MILE.convert(smaller, LengthUnit.NMILE), delta);
    }
    @Test
    public void testMILEToMil() {
        Assert.assertEquals(6.336 * Math.pow(10, 8), LengthUnit.MILE.convert(suitable, LengthUnit.MIL), delta);
        Assert.assertEquals(6.336 * Math.pow(10, 17), LengthUnit.MILE.convert(bigger, LengthUnit.MIL), delta);
        Assert.assertEquals(-0.0006336, LengthUnit.MILE.convert(smaller, LengthUnit.MIL), delta);
    }
    @Test
    public void testNMILEToMillimeter() {
        Assert.assertEquals(1.852 * Math.pow(10, 7), LengthUnit.NMILE.convert(suitable, LengthUnit.MILLIMETER), delta);
        Assert.assertEquals(18520000000000000.0, LengthUnit.NMILE.convert(bigger, LengthUnit.MILLIMETER), delta);
        Assert.assertEquals(-1.852 * Math.pow(10, -5), LengthUnit.NMILE.convert(smaller, LengthUnit.MILLIMETER), delta);
    }
    @Test
    public void testNMILEToCentimeter() {
        Assert.assertEquals(1.852 * Math.pow(10, 6), LengthUnit.NMILE.convert(suitable, LengthUnit.CENTIMETER), delta);
        Assert.assertEquals(1.852 * Math.pow(10, 15), LengthUnit.NMILE.convert(bigger, LengthUnit.CENTIMETER), delta);
        Assert.assertEquals(-1.852 * Math.pow(10, -6), LengthUnit.NMILE.convert(smaller, LengthUnit.CENTIMETER), delta);
    }
    @Test
    public void testNMILERToMeter() {
        Assert.assertEquals(1.852 * Math.pow(10, 4), LengthUnit.NMILE.convert(suitable, LengthUnit.METER), delta);
        Assert.assertEquals(18520000000000.0, LengthUnit.NMILE.convert(bigger, LengthUnit.METER), delta);
        Assert.assertEquals(-1.852 * Math.pow(10, -8), LengthUnit.NMILE.convert(smaller, LengthUnit.METER), delta);
    }
    @Test
    public void testNMILEToKilometer() {
        Assert.assertEquals(18.52, LengthUnit.NMILE.convert(suitable, LengthUnit.KILOMETER), delta);
        Assert.assertEquals(1.852 * Math.pow(10, 10), LengthUnit.NMILE.convert(bigger, LengthUnit.KILOMETER), delta);
        Assert.assertEquals(-1.852 * Math.pow(10, -11), LengthUnit.NMILE.convert(smaller, LengthUnit.KILOMETER), delta);
    }
    @Test
    public void testNMILEToInch() {
        Assert.assertEquals(7.2913385826772 * Math.pow(10, 5), LengthUnit.NMILE.convert(suitable, LengthUnit.INCH), delta);
        Assert.assertEquals(7.2913385826772 * Math.pow(10, 14), LengthUnit.NMILE.convert(bigger, LengthUnit.INCH), delta);
        Assert.assertEquals(-7.2913385826772 * Math.pow(10, -7), LengthUnit.NMILE.convert(smaller, LengthUnit.INCH), delta);
    }
    @Test
    public void testNMILEoFeet() {
        Assert.assertEquals(60761.154855643, LengthUnit.NMILE.convert(suitable, LengthUnit.FEET), delta);
        Assert.assertEquals(60761154855643.0, LengthUnit.NMILE.convert(bigger, LengthUnit.FEET), delta);
        Assert.assertEquals(-6.0761154855643 * Math.pow(10, -8), LengthUnit.NMILE.convert(smaller, LengthUnit.FEET), delta);
    }
    @Test
    public void testNMILEToYard() {
        Assert.assertEquals(2.0253718285214 * Math.pow(10, 4), LengthUnit.NMILE.convert(suitable, LengthUnit.YARD), delta);
        Assert.assertEquals(2.0253718285214 * Math.pow(10, 13), LengthUnit.NMILE.convert(bigger, LengthUnit.YARD), delta);
        Assert.assertEquals(-2.0253718285214 * Math.pow(10, -8), LengthUnit.NMILE.convert(smaller, LengthUnit.YARD), delta);
    }
    @Test
    public void testNMILEToMile() {
        Assert.assertEquals(11.507794480235, LengthUnit.NMILE.convert(suitable, LengthUnit.MILE), delta);
        Assert.assertEquals(1.1507794480235 * Math.pow(10, 10), LengthUnit.NMILE.convert(bigger, LengthUnit.MILE), delta);
        Assert.assertEquals(-1.1507794480235 * Math.pow(10, -11), LengthUnit.NMILE.convert(smaller, LengthUnit.MILE), delta);
    }
    @Test
    public void testNMILEToNMile() {
        Assert.assertEquals(10.0, LengthUnit.NMILE.convert(suitable, LengthUnit.NMILE), delta);
        Assert. assertEquals(10000000000.0, LengthUnit.NMILE.convert(bigger, LengthUnit.NMILE), delta);
        Assert.assertEquals(-0.00000000001, LengthUnit.NMILE.convert(smaller, LengthUnit.NMILE), delta);
    }
    @Test
    public void testNMILEToMil() {
        Assert.assertEquals(7.2913385826772 * Math.pow(10, 8), LengthUnit.NMILE.convert(suitable, LengthUnit.MIL), delta);
        Assert.assertEquals(7.2913385826772 * Math.pow(10, 17), LengthUnit.NMILE.convert(bigger, LengthUnit.MIL), delta);
        Assert.assertEquals(-0.00072913385826772, LengthUnit.NMILE.convert(smaller, LengthUnit.MIL), delta);
    }
    @Test
    public void testMILToMillimeter() {
        Assert.assertEquals(0.254, LengthUnit.MIL.convert(suitable, LengthUnit.MILLIMETER), delta);
        Assert.assertEquals(2.54 * Math.pow(10, 8), LengthUnit.MIL.convert(bigger, LengthUnit.MILLIMETER), delta);
        Assert.assertEquals(-2.54 * Math.pow(10, -13), LengthUnit.MIL.convert(smaller, LengthUnit.MILLIMETER), delta);
    }
    @Test
    public void testMILToCentimeter() {
        Assert.assertEquals(0.0254, LengthUnit.MIL.convert(suitable, LengthUnit.CENTIMETER), delta);
        Assert.assertEquals(2.54 * Math.pow(10, 7), LengthUnit.MIL.convert(bigger, LengthUnit.CENTIMETER), delta);
        Assert.assertEquals(-2.54 * Math.pow(10, -14), LengthUnit.MIL.convert(smaller, LengthUnit.CENTIMETER), delta);
    }
    @Test
    public void testMILToMeter() {
        Assert.assertEquals(0.000254, LengthUnit.MIL.convert(suitable, LengthUnit.METER), delta);
        Assert.assertEquals(2.54 * Math.pow(10, 5), LengthUnit.MIL.convert(bigger, LengthUnit.METER), delta);
        Assert.assertEquals(-2.54 * Math.pow(10, -16), LengthUnit.MIL.convert(smaller, LengthUnit.METER), delta);
    }
    @Test
    public void testMILToKilometer() {
        Assert.assertEquals(2.54 * Math.pow(10, -7), LengthUnit.MIL.convert(suitable, LengthUnit.KILOMETER), delta);
        Assert.assertEquals(254, LengthUnit.MIL.convert(bigger, LengthUnit.KILOMETER), delta);
        Assert.assertEquals(-2.54 * Math.pow(10, -19), LengthUnit.MIL.convert(smaller, LengthUnit.KILOMETER), delta);
    }
    @Test
    public void testMILToInch() {
        Assert.assertEquals(0.01, LengthUnit.MIL.convert(suitable, LengthUnit.INCH), delta);
        Assert.assertEquals(Math.pow(10, 7), LengthUnit.MIL.convert(bigger, LengthUnit.INCH), delta);
        Assert.assertEquals(-Math.pow(10, -14), LengthUnit.MIL.convert(smaller, LengthUnit.INCH), delta);
    }
    @Test
    public void testMILoFeet() {
        Assert.assertEquals(0.00083333333333333, LengthUnit.MIL.convert(suitable, LengthUnit.FEET), delta);
        Assert.assertEquals(8.333333333 * Math.pow(10, 5), LengthUnit.MIL.convert(bigger, LengthUnit.FEET), delta);
        Assert.assertEquals(-8.3333333333333 * Math.pow(10, -16), LengthUnit.MIL.convert(smaller, LengthUnit.FEET), delta);
    }
    @Test
    public void testMILToYard() {
        Assert.assertEquals(0.00027777777777778, LengthUnit.MIL.convert(suitable, LengthUnit.YARD), delta);
        Assert.assertEquals(2.7777777777778 * Math.pow(10, 5), LengthUnit.MIL.convert(bigger, LengthUnit.YARD), delta);
        Assert.assertEquals(-2.7777777777778 * Math.pow(10, -16), LengthUnit.MIL.convert(smaller, LengthUnit.YARD), delta);
    }
    @Test
    public void testMILToMile() {
        Assert.assertEquals(1.5782828282828 * Math.pow(10, -7), LengthUnit.MIL.convert(suitable, LengthUnit.MILE), delta);
        Assert.assertEquals(157.82828282828, LengthUnit.MIL.convert(bigger, LengthUnit.MILE), delta);
        Assert.assertEquals(-1.5782828282828 * Math.pow(10, -19), LengthUnit.MIL.convert(smaller, LengthUnit.MILE), delta);
    }
    @Test
    public void testMILToNMile() {
        Assert.assertEquals(1.3714902807775 * Math.pow(10, -7), LengthUnit.MIL.convert(suitable, LengthUnit.NMILE), delta);
        Assert. assertEquals(137.14902807775, LengthUnit.MIL.convert(bigger, LengthUnit.NMILE), delta);
        Assert.assertEquals(-1.3714902807775 * Math.pow(10, -19), LengthUnit.MIL.convert(smaller, LengthUnit.NMILE), delta);
    }
    @Test
    public void testMILToMil() {
        Assert.assertEquals(10.0, LengthUnit.MIL.convert(suitable, LengthUnit.MIL), delta);
        Assert.assertEquals(10000000000.0, LengthUnit.MIL.convert(bigger, LengthUnit.MIL), delta);
        Assert.assertEquals(-0.00000000001, LengthUnit.MIL.convert(smaller, LengthUnit.MIL), delta);
    }
}
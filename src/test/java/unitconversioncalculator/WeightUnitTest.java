package unitconversioncalculator;
import org.junit.Assert;
import org.junit.Test;

public class WeightUnitTest {
    private static final double suitable = 10.0;
    private static final double bigger = 10000000000.0;
    private static final double smaller = -0.00000000001;
    private static final double delta = 0.00000001;

    //TON, BRITISHTON, USTON, POUND, OUNCE, KILOGRAM, GRAM
    //Ton, BritishTon, UsTon, Pound, Ounce, Kilogram, Gram

    @Test
    public void testTONToTon() {
        Assert.assertEquals(10.0, WeightUnit.TON.convert(suitable, WeightUnit.TON), delta);
        Assert.assertEquals(10000000000.0, WeightUnit.TON.convert(bigger, WeightUnit.TON), delta);
        Assert.assertEquals(-0.00000000001, WeightUnit.TON.convert(smaller, WeightUnit.TON), delta);
    }
    @Test
    public void testTONToBritishTon() {
        Assert.assertEquals(9.8420652761106, WeightUnit.TON.convert(suitable, WeightUnit.BRITISHTON), delta);
        Assert.assertEquals(9.8420652761106 * Math.pow(10, 9), WeightUnit.TON.convert(bigger, WeightUnit.BRITISHTON), delta);
        Assert.assertEquals(-9.8420652761106 * Math.pow(10, -12), WeightUnit.TON.convert(smaller, WeightUnit.BRITISHTON), delta);
    }
    @Test
    public void testTONToUsTon() {
        Assert.assertEquals(11.023113109244, WeightUnit.TON.convert(suitable, WeightUnit.USTON), delta);
        Assert.assertEquals(1.1023113109244 * Math.pow(10, 10), WeightUnit.TON.convert(bigger, WeightUnit.USTON), delta);
        Assert.assertEquals(-1.1023113109244 * Math.pow(10, -11), WeightUnit.TON.convert(smaller, WeightUnit.USTON), delta);
    }
    @Test
    public void testTONToPound() {
        Assert.assertEquals(2.2046226218488 * Math.pow(10, 4), WeightUnit.TON.convert(suitable, WeightUnit.POUND), delta);
        Assert.assertEquals(2.2046226218488 * Math.pow(10, 13), WeightUnit.TON.convert(bigger, WeightUnit.POUND), delta);
        Assert.assertEquals(-2.2046226218488 * Math.pow(10, -8), WeightUnit.TON.convert(smaller, WeightUnit.POUND), delta);
    }
    @Test
    public void testTONToOunce() {
        Assert.assertEquals(3.527396194958 * Math.pow(10, 5), WeightUnit.TON.convert(suitable, WeightUnit.OUNCE), delta);
        Assert.assertEquals(3.527396194958 * Math.pow(10, 14), WeightUnit.TON.convert(bigger, WeightUnit.OUNCE), delta);
        Assert.assertEquals(-3.527396194958 * Math.pow(10, -7), WeightUnit.TON.convert(smaller, WeightUnit.OUNCE), delta);
    }
    @Test
    public void testTONToKilogram() {
        Assert.assertEquals(Math.pow(10, 4), WeightUnit.TON.convert(suitable, WeightUnit.KILOGRAM), delta);
        Assert.assertEquals(Math.pow(10, 13), WeightUnit.TON.convert(bigger, WeightUnit.KILOGRAM), delta);
        Assert.assertEquals(-Math.pow(10, -8), WeightUnit.TON.convert(smaller, WeightUnit.KILOGRAM), delta);
    }
    @Test
    public void testTONToGram() {
        Assert.assertEquals(Math.pow(10, 7), WeightUnit.TON.convert(suitable, WeightUnit.GRAM), delta);
        Assert.assertEquals(Math.pow(10, 16), WeightUnit.TON.convert(bigger, WeightUnit.GRAM), delta);
        Assert.assertEquals(-Math.pow(10, -5), WeightUnit.TON.convert(smaller, WeightUnit.GRAM), delta);
    }
    @Test
    public void testBRITISHTONToTon() {
        Assert.assertEquals(10.160469088, WeightUnit.BRITISHTON.convert(suitable, WeightUnit.TON), delta);
        Assert.assertEquals(1.0160469088 * Math.pow(10, 10), WeightUnit.BRITISHTON.convert(bigger, WeightUnit.TON), delta);
        Assert.assertEquals(-1.0160469088 * Math.pow(10, -11), WeightUnit.BRITISHTON.convert(smaller, WeightUnit.TON), delta);
    }
    @Test
    public void testBRITISHTONToBritishTon() {
        Assert.assertEquals(10.0, WeightUnit.BRITISHTON.convert(suitable, WeightUnit.BRITISHTON), delta);
        Assert.assertEquals(10000000000.0, WeightUnit.BRITISHTON.convert(bigger, WeightUnit.BRITISHTON), delta);
        Assert.assertEquals(-0.00000000001, WeightUnit.BRITISHTON.convert(smaller, WeightUnit.BRITISHTON), delta);
    }
    @Test
    public void testBRITISHTONToUsTon() {
        Assert.assertEquals(11.2, WeightUnit.BRITISHTON.convert(suitable, WeightUnit.USTON), delta);
        Assert.assertEquals(1.12 * Math.pow(10, 10), WeightUnit.BRITISHTON.convert(bigger, WeightUnit.USTON), delta);
        Assert.assertEquals(-1.12 * Math.pow(10, -11), WeightUnit.BRITISHTON.convert(smaller, WeightUnit.USTON), delta);
    }
    @Test
    public void testBRITISHTONToPound() {
        Assert.assertEquals(2.24 * Math.pow(10, 4), WeightUnit.BRITISHTON.convert(suitable, WeightUnit.POUND), delta);
        Assert.assertEquals(22400000000000.0, WeightUnit.BRITISHTON.convert(bigger, WeightUnit.POUND), delta);
        Assert.assertEquals(-2.24 * Math.pow(10, -8), WeightUnit.BRITISHTON.convert(smaller, WeightUnit.POUND), delta);
    }
    @Test
    public void testBRITISHTONToOunce() {
        Assert.assertEquals(3.584 * Math.pow(10, 5), WeightUnit.BRITISHTON.convert(suitable, WeightUnit.OUNCE), delta);
        Assert.assertEquals(3.584 * Math.pow(10, 14), WeightUnit.BRITISHTON.convert(bigger, WeightUnit.OUNCE), delta);
        Assert.assertEquals(-3.584 * Math.pow(10, -7), WeightUnit.BRITISHTON.convert(smaller, WeightUnit.OUNCE), delta);
    }
    @Test
    public void testBRITISHTONToKilogram() {
        Assert.assertEquals(1.0160469088 * Math.pow(10, 4), WeightUnit.BRITISHTON.convert(suitable, WeightUnit.KILOGRAM), delta);
        Assert.assertEquals(1.0160469088 * Math.pow(10, 13), WeightUnit.BRITISHTON.convert(bigger, WeightUnit.KILOGRAM), delta);
        Assert.assertEquals(-1.0160469088 * Math.pow(10, -8), WeightUnit.BRITISHTON.convert(smaller, WeightUnit.KILOGRAM), delta);
    }
    @Test
    public void testBRITISHTONToGram() {
        Assert.assertEquals(1.0160469088 * Math.pow(10, 7), WeightUnit.BRITISHTON.convert(suitable, WeightUnit.GRAM), delta);
        Assert.assertEquals(1.0160469088 * Math.pow(10, 16), WeightUnit.BRITISHTON.convert(bigger, WeightUnit.GRAM), delta);
        Assert.assertEquals(-1.0160469088 * Math.pow(10, -5), WeightUnit.BRITISHTON.convert(smaller, WeightUnit.GRAM), delta);
    }
    @Test
    public void testUSTONToTon() {
        Assert.assertEquals(9.0718474 , WeightUnit.USTON.convert(suitable, WeightUnit.TON), delta);
        Assert.assertEquals(9.0718474 * Math.pow(10, 9), WeightUnit.USTON.convert(bigger, WeightUnit.TON), delta);
        Assert.assertEquals(-9.0718474 * Math.pow(10, -12), WeightUnit.USTON.convert(smaller, WeightUnit.TON), delta);
    }
    @Test
    public void testUSTONToBritishTon() {
        Assert.assertEquals(8.9285714285714, WeightUnit.USTON.convert(suitable, WeightUnit.BRITISHTON), delta);
        Assert.assertEquals(8.9285714285714 * Math.pow(10, 9), WeightUnit.USTON.convert(bigger, WeightUnit.BRITISHTON), delta);
        Assert.assertEquals(-8.9285714285714 * Math.pow(10, -12), WeightUnit.USTON.convert(smaller, WeightUnit.BRITISHTON), delta);
    }
    @Test
    public void testUSTONToUsTon() {
        Assert.assertEquals(10.0, WeightUnit.USTON.convert(suitable, WeightUnit.USTON), delta);
        Assert.assertEquals(10000000000.0, WeightUnit.USTON.convert(bigger, WeightUnit.USTON), delta);
        Assert.assertEquals(-0.00000000001, WeightUnit.USTON.convert(smaller, WeightUnit.USTON), delta);
    }
    @Test
    public void testUSTONToPound() {
        Assert.assertEquals(2 * Math.pow(10, 4), WeightUnit.USTON.convert(suitable, WeightUnit.POUND), delta);
        Assert.assertEquals(2 * Math.pow(10, 13), WeightUnit.USTON.convert(bigger, WeightUnit.POUND), delta);
        Assert.assertEquals(-2 * Math.pow(10, -8), WeightUnit.USTON.convert(smaller, WeightUnit.POUND), delta);
    }
    @Test
    public void tesUStONToOunce() {
        Assert.assertEquals(3.2 * Math.pow(10, 5), WeightUnit.USTON.convert(suitable, WeightUnit.OUNCE), delta);
        Assert.assertEquals(3.2 * Math.pow(10, 14), WeightUnit.USTON.convert(bigger, WeightUnit.OUNCE), delta);
        Assert.assertEquals(-3.2 * Math.pow(10, -7), WeightUnit.USTON.convert(smaller, WeightUnit.OUNCE), delta);
    }
    @Test
    public void testUSTONToKilogram() {
        Assert.assertEquals(9071.8474, WeightUnit.USTON.convert(suitable, WeightUnit.KILOGRAM), delta);
        Assert.assertEquals(9.0718474 * Math.pow(10, 12), WeightUnit.USTON.convert(bigger, WeightUnit.KILOGRAM), delta);
        Assert.assertEquals(-9.0718474 * Math.pow(10, -9), WeightUnit.USTON.convert(smaller, WeightUnit.KILOGRAM), delta);
    }
    @Test
    public void testUSTONToGram() {
        Assert.assertEquals(9.0718474 * Math.pow(10, 6), WeightUnit.USTON.convert(suitable, WeightUnit.GRAM), delta);
        Assert.assertEquals(9.0718474 * Math.pow(10, 15), WeightUnit.USTON.convert(bigger, WeightUnit.GRAM), delta);
        Assert.assertEquals(-9.0718474 * Math.pow(10, -6), WeightUnit.USTON.convert(smaller, WeightUnit.GRAM), delta);
    }
    @Test
    public void testPOUNDToTon() {
        Assert.assertEquals(0.0045359237 , WeightUnit.POUND.convert(suitable, WeightUnit.TON), delta);
        Assert.assertEquals(4.5359237 * Math.pow(10, 6), WeightUnit.POUND.convert(bigger, WeightUnit.TON), delta);
        Assert.assertEquals(-4.5359237 * Math.pow(10, -15), WeightUnit.POUND.convert(smaller, WeightUnit.TON), delta);
    }
    @Test
    public void testPOUNDToBritishTon() {
        Assert.assertEquals(0.0044642857142857, WeightUnit.POUND.convert(suitable, WeightUnit.BRITISHTON), delta);
        Assert.assertEquals(4.4642857142857 * Math.pow(10, 6), WeightUnit.POUND.convert(bigger, WeightUnit.BRITISHTON), delta);
        Assert.assertEquals(-4.4642857142857 * Math.pow(10, -15), WeightUnit.POUND.convert(smaller, WeightUnit.BRITISHTON), delta);
    }
    @Test
    public void testPOUNDToUsTon() {
        Assert.assertEquals(0.005, WeightUnit.POUND.convert(suitable, WeightUnit.USTON), delta);
        Assert.assertEquals(5 * Math.pow(10, 6), WeightUnit.POUND.convert(bigger, WeightUnit.USTON), delta);
        Assert.assertEquals(-5 * Math.pow(10, -15), WeightUnit.POUND.convert(smaller, WeightUnit.USTON), delta);
    }
    @Test
    public void testPOUNDToPound() {
        Assert.assertEquals(10.0, WeightUnit.POUND.convert(suitable, WeightUnit.POUND), delta);
        Assert.assertEquals(10000000000.0, WeightUnit.POUND.convert(bigger, WeightUnit.POUND), delta);
        Assert.assertEquals(-0.00000000001, WeightUnit.POUND.convert(smaller, WeightUnit.POUND), delta);
    }
    @Test
    public void tesPOUNDToOunce() {
        Assert.assertEquals(160, WeightUnit.POUND.convert(suitable, WeightUnit.OUNCE), delta);
        Assert.assertEquals(1.6 * Math.pow(10, 11), WeightUnit.POUND.convert(bigger, WeightUnit.OUNCE), delta);
        Assert.assertEquals(-1.6 * Math.pow(10, -10), WeightUnit.POUND.convert(smaller, WeightUnit.OUNCE), delta);
    }
    @Test
    public void testPOUNDToKilogram() {
        Assert.assertEquals(4.5359237, WeightUnit.POUND.convert(suitable, WeightUnit.KILOGRAM), delta);
        Assert.assertEquals(4.5359237 * Math.pow(10, 9), WeightUnit.POUND.convert(bigger, WeightUnit.KILOGRAM), delta);
        Assert.assertEquals(-4.5359237 * Math.pow(10, -12), WeightUnit.POUND.convert(smaller, WeightUnit.KILOGRAM), delta);
    }
    @Test
    public void testPOUNDToGram() {
        Assert.assertEquals(4535.9237, WeightUnit.POUND.convert(suitable, WeightUnit.GRAM), delta);
        Assert.assertEquals(4.5359237 * Math.pow(10, 12), WeightUnit.POUND.convert(bigger, WeightUnit.GRAM), delta);
        Assert.assertEquals(-4.5359237 * Math.pow(10, -9), WeightUnit.POUND.convert(smaller, WeightUnit.GRAM), delta);
    }
    @Test
    public void testOUNCEToTon() {
        Assert.assertEquals(0.00028349523125 , WeightUnit.OUNCE.convert(suitable, WeightUnit.TON), delta);
        Assert.assertEquals(2.8349523125 * Math.pow(10, 5), WeightUnit.OUNCE.convert(bigger, WeightUnit.TON), delta);
        Assert.assertEquals(-2.8349523125 * Math.pow(10, -16), WeightUnit.OUNCE.convert(smaller, WeightUnit.TON), delta);
    }
    @Test
    public void testOUNCEToBritishTon() {
        Assert.assertEquals(0.00027901785714286, WeightUnit.OUNCE.convert(suitable, WeightUnit.BRITISHTON), delta);
        Assert.assertEquals(2.7901785714286 * Math.pow(10, 5), WeightUnit.OUNCE.convert(bigger, WeightUnit.BRITISHTON), delta);
        Assert.assertEquals(-2.7901785714286 * Math.pow(10, -16), WeightUnit.OUNCE.convert(smaller, WeightUnit.BRITISHTON), delta);
    }
    @Test
    public void testOUNCEToUsTon() {
        Assert.assertEquals(0.0003125, WeightUnit.OUNCE.convert(suitable, WeightUnit.USTON), delta);
        Assert.assertEquals(3.125 * Math.pow(10, 5), WeightUnit.OUNCE.convert(bigger, WeightUnit.USTON), delta);
        Assert.assertEquals(-3.125 * Math.pow(10, -16), WeightUnit.OUNCE.convert(smaller, WeightUnit.USTON), delta);
    }
    @Test
    public void testOUNCEToPound() {
        Assert.assertEquals(0.625, WeightUnit.OUNCE.convert(suitable, WeightUnit.POUND), delta);
        Assert.assertEquals(6.25 * Math.pow(10, 8), WeightUnit.OUNCE.convert(bigger, WeightUnit.POUND), delta);
        Assert.assertEquals(-6.25 * Math.pow(10, -13), WeightUnit.OUNCE.convert(smaller, WeightUnit.POUND), delta);
    }
    @Test
    public void tesOUNCEToOunce() {
        Assert.assertEquals(10.0, WeightUnit.OUNCE.convert(suitable, WeightUnit.OUNCE), delta);
        Assert.assertEquals(10000000000.0, WeightUnit.OUNCE.convert(bigger, WeightUnit.OUNCE), delta);
        Assert.assertEquals(-0.00000000001, WeightUnit.OUNCE.convert(smaller, WeightUnit.OUNCE), delta);
    }
    @Test
    public void testOUNCEToKilogram() {
        Assert.assertEquals(0.28349523125, WeightUnit.OUNCE.convert(suitable, WeightUnit.KILOGRAM), delta);
        Assert.assertEquals(2.8349523125 * Math.pow(10, 8), WeightUnit.OUNCE.convert(bigger, WeightUnit.KILOGRAM), delta);
        Assert.assertEquals(-2.8349523125 * Math.pow(10, -13), WeightUnit.OUNCE.convert(smaller, WeightUnit.KILOGRAM), delta);
    }
    @Test
    public void testOUNCEToGram() {
        Assert.assertEquals(283.49523125, WeightUnit.OUNCE.convert(suitable, WeightUnit.GRAM), delta);
        Assert.assertEquals(2.8349523125 * Math.pow(10, 11), WeightUnit.OUNCE.convert(bigger, WeightUnit.GRAM), delta);
        Assert.assertEquals(-2.8349523125 * Math.pow(10, -10), WeightUnit.OUNCE.convert(smaller, WeightUnit.GRAM), delta);
    }
    @Test
    public void testKILOGRAMToTon() {
        Assert.assertEquals(0.01 , WeightUnit.KILOGRAM.convert(suitable, WeightUnit.TON), delta);
        Assert.assertEquals(Math.pow(10, 7), WeightUnit.KILOGRAM.convert(bigger, WeightUnit.TON), delta);
        Assert.assertEquals(-Math.pow(10, -14), WeightUnit.KILOGRAM.convert(smaller, WeightUnit.TON), delta);
    }
    @Test
    public void testKILOGRAMToBritishTon() {
        Assert.assertEquals(0.0098420652761106, WeightUnit.KILOGRAM.convert(suitable, WeightUnit.BRITISHTON), delta);
        Assert.assertEquals(9.8420652761106 * Math.pow(10, 6), WeightUnit.KILOGRAM.convert(bigger, WeightUnit.BRITISHTON), delta);
        Assert.assertEquals(-9.8420652761106 * Math.pow(10, -15), WeightUnit.KILOGRAM.convert(smaller, WeightUnit.BRITISHTON), delta);
    }
    @Test
    public void testKILOGRAMToUsTon() {
        Assert.assertEquals(0.011023113109244, WeightUnit.KILOGRAM.convert(suitable, WeightUnit.USTON), delta);
        Assert.assertEquals(1.1023113109244 * Math.pow(10, 7), WeightUnit.KILOGRAM.convert(bigger, WeightUnit.USTON), delta);
        Assert.assertEquals(-1.1023113109244 * Math.pow(10, -14), WeightUnit.KILOGRAM.convert(smaller, WeightUnit.USTON), delta);
    }
    @Test
    public void testKILOGRAMToPound() {
        Assert.assertEquals(22.046226218488, WeightUnit.KILOGRAM.convert(suitable, WeightUnit.POUND), delta);
        Assert.assertEquals(2.2046226218488 * Math.pow(10, 10), WeightUnit.KILOGRAM.convert(bigger, WeightUnit.POUND), delta);
        Assert.assertEquals(-2.2046226218488 * Math.pow(10, -11), WeightUnit.KILOGRAM.convert(smaller, WeightUnit.POUND), delta);
    }
    @Test
    public void tesKILOGRAMToOunce() {
        Assert.assertEquals(352.7396195, WeightUnit.KILOGRAM.convert(suitable, WeightUnit.OUNCE), delta);
        Assert.assertEquals(3.527396195 * Math.pow(10, 11), WeightUnit.KILOGRAM.convert(bigger, WeightUnit.OUNCE), delta);
        Assert.assertEquals(-3.527396195 * Math.pow(10, -10), WeightUnit.KILOGRAM.convert(smaller, WeightUnit.OUNCE), delta);
    }
    @Test
    public void testKILOGRAMToKilogram() {
        Assert.assertEquals(10.0, WeightUnit.KILOGRAM.convert(suitable, WeightUnit.KILOGRAM), delta);
        Assert.assertEquals(10000000000.0, WeightUnit.KILOGRAM.convert(bigger, WeightUnit.KILOGRAM), delta);
        Assert.assertEquals(-0.00000000001, WeightUnit.KILOGRAM.convert(smaller, WeightUnit.KILOGRAM), delta);
    }
    @Test
    public void testKILOGRAMToGram() {
        Assert.assertEquals(Math.pow(10, 4), WeightUnit.KILOGRAM.convert(suitable, WeightUnit.GRAM), delta);
        Assert.assertEquals(Math.pow(10, 13), WeightUnit.KILOGRAM.convert(bigger, WeightUnit.GRAM), delta);
        Assert.assertEquals(-Math.pow(10, -8), WeightUnit.KILOGRAM.convert(smaller, WeightUnit.GRAM), delta);
    }
    @Test
    public void testGRAMToTon() {
        Assert.assertEquals(Math.pow(10, -5) , WeightUnit.GRAM.convert(suitable, WeightUnit.TON), delta);
        Assert.assertEquals(Math.pow(10, 4), WeightUnit.GRAM.convert(bigger, WeightUnit.TON), delta);
        Assert.assertEquals(-Math.pow(10, -17), WeightUnit.GRAM.convert(smaller, WeightUnit.TON), delta);
    }
    @Test
    public void testGRAMToBritishTon() {
        Assert.assertEquals(9.8420652761106 * Math.pow(10, -6), WeightUnit.GRAM.convert(suitable, WeightUnit.BRITISHTON), delta);
        Assert.assertEquals(9842.0652761106, WeightUnit.GRAM.convert(bigger, WeightUnit.BRITISHTON), delta);
        Assert.assertEquals(-9.8420652761106 * Math.pow(10, -18), WeightUnit.GRAM.convert(smaller, WeightUnit.BRITISHTON), delta);
    }
    @Test
    public void testGRAMToUsTon() {
        Assert.assertEquals(1.1023113109244 * Math.pow(10, -5), WeightUnit.GRAM.convert(suitable, WeightUnit.USTON), delta);
        Assert.assertEquals(1.1023113109244 * Math.pow(10, 4), WeightUnit.GRAM.convert(bigger, WeightUnit.USTON), delta);
        Assert.assertEquals(-1.1023113109244 * Math.pow(10, -17), WeightUnit.GRAM.convert(smaller, WeightUnit.USTON), delta);
    }
    @Test
    public void testGRAMToPound() {
        Assert.assertEquals(0.022046226218488, WeightUnit.GRAM.convert(suitable, WeightUnit.POUND), delta);
        Assert.assertEquals(2.2046226218488 * Math.pow(10, 7), WeightUnit.GRAM.convert(bigger, WeightUnit.POUND), delta);
        Assert.assertEquals(-2.2046226218488 * Math.pow(10, -14), WeightUnit.GRAM.convert(smaller, WeightUnit.POUND), delta);
    }
    @Test
    public void tesGRAMToOunce() {
        Assert.assertEquals(0.3527396195, WeightUnit.GRAM.convert(suitable, WeightUnit.OUNCE), delta);
        Assert.assertEquals(3.527396195 * Math.pow(10, 8), WeightUnit.GRAM.convert(bigger, WeightUnit.OUNCE), delta);
        Assert.assertEquals(-3.527396195 * Math.pow(10, -13), WeightUnit.GRAM.convert(smaller, WeightUnit.OUNCE), delta);
    }
    @Test
    public void testGRAMToKilogram() {
        Assert.assertEquals(0.01, WeightUnit.GRAM.convert(suitable, WeightUnit.KILOGRAM), delta);
        Assert.assertEquals(Math.pow(10, 7), WeightUnit.GRAM.convert(bigger, WeightUnit.KILOGRAM), delta);
        Assert.assertEquals(-Math.pow(10, -14), WeightUnit.GRAM.convert(smaller, WeightUnit.KILOGRAM), delta);
    }
    @Test
    public void testGRAMToGram() {
        Assert.assertEquals(10.0, WeightUnit.GRAM.convert(suitable, WeightUnit.GRAM), delta);
        Assert.assertEquals(10000000000.0, WeightUnit.GRAM.convert(bigger, WeightUnit.GRAM), delta);
        Assert.assertEquals(-0.00000000001, WeightUnit.GRAM.convert(smaller, WeightUnit.GRAM), delta);
    }
}
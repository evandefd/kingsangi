package unitconversioncalculator;

import org.junit.Assert;
import org.junit.Test;

public class DataUnitTest {
    private static final double suitable = 10.0;
    private static final double bigger = 10000000000.0;
    private static final double smaller = -0.00000000001;
    private static final double delta = 0.00000001;

    //BIT, BYTE, KILOBYTE, MEGABYTE, GIGABYTE, TERABYTE, PETABYTE
    //Bit, Byte, KiloByte, MegaByte, GigaByte, TeraByte, PetaByte

    @Test
    public void TestBitToBit() {
        Assert.assertEquals(10.0, DataUnit.BIT.convert(suitable, DataUnit.BIT), delta);
        Assert.assertEquals(10000000000.0, DataUnit.BIT.convert(bigger, DataUnit.BIT), delta);
        Assert.assertEquals(-0.00000000001, DataUnit.BIT.convert(smaller, DataUnit.BIT), delta);
    }
    @Test
    public void TestBitToByte() {
        Assert.assertEquals(1.25, DataUnit.BIT.convert(suitable, DataUnit.BYTE), delta);
        Assert.assertEquals(1.25 * Math.pow(10, 9), DataUnit.BIT.convert(bigger, DataUnit.BYTE), delta);
        Assert.assertEquals(-1.25 * Math.pow(10, -12), DataUnit.BIT.convert(smaller, DataUnit.BYTE), delta);
    }

    @Test
    public void TestBitToKiloByte() {
        Assert.assertEquals(0.001220703125, DataUnit.BIT.convert(suitable, DataUnit.KILOBYTE), delta);
        Assert.assertEquals(1.220703 * Math.pow(10, 6), DataUnit.BIT.convert(bigger, DataUnit.KILOBYTE), delta);
        Assert.assertEquals(-1.220703125 * Math.pow(10, -15), DataUnit.BIT.convert(smaller, DataUnit.KILOBYTE), delta);
    }
    @Test
    public void TestBitToMegaByte() {
        Assert.assertEquals(1.1920928955078 * Math.pow(10, -6), DataUnit.BIT.convert(suitable, DataUnit.MEGABYTE), delta);
        Assert.assertEquals(1192.0928955078, DataUnit.BIT.convert(bigger, DataUnit.MEGABYTE), delta);
        Assert.assertEquals(-1.1920928955078 * Math.pow(10, -18), DataUnit.BIT.convert(smaller, DataUnit.MEGABYTE), delta);
    }
    @Test
    public void TestBitToGigaByte() {
        Assert.assertEquals(1.1641532182693 * Math.pow(10, -9), DataUnit.BIT.convert(suitable, DataUnit.GIGABYTE), delta);
        Assert.assertEquals(1.1641532182693, DataUnit.BIT.convert(bigger, DataUnit.GIGABYTE), delta);
        Assert.assertEquals(-1.1641532182693 * Math.pow(10, -21), DataUnit.BIT.convert(smaller, DataUnit.GIGABYTE), delta);
    }
    @Test
    public void TestBitToTeraByte() {
        Assert.assertEquals(1.1368683772162 * Math.pow(10, -12), DataUnit.BIT.convert(suitable, DataUnit.TERABYTE), delta);
        Assert.assertEquals(0.0011368683772162, DataUnit.BIT.convert(bigger, DataUnit.TERABYTE), delta);
        Assert.assertEquals(-1.1368683772162 * Math.pow(10, -24), DataUnit.BIT.convert(smaller, DataUnit.TERABYTE), delta);
    }
    @Test
    public void TestBitToPetaByte() {
        Assert.assertEquals(1.1102230246252 * Math.pow(10, -15), DataUnit.BIT.convert(suitable, DataUnit.PETABYTE), delta);
        Assert.assertEquals(1.1102230246252 * Math.pow(10, -6), DataUnit.BIT.convert(bigger, DataUnit.PETABYTE), delta);
        Assert.assertEquals(-1.1102230246252 * Math.pow(10, -27), DataUnit.BIT.convert(smaller, DataUnit.PETABYTE), delta);
    }
    @Test
    public void TestBYTEToBit() {
        Assert.assertEquals(80.0, DataUnit.BYTE.convert(suitable, DataUnit.BIT), delta);
        Assert.assertEquals(80000000000.0, DataUnit.BYTE.convert(bigger, DataUnit.BIT), delta);
        Assert.assertEquals(-0.00000000008, DataUnit.BYTE.convert(smaller, DataUnit.BIT), delta);
    }
    @Test
    public void TestBYTEToByte() {
        Assert.assertEquals(10.0, DataUnit.BYTE.convert(suitable, DataUnit.BYTE), delta);
        Assert.assertEquals(10000000000.0, DataUnit.BYTE.convert(bigger, DataUnit.BYTE), delta);
        Assert.assertEquals(-0.00000000001, DataUnit.BYTE.convert(smaller, DataUnit.BYTE), delta);
    }
    @Test
    public void TestBYTEToKiloByte() {
        Assert.assertEquals(0.009765625, DataUnit.BYTE.convert(suitable, DataUnit.KILOBYTE), delta);
        Assert.assertEquals(9.765625 * Math.pow(10, 6), DataUnit.BYTE.convert(bigger, DataUnit.KILOBYTE), delta);
        Assert.assertEquals(-9.765625 * Math.pow(10, -15), DataUnit.BYTE.convert(smaller, DataUnit.KILOBYTE), delta);
    }
    @Test
    public void TestBYTEToMegaByte() {
        Assert.assertEquals(9.5367431640625 * Math.pow(10, -6), DataUnit.BYTE.convert(suitable, DataUnit.MEGABYTE), delta);
        Assert.assertEquals(9536.7431640625, DataUnit.BYTE.convert(bigger, DataUnit.MEGABYTE), delta);
        Assert.assertEquals(-9.5367431640625 * Math.pow(10, -18), DataUnit.BYTE.convert(smaller, DataUnit.MEGABYTE), delta);
    }
    @Test
    public void TestBYTEToGigaByte() {
        Assert.assertEquals(9.3132257461548 * Math.pow(10, -9), DataUnit.BYTE.convert(suitable, DataUnit.GIGABYTE), delta);
        Assert.assertEquals(9.3132257461548, DataUnit.BYTE.convert(bigger, DataUnit.GIGABYTE), delta);
        Assert.assertEquals(-9.3132257461548 * Math.pow(10, -21), DataUnit.BYTE.convert(smaller, DataUnit.GIGABYTE), delta);
    }
    @Test
    public void TestBYTEToTeraByte() {
        Assert.assertEquals(9.0949470177293 * Math.pow(10, -12), DataUnit.BYTE.convert(suitable, DataUnit.TERABYTE), delta);
        Assert.assertEquals(0.0090949470177293, DataUnit.BYTE.convert(bigger, DataUnit.TERABYTE), delta);
        Assert.assertEquals(-9.0949470177293 * Math.pow(10, -24), DataUnit.BYTE.convert(smaller, DataUnit.TERABYTE), delta);
    }
    @Test
    public void TestBYTEToPetaByte() {
        Assert.assertEquals(8.8817841970013 * Math.pow(10, -15), DataUnit.BYTE.convert(suitable, DataUnit.PETABYTE), delta);
        Assert.assertEquals(8.8817841970013 * Math.pow(10, -6), DataUnit.BYTE.convert(bigger, DataUnit.PETABYTE), delta);
        Assert.assertEquals(-8.8817841970013 * Math.pow(10, -27), DataUnit.BYTE.convert(smaller, DataUnit.PETABYTE), delta);
    }
    @Test
    public void TestKILOBYTEToBit() {
        Assert.assertEquals(8.192 * Math.pow(10, 4), DataUnit.KILOBYTE.convert(suitable, DataUnit.BIT), delta);
        Assert.assertEquals(8.192 * Math.pow(10, 13), DataUnit.KILOBYTE.convert(bigger, DataUnit.BIT), delta);
        Assert.assertEquals(-8.192 * Math.pow(10, -8), DataUnit.KILOBYTE.convert(smaller, DataUnit.BIT), delta);
    }
    @Test
    public void TestKILOBYTEToByte() {
        Assert.assertEquals(1.024 * Math.pow(10, 4), DataUnit.KILOBYTE.convert(suitable, DataUnit.BYTE), delta);
        Assert.assertEquals(1.024 * Math.pow(10, 13), DataUnit.KILOBYTE.convert(bigger, DataUnit.BYTE), delta);
        Assert.assertEquals(-1.024 * Math.pow(10, -8), DataUnit.KILOBYTE.convert(smaller, DataUnit.BYTE), delta);
    }

    @Test
    public void TestKILOBYTEToKiloByte() {
        Assert.assertEquals(10.0, DataUnit.KILOBYTE.convert(suitable, DataUnit.KILOBYTE), delta);
        Assert.assertEquals(10000000000.0, DataUnit.KILOBYTE.convert(bigger, DataUnit.KILOBYTE), delta);
        Assert.assertEquals(-0.00000000001, DataUnit.KILOBYTE.convert(smaller, DataUnit.KILOBYTE), delta);
    }
    @Test
    public void TestKILOBYTEToMegaByte() {
        Assert.assertEquals(0.009765625, DataUnit.KILOBYTE.convert(suitable, DataUnit.MEGABYTE), delta);
        Assert.assertEquals(9.765625 * Math.pow(10, 6), DataUnit.KILOBYTE.convert(bigger, DataUnit.MEGABYTE), delta);
        Assert.assertEquals(-9.765625 * Math.pow(10, -15), DataUnit.KILOBYTE.convert(smaller, DataUnit.MEGABYTE), delta);
    }
    @Test
    public void TestKILOBYTEToGigaByte() {
        Assert.assertEquals(9.5367431640625 * Math.pow(10, -6), DataUnit.KILOBYTE.convert(suitable, DataUnit.GIGABYTE), delta);
        Assert.assertEquals(9536.7431640625, DataUnit.KILOBYTE.convert(bigger, DataUnit.GIGABYTE), delta);
        Assert.assertEquals(-9.5367431640625 * Math.pow(10, -18), DataUnit.KILOBYTE.convert(smaller, DataUnit.GIGABYTE), delta);
    }
    @Test
    public void TestKILOBYTEToTeraByte() {
        Assert.assertEquals(9.3132257461548 * Math.pow(10, -9), DataUnit.KILOBYTE.convert(suitable, DataUnit.TERABYTE), delta);
        Assert.assertEquals(9.3132257461548, DataUnit.KILOBYTE.convert(bigger, DataUnit.TERABYTE), delta);
        Assert.assertEquals(-9.3132257461548 * Math.pow(10, -21), DataUnit.KILOBYTE.convert(smaller, DataUnit.TERABYTE), delta);
    }
    @Test
    public void TestKILOBYTEToPetaByte() {
        Assert.assertEquals(9.0949470177293 * Math.pow(10, -12), DataUnit.KILOBYTE.convert(suitable, DataUnit.PETABYTE), delta);
        Assert.assertEquals(0.0090949470177293, DataUnit.KILOBYTE.convert(bigger, DataUnit.PETABYTE), delta);
        Assert.assertEquals(-9.0949470177293 * Math.pow(10, -24), DataUnit.KILOBYTE.convert(smaller, DataUnit.PETABYTE), delta);
    }
    @Test
    public void TestMEGABYTEToBit() {
        Assert.assertEquals(8.388608 * Math.pow(10, 7), DataUnit.MEGABYTE.convert(suitable, DataUnit.BIT), delta);
        Assert.assertEquals(8.388608 * Math.pow(10, 16), DataUnit.MEGABYTE.convert(bigger, DataUnit.BIT), delta);
        Assert.assertEquals(-8.388608 * Math.pow(10, -5), DataUnit.MEGABYTE.convert(smaller, DataUnit.BIT), delta);
    }
    @Test
    public void TestMEGABYTEToByte() {
        Assert.assertEquals(1.048576 * Math.pow(10, 7), DataUnit.MEGABYTE.convert(suitable, DataUnit.BYTE), delta);
        Assert.assertEquals(1.048576 * Math.pow(10, 16), DataUnit.MEGABYTE.convert(bigger, DataUnit.BYTE), delta);
        Assert.assertEquals(-1.048576 * Math.pow(10, -5), DataUnit.MEGABYTE.convert(smaller, DataUnit.BYTE), delta);
    }
    @Test
    public void TestMEGABYTEToKiloByte() {
        Assert.assertEquals(1.024 * Math.pow(10, 4), DataUnit.MEGABYTE.convert(suitable, DataUnit.KILOBYTE), delta);
        Assert.assertEquals(1.024 * Math.pow(10, 13), DataUnit.MEGABYTE.convert(bigger, DataUnit.KILOBYTE), delta);
        Assert.assertEquals(-1.024 * Math.pow(10, -8), DataUnit.MEGABYTE.convert(smaller, DataUnit.KILOBYTE), delta);
    }
    @Test
    public void TestMEGABYTEToMegaByte() {
        Assert.assertEquals(10.0, DataUnit.MEGABYTE.convert(suitable, DataUnit.MEGABYTE), delta);
        Assert.assertEquals(10000000000.0, DataUnit.MEGABYTE.convert(bigger, DataUnit.MEGABYTE), delta);
        Assert.assertEquals(-0.00000000001, DataUnit.MEGABYTE.convert(smaller, DataUnit.MEGABYTE), delta);
    }
    @Test
    public void TestMEGABYTEToGigaByte() {
        Assert.assertEquals(0.009765625, DataUnit.MEGABYTE.convert(suitable, DataUnit.GIGABYTE), delta);
        Assert.assertEquals(9.765625 * Math.pow(10, 6), DataUnit.MEGABYTE.convert(bigger, DataUnit.GIGABYTE), delta);
        Assert.assertEquals(-9.765625 * Math.pow(10, -15), DataUnit.MEGABYTE.convert(smaller, DataUnit.GIGABYTE), delta);
    }
    @Test
    public void TestMEGABYTEToTeraByte() {
        Assert.assertEquals(9.5367431640625 * Math.pow(10, -6), DataUnit.MEGABYTE.convert(suitable, DataUnit.TERABYTE), delta);
        Assert.assertEquals(9536.7431640625, DataUnit.MEGABYTE.convert(bigger, DataUnit.TERABYTE), delta);
        Assert.assertEquals(-9.5367431640625 * Math.pow(10, -18), DataUnit.MEGABYTE.convert(smaller, DataUnit.TERABYTE), delta);
    }
    @Test
    public void TestMEGABYTEToPetaByte() {
        Assert.assertEquals(9.3132257461548 * Math.pow(10, -9), DataUnit.MEGABYTE.convert(suitable, DataUnit.PETABYTE), delta);
        Assert.assertEquals(9.3132257461548, DataUnit.MEGABYTE.convert(bigger, DataUnit.PETABYTE), delta);
        Assert.assertEquals(-9.3132257461548 * Math.pow(10, -21), DataUnit.MEGABYTE.convert(smaller, DataUnit.PETABYTE), delta);
    }
    @Test
    public void TestGIGABYTEToBit() {
        Assert.assertEquals(8.589934592 * Math.pow(10, 10), DataUnit.GIGABYTE.convert(suitable, DataUnit.BIT), delta);
        Assert.assertEquals(85899345920000000000.0, DataUnit.GIGABYTE.convert(bigger, DataUnit.BIT), delta);
        Assert.assertEquals(-0.08589934592, DataUnit.GIGABYTE.convert(smaller, DataUnit.BIT), delta);
    }
    @Test
    public void TestGIGABYTEToByte() {
        Assert.assertEquals(1.073741824 * Math.pow(10, 10), DataUnit.GIGABYTE.convert(suitable, DataUnit.BYTE), delta);
        Assert.assertEquals(1.073741824 * Math.pow(10, 19), DataUnit.GIGABYTE.convert(bigger, DataUnit.BYTE), delta);
        Assert.assertEquals(-0.01073741824, DataUnit.GIGABYTE.convert(smaller, DataUnit.BYTE), delta);
    }

    @Test
    public void TestGIGABYTEToKiloByte() {
        Assert.assertEquals(1.048576 * Math.pow(10, 7), DataUnit.GIGABYTE.convert(suitable, DataUnit.KILOBYTE), delta);
        Assert.assertEquals(1.048576 * Math.pow(10, 16), DataUnit.GIGABYTE.convert(bigger, DataUnit.KILOBYTE), delta);
        Assert.assertEquals(-1.048576 * Math.pow(10, -5), DataUnit.GIGABYTE.convert(smaller, DataUnit.KILOBYTE), delta);
    }
    @Test
    public void TestGIGABYTEToMegaByte() {
        Assert.assertEquals(1.024 * Math.pow(10, 4), DataUnit.GIGABYTE.convert(suitable, DataUnit.MEGABYTE), delta);
        Assert.assertEquals(1.024 * Math.pow(10, 13), DataUnit.GIGABYTE.convert(bigger, DataUnit.MEGABYTE), delta);
        Assert.assertEquals(-1.024 * Math.pow(10, -8), DataUnit.GIGABYTE.convert(smaller, DataUnit.MEGABYTE), delta);
    }
    @Test
    public void TestGIGABYTEToGigaByte() {
        Assert.assertEquals(10.0, DataUnit.GIGABYTE.convert(suitable, DataUnit.GIGABYTE), delta);
        Assert.assertEquals(10000000000.0, DataUnit.GIGABYTE.convert(bigger, DataUnit.GIGABYTE), delta);
        Assert.assertEquals(-0.00000000001, DataUnit.GIGABYTE.convert(smaller, DataUnit.GIGABYTE), delta);
    }
    @Test
    public void TestGIGABYTEToTeraByte() {
        Assert.assertEquals(0.009765625, DataUnit.GIGABYTE.convert(suitable, DataUnit.TERABYTE), delta);
        Assert.assertEquals(9.765625 * Math.pow(10, 6), DataUnit.GIGABYTE.convert(bigger, DataUnit.TERABYTE), delta);
        Assert.assertEquals(-9.765625 * Math.pow(10, -15), DataUnit.GIGABYTE.convert(smaller, DataUnit.TERABYTE), delta);
    }
    @Test
    public void TestGIGABYTEToPetaByte() {
        Assert.assertEquals(9.5367431640625 * Math.pow(10, -6), DataUnit.GIGABYTE.convert(suitable, DataUnit.PETABYTE), delta);
        Assert.assertEquals(9536.7431640625, DataUnit.GIGABYTE.convert(bigger, DataUnit.PETABYTE), delta);
        Assert.assertEquals(-9.5367431640625 * Math.pow(10, -18), DataUnit.GIGABYTE.convert(smaller, DataUnit.PETABYTE), delta);
    }
    @Test
    public void TestTERABYTEToBit() {
        Assert.assertEquals(8.796093022208 * Math.pow(10, 13), DataUnit.TERABYTE.convert(suitable, DataUnit.BIT), delta);
        Assert.assertEquals(8.796093022208 * Math.pow(10, 22), DataUnit.TERABYTE.convert(bigger, DataUnit.BIT), delta);
        Assert.assertEquals(-87.96093022208, DataUnit.TERABYTE.convert(smaller, DataUnit.BIT), delta);
    }
    @Test
    public void TestTERABYTEToByte() {
        Assert.assertEquals(1.099511627776 * Math.pow(10, 13), DataUnit.TERABYTE.convert(suitable, DataUnit.BYTE), delta);
        Assert.assertEquals(1.099511627776 * Math.pow(10, 22), DataUnit.TERABYTE.convert(bigger, DataUnit.BYTE), delta);
        Assert.assertEquals(-10.99511627776, DataUnit.TERABYTE.convert(smaller, DataUnit.BYTE), delta);
    }
    @Test
    public void TestTERABYTEToKiloByte() {
        Assert.assertEquals(1.073741824 * Math.pow(10, 10), DataUnit.TERABYTE.convert(suitable, DataUnit.KILOBYTE), delta);
        Assert.assertEquals(1.073741824 * Math.pow(10, 19), DataUnit.TERABYTE.convert(bigger, DataUnit.KILOBYTE), delta);
        Assert.assertEquals(-0.01073741824, DataUnit.TERABYTE.convert(smaller, DataUnit.KILOBYTE), delta);
    }
    @Test
    public void TestTERABYTEToMegaByte() {
        Assert.assertEquals(1.048576 * Math.pow(10, 7), DataUnit.TERABYTE.convert(suitable, DataUnit.MEGABYTE), delta);
        Assert.assertEquals(1.048576 * Math.pow(10, 16), DataUnit.TERABYTE.convert(bigger, DataUnit.MEGABYTE), delta);
        Assert.assertEquals(-1.048576 * Math.pow(10, -5), DataUnit.TERABYTE.convert(smaller, DataUnit.MEGABYTE), delta);
    }
    @Test
    public void TestTERABYTEToGigaByte() {
        Assert.assertEquals(1.024 * Math.pow(10, 4), DataUnit.TERABYTE.convert(suitable, DataUnit.GIGABYTE), delta);
        Assert.assertEquals(1.024 * Math.pow(10, 13), DataUnit.TERABYTE.convert(bigger, DataUnit.GIGABYTE), delta);
        Assert.assertEquals(-1.024 * Math.pow(10, -8), DataUnit.TERABYTE.convert(smaller, DataUnit.GIGABYTE), delta);
    }
    @Test
    public void TestTERABYTEToTeraByte() {
        Assert.assertEquals(10.0, DataUnit.TERABYTE.convert(suitable, DataUnit.TERABYTE), delta);
        Assert.assertEquals(10000000000.0, DataUnit.TERABYTE.convert(bigger, DataUnit.TERABYTE), delta);
        Assert.assertEquals(-0.00000000001, DataUnit.TERABYTE.convert(smaller, DataUnit.TERABYTE), delta);
    }
    @Test
    public void TestTERABYTEToPetaByte() {
        Assert.assertEquals(0.009765625, DataUnit.TERABYTE.convert(suitable, DataUnit.PETABYTE), delta);
        Assert.assertEquals(9.765625 * Math.pow(10, 6), DataUnit.TERABYTE.convert(bigger, DataUnit.PETABYTE), delta);
        Assert.assertEquals(-9.765625 * Math.pow(10, -15), DataUnit.TERABYTE.convert(smaller, DataUnit.PETABYTE), delta);
    }
    @Test
    public void TestPETABYTEToBit() {
        Assert.assertEquals(9.007199254741 * Math.pow(10, 16), DataUnit.PETABYTE.convert(suitable, DataUnit.BIT), delta);
        Assert.assertEquals(9.007199254741 * Math.pow(10, 25), DataUnit.PETABYTE.convert(bigger, DataUnit.BIT), delta);
        Assert.assertEquals(-9.007199254741 * Math.pow(10, 4), DataUnit.PETABYTE.convert(smaller, DataUnit.BIT), delta);
    }
    @Test
    public void TestPETABYTEToByte() {
        Assert.assertEquals(11258999068426240.0, DataUnit.PETABYTE.convert(suitable, DataUnit.BYTE), delta);
        Assert.assertEquals(11258999068426240000000000.0, DataUnit.PETABYTE.convert(bigger, DataUnit.BYTE), delta);
        Assert.assertEquals(-1.1258999068426 * Math.pow(10, 4), DataUnit.PETABYTE.convert(smaller, DataUnit.BYTE), delta);
    }

    @Test
    public void TestPETABYTEToKiloByte() {
        Assert.assertEquals(1.099511627776 * Math.pow(10, 13), DataUnit.PETABYTE.convert(suitable, DataUnit.KILOBYTE), delta);
        Assert.assertEquals(1.099511627776 * Math.pow(10, 22), DataUnit.PETABYTE.convert(bigger, DataUnit.KILOBYTE), delta);
        Assert.assertEquals(-10.99511627776, DataUnit.PETABYTE.convert(smaller, DataUnit.KILOBYTE), delta);
    }
    @Test
    public void TestPETABYTEToMegaByte() {
        Assert.assertEquals(1.073741824 * Math.pow(10, 10), DataUnit.PETABYTE.convert(suitable, DataUnit.MEGABYTE), delta);
        Assert.assertEquals(1.073741824 * Math.pow(10, 19), DataUnit.PETABYTE.convert(bigger, DataUnit.MEGABYTE), delta);
        Assert.assertEquals(-0.01073741824, DataUnit.PETABYTE.convert(smaller, DataUnit.MEGABYTE), delta);
    }
    @Test
    public void TestPETABYTEToGigaByte() {
        Assert.assertEquals(1.048576 * Math.pow(10, 7), DataUnit.PETABYTE.convert(suitable, DataUnit.GIGABYTE), delta);
        Assert.assertEquals(1.048576 * Math.pow(10, 16), DataUnit.PETABYTE.convert(bigger, DataUnit.GIGABYTE), delta);
        Assert.assertEquals(-1.048576 * Math.pow(10, -5), DataUnit.PETABYTE.convert(smaller, DataUnit.GIGABYTE), delta);
    }
    @Test
    public void TestPETABYTEToTeraByte() {
        Assert.assertEquals(1.024 * Math.pow(10, 4), DataUnit.PETABYTE.convert(suitable, DataUnit.TERABYTE), delta);
        Assert.assertEquals(1.024 * Math.pow(10, 13), DataUnit.PETABYTE.convert(bigger, DataUnit.TERABYTE), delta);
        Assert.assertEquals(-1.024 * Math.pow(10, -8), DataUnit.PETABYTE.convert(smaller, DataUnit.TERABYTE), delta);
    }
    @Test
    public void TestPETABYTEToPetaByte() {
        Assert.assertEquals(10.0, DataUnit.PETABYTE.convert(suitable, DataUnit.PETABYTE), delta);
        Assert.assertEquals(10000000000.0, DataUnit.PETABYTE.convert(bigger, DataUnit.PETABYTE), delta);
        Assert.assertEquals(-0.00000000001, DataUnit.PETABYTE.convert(smaller, DataUnit.PETABYTE), delta);
    }
}
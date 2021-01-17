package unitconversioncalculator;

import org.junit.Assert;
import org.junit.Test;

public class VolumeUnitTest {
    private static final double suitable = 10.0;
    private static final double bigger = 10000000000.0;
    private static final double smaller = -0.00000000001;
    private static final double delta = 0.00000001;

    //BRITISHGALLON, USGALLON, LITER, MILLILITER, CUBICCENTIMETER, CUBICMETER, CUBICINCH, CUBICFEET
    //BritishGallon, UsGallon, Liter, Milliliter, CubicCentimeter, CubicMeter, CubicInch, CubicFeet

    @Test
    public void testBRITISHGALLONToBritishGallon() {
        Assert.assertEquals(10.0, VolumeUnit.BRITISHGALLON.convert(suitable, VolumeUnit.BRITISHGALLON), delta);
        Assert.assertEquals(10000000000.0, VolumeUnit.BRITISHGALLON.convert(bigger, VolumeUnit.BRITISHGALLON), delta);
        Assert.assertEquals(-0.00000000001, VolumeUnit.BRITISHGALLON.convert(smaller, VolumeUnit.BRITISHGALLON), delta);
    }
    @Test
    public void testBRITISHGALLONToUsGallon() {
        Assert.assertEquals(10.320567434887, VolumeUnit.BRITISHGALLON.convert(suitable, VolumeUnit.USGALLON), delta);
        Assert.assertEquals(1.0320567434887 * Math.pow(10, 10), VolumeUnit.BRITISHGALLON.convert(bigger, VolumeUnit.USGALLON), delta);
        Assert.assertEquals(-1.0320567434887 * Math.pow(10, -11), VolumeUnit.BRITISHGALLON.convert(smaller, VolumeUnit.USGALLON), delta);
    }
    @Test
    public void testBRITISHGALLONToLiter() {
        Assert.assertEquals(45.4609, VolumeUnit.BRITISHGALLON.convert(suitable, VolumeUnit.LITER), delta);
        Assert.assertEquals(4.54609 * Math.pow(10, 10), VolumeUnit.BRITISHGALLON.convert(bigger, VolumeUnit.LITER), delta);
        Assert.assertEquals(-4.54609 * Math.pow(10, -11), VolumeUnit.BRITISHGALLON.convert(smaller, VolumeUnit.LITER), delta);
    }
    @Test
    public void testBRITISHGALLONToMilliLiter() {
        Assert.assertEquals(4.54609 * Math.pow(10, 4), VolumeUnit.BRITISHGALLON.convert(suitable, VolumeUnit.MILLILITER), delta);
        Assert.assertEquals(45460900000000.0, VolumeUnit.BRITISHGALLON.convert(bigger, VolumeUnit.MILLILITER), delta);
        Assert.assertEquals(-4.54609 * Math.pow(10, -8), VolumeUnit.BRITISHGALLON.convert(smaller, VolumeUnit.MILLILITER), delta);
    }
    @Test
    public void testBRITISHGALLONToCubicCentimeter() {
        Assert.assertEquals(4.54609 * Math.pow(10, 4), VolumeUnit.BRITISHGALLON.convert(suitable, VolumeUnit.CUBICCENTIMETER), delta);
        Assert.assertEquals(45460900000000.0, VolumeUnit.BRITISHGALLON.convert(bigger, VolumeUnit.CUBICCENTIMETER), delta);
        Assert.assertEquals(-4.54609 * Math.pow(10, -8), VolumeUnit.BRITISHGALLON.convert(smaller, VolumeUnit.CUBICCENTIMETER), delta);
    }
    @Test
    public void testBRITISHGALLONToCubicMeter() {
        Assert.assertEquals(0.0454609, VolumeUnit.BRITISHGALLON.convert(suitable, VolumeUnit.CUBICMETER), delta);
        Assert.assertEquals(4.54609 * Math.pow(10, 7), VolumeUnit.BRITISHGALLON.convert(bigger, VolumeUnit.CUBICMETER), delta);
        Assert.assertEquals(-4.54609 * Math.pow(10, -14), VolumeUnit.BRITISHGALLON.convert(smaller, VolumeUnit.CUBICMETER), delta);
    }
    @Test
    public void testBRITISHGALLONToCubicInch() {
        Assert.assertEquals(2774.1943279162, VolumeUnit.BRITISHGALLON.convert(suitable, VolumeUnit.CUBICINCH), delta);
        Assert.assertEquals(2.7741943279162 * Math.pow(10, 12), VolumeUnit.BRITISHGALLON.convert(bigger, VolumeUnit.CUBICINCH), delta);
        Assert.assertEquals(-2.7741943279162 * Math.pow(10, -9), VolumeUnit.BRITISHGALLON.convert(smaller, VolumeUnit.CUBICINCH), delta);
    }
    @Test
    public void testBRITISHGALLONToCubicFeet() {
        Assert.assertEquals(1.6054365323589, VolumeUnit.BRITISHGALLON.convert(suitable, VolumeUnit.CUBICFEET), delta);
        Assert.assertEquals(1605436532.3589, VolumeUnit.BRITISHGALLON.convert(bigger, VolumeUnit.CUBICFEET), delta);
        Assert.assertEquals(-1.6054365323589 * Math.pow(10, -12), VolumeUnit.BRITISHGALLON.convert(smaller, VolumeUnit.CUBICFEET), delta);
    }
    @Test
    public void testUSGALLONToBritishGallon() {
        Assert.assertEquals(9.6893897192093, VolumeUnit.USGALLON.convert(suitable, VolumeUnit.BRITISHGALLON), delta);
        Assert.assertEquals(9.6893897192093 * Math.pow(10, 9), VolumeUnit.USGALLON.convert(bigger, VolumeUnit.BRITISHGALLON), delta);
        Assert.assertEquals(-9.6893897192093 * Math.pow(10, -12), VolumeUnit.USGALLON.convert(smaller, VolumeUnit.BRITISHGALLON), delta);
    }
    @Test
    public void testUSGALLONToUsGallon() {
        Assert.assertEquals(10.0, VolumeUnit.USGALLON.convert(suitable, VolumeUnit.USGALLON), delta);
        Assert.assertEquals(10000000000.0, VolumeUnit.USGALLON.convert(bigger, VolumeUnit.USGALLON), delta);
        Assert.assertEquals(-0.00000000001, VolumeUnit.USGALLON.convert(smaller, VolumeUnit.USGALLON), delta);
    }
    @Test
    public void testUSGALLONToLiter() {
        Assert.assertEquals(44.0488377086, VolumeUnit.USGALLON.convert(suitable, VolumeUnit.LITER), delta);
        Assert.assertEquals(4.40488377086 * Math.pow(10, 10), VolumeUnit.USGALLON.convert(bigger, VolumeUnit.LITER), delta);
        Assert.assertEquals(-4.40488377086 * Math.pow(10, -11), VolumeUnit.USGALLON.convert(smaller, VolumeUnit.LITER), delta);
    }
    @Test
    public void testUSGALLONToMilliLiter() {
        Assert.assertEquals(44048.8377086, VolumeUnit.USGALLON.convert(suitable, VolumeUnit.MILLILITER), delta);
        Assert.assertEquals(4.40488377086 * Math.pow(10, 13), VolumeUnit.USGALLON.convert(bigger, VolumeUnit.MILLILITER), delta);
        Assert.assertEquals(-4.40488377086 * Math.pow(10, -8), VolumeUnit.USGALLON.convert(smaller, VolumeUnit.MILLILITER), delta);
    }
    @Test
    public void testUSGALLONToCubicCentimeter() {
        Assert.assertEquals(44048.8377086, VolumeUnit.USGALLON.convert(suitable, VolumeUnit.CUBICCENTIMETER), delta);
        Assert.assertEquals(4.40488377086 * Math.pow(10, 13), VolumeUnit.USGALLON.convert(bigger, VolumeUnit.CUBICCENTIMETER), delta);
        Assert.assertEquals(-4.40488377086 * Math.pow(10, -8), VolumeUnit.USGALLON.convert(smaller, VolumeUnit.CUBICCENTIMETER), delta);
    }
    @Test
    public void testUSGALLONToCubicMeter() {
        Assert.assertEquals(0.0440488377086, VolumeUnit.USGALLON.convert(suitable, VolumeUnit.CUBICMETER), delta);
        Assert.assertEquals(4.40488377086 * Math.pow(10, 7), VolumeUnit.USGALLON.convert(bigger, VolumeUnit.CUBICMETER), delta);
        Assert.assertEquals(-4.40488377086 * Math.pow(10, -14), VolumeUnit.USGALLON.convert(smaller, VolumeUnit.CUBICMETER), delta);
    }
    @Test
    public void testUSGALLONToCubicInch() {
        Assert.assertEquals(2688.025, VolumeUnit.USGALLON.convert(suitable, VolumeUnit.CUBICINCH), delta);
        Assert.assertEquals(2.688025 * Math.pow(10, 12), VolumeUnit.USGALLON.convert(bigger, VolumeUnit.CUBICINCH), delta);
        Assert.assertEquals(-2.688025 * Math.pow(10, -9), VolumeUnit.USGALLON.convert(smaller, VolumeUnit.CUBICINCH), delta);
    }
    @Test
    public void testUSGALLONToCubicFeet() {
        Assert.assertEquals(1.5555700231481, VolumeUnit.USGALLON.convert(suitable, VolumeUnit.CUBICFEET), delta);
        Assert.assertEquals(1555570023.1, VolumeUnit.USGALLON.convert(bigger, VolumeUnit.CUBICFEET), delta);
        Assert.assertEquals(-1.5555700231481 * Math.pow(10, -12), VolumeUnit.USGALLON.convert(smaller, VolumeUnit.CUBICFEET), delta);
    }
    @Test
    public void testLITERToBritishGallon() {
        Assert.assertEquals(2.2702074606721, VolumeUnit.LITER.convert(suitable, VolumeUnit.BRITISHGALLON), delta);
        Assert.assertEquals(2.2702074606721 * Math.pow(10, 9), VolumeUnit.LITER.convert(bigger, VolumeUnit.BRITISHGALLON), delta);
        Assert.assertEquals(-2.2702074606721 * Math.pow(10, -12), VolumeUnit.LITER.convert(smaller, VolumeUnit.BRITISHGALLON), delta);
    }
    @Test
    public void testLITERToUsGallon() {
        Assert.assertEquals(2.1996924829909, VolumeUnit.LITER.convert(suitable, VolumeUnit.USGALLON), delta);
        Assert.assertEquals(2.1996924829909 * Math.pow(10, 9), VolumeUnit.LITER.convert(bigger, VolumeUnit.USGALLON), delta);
        Assert.assertEquals(-2.1996924829909 * Math.pow(10, -12), VolumeUnit.LITER.convert(smaller, VolumeUnit.USGALLON), delta);
    }
    @Test
    public void testLITERToLiter() {
        Assert.assertEquals(10.0, VolumeUnit.LITER.convert(suitable, VolumeUnit.LITER), delta);
        Assert.assertEquals(10000000000.0, VolumeUnit.LITER.convert(bigger, VolumeUnit.LITER), delta);
        Assert.assertEquals(-0.00000000001, VolumeUnit.LITER.convert(smaller, VolumeUnit.LITER), delta);
    }
    @Test
    public void testLITERToMilliLiter() {
        Assert.assertEquals(10000, VolumeUnit.LITER.convert(suitable, VolumeUnit.MILLILITER), delta);
        Assert.assertEquals(Math.pow(10, 13), VolumeUnit.LITER.convert(bigger, VolumeUnit.MILLILITER), delta);
        Assert.assertEquals(-Math.pow(10, -8), VolumeUnit.LITER.convert(smaller, VolumeUnit.MILLILITER), delta);
    }
    @Test
    public void testLITERToCubicCentimeter() {
        Assert.assertEquals(10000, VolumeUnit.LITER.convert(suitable, VolumeUnit.CUBICCENTIMETER), delta);
        Assert.assertEquals(Math.pow(10, 13), VolumeUnit.LITER.convert(bigger, VolumeUnit.CUBICCENTIMETER), delta);
        Assert.assertEquals(-Math.pow(10, -8), VolumeUnit.LITER.convert(smaller, VolumeUnit.CUBICCENTIMETER), delta);
    }
    @Test
    public void testLITERToCubicMeter() {
        Assert.assertEquals(0.01, VolumeUnit.LITER.convert(suitable, VolumeUnit.CUBICMETER), delta);
        Assert.assertEquals(Math.pow(10, 7), VolumeUnit.LITER.convert(bigger, VolumeUnit.CUBICMETER), delta);
        Assert.assertEquals(-Math.pow(10, -14), VolumeUnit.LITER.convert(smaller, VolumeUnit.CUBICMETER), delta);
    }
    @Test
    public void testLITERToCubicInch() {
        Assert.assertEquals(610.23744094732, VolumeUnit.LITER.convert(suitable, VolumeUnit.CUBICINCH), delta);
        Assert.assertEquals(6.1023744094732 * Math.pow(10, 11), VolumeUnit.LITER.convert(bigger, VolumeUnit.CUBICINCH), delta);
        Assert.assertEquals(-6.1023744094732 * Math.pow(10, -10), VolumeUnit.LITER.convert(smaller, VolumeUnit.CUBICINCH), delta);
    }
    @Test
    public void testLITERToCubicFeet() {
        Assert.assertEquals(0.35314666721489, VolumeUnit.LITER.convert(suitable, VolumeUnit.CUBICFEET), delta);
        Assert.assertEquals(3.5314666721489 * Math.pow(10, 8), VolumeUnit.LITER.convert(bigger, VolumeUnit.CUBICFEET), delta);
        Assert.assertEquals(-3.5314666721489 * Math.pow(10, -13), VolumeUnit.LITER.convert(smaller, VolumeUnit.CUBICFEET), delta);
    }
    @Test
    public void testMILLILITERToBritishGallon() {
        Assert.assertEquals(0.0022702074606721, VolumeUnit.MILLILITER.convert(suitable, VolumeUnit.BRITISHGALLON), delta);
        Assert.assertEquals(2.2702074606721 * Math.pow(10, 6), VolumeUnit.MILLILITER.convert(bigger, VolumeUnit.BRITISHGALLON), delta);
        Assert.assertEquals(-2.2702074606721 * Math.pow(10, -15), VolumeUnit.MILLILITER.convert(smaller, VolumeUnit.BRITISHGALLON), delta);
    }
    @Test
    public void testMILLILITERToUsGallon() {
        Assert.assertEquals(0.0021996924829909, VolumeUnit.MILLILITER.convert(suitable, VolumeUnit.USGALLON), delta);
        Assert.assertEquals(2.1996924829909 * Math.pow(10, 6), VolumeUnit.MILLILITER.convert(bigger, VolumeUnit.USGALLON), delta);
        Assert.assertEquals(-2.1996924829909 * Math.pow(10, -15), VolumeUnit.MILLILITER.convert(smaller, VolumeUnit.USGALLON), delta);
    }
    @Test
    public void testMILLILITERToLiter() {
        Assert.assertEquals(0.01, VolumeUnit.MILLILITER.convert(suitable, VolumeUnit.LITER), delta);
        Assert.assertEquals(Math.pow(10, 7), VolumeUnit.MILLILITER.convert(bigger, VolumeUnit.LITER), delta);
        Assert.assertEquals(-Math.pow(10, -14), VolumeUnit.MILLILITER.convert(smaller, VolumeUnit.LITER), delta);
    }
    @Test
    public void testMILLILITERToMilliLiter() {
        Assert.assertEquals(10.0, VolumeUnit.MILLILITER.convert(suitable, VolumeUnit.MILLILITER), delta);
        Assert.assertEquals(10000000000.0, VolumeUnit.MILLILITER.convert(bigger, VolumeUnit.MILLILITER), delta);
        Assert.assertEquals(-0.00000000001, VolumeUnit.MILLILITER.convert(smaller, VolumeUnit.MILLILITER), delta);
    }
    @Test
    public void testMILLILITERToCubicCentimeter() {
        Assert.assertEquals(10.0, VolumeUnit.MILLILITER.convert(suitable, VolumeUnit.CUBICCENTIMETER), delta);
        Assert.assertEquals(10000000000.0, VolumeUnit.MILLILITER.convert(bigger, VolumeUnit.CUBICCENTIMETER), delta);
        Assert.assertEquals(-0.00000000001, VolumeUnit.MILLILITER.convert(smaller, VolumeUnit.CUBICCENTIMETER), delta);
    }
    @Test
    public void testMILLILITERToCubicMeter() {
        Assert.assertEquals(Math.pow(10, -5), VolumeUnit.MILLILITER.convert(suitable, VolumeUnit.CUBICMETER), delta);
        Assert.assertEquals(Math.pow(10, 4), VolumeUnit.MILLILITER.convert(bigger, VolumeUnit.CUBICMETER), delta);
        Assert.assertEquals(-Math.pow(10, -11), VolumeUnit.MILLILITER.convert(smaller, VolumeUnit.CUBICMETER), delta);
    }
    @Test
    public void testMILLILITERToCubicInch() {
        Assert.assertEquals(0.61023744094732, VolumeUnit.MILLILITER.convert(suitable, VolumeUnit.CUBICINCH), delta);
        Assert.assertEquals(6.1023744094732 * Math.pow(10, 8), VolumeUnit.MILLILITER.convert(bigger, VolumeUnit.CUBICINCH), delta);
        Assert.assertEquals(-6.1023744094732 * Math.pow(10, -13), VolumeUnit.MILLILITER.convert(smaller, VolumeUnit.CUBICINCH), delta);
    }
    @Test
    public void testMILLILITERToCubicFeet() {
        Assert.assertEquals(0.00035314666721489, VolumeUnit.MILLILITER.convert(suitable, VolumeUnit.CUBICFEET), delta);
        Assert.assertEquals(3.5314666721489 * Math.pow(10, 5), VolumeUnit.MILLILITER.convert(bigger, VolumeUnit.CUBICFEET), delta);
        Assert.assertEquals(-3.5314666721489 * Math.pow(10, -16), VolumeUnit.MILLILITER.convert(smaller, VolumeUnit.CUBICFEET), delta);
    }
    @Test
    public void testCUBICCENTIMETERToBritishGallon() {
        Assert.assertEquals(0.0022702074606721, VolumeUnit.CUBICCENTIMETER.convert(suitable, VolumeUnit.BRITISHGALLON), delta);
        Assert.assertEquals(2.2702074606721 * Math.pow(10, 6), VolumeUnit.CUBICCENTIMETER.convert(bigger, VolumeUnit.BRITISHGALLON), delta);
        Assert.assertEquals(-2.2702074606721 * Math.pow(10, -15), VolumeUnit.CUBICCENTIMETER.convert(smaller, VolumeUnit.BRITISHGALLON), delta);
    }
    @Test
    public void testCUBICCENTIMETERToUsGallon() {
        Assert.assertEquals(0.0021996924829909, VolumeUnit.CUBICCENTIMETER.convert(suitable, VolumeUnit.USGALLON), delta);
        Assert.assertEquals(2.1996924829909 * Math.pow(10, 6), VolumeUnit.CUBICCENTIMETER.convert(bigger, VolumeUnit.USGALLON), delta);
        Assert.assertEquals(-2.1996924829909 * Math.pow(10, -15), VolumeUnit.CUBICCENTIMETER.convert(smaller, VolumeUnit.USGALLON), delta);
    }
    @Test
    public void testCUBICCENTIMETERToLiter() {
        Assert.assertEquals(0.01, VolumeUnit.CUBICCENTIMETER.convert(suitable, VolumeUnit.LITER), delta);
        Assert.assertEquals(Math.pow(10, 7), VolumeUnit.CUBICCENTIMETER.convert(bigger, VolumeUnit.LITER), delta);
        Assert.assertEquals(-Math.pow(10, -14), VolumeUnit.CUBICCENTIMETER.convert(smaller, VolumeUnit.LITER), delta);
    }
    @Test
    public void testCUBICCENTIMETERToMilliLiter() {
        Assert.assertEquals(10.0, VolumeUnit.CUBICCENTIMETER.convert(suitable, VolumeUnit.MILLILITER), delta);
        Assert.assertEquals(10000000000.0, VolumeUnit.CUBICCENTIMETER.convert(bigger, VolumeUnit.MILLILITER), delta);
        Assert.assertEquals(-0.00000000001, VolumeUnit.CUBICCENTIMETER.convert(smaller, VolumeUnit.MILLILITER), delta);
    }
    @Test
    public void testCUBICCENTIMETERToCubicCentimeter() {
        Assert.assertEquals(10.0, VolumeUnit.CUBICCENTIMETER.convert(suitable, VolumeUnit.CUBICCENTIMETER), delta);
        Assert.assertEquals(10000000000.0, VolumeUnit.CUBICCENTIMETER.convert(bigger, VolumeUnit.CUBICCENTIMETER), delta);
        Assert.assertEquals(-0.00000000001, VolumeUnit.CUBICCENTIMETER.convert(smaller, VolumeUnit.CUBICCENTIMETER), delta);
    }
    @Test
    public void testCUBICCENTIMETERToCubicMeter() {
        Assert.assertEquals(Math.pow(10, -5), VolumeUnit.CUBICCENTIMETER.convert(suitable, VolumeUnit.CUBICMETER), delta);
        Assert.assertEquals(Math.pow(10, 4), VolumeUnit.CUBICCENTIMETER.convert(bigger, VolumeUnit.CUBICMETER), delta);
        Assert.assertEquals(-Math.pow(10, -11), VolumeUnit.CUBICCENTIMETER.convert(smaller, VolumeUnit.CUBICMETER), delta);
    }
    @Test
    public void testCUBICCENTIMETERToCubicInch() {
        Assert.assertEquals(0.61023744094732, VolumeUnit.CUBICCENTIMETER.convert(suitable, VolumeUnit.CUBICINCH), delta);
        Assert.assertEquals(6.1023744094732 * Math.pow(10, 8), VolumeUnit.CUBICCENTIMETER.convert(bigger, VolumeUnit.CUBICINCH), delta);
        Assert.assertEquals(-6.1023744094732 * Math.pow(10, -13), VolumeUnit.CUBICCENTIMETER.convert(smaller, VolumeUnit.CUBICINCH), delta);
    }
    @Test
    public void testCUBICCENTIMETERToCubicFeet() {
        Assert.assertEquals(0.00035314666721489, VolumeUnit.CUBICCENTIMETER.convert(suitable, VolumeUnit.CUBICFEET), delta);
        Assert.assertEquals(3.5314666721489 * Math.pow(10, 5), VolumeUnit.CUBICCENTIMETER.convert(bigger, VolumeUnit.CUBICFEET), delta);
        Assert.assertEquals(-3.5314666721489 * Math.pow(10, -16), VolumeUnit.CUBICCENTIMETER.convert(smaller, VolumeUnit.CUBICFEET), delta);
    }
    @Test
    public void testCUBICMETERToBritishGallon() {
        Assert.assertEquals(2270.2074606721, VolumeUnit.CUBICMETER.convert(suitable, VolumeUnit.BRITISHGALLON), delta);
        Assert.assertEquals(2.2702074606721 * Math.pow(10, 12), VolumeUnit.CUBICMETER.convert(bigger, VolumeUnit.BRITISHGALLON), delta);
        Assert.assertEquals(-2.2702074606721 * Math.pow(10, -9), VolumeUnit.CUBICMETER.convert(smaller, VolumeUnit.BRITISHGALLON), delta);
    }
    @Test
    public void testCUBICMETERToUsGallon() {
        Assert.assertEquals(2199.6924829909, VolumeUnit.CUBICMETER.convert(suitable, VolumeUnit.USGALLON), delta);
        Assert.assertEquals(2.1996924829909 * Math.pow(10, 12), VolumeUnit.CUBICMETER.convert(bigger, VolumeUnit.USGALLON), delta);
        Assert.assertEquals(-2.1996924829909 * Math.pow(10, -9), VolumeUnit.CUBICMETER.convert(smaller, VolumeUnit.USGALLON), delta);
    }
    @Test
    public void testCUBICMETERToLiter() {
        Assert.assertEquals(Math.pow(10, 4), VolumeUnit.CUBICMETER.convert(suitable, VolumeUnit.LITER), delta);
        Assert.assertEquals(Math.pow(10, 13), VolumeUnit.CUBICMETER.convert(bigger, VolumeUnit.LITER), delta);
        Assert.assertEquals(-Math.pow(10, -8), VolumeUnit.CUBICMETER.convert(smaller, VolumeUnit.LITER), delta);
    }
    @Test
    public void testCUBICMETERToMilliLiter() {
        Assert.assertEquals(Math.pow(10, 7), VolumeUnit.CUBICMETER.convert(suitable, VolumeUnit.MILLILITER), delta);
        Assert.assertEquals(Math.pow(10, 16), VolumeUnit.CUBICMETER.convert(bigger, VolumeUnit.MILLILITER), delta);
        Assert.assertEquals(-Math.pow(10, -5), VolumeUnit.CUBICMETER.convert(smaller, VolumeUnit.MILLILITER), delta);
    }
    @Test
    public void testCUBICMETERToCubicCentimeter() {
        Assert.assertEquals(Math.pow(10, 7), VolumeUnit.CUBICMETER.convert(suitable, VolumeUnit.CUBICCENTIMETER), delta);
        Assert.assertEquals(Math.pow(10, 16), VolumeUnit.CUBICMETER.convert(bigger, VolumeUnit.CUBICCENTIMETER), delta);
        Assert.assertEquals(-Math.pow(10, -5), VolumeUnit.CUBICMETER.convert(smaller, VolumeUnit.CUBICCENTIMETER), delta);
    }
    @Test
    public void testCUBICMETERToCubicMeter() {
        Assert.assertEquals(10.0, VolumeUnit.CUBICMETER.convert(suitable, VolumeUnit.CUBICMETER), delta);
        Assert.assertEquals(10000000000.0, VolumeUnit.CUBICMETER.convert(bigger, VolumeUnit.CUBICMETER), delta);
        Assert.assertEquals(-0.00000000001, VolumeUnit.CUBICMETER.convert(smaller, VolumeUnit.CUBICMETER), delta);
    }
    @Test
    public void testCUBICMETERToCubicInch() {
        Assert.assertEquals(6.1023744094732 * Math.pow(10, 5), VolumeUnit.CUBICMETER.convert(suitable, VolumeUnit.CUBICINCH), delta);
        Assert.assertEquals(6.1023744094732 * Math.pow(10, 14), VolumeUnit.CUBICMETER.convert(bigger, VolumeUnit.CUBICINCH), delta);
        Assert.assertEquals(-6.1023744094732 * Math.pow(10, -7), VolumeUnit.CUBICMETER.convert(smaller, VolumeUnit.CUBICINCH), delta);
    }
    @Test
    public void testCUBICMETERToCubicFeet() {
        Assert.assertEquals(353.1466672148995, VolumeUnit.CUBICMETER.convert(suitable, VolumeUnit.CUBICFEET), delta);
        Assert.assertEquals(3.5314666721488995 * Math.pow(10, 11), VolumeUnit.CUBICMETER.convert(bigger, VolumeUnit.CUBICFEET), delta);
        Assert.assertEquals(-3.531466672148995 * Math.pow(10, -10), VolumeUnit.CUBICMETER.convert(smaller, VolumeUnit.CUBICFEET), delta);
    }
    @Test
    public void testCUBICINCHToBritishGallon() {
        Assert.assertEquals(0.037202034951312, VolumeUnit.CUBICINCH.convert(suitable, VolumeUnit.BRITISHGALLON), delta);
        Assert.assertEquals(3.7202034951312 * Math.pow(10, 7), VolumeUnit.CUBICINCH.convert(bigger, VolumeUnit.BRITISHGALLON), delta);
        Assert.assertEquals(-3.7202034951312 * Math.pow(10, -14), VolumeUnit.CUBICINCH.convert(smaller, VolumeUnit.BRITISHGALLON), delta);
    }
    @Test
    public void testCUBICINCHToUsGallon() {
        Assert.assertEquals(0.03604650149909, VolumeUnit.CUBICINCH.convert(suitable, VolumeUnit.USGALLON), delta);
        Assert.assertEquals(3.604650149909 * Math.pow(10, 7), VolumeUnit.CUBICINCH.convert(bigger, VolumeUnit.USGALLON), delta);
        Assert.assertEquals(-3.604650149909 * Math.pow(10, -14), VolumeUnit.CUBICINCH.convert(smaller, VolumeUnit.USGALLON), delta);
    }
    @Test
    public void testCUBICINCHToLiter() {
        Assert.assertEquals(0.16387064, VolumeUnit.CUBICINCH.convert(suitable, VolumeUnit.LITER), delta);
        Assert.assertEquals(1.6387064 * Math.pow(10, 8), VolumeUnit.CUBICINCH.convert(bigger, VolumeUnit.LITER), delta);
        Assert.assertEquals(-1.6387064 * Math.pow(10, -13), VolumeUnit.CUBICINCH.convert(smaller, VolumeUnit.LITER), delta);
    }
    @Test
    public void testCUBICINCHToMilliLiter() {
        Assert.assertEquals(163.87064, VolumeUnit.CUBICINCH.convert(suitable, VolumeUnit.MILLILITER), delta);
        Assert.assertEquals(1.6387064 * Math.pow(10, 11), VolumeUnit.CUBICINCH.convert(bigger, VolumeUnit.MILLILITER), delta);
        Assert.assertEquals(-1.6387064 * Math.pow(10, -10), VolumeUnit.CUBICINCH.convert(smaller, VolumeUnit.MILLILITER), delta);
    }
    @Test
    public void testCUBICINCHToCubicCentimeter() {
        Assert.assertEquals(163.87064, VolumeUnit.CUBICINCH.convert(suitable, VolumeUnit.CUBICCENTIMETER), delta);
        Assert.assertEquals(1.6387064 * Math.pow(10, 11), VolumeUnit.CUBICINCH.convert(bigger, VolumeUnit.CUBICCENTIMETER), delta);
        Assert.assertEquals(-1.6387064 * Math.pow(10, -10), VolumeUnit.CUBICINCH.convert(smaller, VolumeUnit.CUBICCENTIMETER), delta);
    }
    @Test
    public void testCUBICINCHToCubicMeter() {
        Assert.assertEquals(0.00016387064, VolumeUnit.CUBICINCH.convert(suitable, VolumeUnit.CUBICMETER), delta);
        Assert.assertEquals(1.6387064 * Math.pow(10, 5), VolumeUnit.CUBICINCH.convert(bigger, VolumeUnit.CUBICMETER), delta);
        Assert.assertEquals(-1.6387064 * Math.pow(10, -16), VolumeUnit.CUBICINCH.convert(smaller, VolumeUnit.CUBICMETER), delta);
    }
    @Test
    public void testCUBICINCHToCubicInch() {
        Assert.assertEquals(10, VolumeUnit.CUBICINCH.convert(suitable, VolumeUnit.CUBICINCH), delta);
        Assert.assertEquals(10000000000.0, VolumeUnit.CUBICINCH.convert(bigger, VolumeUnit.CUBICINCH), delta);
        Assert.assertEquals(-0.00000000001, VolumeUnit.CUBICINCH.convert(smaller, VolumeUnit.CUBICINCH), delta);
    }
    @Test
    public void testCUBICINCHToCubicFeet() {
        Assert.assertEquals(0.005787037037037, VolumeUnit.CUBICINCH.convert(suitable, VolumeUnit.CUBICFEET), delta);
        Assert.assertEquals(5.787037037037 * Math.pow(10, 6), VolumeUnit.CUBICINCH.convert(bigger, VolumeUnit.CUBICFEET), delta);
        Assert.assertEquals(-5.787037037037 * Math.pow(10, -15), VolumeUnit.CUBICINCH.convert(smaller, VolumeUnit.CUBICFEET), delta);
    }
    @Test
    public void testCUBICFEETToBritishGallon() {
        Assert.assertEquals(64.285116395867, VolumeUnit.CUBICFEET.convert(suitable, VolumeUnit.BRITISHGALLON), delta);
        Assert.assertEquals(6.4285116395867 * Math.pow(10, 10), VolumeUnit.CUBICFEET.convert(bigger, VolumeUnit.BRITISHGALLON), delta);
        Assert.assertEquals(-6.4285116395867 * Math.pow(10, -11), VolumeUnit.CUBICFEET.convert(smaller, VolumeUnit.BRITISHGALLON), delta);
    }
    @Test
    public void testCUBICFEETToUsGallon() {
        Assert.assertEquals(62.288354590428, VolumeUnit.CUBICFEET.convert(suitable, VolumeUnit.USGALLON), delta);
        Assert.assertEquals(6.2288354590428 * Math.pow(10, 10), VolumeUnit.CUBICFEET.convert(bigger, VolumeUnit.USGALLON), delta);
        Assert.assertEquals(-6.2288354590428 * Math.pow(10, -11), VolumeUnit.CUBICFEET.convert(smaller, VolumeUnit.USGALLON), delta);
    }
    @Test
    public void testCUBICFEETToLiter() {
        Assert.assertEquals(283.16846592, VolumeUnit.CUBICFEET.convert(suitable, VolumeUnit.LITER), delta);
        Assert.assertEquals(2.8316846592 * Math.pow(10, 11), VolumeUnit.CUBICFEET.convert(bigger, VolumeUnit.LITER), delta);
        Assert.assertEquals(-2.8316846592 * Math.pow(10, -10), VolumeUnit.CUBICFEET.convert(smaller, VolumeUnit.LITER), delta);
    }
    @Test
    public void testCUBICFEETToMilliLiter() {
        Assert.assertEquals(2.8316846592 * Math.pow(10, 5), VolumeUnit.CUBICFEET.convert(suitable, VolumeUnit.MILLILITER), delta);
        Assert.assertEquals(2.8316846592 * Math.pow(10, 14), VolumeUnit.CUBICFEET.convert(bigger, VolumeUnit.MILLILITER), delta);
        Assert.assertEquals(-2.8316846592 * Math.pow(10, -7), VolumeUnit.CUBICFEET.convert(smaller, VolumeUnit.MILLILITER), delta);
    }
    @Test
    public void testCUBICFEETToCubicCentimeter() {
        Assert.assertEquals(2.8316846592 * Math.pow(10, 5), VolumeUnit.CUBICFEET.convert(suitable, VolumeUnit.CUBICCENTIMETER), delta);
        Assert.assertEquals(2.8316846592 * Math.pow(10, 14), VolumeUnit.CUBICFEET.convert(bigger, VolumeUnit.CUBICCENTIMETER), delta);
        Assert.assertEquals(-2.8316846592 * Math.pow(10, -7), VolumeUnit.CUBICFEET.convert(smaller, VolumeUnit.CUBICCENTIMETER), delta);
    }
    @Test
    public void testCUBICFEETToCubicMeter() {
        Assert.assertEquals(0.28316846592, VolumeUnit.CUBICFEET.convert(suitable, VolumeUnit.CUBICMETER), delta);
        Assert.assertEquals(2.8316846592 * Math.pow(10, 8), VolumeUnit.CUBICFEET.convert(bigger, VolumeUnit.CUBICMETER), delta);
        Assert.assertEquals(-2.8316846592 * Math.pow(10, -13), VolumeUnit.CUBICFEET.convert(smaller, VolumeUnit.CUBICMETER), delta);
    }
    @Test
    public void testCUBICFEETToCubicInch() {
        Assert.assertEquals(1.728 * Math.pow(10, 4), VolumeUnit.CUBICFEET.convert(suitable, VolumeUnit.CUBICINCH), delta);
        Assert.assertEquals(1.728 * Math.pow(10, 13), VolumeUnit.CUBICFEET.convert(bigger, VolumeUnit.CUBICINCH), delta);
        Assert.assertEquals(-1.728 * Math.pow(10, -8), VolumeUnit.CUBICFEET.convert(smaller, VolumeUnit.CUBICINCH), delta);
    }
    @Test
    public void testCUBICFEETToCubicFeet() {
        Assert.assertEquals(10, VolumeUnit.CUBICFEET.convert(suitable, VolumeUnit.CUBICFEET), delta);
        Assert.assertEquals(10000000000.0, VolumeUnit.CUBICFEET.convert(bigger, VolumeUnit.CUBICFEET), delta);
        Assert.assertEquals(-0.00000000001, VolumeUnit.CUBICFEET.convert(smaller, VolumeUnit.CUBICFEET), delta);
    }
}
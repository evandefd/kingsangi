package unitconversioncalculator;

import org.junit.Assert;
import org.junit.Test;

public class PressureUnitTest {
    private static final double suitable = 10.0;
    private static final double bigger = 10000000000.0;
    private static final double smaller = -0.00000000001;
    private static final double delta = 0.00000001;

    //ATOMASPHERICPRESSURE, BAR, POUNDFORCEPERSQUAREINCH, TORR, PASCAL
    //AtomasphericPressure, Bar, PoundForcePerSquareInch, Torr, Pascal

    @Test
    public void ATOMASPHERICPRESSUREToAtomasphericPressure() {
        Assert.assertEquals(10.0, PressureUnit.ATOMASPHERICPRESSURE.convert(suitable, PressureUnit.ATOMASPHERICPRESSURE), delta);
        Assert.assertEquals(10000000000.0, PressureUnit.ATOMASPHERICPRESSURE.convert(bigger, PressureUnit.ATOMASPHERICPRESSURE), delta);
        Assert.assertEquals(-0.00000000001, PressureUnit.ATOMASPHERICPRESSURE.convert(smaller, PressureUnit.ATOMASPHERICPRESSURE), delta);
    }
    @Test
    public void ATOMASPHERICPRESSUREToBar() {
        Assert.assertEquals(10.1325, PressureUnit.ATOMASPHERICPRESSURE.convert(suitable, PressureUnit.BAR), delta);
        Assert.assertEquals(1.01325 * Math.pow(10, 10), PressureUnit.ATOMASPHERICPRESSURE.convert(bigger, PressureUnit.BAR), delta);
        Assert.assertEquals(-1.01325 * Math.pow(10, -11), PressureUnit.ATOMASPHERICPRESSURE.convert(smaller, PressureUnit.BAR), delta);
    }
    @Test
    public void ATOMASPHERICPRESSUREToPoundForcePerSquareInch() {
        Assert.assertEquals(146.95949400392, PressureUnit.ATOMASPHERICPRESSURE.convert(suitable, PressureUnit.BAR), delta);
        Assert.assertEquals(1.469595 * Math.pow(10, 11), PressureUnit.ATOMASPHERICPRESSURE.convert(bigger, PressureUnit.BAR), delta);
        Assert.assertEquals(-1.4695949400392 * Math.pow(10, -10), PressureUnit.ATOMASPHERICPRESSURE.convert(smaller , PressureUnit.BAR), delta);
    }
    @Test
    public void ATOMASPHERICPRESSUREToTorr() {
        Assert.assertEquals(7599.9981998524, PressureUnit.ATOMASPHERICPRESSURE.convert(suitable, PressureUnit.TORR), delta);
        Assert.assertEquals(7.599998 * Math.pow(10, 12), PressureUnit.ATOMASPHERICPRESSURE.convert(bigger, PressureUnit.TORR), delta);
        Assert.assertEquals(-7.5999981998524 * Math.pow(10, -9), PressureUnit.ATOMASPHERICPRESSURE.convert(smaller , PressureUnit.TORR), delta);
    }
    @Test
    public void ATOMASPHERICPRESSUREToPascal() {
        Assert.assertEquals(1.01325 * Math.pow(10, 6), PressureUnit.ATOMASPHERICPRESSURE.convert(suitable, PressureUnit.PASCAL), delta);
        Assert.assertEquals(1.01325 * Math.pow(10, 15), PressureUnit.ATOMASPHERICPRESSURE.convert(bigger, PressureUnit.PASCAL), delta);
        Assert.assertEquals(-1.01325 * Math.pow(10, -6), PressureUnit.ATOMASPHERICPRESSURE.convert(smaller , PressureUnit.PASCAL), delta);
    }
    @Test
    public void BARToAtomasphericPressure() {
        Assert.assertEquals(9.8692326671601, PressureUnit.BAR.convert(suitable, PressureUnit.ATOMASPHERICPRESSURE), delta);
        Assert.assertEquals(9.869233 * Math.pow(10, 9), PressureUnit.BAR.convert(bigger, PressureUnit.ATOMASPHERICPRESSURE), delta);
        Assert.assertEquals(-9.8692326671601 * Math.pow(10, -12), PressureUnit.BAR.convert(smaller, PressureUnit.ATOMASPHERICPRESSURE), delta);
    }
    @Test
    public void BARToBar() {
        Assert.assertEquals(10.0, PressureUnit.BAR.convert(suitable, PressureUnit.BAR), delta);
        Assert.assertEquals(10000000000.0, PressureUnit.BAR.convert(bigger, PressureUnit.BAR), delta);
        Assert.assertEquals(-0.00000000001, PressureUnit.BAR.convert(smaller, PressureUnit.BAR), delta);
    }
    @Test
    public void BARToPoundForcePerSquareInch() {
        Assert.assertEquals(145.03774389728, PressureUnit.BAR.convert(suitable, PressureUnit.BAR), delta);
        Assert.assertEquals(1.450377 * Math.pow(10, 11), PressureUnit.BAR.convert(bigger, PressureUnit.BAR), delta);
        Assert.assertEquals(-1.4503774389728 * Math.pow(10, -10), PressureUnit.BAR.convert(smaller , PressureUnit.BAR), delta);
    }
    @Test
    public void BARToTorr() {
        Assert.assertEquals(7500.6150504341, PressureUnit.BAR.convert(suitable, PressureUnit.TORR), delta);
        Assert.assertEquals(7.500615 * Math.pow(10, 12), PressureUnit.BAR.convert(bigger, PressureUnit.TORR), delta);
        Assert.assertEquals(-7.5006150504341 * Math.pow(10, -9), PressureUnit.BAR.convert(smaller , PressureUnit.TORR), delta);
    }
    @Test
    public void BARToPascal() {
        Assert.assertEquals(Math.pow(10, 6), PressureUnit.BAR.convert(suitable, PressureUnit.PASCAL), delta);
        Assert.assertEquals(Math.pow(10, 15), PressureUnit.BAR.convert(bigger, PressureUnit.PASCAL), delta);
        Assert.assertEquals(-Math.pow(10, -6), PressureUnit.BAR.convert(smaller , PressureUnit.PASCAL), delta);
    }
    @Test
    public void POUNDFORCEPERSQUAREINCHToAtomasphericPressure() {
        Assert.assertEquals(0.68045961016531, PressureUnit.ATOMASPHERICPRESSURE.convert(suitable, PressureUnit.ATOMASPHERICPRESSURE), delta);
        Assert.assertEquals(6.804596 * Math.pow(10, 8), PressureUnit.ATOMASPHERICPRESSURE.convert(bigger, PressureUnit.ATOMASPHERICPRESSURE), delta);
        Assert.assertEquals(-6.8045961016531 * Math.pow(10, 13), PressureUnit.ATOMASPHERICPRESSURE.convert(smaller, PressureUnit.ATOMASPHERICPRESSURE), delta);
    }
    @Test
    public void POUNDFORCEPERSQUAREINCHToBar() {
        Assert.assertEquals(0.6894757, PressureUnit.ATOMASPHERICPRESSURE.convert(suitable, PressureUnit.BAR), delta);
        Assert.assertEquals(6.894757 * Math.pow(10, 8), PressureUnit.ATOMASPHERICPRESSURE.convert(bigger, PressureUnit.BAR), delta);
        Assert.assertEquals(-6.894757 * Math.pow(10, -13), PressureUnit.ATOMASPHERICPRESSURE.convert(smaller, PressureUnit.BAR), delta);
    }
    @Test
    public void POUNDFORCEPERSQUAREINCHToPoundForcePerSquareInch() {
        Assert.assertEquals(10.0, PressureUnit.ATOMASPHERICPRESSURE.convert(suitable, PressureUnit.BAR), delta);
        Assert.assertEquals(10000000000.0, PressureUnit.ATOMASPHERICPRESSURE.convert(bigger, PressureUnit.BAR), delta);
        Assert.assertEquals(-0.00000000001, PressureUnit.ATOMASPHERICPRESSURE.convert(smaller , PressureUnit.BAR), delta);
    }
    @Test
    public void POUNDFORCEPERSQUAREINCHToTorr() {
        Assert.assertEquals(517.14918123286, PressureUnit.ATOMASPHERICPRESSURE.convert(suitable, PressureUnit.TORR), delta);
        Assert.assertEquals(5.171492 * Math.pow(10, 11), PressureUnit.ATOMASPHERICPRESSURE.convert(bigger, PressureUnit.TORR), delta);
        Assert.assertEquals(-5.1714918123286 * Math.pow(10, -10), PressureUnit.ATOMASPHERICPRESSURE.convert(smaller , PressureUnit.TORR), delta);
    }
    @Test
    public void POUNDFORCEPERSQUAREINCHToPascal() {
        Assert.assertEquals(6.894757 * Math.pow(10, 4), PressureUnit.ATOMASPHERICPRESSURE.convert(suitable, PressureUnit.PASCAL), delta);
        Assert.assertEquals(6.894757 * Math.pow(10, 13), PressureUnit.ATOMASPHERICPRESSURE.convert(bigger, PressureUnit.PASCAL), delta);
        Assert.assertEquals(-6.894757 * Math.pow(10, -8), PressureUnit.ATOMASPHERICPRESSURE.convert(smaller , PressureUnit.PASCAL), delta);
    }
    @Test
    public void TORRToAtomasphericPressure() {
        Assert.assertEquals(0.013157897853442, PressureUnit.TORR.convert(suitable, PressureUnit.ATOMASPHERICPRESSURE), delta);
        Assert.assertEquals(1.31579 * Math.pow(10, 7), PressureUnit.TORR.convert(bigger, PressureUnit.ATOMASPHERICPRESSURE), delta);
        Assert.assertEquals(-1.3157897853442 * Math.pow(10, -14), PressureUnit.TORR.convert(smaller, PressureUnit.ATOMASPHERICPRESSURE), delta);
    }
    @Test
    public void TORRToBar() {
        Assert.assertEquals(0.01333224, PressureUnit.TORR.convert(suitable, PressureUnit.BAR), delta);
        Assert.assertEquals(1.333224 * Math.pow(10, 7), PressureUnit.TORR.convert(bigger, PressureUnit.BAR), delta);
        Assert.assertEquals(-1.333224 * Math.pow(10, -14), PressureUnit.TORR.convert(smaller, PressureUnit.BAR), delta);
    }
    @Test
    public void TORRToPoundForcePerSquareInch() {
        Assert.assertEquals(0.19336780106971, PressureUnit.TORR.convert(suitable, PressureUnit.BAR), delta);
        Assert.assertEquals(1.933678 * Math.pow(10, 8), PressureUnit.TORR.convert(bigger, PressureUnit.BAR), delta);
        Assert.assertEquals(-1.9336780106971 * Math.pow(10, -13), PressureUnit.TORR.convert(smaller , PressureUnit.BAR), delta);
    }
    @Test
    public void TORRToTorr() {
        Assert.assertEquals(10.0, PressureUnit.TORR.convert(suitable, PressureUnit.TORR), delta);
        Assert.assertEquals(10000000000.0, PressureUnit.TORR.convert(bigger, PressureUnit.TORR), delta);
        Assert.assertEquals(-0.00000000001, PressureUnit.TORR.convert(smaller , PressureUnit.TORR), delta);
    }
    @Test
    public void TORRToPascal() {
        Assert.assertEquals(1333.224, PressureUnit.TORR.convert(suitable, PressureUnit.PASCAL), delta);
        Assert.assertEquals(1.333224 * Math.pow(10, 12), PressureUnit.TORR.convert(bigger, PressureUnit.PASCAL), delta);
        Assert.assertEquals(-1.333224 * Math.pow(10, -9), PressureUnit.TORR.convert(smaller , PressureUnit.PASCAL), delta);
    }
    @Test
    public void PASCALToAtomasphericPressure() {
        Assert.assertEquals(9.8692326671601 * Math.pow(10, -5), PressureUnit.PASCAL.convert(suitable, PressureUnit.ATOMASPHERICPRESSURE), delta);
        Assert.assertEquals(9.869233 * Math.pow(10, 4), PressureUnit.PASCAL.convert(bigger, PressureUnit.ATOMASPHERICPRESSURE), delta);
        Assert.assertEquals(-9.8692326671601 * Math.pow(10, -17), PressureUnit.PASCAL.convert(smaller, PressureUnit.ATOMASPHERICPRESSURE), delta);
    }
    @Test
    public void PASCALToBar() {
        Assert.assertEquals(0.0001, PressureUnit.PASCAL.convert(suitable, PressureUnit.BAR), delta);
        Assert.assertEquals(Math.pow(10, 5), PressureUnit.PASCAL.convert(bigger, PressureUnit.BAR), delta);
        Assert.assertEquals(-Math.pow(10, -16), PressureUnit.PASCAL.convert(smaller, PressureUnit.BAR), delta);
    }
    @Test
    public void PASCALToPoundForcePerSquareInch() {
        Assert.assertEquals(0.0014503774389728, PressureUnit.PASCAL.convert(suitable, PressureUnit.BAR), delta);
        Assert.assertEquals(1.450377 * Math.pow(10, 6), PressureUnit.PASCAL.convert(bigger, PressureUnit.BAR), delta);
        Assert.assertEquals(-1.4503774389728 * Math.pow(10, -15), PressureUnit.PASCAL.convert(smaller , PressureUnit.BAR), delta);
    }
    @Test
    public void PASCALToTorr() {
        Assert.assertEquals(0.075006150504341, PressureUnit.PASCAL.convert(suitable, PressureUnit.TORR), delta);
        Assert.assertEquals(7.500615 * Math.pow(10, 7), PressureUnit.PASCAL.convert(bigger, PressureUnit.TORR), delta);
        Assert.assertEquals(-7.5006150504341 * Math.pow(10, -14), PressureUnit.PASCAL.convert(smaller , PressureUnit.TORR), delta);
    }
    @Test
    public void PASCALToPascal() {
        Assert.assertEquals(10.0, PressureUnit.PASCAL.convert(suitable, PressureUnit.PASCAL), delta);
        Assert.assertEquals(10000000000.0, PressureUnit.PASCAL.convert(bigger, PressureUnit.PASCAL), delta);
        Assert.assertEquals(-0.00000000001, PressureUnit.PASCAL.convert(smaller , PressureUnit.PASCAL), delta);
    }
}
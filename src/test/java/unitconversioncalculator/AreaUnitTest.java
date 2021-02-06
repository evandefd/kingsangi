package unitconversioncalculator;

import org.junit.Assert;
import org.junit.Test;

public class AreaUnitTest {
    private static final double suitable = 10.0;
    private static final double bigger = 10000000000.0;
    private static final double smaller = -0.00000000001;
    private static final double delta = 0.00000001;

    //ACRE, ARE, HECTARE, SQUARECENTIMETER, SQUAREFEET, SQUAREINCH, SQUAREMETER, PYEONG
    //Acre, Are, Hectare, SquareCentimeter, SquareFeet, SquareInch, SquareMeter, Pyeong

    @Test
    public void testACREToAcre() {
        Assert.assertEquals(10.0, AreaUnit.ACRE.convert(suitable, AreaUnit.ACRE), delta);
        Assert.assertEquals(10000000000.0, AreaUnit.ACRE.convert(bigger, AreaUnit.ACRE), delta);
        Assert.assertEquals(-0.00000000001, AreaUnit.ACRE.convert(smaller, AreaUnit.ACRE), delta);
    }
    @Test
    public void testACREToAre() {
        Assert.assertEquals(404.68564224, AreaUnit.ACRE.convert(suitable, AreaUnit.ARE), delta);
        Assert.assertEquals(404685642240.0, AreaUnit.ACRE.convert(bigger, AreaUnit.ARE), delta);
        Assert.assertEquals(-4.0468564224 * Math.pow(10, -10), AreaUnit.ACRE.convert(smaller, AreaUnit.ARE), delta);
    }
    @Test
    public void testACREToHectare() {
        Assert.assertEquals(4.0468564224, AreaUnit.ACRE.convert(suitable, AreaUnit.HECTARE), delta);
        Assert.assertEquals(4.04685642 * Math.pow(10, 9), AreaUnit.ACRE.convert(bigger, AreaUnit.HECTARE), delta);
        Assert.assertEquals(-4.0468564224 * Math.pow(10, -12), AreaUnit.ACRE.convert(smaller, AreaUnit.HECTARE), delta);
    }
    @Test
    public void testACREToSquareCentimeter() {
        Assert.assertEquals(4.0468564224 * Math.pow(10, 8), AreaUnit.ACRE.convert(suitable, AreaUnit.SQUARECENTIMETER), delta);
        Assert.assertEquals(4.0468564224 * Math.pow(10, 17), AreaUnit.ACRE.convert(bigger, AreaUnit.SQUARECENTIMETER), delta);
        Assert.assertEquals(-0.00040468564224, AreaUnit.ACRE.convert(smaller, AreaUnit.SQUARECENTIMETER), delta);
    }
    @Test
    public void testACREToSquareFeet() {
        Assert.assertEquals(4.356 * Math.pow(10, 5), AreaUnit.ACRE.convert(suitable, AreaUnit.SQUAREFEET), delta);
        Assert.assertEquals(4.356 * Math.pow(10, 14), AreaUnit.ACRE.convert(bigger, AreaUnit.SQUAREFEET), delta);
        Assert.assertEquals(-4.356 * Math.pow(10, -7), AreaUnit.ACRE.convert(smaller, AreaUnit.SQUAREFEET), delta);
    }
    @Test
    public void testACREToSquareInch() {
        Assert.assertEquals(6.27264 * Math.pow(10, 7), AreaUnit.ACRE.convert(suitable, AreaUnit.SQUAREINCH), delta);
        Assert.assertEquals(6.27264 * Math.pow(10, 16), AreaUnit.ACRE.convert(bigger, AreaUnit.SQUAREINCH), delta);
        Assert.assertEquals(-6.27264 * Math.pow(10, -5), AreaUnit.ACRE.convert(smaller, AreaUnit.SQUAREINCH), delta);
    }
    @Test
    public void testACREToSquareMeter() {
        Assert.assertEquals(4.0468564224 * Math.pow(10, 4), AreaUnit.ACRE.convert(suitable, AreaUnit.SQUAREMETER), delta);
        Assert.assertEquals(4.0468564224 * Math.pow(10, 13), AreaUnit.ACRE.convert(bigger, AreaUnit.SQUAREMETER), delta);
        Assert.assertEquals(-4.0468564224 * Math.pow(10, -8), AreaUnit.ACRE.convert(smaller, AreaUnit.SQUAREMETER), delta);
    }
    @Test
    public void testACREToPyeong() {
        Assert.assertEquals(12241.741136825001, AreaUnit.ACRE.convert(suitable, AreaUnit.PYEONG), delta);
        Assert.assertEquals(1.2241741136825 * Math.pow(10, 13), AreaUnit.ACRE.convert(bigger, AreaUnit.PYEONG), delta);
        Assert.assertEquals(-1.22417406776376 * Math.pow(10, -8), AreaUnit.ACRE.convert(smaller, AreaUnit.PYEONG), delta);
    }
    @Test
    public void testAREToAcre() {
        Assert.assertEquals(0.24710538146717, AreaUnit.ARE.convert(suitable, AreaUnit.ACRE), delta);
        Assert.assertEquals(2.4710538 * Math.pow(10, 8), AreaUnit.ARE.convert(bigger, AreaUnit.ACRE), delta);
        Assert.assertEquals(-2.4710538146717 * Math.pow(10, -13), AreaUnit.ARE.convert(smaller, AreaUnit.ACRE), delta);
    }
    @Test
    public void testAREToAre() {
        Assert.assertEquals(10.0, AreaUnit.ARE.convert(suitable, AreaUnit.ARE), delta);
        Assert.assertEquals(10000000000.0, AreaUnit.ARE.convert(bigger, AreaUnit.ARE), delta);
        Assert.assertEquals(-0.00000000001, AreaUnit.ARE.convert(smaller, AreaUnit.ARE), delta);
    }
    @Test
    public void testAREToHectare() {
        Assert.assertEquals(0.1, AreaUnit.ARE.convert(suitable, AreaUnit.HECTARE), delta);
        Assert.assertEquals(Math.pow(10, 8), AreaUnit.ARE.convert(bigger, AreaUnit.HECTARE), delta);
        Assert.assertEquals(-Math.pow(10, -13), AreaUnit.ARE.convert(smaller, AreaUnit.HECTARE), delta);
    }
    @Test
    public void testAREToSquareCentimeter() {
        Assert.assertEquals(Math.pow(10, 7), AreaUnit.ARE.convert(suitable, AreaUnit.SQUARECENTIMETER), delta);
        Assert.assertEquals(Math.pow(10, 16), AreaUnit.ARE.convert(bigger, AreaUnit.SQUARECENTIMETER), delta);
        Assert.assertEquals(-Math.pow(10, -5), AreaUnit.ARE.convert(smaller, AreaUnit.SQUARECENTIMETER), delta);
    }
    @Test
    public void testAREToSquareFeet() {
        Assert.assertEquals(1.076391041671 * Math.pow(10, 4), AreaUnit.ARE.convert(suitable, AreaUnit.SQUAREFEET), delta);
        Assert.assertEquals(1.076391041671 * Math.pow(10, 13), AreaUnit.ARE.convert(bigger, AreaUnit.SQUAREFEET), delta);
        Assert.assertEquals(-1.076391041671 * Math.pow(10, -8), AreaUnit.ARE.convert(smaller, AreaUnit.SQUAREFEET), delta);
    }
    @Test
    public void testAREToSquareInch() {
        Assert.assertEquals(1.5500031000062 * Math.pow(10, 6), AreaUnit.ARE.convert(suitable, AreaUnit.SQUAREINCH), delta);
        Assert.assertEquals(1.5500031000062 * Math.pow(10, 15), AreaUnit.ARE.convert(bigger, AreaUnit.SQUAREINCH), delta);
        Assert.assertEquals(-1.5500031000062 * Math.pow(10, -6), AreaUnit.ARE.convert(smaller, AreaUnit.SQUAREINCH), delta);
    }
    @Test
    public void testAREToSquareMeter() {
        Assert.assertEquals(Math.pow(10, 3), AreaUnit.ARE.convert(suitable, AreaUnit.SQUAREMETER), delta);
        Assert.assertEquals(Math.pow(10, 12), AreaUnit.ARE.convert(bigger, AreaUnit.SQUAREMETER), delta);
        Assert.assertEquals(-Math.pow(10, -9), AreaUnit.ARE.convert(smaller, AreaUnit.SQUAREMETER), delta);
    }
    @Test
    public void testAREToPyeong() {
        Assert.assertEquals(302.500011344, AreaUnit.ARE.convert(suitable, AreaUnit.PYEONG), delta);
        Assert.assertEquals(3.02500011344 * Math.pow(10, 11), AreaUnit.ARE.convert(bigger, AreaUnit.PYEONG), delta);
        Assert.assertEquals(-3.02499999996975 * Math.pow(10, -10), AreaUnit.ARE.convert(smaller, AreaUnit.PYEONG), delta);
    }
    @Test
    public void testHECTAREToAcre() {
        Assert.assertEquals(24.710538146717, AreaUnit.HECTARE.convert(suitable, AreaUnit.ACRE), delta);
        Assert.assertEquals(2.4710538147 * Math.pow(10, 10), AreaUnit.HECTARE.convert(bigger, AreaUnit.ACRE), delta);
        Assert.assertEquals(-2.4710538146717 * Math.pow(10, -11), AreaUnit.HECTARE.convert(smaller, AreaUnit.ACRE), delta);
    }
    @Test
    public void testHECTAREToAre() {
        Assert.assertEquals(1000, AreaUnit.HECTARE.convert(suitable, AreaUnit.ARE), delta);
        Assert.assertEquals(Math.pow(10, 12), AreaUnit.HECTARE.convert(bigger, AreaUnit.ARE), delta);
        Assert.assertEquals(-Math.pow(10, -9), AreaUnit.HECTARE.convert(smaller, AreaUnit.ARE), delta);
    }
    @Test
    public void testHECTAREToHectare() {
        Assert.assertEquals(10.0, AreaUnit.HECTARE.convert(suitable, AreaUnit.HECTARE), delta);
        Assert.assertEquals(10000000000.0, AreaUnit.HECTARE.convert(bigger, AreaUnit.HECTARE), delta);
        Assert.assertEquals(-0.00000000001, AreaUnit.HECTARE.convert(smaller, AreaUnit.HECTARE), delta);
    }
    @Test
    public void testHECTAREToSquareCentimeter() {
        Assert.assertEquals(Math.pow(10, 9), AreaUnit.HECTARE.convert(suitable, AreaUnit.SQUARECENTIMETER), delta);
        Assert.assertEquals(Math.pow(10, 18), AreaUnit.HECTARE.convert(bigger, AreaUnit.SQUARECENTIMETER), delta);
        Assert.assertEquals(-Math.pow(10, -3), AreaUnit.HECTARE.convert(smaller, AreaUnit.SQUARECENTIMETER), delta);
    }
    @Test
    public void testHECTAREToSquareFeet() {
        Assert.assertEquals(1.076391041671 * Math.pow(10, 6), AreaUnit.HECTARE.convert(suitable, AreaUnit.SQUAREFEET), delta);
        Assert.assertEquals(1076391041671000.0, AreaUnit.HECTARE.convert(bigger, AreaUnit.SQUAREFEET), delta);
        Assert.assertEquals(-1.076391041671 * Math.pow(10, -6), AreaUnit.HECTARE.convert(smaller, AreaUnit.SQUAREFEET), delta);
    }
    @Test
    public void testHECTAREToSquareInch() {
        Assert.assertEquals(1.5500031000062 * Math.pow(10, 8), AreaUnit.HECTARE.convert(suitable, AreaUnit.SQUAREINCH), delta);
        Assert.assertEquals(1.5500031000062 * Math.pow(10, 17), AreaUnit.HECTARE.convert(bigger, AreaUnit.SQUAREINCH), delta);
        Assert.assertEquals(-1.5500031000062 * Math.pow(10, -4), AreaUnit.HECTARE.convert(smaller, AreaUnit.SQUAREINCH), delta);
    }
    @Test
    public void testHECTAREToSquareMeter() {
        Assert.assertEquals(Math.pow(10, 5), AreaUnit.HECTARE.convert(suitable, AreaUnit.SQUAREMETER), delta);
        Assert.assertEquals(Math.pow(10, 14), AreaUnit.HECTARE.convert(bigger, AreaUnit.SQUAREMETER), delta);
        Assert.assertEquals(-Math.pow(10, -7), AreaUnit.HECTARE.convert(smaller, AreaUnit.SQUAREMETER), delta);
    }
    @Test
    public void testHECTAREToPyeong() {
        Assert.assertEquals(30250.0011344, AreaUnit.HECTARE.convert(suitable, AreaUnit.PYEONG), delta);
        Assert.assertEquals(3.02500011344 * Math.pow(10, 13), AreaUnit.HECTARE.convert(bigger, AreaUnit.PYEONG), delta);
        Assert.assertEquals(-3.02499999996975 * Math.pow(10, -8), AreaUnit.HECTARE.convert(smaller, AreaUnit.PYEONG), delta);
    }
    @Test
    public void testSQUARECENTIMETERToAcre() {
        Assert.assertEquals(2.4710538146717 * Math.pow(10, -7), AreaUnit.SQUARECENTIMETER.convert(suitable, AreaUnit.ACRE), delta);
        Assert.assertEquals(247.10538146717, AreaUnit.SQUARECENTIMETER.convert(bigger, AreaUnit.ACRE), delta);
        Assert.assertEquals(-2.4710538146717 * Math.pow(10, -19), AreaUnit.SQUARECENTIMETER.convert(smaller, AreaUnit.ACRE), delta);
    }
    @Test
    public void testSQUARECENTIMETERToAre() {
        Assert.assertEquals(Math.pow(10, -5), AreaUnit.SQUARECENTIMETER.convert(suitable, AreaUnit.ARE), delta);
        Assert.assertEquals(Math.pow(10, 4), AreaUnit.SQUARECENTIMETER.convert(bigger, AreaUnit.ARE), delta);
        Assert.assertEquals(-Math.pow(10, -17), AreaUnit.SQUARECENTIMETER.convert(smaller, AreaUnit.ARE), delta);
    }
    @Test
    public void testSQUARECENTIMETERToHectare() {
        Assert.assertEquals(Math.pow(10, -7), AreaUnit.SQUARECENTIMETER.convert(suitable, AreaUnit.HECTARE), delta);
        Assert.assertEquals(Math.pow(10, 2), AreaUnit.SQUARECENTIMETER.convert(bigger, AreaUnit.HECTARE), delta);
        Assert.assertEquals(-Math.pow(10, -19), AreaUnit.SQUARECENTIMETER.convert(smaller, AreaUnit.HECTARE), delta);
    }
    @Test
    public void testSQUARECENTIMETERToSquareCentimeter() {
        Assert.assertEquals(10.0, AreaUnit.SQUARECENTIMETER.convert(suitable, AreaUnit.SQUARECENTIMETER), delta);
        Assert.assertEquals(10000000000.0, AreaUnit.SQUARECENTIMETER.convert(bigger, AreaUnit.SQUARECENTIMETER), delta);
        Assert.assertEquals(-0.00000000001, AreaUnit.SQUARECENTIMETER.convert(smaller, AreaUnit.SQUARECENTIMETER), delta);
    }
    @Test
    public void testSQUARECENTIMETERToSquareFeet() {
        Assert.assertEquals(0.01076391041671, AreaUnit.SQUARECENTIMETER.convert(suitable, AreaUnit.SQUAREFEET), delta);
        Assert.assertEquals(1.076391041671 * Math.pow(10, 7), AreaUnit.SQUARECENTIMETER.convert(bigger, AreaUnit.SQUAREFEET), delta);
        Assert.assertEquals(-1.076391041671 * Math.pow(10, -14), AreaUnit.SQUARECENTIMETER.convert(smaller, AreaUnit.SQUAREFEET), delta);
    }
    @Test
    public void testSQUARECENTIMETERToSquareInch() {
        Assert.assertEquals(1.5500031000062, AreaUnit.SQUARECENTIMETER.convert(suitable, AreaUnit.SQUAREINCH), delta);
        Assert.assertEquals(1.5500031000062 * Math.pow(10, 9), AreaUnit.SQUARECENTIMETER.convert(bigger, AreaUnit.SQUAREINCH), delta);
        Assert.assertEquals(-1.5500031000062 * Math.pow(10, -12), AreaUnit.SQUARECENTIMETER.convert(smaller, AreaUnit.SQUAREINCH), delta);
    }
    @Test
    public void testSQUARECENTIMETERToSquareMeter() {
        Assert.assertEquals(0.001, AreaUnit.SQUARECENTIMETER.convert(suitable, AreaUnit.SQUAREMETER), delta);
        Assert.assertEquals(Math.pow(10, 6), AreaUnit.SQUARECENTIMETER.convert(bigger, AreaUnit.SQUAREMETER), delta);
        Assert.assertEquals(-Math.pow(10, -15), AreaUnit.SQUARECENTIMETER.convert(smaller, AreaUnit.SQUAREMETER), delta);
    }
    @Test
    public void testSQUARECENTIMETERToPyeong() {
        Assert.assertEquals(3.025 * Math.pow(10, -4), AreaUnit.SQUARECENTIMETER.convert(suitable, AreaUnit.PYEONG), delta);
        Assert.assertEquals(302500, AreaUnit.SQUARECENTIMETER.convert(bigger, AreaUnit.PYEONG), delta);
        Assert.assertEquals(-3.025 * Math.pow(10, -16), AreaUnit.SQUARECENTIMETER.convert(smaller, AreaUnit.PYEONG), delta);
    }
    @Test
    public void testSQUAREFEETToAcre() {
        Assert.assertEquals(2.2956841138659 * Math.pow(10, -4), AreaUnit.SQUAREFEET.convert(suitable, AreaUnit.ACRE), delta);
        Assert.assertEquals(2.2956841138659 * Math.pow(10, 5), AreaUnit.SQUAREFEET.convert(bigger, AreaUnit.ACRE), delta);
        Assert.assertEquals(-2.2956841138659 * Math.pow(10, -16), AreaUnit.SQUAREFEET.convert(smaller, AreaUnit.ACRE), delta);
    }
    @Test
    public void testSQUAREFEETToAre() {
        Assert.assertEquals(0.009290304, AreaUnit.SQUAREFEET.convert(suitable, AreaUnit.ARE), delta);
        Assert.assertEquals(9.290304 * Math.pow(10, 6), AreaUnit.SQUAREFEET.convert(bigger, AreaUnit.ARE), delta);
        Assert.assertEquals(-9.290304 * Math.pow(10, -15), AreaUnit.SQUAREFEET.convert(smaller, AreaUnit.ARE), delta);
    }
    @Test
    public void testSQUAREFEETToHectare() {
        Assert.assertEquals(9.290304 * Math.pow(10, -5), AreaUnit.SQUAREFEET.convert(suitable, AreaUnit.HECTARE), delta);
        Assert.assertEquals(9.290304 * Math.pow(10, 4), AreaUnit.SQUAREFEET.convert(bigger, AreaUnit.HECTARE), delta);
        Assert.assertEquals(-9.290304 * Math.pow(10, -17), AreaUnit.SQUAREFEET.convert(smaller, AreaUnit.HECTARE), delta);
    }
    @Test
    public void testSQUAREFEETToSquareCentimeter() {
        Assert.assertEquals(9290.304, AreaUnit.SQUAREFEET.convert(suitable, AreaUnit.SQUARECENTIMETER), delta);
        Assert.assertEquals(9.290304 * Math.pow(10, 12), AreaUnit.SQUAREFEET.convert(bigger, AreaUnit.SQUARECENTIMETER), delta);
        Assert.assertEquals(-9.290304 * Math.pow(10, -9), AreaUnit.SQUAREFEET.convert(smaller, AreaUnit.SQUARECENTIMETER), delta);
    }
    @Test
    public void testSQUAREFEETToSquareFeet() {
        Assert.assertEquals(10.0, AreaUnit.SQUAREFEET.convert(suitable, AreaUnit.SQUAREFEET), delta);
        Assert.assertEquals(10000000000.0, AreaUnit.SQUAREFEET.convert(bigger, AreaUnit.SQUAREFEET), delta);
        Assert.assertEquals(-0.00000000001, AreaUnit.SQUAREFEET.convert(smaller, AreaUnit.SQUAREFEET), delta);
    }
    @Test
    public void testSQUAREFEETToSquareInch() {
        Assert.assertEquals(1440, AreaUnit.SQUAREFEET.convert(suitable, AreaUnit.SQUAREINCH), delta);
        Assert.assertEquals(1.44 * Math.pow(10, 12), AreaUnit.SQUAREFEET.convert(bigger, AreaUnit.SQUAREINCH), delta);
        Assert.assertEquals(-1.44 * Math.pow(10, -9), AreaUnit.SQUAREFEET.convert(smaller, AreaUnit.SQUAREINCH), delta);
    }
    @Test
    public void testSQUAREFEETToSquareMeter() {
        Assert.assertEquals(0.9290304, AreaUnit.SQUAREFEET.convert(suitable, AreaUnit.SQUAREMETER), delta);
        Assert.assertEquals(9.290304 * Math.pow(10, 8), AreaUnit.SQUAREFEET.convert(bigger, AreaUnit.SQUAREMETER), delta);
        Assert.assertEquals(-9.290304 * Math.pow(10, -13), AreaUnit.SQUAREFEET.convert(smaller, AreaUnit.SQUAREMETER), delta);
    }
    @Test
    public void testSQUAREFEETToPyeong() {
        Assert.assertEquals(0.281031707, AreaUnit.SQUAREFEET.convert(suitable, AreaUnit.PYEONG), delta);
        Assert.assertEquals(281031707, AreaUnit.SQUAREFEET.convert(bigger, AreaUnit.PYEONG), delta);
        Assert.assertEquals(-2.81031707 * Math.pow(10, -13), AreaUnit.SQUAREFEET.convert(smaller, AreaUnit.PYEONG), delta);
    }
    @Test
    public void testSQUAREINCHToAcre() {
        Assert.assertEquals(1.5942250790736 * Math.pow(10, -6), AreaUnit.SQUAREINCH.convert(suitable, AreaUnit.ACRE), delta);
        Assert.assertEquals(1594.2250790736, AreaUnit.SQUAREINCH.convert(bigger, AreaUnit.ACRE), delta);
        Assert.assertEquals(-1.5942250790736 * Math.pow(10, -18), AreaUnit.SQUAREINCH.convert(smaller, AreaUnit.ACRE), delta);
    }
    @Test
    public void testSQUAREINCHToAre() {
        Assert.assertEquals(6.4516 * Math.pow(10, -5), AreaUnit.SQUAREINCH.convert(suitable, AreaUnit.ARE), delta);
        Assert.assertEquals(6.4516 * Math.pow(10, 4), AreaUnit.SQUAREINCH.convert(bigger, AreaUnit.ARE), delta);
        Assert.assertEquals(-6.4516 * Math.pow(10, -17), AreaUnit.SQUAREINCH.convert(smaller, AreaUnit.ARE), delta);
    }
    @Test
    public void testSQUAREINCHToHectare() {
        Assert.assertEquals(6.4516 * Math.pow(10, -7), AreaUnit.SQUAREINCH.convert(suitable, AreaUnit.HECTARE), delta);
        Assert.assertEquals(6.4516 * Math.pow(10, 2), AreaUnit.SQUAREINCH.convert(bigger, AreaUnit.HECTARE), delta);
        Assert.assertEquals(-6.4516 * Math.pow(10, -19), AreaUnit.SQUAREINCH.convert(smaller, AreaUnit.HECTARE), delta);
    }
    @Test
    public void testSQUAREINCHToSquareCentimeter() {
        Assert.assertEquals(64.516, AreaUnit.SQUAREINCH.convert(suitable, AreaUnit.SQUARECENTIMETER), delta);
        Assert.assertEquals(6.4516 * Math.pow(10, 10), AreaUnit.SQUAREINCH.convert(bigger, AreaUnit.SQUARECENTIMETER), delta);
        Assert.assertEquals(-6.4516 * Math.pow(10, -11), AreaUnit.SQUAREINCH.convert(smaller, AreaUnit.SQUARECENTIMETER), delta);
    }
    @Test
    public void testSQUAREINCHToSquareFeet() {
        Assert.assertEquals(0.069444444444444, AreaUnit.SQUAREINCH.convert(suitable, AreaUnit.SQUAREFEET), delta);
        Assert.assertEquals(6.9444444444444 * Math.pow(10, 7), AreaUnit.SQUAREINCH.convert(bigger, AreaUnit.SQUAREFEET), delta);
        Assert.assertEquals(-6.9444444444444 * Math.pow(10, -14), AreaUnit.SQUAREINCH.convert(smaller, AreaUnit.SQUAREFEET), delta);
    }
    @Test
    public void testSQUAREINCHToSquareInch() {
        Assert.assertEquals(10.0, AreaUnit.SQUAREINCH.convert(suitable, AreaUnit.SQUAREINCH), delta);
        Assert.assertEquals(10000000000.0, AreaUnit.SQUAREINCH.convert(bigger, AreaUnit.SQUAREINCH), delta);
        Assert.assertEquals(-0.00000000001, AreaUnit.SQUAREINCH.convert(smaller, AreaUnit.SQUAREINCH), delta);
    }
    @Test
    public void testSQUAREINCHToSquareMeter() {
        Assert.assertEquals(0.0064516, AreaUnit.SQUAREINCH.convert(suitable, AreaUnit.SQUAREMETER), delta);
        Assert.assertEquals(6.4516 * Math.pow(10, 6), AreaUnit.SQUAREINCH.convert(bigger, AreaUnit.SQUAREMETER), delta);
        Assert.assertEquals(-6.4516 * Math.pow(10, -15), AreaUnit.SQUAREINCH.convert(smaller, AreaUnit.SQUAREMETER), delta);
    }
    @Test
    public void testSQUAREINCHToPyeong() {
        Assert.assertEquals(0.00195161, AreaUnit.SQUAREINCH.convert(suitable, AreaUnit.PYEONG), delta);
        Assert.assertEquals(1951610, AreaUnit.SQUAREINCH.convert(bigger, AreaUnit.PYEONG), delta);
        Assert.assertEquals(-1.95161 * Math.pow(10, -15), AreaUnit.SQUAREINCH.convert(smaller, AreaUnit.PYEONG), delta);
    }
    @Test
    public void testSQUAREMETERToAcre() {
        Assert.assertEquals(0.0024710538146717, AreaUnit.SQUAREMETER.convert(suitable, AreaUnit.ACRE), delta);
        Assert.assertEquals(2.4710538146717 * Math.pow(10, 6), AreaUnit.SQUAREMETER.convert(bigger, AreaUnit.ACRE), delta);
        Assert.assertEquals(-2.4710538146717 * Math.pow(10, -15), AreaUnit.SQUAREMETER.convert(smaller, AreaUnit.ACRE), delta);
    }
    @Test
    public void testSQUAREMETERToAre() {
        Assert.assertEquals(0.1, AreaUnit.SQUAREMETER.convert(suitable, AreaUnit.ARE), delta);
        Assert.assertEquals(Math.pow(10, 8), AreaUnit.SQUAREMETER.convert(bigger, AreaUnit.ARE), delta);
        Assert.assertEquals(-Math.pow(10, -13), AreaUnit.SQUAREMETER.convert(smaller, AreaUnit.ARE), delta);
    }
    @Test
    public void testSQUAREMETERToHectare() {
        Assert.assertEquals(0.001, AreaUnit.SQUAREMETER.convert(suitable, AreaUnit.HECTARE), delta);
        Assert.assertEquals(Math.pow(10, 6), AreaUnit.SQUAREMETER.convert(bigger, AreaUnit.HECTARE), delta);
        Assert.assertEquals(-Math.pow(10, -15), AreaUnit.SQUAREMETER.convert(smaller, AreaUnit.HECTARE), delta);
    }
    @Test
    public void testSQUAREMETERToSquareCentimeter() {
        Assert.assertEquals(Math.pow(10, 5), AreaUnit.SQUAREMETER.convert(suitable, AreaUnit.SQUARECENTIMETER), delta);
        Assert.assertEquals(Math.pow(10, 14), AreaUnit.SQUAREMETER.convert(bigger, AreaUnit.SQUARECENTIMETER), delta);
        Assert.assertEquals(-Math.pow(10, -7), AreaUnit.SQUAREMETER.convert(smaller, AreaUnit.SQUARECENTIMETER), delta);
    }
    @Test
    public void testSQUAREMETERToSquareFeet() {
        Assert.assertEquals(107.6391041671, AreaUnit.SQUAREMETER.convert(suitable, AreaUnit.SQUAREFEET), delta);
        Assert.assertEquals(1.076391041671 * Math.pow(10, 11), AreaUnit.SQUAREMETER.convert(bigger, AreaUnit.SQUAREFEET), delta);
        Assert.assertEquals(-1.076391041671 * Math.pow(10, -10), AreaUnit.SQUAREMETER.convert(smaller, AreaUnit.SQUAREFEET), delta);
    }
    @Test
    public void testSQUAREMETERToSquareInch() {
        Assert.assertEquals(1.5500031000062 * Math.pow(10, 4), AreaUnit.SQUAREMETER.convert(suitable, AreaUnit.SQUAREINCH), delta);
        Assert.assertEquals(1.5500031000062 * Math.pow(10, 13), AreaUnit.SQUAREMETER.convert(bigger, AreaUnit.SQUAREINCH), delta);
        Assert.assertEquals(-1.5500031000062 * Math.pow(10, -8), AreaUnit.SQUAREMETER.convert(smaller, AreaUnit.SQUAREINCH), delta);
    }
    @Test
    public void testSQUAREMETERToSquareMeter() {
        Assert.assertEquals(10.0, AreaUnit.SQUAREMETER.convert(suitable, AreaUnit.SQUAREMETER), delta);
        Assert.assertEquals(10000000000.0, AreaUnit.SQUAREMETER.convert(bigger, AreaUnit.SQUAREMETER), delta);
        Assert.assertEquals(-0.00000000001, AreaUnit.SQUAREMETER.convert(smaller, AreaUnit.SQUAREMETER), delta);
    }
    @Test
    public void testSQUAREMETERToPyeong() {
        Assert.assertEquals(3.025000113, AreaUnit.SQUAREMETER.convert(suitable, AreaUnit.PYEONG), delta);
        Assert.assertEquals(3025000113.0, AreaUnit.SQUAREMETER.convert(bigger, AreaUnit.PYEONG), delta);
        Assert.assertEquals(-3.025000113 * Math.pow(10, -12), AreaUnit.SQUAREMETER.convert(smaller, AreaUnit.PYEONG), delta);
    }
    @Test
    public void testPYEONGToAcre() {
        Assert.assertEquals(0.008168772941145, AreaUnit.PYEONG.convert(suitable, AreaUnit.ACRE), delta);
        Assert.assertEquals(8168772.941145, AreaUnit.PYEONG.convert(bigger, AreaUnit.ACRE), delta);
        Assert.assertEquals(-8.168772941145 * Math.pow(10, -15), AreaUnit.PYEONG.convert(smaller, AreaUnit.ACRE), delta);
    }
    @Test
    public void testPYEONGToAre() {
        Assert.assertEquals(0.3305785124, AreaUnit.PYEONG.convert(suitable, AreaUnit.ARE), delta);
        Assert.assertEquals(330578512.4, AreaUnit.PYEONG.convert(bigger, AreaUnit.ARE), delta);
        Assert.assertEquals(-3.305785124 * Math.pow(10, -13), AreaUnit.PYEONG.convert(smaller, AreaUnit.ARE), delta);
    }
    @Test
    public void testPYEONGToHectare() {
        Assert.assertEquals(0.003305785124, AreaUnit.PYEONG.convert(suitable, AreaUnit.HECTARE), delta);
        Assert.assertEquals(3305785.124, AreaUnit.PYEONG.convert(bigger, AreaUnit.HECTARE), delta);
        Assert.assertEquals(-3.305785124 * Math.pow(10, -15), AreaUnit.PYEONG.convert(smaller, AreaUnit.HECTARE), delta);
    }
    @Test
    public void testPYEONGToSquareCentimeter() {
        Assert.assertEquals(330578.512, AreaUnit.PYEONG.convert(suitable, AreaUnit.SQUARECENTIMETER), delta);
        Assert.assertEquals(3.30578512 * Math.pow(10, 14), AreaUnit.PYEONG.convert(bigger, AreaUnit.SQUARECENTIMETER), delta);
        Assert.assertEquals(-3.30578512 * Math.pow(10, -7), AreaUnit.PYEONG.convert(smaller, AreaUnit.SQUARECENTIMETER), delta);
    }
    @Test
    public void testPYEONGToSquareFeet() {
        Assert.assertEquals(355.8317493163, AreaUnit.PYEONG.convert(suitable, AreaUnit.SQUAREFEET), delta);
        Assert.assertEquals(355831749316.3, AreaUnit.PYEONG.convert(bigger, AreaUnit.SQUAREFEET), delta);
        Assert.assertEquals(-3.558317493163 * Math.pow(10, -10), AreaUnit.PYEONG.convert(smaller, AreaUnit.SQUAREFEET), delta);
    }
    @Test
    public void testPYEONGToSquareInch() {
        Assert.assertEquals(51239.771902, AreaUnit.PYEONG.convert(suitable, AreaUnit.SQUAREINCH), delta);
        Assert.assertEquals(5.1239771902 * Math.pow(10, 13), AreaUnit.PYEONG.convert(bigger, AreaUnit.SQUAREINCH), delta);
        Assert.assertEquals(-5.1239771902 * Math.pow(10, -8), AreaUnit.PYEONG.convert(smaller, AreaUnit.SQUAREINCH), delta);
    }
    @Test
    public void testPYEONGToSquareMeter() {
        Assert.assertEquals(33.0578512, AreaUnit.PYEONG.convert(suitable, AreaUnit.SQUAREMETER), delta);
        Assert.assertEquals(33057851200.0, AreaUnit.PYEONG.convert(bigger, AreaUnit.SQUAREMETER), delta);
        Assert.assertEquals(-3.30578512 * Math.pow(10, -11), AreaUnit.PYEONG.convert(smaller, AreaUnit.SQUAREMETER), delta);
    }
    @Test
    public void testPYEONGToPyeong() {
        Assert.assertEquals(10.0, AreaUnit.PYEONG.convert(suitable, AreaUnit.PYEONG), delta);
        Assert.assertEquals(10000000000.0, AreaUnit.PYEONG.convert(bigger, AreaUnit.PYEONG), delta);
        Assert.assertEquals(-0.00000000001, AreaUnit.PYEONG.convert(smaller, AreaUnit.PYEONG), delta);
    }
}
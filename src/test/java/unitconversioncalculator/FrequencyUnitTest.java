package unitconversioncalculator;

import org.junit.Assert;
import org.junit.Test;

public class FrequencyUnitTest {
    private static final double suitable = 10.0;
    private static final double bigger = 10000000000.0;
    private static final double smaller = -0.00000000001;
    private static final double delta = 0.00000001;

    // HERTZ, KILOHERTZ, MEGAHERTZ, GIGAHERTZ, TERAHERTZ
    // Hertz, KiloHertz, MegaHertz, GigaHertz, teraHertz

    @Test
    public void testHERTZToHertz() {
        Assert.assertEquals(10.0, FrequencyUnit.HERTZ.convert(suitable, FrequencyUnit.HERTZ), delta);
        Assert.assertEquals(10000000000.0, FrequencyUnit.HERTZ.convert(bigger, FrequencyUnit.HERTZ), delta);
        Assert.assertEquals(-0.00000000001, FrequencyUnit.HERTZ.convert(smaller, FrequencyUnit.HERTZ), delta);
    }
    @Test
    public void testHERTZToKiloHertz() {
        Assert.assertEquals(0.01, FrequencyUnit.HERTZ.convert(suitable, FrequencyUnit.KILOHERTZ), delta);
        Assert.assertEquals(Math.pow(10, 7), FrequencyUnit.HERTZ.convert(bigger, FrequencyUnit.KILOHERTZ), delta);
        Assert.assertEquals(-Math.pow(10, -14), FrequencyUnit.HERTZ.convert(smaller, FrequencyUnit.KILOHERTZ), delta);
    }
    @Test
    public void testHERTZToMegaHertz() {
        Assert.assertEquals(Math.pow(10, -5), FrequencyUnit.HERTZ.convert(suitable, FrequencyUnit.MEGAHERTZ), delta);
        Assert.assertEquals(Math.pow(10, 4), FrequencyUnit.HERTZ.convert(bigger, FrequencyUnit.MEGAHERTZ), delta);
        Assert.assertEquals(-Math.pow(10, -17), FrequencyUnit.HERTZ.convert(smaller, FrequencyUnit.MEGAHERTZ), delta);
    }
    @Test
    public void testHERTZToGigaHertz() {
        Assert.assertEquals(Math.pow(10, -8), FrequencyUnit.HERTZ.convert(suitable, FrequencyUnit.GIGAHERTZ), delta);
        Assert.assertEquals(10, FrequencyUnit.HERTZ.convert(bigger, FrequencyUnit.GIGAHERTZ), delta);
        Assert.assertEquals(-Math.pow(10, -20), FrequencyUnit.HERTZ.convert(smaller, FrequencyUnit.GIGAHERTZ), delta);
    }
    @Test
    public void testHERTZToTeraHertz() {
        Assert.assertEquals(Math.pow(10, -11), FrequencyUnit.HERTZ.convert(suitable, FrequencyUnit.TERAHERTZ), delta);
        Assert.assertEquals(0.01, FrequencyUnit.HERTZ.convert(bigger, FrequencyUnit.TERAHERTZ), delta);
        Assert.assertEquals(-Math.pow(10, -23), FrequencyUnit.HERTZ.convert(smaller, FrequencyUnit.TERAHERTZ), delta);
    }
    @Test
    public void testKILOHERTZToHertz() {
        Assert.assertEquals(Math.pow(10, 4), FrequencyUnit.KILOHERTZ.convert(suitable, FrequencyUnit.HERTZ), delta);
        Assert.assertEquals(Math.pow(10, 13), FrequencyUnit.KILOHERTZ.convert(bigger, FrequencyUnit.HERTZ), delta);
        Assert.assertEquals(-Math.pow(10, -8), FrequencyUnit.KILOHERTZ.convert(smaller, FrequencyUnit.HERTZ), delta);
    }
    @Test
    public void testKILOHERTZToKiloHertz() {
        Assert.assertEquals(10.0, FrequencyUnit.KILOHERTZ.convert(suitable, FrequencyUnit.KILOHERTZ), delta);
        Assert.assertEquals(10000000000.0, FrequencyUnit.KILOHERTZ.convert(bigger, FrequencyUnit.KILOHERTZ), delta);
        Assert.assertEquals(-0.00000000001, FrequencyUnit.KILOHERTZ.convert(smaller, FrequencyUnit.KILOHERTZ), delta);
    }
    @Test
    public void testKILOHERTZToMegaHertz() {
        Assert.assertEquals(0.01, FrequencyUnit.KILOHERTZ.convert(suitable, FrequencyUnit.MEGAHERTZ), delta);
        Assert.assertEquals(Math.pow(10, 7), FrequencyUnit.KILOHERTZ.convert(bigger, FrequencyUnit.MEGAHERTZ), delta);
        Assert.assertEquals(-Math.pow(10, -14), FrequencyUnit.KILOHERTZ.convert(smaller, FrequencyUnit.MEGAHERTZ), delta);
    }
    @Test
    public void testKILOHERTZToGigaHertz() {
        Assert.assertEquals(Math.pow(10, -5), FrequencyUnit.KILOHERTZ.convert(suitable, FrequencyUnit.GIGAHERTZ), delta);
        Assert.assertEquals(Math.pow(10, 4), FrequencyUnit.KILOHERTZ.convert(bigger, FrequencyUnit.GIGAHERTZ), delta);
        Assert.assertEquals(-Math.pow(10, -17), FrequencyUnit.KILOHERTZ.convert(smaller, FrequencyUnit.GIGAHERTZ), delta);
    }
    @Test
    public void testKILOHERTZToTeraHertz() {
        Assert.assertEquals(Math.pow(10, -8), FrequencyUnit.KILOHERTZ.convert(suitable, FrequencyUnit.TERAHERTZ), delta);
        Assert.assertEquals(10, FrequencyUnit.KILOHERTZ.convert(bigger, FrequencyUnit.TERAHERTZ), delta);
        Assert.assertEquals(-Math.pow(10, -20), FrequencyUnit.KILOHERTZ.convert(smaller, FrequencyUnit.TERAHERTZ), delta);
    }
    @Test
    public void testMEGAHERTZToHertz() {
        Assert.assertEquals(Math.pow(10, 7), FrequencyUnit.MEGAHERTZ.convert(suitable, FrequencyUnit.HERTZ), delta);
        Assert.assertEquals(Math.pow(10, 16), FrequencyUnit.MEGAHERTZ.convert(bigger, FrequencyUnit.HERTZ), delta);
        Assert.assertEquals(-Math.pow(10, -5), FrequencyUnit.MEGAHERTZ.convert(smaller, FrequencyUnit.HERTZ), delta);
    }
    @Test
    public void testMEGAHERTZToKiloHertz() {
        Assert.assertEquals(Math.pow(10, 4), FrequencyUnit.MEGAHERTZ.convert(suitable, FrequencyUnit.KILOHERTZ), delta);
        Assert.assertEquals(Math.pow(10, 13), FrequencyUnit.MEGAHERTZ.convert(bigger, FrequencyUnit.KILOHERTZ), delta);
        Assert.assertEquals(-Math.pow(10, -8), FrequencyUnit.MEGAHERTZ.convert(smaller, FrequencyUnit.KILOHERTZ), delta);
    }
    @Test
    public void testMEGAHERTZToMegaHertz() {
        Assert.assertEquals(10, FrequencyUnit.MEGAHERTZ.convert(suitable, FrequencyUnit.MEGAHERTZ), delta);
        Assert.assertEquals(10000000000.0, FrequencyUnit.MEGAHERTZ.convert(bigger, FrequencyUnit.MEGAHERTZ), delta);
        Assert.assertEquals(-0.00000000001, FrequencyUnit.MEGAHERTZ.convert(smaller, FrequencyUnit.MEGAHERTZ), delta);
    }
    @Test
    public void testMEGAHERTZToGigaHertz() {
        Assert.assertEquals(0.01, FrequencyUnit.MEGAHERTZ.convert(suitable, FrequencyUnit.GIGAHERTZ), delta);
        Assert.assertEquals(Math.pow(10, 7), FrequencyUnit.MEGAHERTZ.convert(bigger, FrequencyUnit.GIGAHERTZ), delta);
        Assert.assertEquals(-Math.pow(10, -14), FrequencyUnit.MEGAHERTZ.convert(smaller, FrequencyUnit.GIGAHERTZ), delta);
    }
    @Test
    public void testMEGAHERTZToTeraHertz() {
        Assert.assertEquals(Math.pow(10, -5), FrequencyUnit.MEGAHERTZ.convert(suitable, FrequencyUnit.TERAHERTZ), delta);
        Assert.assertEquals(Math.pow(10, 4), FrequencyUnit.MEGAHERTZ.convert(bigger, FrequencyUnit.TERAHERTZ), delta);
        Assert.assertEquals(-Math.pow(10, -17), FrequencyUnit.MEGAHERTZ.convert(smaller, FrequencyUnit.TERAHERTZ), delta);
    }
    @Test
    public void testGIGAHERTZToHertz() {
        Assert.assertEquals(Math.pow(10, 10), FrequencyUnit.GIGAHERTZ.convert(suitable, FrequencyUnit.HERTZ), delta);
        Assert.assertEquals(Math.pow(10, 19), FrequencyUnit.GIGAHERTZ.convert(bigger, FrequencyUnit.HERTZ), delta);
        Assert.assertEquals(-0.01, FrequencyUnit.GIGAHERTZ.convert(smaller, FrequencyUnit.HERTZ), delta);
    }
    @Test
    public void testGIGAHERTZToKiloHertz() {
        Assert. assertEquals(Math.pow(10, 7), FrequencyUnit.GIGAHERTZ.convert(suitable, FrequencyUnit.KILOHERTZ), delta);
        Assert.assertEquals(Math.pow(10, 16), FrequencyUnit.GIGAHERTZ.convert(bigger, FrequencyUnit.KILOHERTZ), delta);
        Assert.assertEquals(-Math.pow(10, -5), FrequencyUnit.GIGAHERTZ.convert(smaller, FrequencyUnit.KILOHERTZ), delta);
    }
    @Test
    public void testGIGAHERTZToMegaHertz() {
        Assert. assertEquals(Math.pow(10, 4), FrequencyUnit.GIGAHERTZ.convert(suitable, FrequencyUnit.MEGAHERTZ), delta);
        Assert.assertEquals(Math.pow(10, 13), FrequencyUnit.GIGAHERTZ.convert(bigger, FrequencyUnit.MEGAHERTZ), delta);
        Assert.assertEquals(-Math.pow(10, -8), FrequencyUnit.GIGAHERTZ.convert(smaller, FrequencyUnit.MEGAHERTZ), delta);
    }
    @Test
    public void testGIGAHERTZToGigaHertz() {
        Assert. assertEquals(10, FrequencyUnit.GIGAHERTZ.convert(suitable, FrequencyUnit.GIGAHERTZ), delta);
        Assert.assertEquals(10000000000.0, FrequencyUnit.GIGAHERTZ.convert(bigger, FrequencyUnit.GIGAHERTZ), delta);
        Assert.assertEquals(-0.00000000001, FrequencyUnit.GIGAHERTZ.convert(smaller, FrequencyUnit.GIGAHERTZ), delta);
    }
    @Test
    public void testGIGAHERTZToTeraHertz() {
        Assert. assertEquals(0.01, FrequencyUnit.GIGAHERTZ.convert(suitable, FrequencyUnit.TERAHERTZ), delta);
        Assert.assertEquals(Math.pow(10, 7), FrequencyUnit.GIGAHERTZ.convert(bigger, FrequencyUnit.TERAHERTZ), delta);
        Assert.assertEquals(-Math.pow(10, -14), FrequencyUnit.GIGAHERTZ.convert(smaller, FrequencyUnit.TERAHERTZ), delta);
    }
    @Test
    public void testTERAHERTZToHertz() {
        Assert. assertEquals(Math.pow(10, 13), FrequencyUnit.TERAHERTZ.convert(suitable, FrequencyUnit.HERTZ), delta);
        Assert.assertEquals(Math.pow(10, 22), FrequencyUnit.TERAHERTZ.convert(bigger, FrequencyUnit.HERTZ), delta);
        Assert.assertEquals(-10, FrequencyUnit.TERAHERTZ.convert(smaller, FrequencyUnit.HERTZ), delta);
    }
    @Test
    public void testTERAHERTZToKiloHertz() {
        Assert. assertEquals(Math.pow(10, 10), FrequencyUnit.TERAHERTZ.convert(suitable, FrequencyUnit.KILOHERTZ), delta);
        Assert.assertEquals(Math.pow(10, 19), FrequencyUnit.TERAHERTZ.convert(bigger, FrequencyUnit.KILOHERTZ), delta);
        Assert.assertEquals(-0.01, FrequencyUnit.TERAHERTZ.convert(smaller, FrequencyUnit.KILOHERTZ), delta);
    }
    @Test
    public void testTERAHERTZToMegaHertz() {
        Assert. assertEquals(Math.pow(10, 7), FrequencyUnit.TERAHERTZ.convert(suitable, FrequencyUnit.MEGAHERTZ), delta);
        Assert.assertEquals(Math.pow(10, 16), FrequencyUnit.TERAHERTZ.convert(bigger, FrequencyUnit.MEGAHERTZ), delta);
        Assert.assertEquals(-Math.pow(10, -5), FrequencyUnit.TERAHERTZ.convert(smaller, FrequencyUnit.MEGAHERTZ), delta);
    }
    @Test
    public void testTERAHERTZToGigaHertz() {
        Assert. assertEquals(Math.pow(10, 4), FrequencyUnit.TERAHERTZ.convert(suitable, FrequencyUnit.GIGAHERTZ), delta);
        Assert.assertEquals(Math.pow(10, 13), FrequencyUnit.TERAHERTZ.convert(bigger, FrequencyUnit.GIGAHERTZ), delta);
        Assert.assertEquals(-Math.pow(10, -8), FrequencyUnit.TERAHERTZ.convert(smaller, FrequencyUnit.GIGAHERTZ), delta);
    }
    @Test
    public void testTERAHERTZToTeraHertz() {
        Assert. assertEquals(10, FrequencyUnit.TERAHERTZ.convert(suitable, FrequencyUnit.TERAHERTZ), delta);
        Assert.assertEquals(10000000000.0, FrequencyUnit.TERAHERTZ.convert(bigger, FrequencyUnit.TERAHERTZ), delta);
        Assert.assertEquals(-0.00000000001, FrequencyUnit.TERAHERTZ.convert(smaller, FrequencyUnit.TERAHERTZ), delta);
    }
}
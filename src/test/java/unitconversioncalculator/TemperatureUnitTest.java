package unitconversioncalculator;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TemperatureUnitTest extends TestCase {

    private static final double suitable = 24.0;
    private static final double bigger = 16000000000.0;
    private static final double smaller = -0.00000000032;

    private static final double delta = 0.0000000001;

    //CELSIUS, FAHRENHEIT, KELVIN
    //Celsius, Fahrenheit, Kelvin

    @Test
    public void testCelsiusToCelsius() {
        Assert.assertEquals(24.0,
                TemperatureUnit.CELSIUS.convert(suitable, TemperatureUnit.CELSIUS), delta);
        Assert.assertEquals(16000000000.0,
                TemperatureUnit.CELSIUS.convert(bigger, TemperatureUnit.CELSIUS), delta);
        Assert.assertEquals(-0.00000000032,
                TemperatureUnit.CELSIUS.convert(smaller, TemperatureUnit.CELSIUS), delta);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        Assert.assertEquals(75.2,
                TemperatureUnit.CELSIUS.convert(suitable, TemperatureUnit.FAHRENHEIT), delta);
        Assert.assertEquals(28800000032.0,
                TemperatureUnit.CELSIUS.convert(bigger, TemperatureUnit.FAHRENHEIT), delta);
        Assert.assertEquals(31.99999999942404,
                TemperatureUnit.CELSIUS.convert(smaller, TemperatureUnit.FAHRENHEIT), delta);
    }

    @Test
    public void testCelsiusToKelvin() {
        Assert.assertEquals(297.15,
                TemperatureUnit.CELSIUS.convert(suitable, TemperatureUnit.KELVIN), delta);
        Assert.assertEquals(16000000273.15,
                TemperatureUnit.CELSIUS.convert(bigger, TemperatureUnit.KELVIN), delta);
        Assert.assertEquals(273.14999999968,
                TemperatureUnit.CELSIUS.convert(smaller, TemperatureUnit.KELVIN), delta);
    }

    @Test
    public void testFahrenheitToCelsius() {
        Assert.assertEquals(-4.4444444444,
                TemperatureUnit.FAHRENHEIT.convert(suitable, TemperatureUnit.CELSIUS), delta);
        Assert.assertEquals(8888888871.11111,
                TemperatureUnit.FAHRENHEIT.convert(bigger, TemperatureUnit.CELSIUS), delta);
        Assert.assertEquals(-17.77777777795555,
                TemperatureUnit.FAHRENHEIT.convert(smaller, TemperatureUnit.CELSIUS), delta);
    }

    @Test
    public void testFahrenheitToFahrenheit() {
        Assert.assertEquals(24.0,
                TemperatureUnit.FAHRENHEIT.convert(suitable, TemperatureUnit.FAHRENHEIT), delta);
        Assert.assertEquals(16000000000.0,
                TemperatureUnit.FAHRENHEIT.convert(bigger, TemperatureUnit.FAHRENHEIT), delta);
        Assert.assertEquals(-0.00000000032,
                TemperatureUnit.FAHRENHEIT.convert(smaller, TemperatureUnit.FAHRENHEIT), delta);
    }

    @Test
    public void testFahrenheitToKelvin() {
        Assert.assertEquals(268.705555555555,
                TemperatureUnit.FAHRENHEIT.convert(suitable, TemperatureUnit.KELVIN), delta);
        Assert.assertEquals(8888889144.26111,
                TemperatureUnit.FAHRENHEIT.convert(bigger, TemperatureUnit.KELVIN), delta);
        Assert.assertEquals(255.37222222204442801,
                TemperatureUnit.FAHRENHEIT.convert(smaller, TemperatureUnit.KELVIN), delta);
    }

    @Test
    public void testKelvinToCelsius() {
        Assert.assertEquals(-249.15,
                TemperatureUnit.KELVIN.convert(suitable, TemperatureUnit.CELSIUS), delta);
        Assert.assertEquals(15999999726.85,
                TemperatureUnit.KELVIN.convert(bigger, TemperatureUnit.CELSIUS), delta);
        Assert.assertEquals( -273.15000000032,
                TemperatureUnit.KELVIN.convert(smaller, TemperatureUnit.CELSIUS), delta);
    }

    @Test
    public void testKelvinToFahrenheit() {
        Assert.assertEquals(-416.47,
                TemperatureUnit.KELVIN.convert(suitable, TemperatureUnit.FAHRENHEIT), delta);
        Assert.assertEquals(28799999540.33,
                TemperatureUnit.KELVIN.convert(bigger, TemperatureUnit.FAHRENHEIT), delta);
        Assert.assertEquals(-459.67000000058,
                TemperatureUnit.KELVIN.convert(smaller, TemperatureUnit.FAHRENHEIT), delta);
    }

    @Test
    public void testKelvinToKelvin() {
        Assert.assertEquals(24.0,
                TemperatureUnit.KELVIN.convert(suitable, TemperatureUnit.KELVIN), delta);
        Assert.assertEquals(16000000000.0,
                TemperatureUnit.KELVIN.convert(bigger, TemperatureUnit.KELVIN), delta);
        Assert.assertEquals(-0.00000000032,
                TemperatureUnit.KELVIN.convert(smaller, TemperatureUnit.KELVIN), delta);
    }

}
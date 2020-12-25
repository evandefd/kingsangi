package unitconversioncalculator;

import java.math.BigDecimal;

public enum TemperatureUnitConvertor {
    CELSIUS{
        @Override
        BigDecimal convert(BigDecimal value, TemperatureUnitConvertor temperatureUnit) throws IllegalArgumentException {
            String calculatevalue;
            BigDecimal string_to_bigdecimal;
            BigDecimal calculated_value;
            switch (temperatureUnit) {
                case CELSIUS: {
                    calculated_value = value;
                    return calculated_value;
                }
                case FAHRENHEIT: {
                    calculatevalue = "0.5555555556";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal).add(new BigDecimal("32"));
                    return calculated_value;
                }
                case KELVIN: {
                    calculatevalue = "273.15";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.add(string_to_bigdecimal);
                    return calculated_value;
                }
            }
            throw new IllegalArgumentException();
        }
    },
    FAHRENHEIT{
        @Override
        BigDecimal convert(BigDecimal value, TemperatureUnitConvertor temperatureUnit) throws IllegalArgumentException {
            String calculatevalue;
            BigDecimal string_to_bigdecimal;
            BigDecimal calculated_value;
            switch (temperatureUnit) {
                case CELSIUS: {
                    calculatevalue = "0.5555555556";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.subtract(new BigDecimal("32")).multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case FAHRENHEIT: {
                    calculated_value = value;
                    return calculated_value;
                }
                case KELVIN: {
                    calculatevalue = "0.5555555556";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.subtract(new BigDecimal("32")).multiply(string_to_bigdecimal).add(new BigDecimal("273.15"));
                    return calculated_value;
                }
            }
            throw new IllegalArgumentException();
        }
    },
    KELVIN{
        @Override
        BigDecimal convert(BigDecimal value, TemperatureUnitConvertor temperatureUnit) throws IllegalArgumentException {
            String calculatevalue;
            BigDecimal string_to_bigdecimal;
            BigDecimal calculated_value;
            switch (temperatureUnit) {
                case CELSIUS: {
                    calculatevalue = "273.15";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.subtract(string_to_bigdecimal);
                    return calculated_value;
                }
                case FAHRENHEIT: {
                    calculatevalue = "0.5555555556";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.subtract(new BigDecimal("273.15")).multiply(string_to_bigdecimal).add(new BigDecimal("32"));
                    return calculated_value;
                }
                case KELVIN: {
                    calculated_value = value;
                    return calculated_value;
                }
            }
            throw new IllegalArgumentException();
        }
    };
    abstract BigDecimal convert(BigDecimal value, TemperatureUnitConvertor tempUnit);
}

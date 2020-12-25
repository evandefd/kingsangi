package unitconversioncalculator;

import java.math.BigDecimal;

public enum TemperatureUnit {
    CELSIUS{
        @Override
        public BigDecimal convert(BigDecimal value, TemperatureUnit temperatureUnit) throws IllegalArgumentException {
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (temperatureUnit) {
                case CELSIUS:
                    calculatedValue = value;
                    return calculatedValue;
                case FAHRENHEIT:
                    calculateValue = "0.5555555556";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal).add(new BigDecimal("32"));
                    return calculatedValue;
                case KELVIN:
                    calculateValue = "273.15";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.add(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    FAHRENHEIT{
        @Override
        public BigDecimal convert(BigDecimal value, TemperatureUnit temperatureUnit) throws IllegalArgumentException {
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (temperatureUnit) {
                case CELSIUS:
                    calculateValue = "0.5555555556";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.subtract(new BigDecimal("32")).multiply(stringToBigDecimal);
                    return calculatedValue;
                case FAHRENHEIT:
                    calculatedValue = value;
                    return calculatedValue;
                case KELVIN:
                    calculateValue = "0.5555555556";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.subtract(new BigDecimal("32")).multiply(stringToBigDecimal).add(new BigDecimal("273.15"));
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    KELVIN{
        @Override
        public BigDecimal convert(BigDecimal value, TemperatureUnit temperatureUnit) throws IllegalArgumentException {
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (temperatureUnit) {
                case CELSIUS:
                    calculateValue = "273.15";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.subtract(stringToBigDecimal);
                    return calculatedValue;
                case FAHRENHEIT:
                    calculateValue = "0.5555555556";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.subtract(new BigDecimal("273.15")).multiply(stringToBigDecimal).add(new BigDecimal("32"));
                    return calculatedValue;
                case KELVIN:
                    calculatedValue = value;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    };
    public abstract BigDecimal convert(BigDecimal value, TemperatureUnit tempUnit);
}

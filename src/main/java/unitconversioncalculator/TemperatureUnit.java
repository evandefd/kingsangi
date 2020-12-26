package unitconversioncalculator;

public enum TemperatureUnit {
    CELSIUS{
        @Override
        public double convert(double value, TemperatureUnit temperatureUnit) throws IllegalArgumentException {
            double calculateValue;
            double calculatedValue;
            switch (temperatureUnit) {
                case CELSIUS:
                    calculatedValue = value;
                    return calculatedValue;
                case FAHRENHEIT:
                    calculateValue = 9.0 / 5;
                    calculatedValue = value * calculateValue + 32;
                    return calculatedValue;
                case KELVIN:
                    calculateValue = 273.15;
                    calculatedValue = value + calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    FAHRENHEIT{
        @Override
        public double convert(double value, TemperatureUnit temperatureUnit) throws IllegalArgumentException {
            double calculateValue;
            double calculatedValue;
            switch (temperatureUnit) {
                case CELSIUS:
                    calculateValue = 5.0 / 9;
                    calculatedValue = (value - 32) * calculateValue;
                    return calculatedValue;
                case FAHRENHEIT:
                    calculatedValue = value;
                    return calculatedValue;
                case KELVIN:
                    calculateValue = 5.0 / 9;
                    calculatedValue = (value-32) * calculateValue + 273.15;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    KELVIN{
        @Override
        public double convert(double value, TemperatureUnit temperatureUnit) throws IllegalArgumentException {
            double calculateValue;
            double calculatedValue;
            switch (temperatureUnit) {
                case CELSIUS:
                    calculateValue = 273.15;
                    calculatedValue = value- calculateValue;
                    return calculatedValue;
                case FAHRENHEIT:
                    calculateValue = 9.0 / 5;
                    calculatedValue = (value - 273.15) * calculateValue + 32;
                    return calculatedValue;
                case KELVIN:
                    calculatedValue = value;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    };
    public abstract double convert(double value, TemperatureUnit tempUnit);
}

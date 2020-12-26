package unitconversioncalculator;

public enum FrequencyUnit {
    HERTZ{
        @Override
        public double convert(double value, FrequencyUnit frequencyUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (frequencyUnit) {
                case HERTZ:
                    calculatedValue = value;
                    return calculatedValue;
                case KILOHERTZ:
                    calculateValue = 0.001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MEGAHERTZ:
                    calculateValue = Math.pow(10, -6);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case GIGAHERTZ:
                    calculateValue = Math.pow(10, -9);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    KILOHERTZ{
        @Override
        public double convert(double value, FrequencyUnit frequencyUnit) {
            double calculateValue;
            double calculatedValue;
            switch (frequencyUnit) {
                case HERTZ:
                    calculateValue = 1000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOHERTZ:
                    calculatedValue = value;
                    return calculatedValue;
                case MEGAHERTZ:
                    calculateValue = 0.001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case GIGAHERTZ:
                    calculateValue = Math.pow(10, -6);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    MEGAHERTZ{
        @Override
        public double convert(double value, FrequencyUnit frequencyUnit) {
            double calculateValue;
            double calculatedValue;
            switch (frequencyUnit) {
                case HERTZ:
                    calculateValue = Math.pow(10, 6);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOHERTZ:
                    calculateValue = 1000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MEGAHERTZ:
                    calculatedValue = value;
                    return calculatedValue;
                case GIGAHERTZ:
                    calculateValue = 0.001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    GIGAHERTZ{
        @Override
        public double convert(double value, FrequencyUnit frequencyUnit) {
            double calculateValue;
            double calculatedValue;
            switch (frequencyUnit) {
                case HERTZ:
                    calculateValue = Math.pow(10, 9);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOHERTZ:
                    calculateValue = Math.pow(10, 6);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MEGAHERTZ:
                    calculateValue = 1000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case GIGAHERTZ:
                    calculatedValue = value;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    };
    public abstract double convert(double value, FrequencyUnit frequencyUnit);
}

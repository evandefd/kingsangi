package unitconversioncalculator;

public enum WeightUnit {
    TON{
        @Override
        public double convert(double value, WeightUnit weightUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (weightUnit) {
                case TON: 
                    calculatedValue = value;
                    return calculatedValue;
                case BRITISHTON:
                    calculateValue = 0.98420652761106;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case USTON:
                    calculateValue = 1.1023113109244;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case POUND: 
                    calculateValue = 2204.6226218488;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case OUNCE: 
                    calculateValue = 35273.96194958;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOGRAM: 
                    calculateValue = 1000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case GRAM: 
                    calculateValue = 1000000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    BRITISHTON{
        @Override
        public double convert(double value, WeightUnit weightUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (weightUnit) {
                case TON: 
                    calculateValue = 1.0160469088;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case BRITISHTON: 
                    calculatedValue = value;
                    return calculatedValue;
                case USTON: 
                    calculateValue = 1.12;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case POUND: 
                    calculateValue = 2240;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case OUNCE: 
                    calculateValue = 35840;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOGRAM: 
                    calculateValue = 1016.0469088;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case GRAM: 
                    calculateValue = 1016046.9088;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    USTON{
        @Override
        public double convert(double value, WeightUnit weightUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (weightUnit) {
                case TON:
                    calculateValue = 0.90718474;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case BRITISHTON:
                    calculateValue = 0.89285714285714;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case USTON:
                    calculatedValue = value;
                    return calculatedValue;
                case POUND:
                    calculateValue = 2000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case OUNCE:
                    calculateValue = 32000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOGRAM:
                    calculateValue = 907.18474;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case GRAM:
                    calculateValue = 907184.74;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    POUND{
        @Override
        public double convert(double value, WeightUnit weightUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (weightUnit) {
                case TON:
                    calculateValue = 0.00045359237;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case BRITISHTON:
                    calculateValue = 0.00044642857142857;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case USTON:
                    calculateValue = 0.0005;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case POUND:
                    calculatedValue = value;
                    return calculatedValue;
                case OUNCE:
                    calculateValue = 16;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOGRAM:
                    calculateValue = 0.45359237;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case GRAM:
                    calculateValue = 453.59237;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    OUNCE{
        @Override
        public double convert(double value, WeightUnit weightUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (weightUnit) {
                case TON:
                    calculateValue = 0.000028349523125;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case BRITISHTON:
                    calculateValue = 0.000027901785714286;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case USTON:
                    calculateValue = 0.00003125;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case POUND:
                    calculateValue = 0.0625;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case OUNCE:
                    calculatedValue = value;
                    return calculatedValue;
                case KILOGRAM:
                    calculateValue = 0.028349523125;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case GRAM:
                    calculateValue = 28.349523125;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    KILOGRAM{
        @Override
        public double convert(double value, WeightUnit weightUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (weightUnit) {
                case TON:
                    calculateValue = 0.001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case BRITISHTON:
                    calculateValue = 0.00098420652761106;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case USTON:
                    calculateValue = 0.0011023113109244;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case POUND:
                    calculateValue = 2.2046226218488;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case OUNCE:
                    calculateValue = 35.27396195;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOGRAM:
                    calculatedValue = value;
                    return calculatedValue;
                case GRAM:
                    calculateValue = 1000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    GRAM{
        @Override
        public double convert(double value, WeightUnit weightUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (weightUnit) {
                case TON:
                    calculateValue = 0.000001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case BRITISHTON:
                    calculateValue = 9.8420652761106 * Math.pow(10, -7);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case USTON:
                    calculateValue = 1.1023113109244 * Math.pow(10, -6);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case POUND:
                    calculateValue = 0.0022046226218488;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case OUNCE:
                    calculateValue = 0.03527396195;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOGRAM:
                    calculateValue = 0.001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case GRAM:
                    calculatedValue = value;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    };
    public abstract double convert(double value, WeightUnit weightUnit);
}

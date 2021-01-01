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
                    calculateValue = 1.016;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case USTON:
                    calculateValue = 1.1023113109;
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
                    calculateValue = 1.102;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case BRITISHTON:
                    calculateValue = 1.12;
                    calculatedValue = value / calculateValue;
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
                    calculateValue = 2205;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case BRITISHTON:
                    calculateValue = 2240;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case USTON:
                    calculateValue = 2000;
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
                    calculateValue = 2.205;
                    calculatedValue = value / calculateValue;
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
                    calculateValue = 35274;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case BRITISHTON:
                    calculateValue = 35840;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case USTON:
                    calculateValue = 32000;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case POUND:
                    calculateValue = 16;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case OUNCE:
                    calculatedValue = value;
                    return calculatedValue;
                case KILOGRAM:
                    calculateValue = 35.274;
                    calculatedValue = value / calculateValue;
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
                    calculateValue = 1000;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case BRITISHTON:
                    calculateValue = 1016;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case USTON:
                    calculateValue = 907;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case POUND:
                    calculateValue = 2.2046226218;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case OUNCE:
                    calculateValue = 35.2739619496;
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
                    calculateValue = 1.013 * Math.pow(10, 6);
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case USTON:
                    calculateValue = 907185;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case POUND:
                    calculateValue = 454;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case OUNCE:
                    calculateValue = 28.35;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case KILOGRAM:
                    calculateValue = 1000;
                    calculatedValue = value / calculateValue;
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

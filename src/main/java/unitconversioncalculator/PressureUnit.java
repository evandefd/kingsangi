package unitconversioncalculator;

public enum PressureUnit {
    ATOMASPHERICPRESSURE{
        @Override
        public double convert(double value, PressureUnit pressureUnit) throws IllegalArgumentException, ArithmeticException{
            double calculateValue;
            
            double calculatedValue;
            switch (pressureUnit) {
                case ATOMASPHERICPRESSURE:
                    calculatedValue = value;
                    return calculatedValue;
                case BAR:
                    calculateValue = 1.013;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case POUNDFORCEPERSQUAREINCH:
                    calculateValue = 14.696;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case TORR:
                    calculateValue = 760;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PASCAL:
                    calculateValue = 101325;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    BAR{
        @Override
        public double convert(double value, PressureUnit pressureUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (pressureUnit) {
                case ATOMASPHERICPRESSURE:
                    calculateValue = 0.986923;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case BAR:
                    calculatedValue = value;
                    return calculatedValue;
                case POUNDFORCEPERSQUAREINCH:
                    calculateValue = 14.504;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case TORR:
                    calculateValue = 750;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PASCAL:
                    calculateValue = 100000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    POUNDFORCEPERSQUAREINCH{
        @Override
        public double convert(double value, PressureUnit pressureUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (pressureUnit) {
                case ATOMASPHERICPRESSURE:
                    calculateValue = 0.068046;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case BAR:
                    calculateValue = 0.0689476;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case POUNDFORCEPERSQUAREINCH:
                    calculatedValue = value;
                    return calculatedValue;
                case TORR:
                    calculateValue = 51.714952902379;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PASCAL:
                    calculateValue = 6894.76;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    TORR{
        @Override
        public double convert(double value, PressureUnit pressureUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (pressureUnit) {
                case ATOMASPHERICPRESSURE:
                    calculateValue = 0.00131579;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case BAR:
                    calculateValue = 0.00133322;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case POUNDFORCEPERSQUAREINCH:
                    calculateValue = 0.0193368;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case TORR:
                    calculatedValue = value;
                    return calculatedValue;
                case PASCAL:
                    calculateValue = 133.322;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    PASCAL{
        @Override
        public double convert(double value, PressureUnit pressureUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (pressureUnit) {
                case ATOMASPHERICPRESSURE:
                    calculateValue = 9.8692 * Math.pow(10, -6);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case BAR:
                    calculateValue = Math.pow(10, -5);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case POUNDFORCEPERSQUAREINCH:
                    calculateValue = 0.000145038;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case TORR:
                    calculateValue = 0.00750062;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PASCAL:
                    calculatedValue = value;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    };
    public abstract double convert(double value, PressureUnit pressureUnit);
}

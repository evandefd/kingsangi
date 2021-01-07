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
                    calculateValue = 1.01325;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case POUNDFORCEPERSQUAREINCH:
                    calculateValue = 14.695949400392;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case TORR:
                    calculateValue = 759.99981998524;
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
                    calculateValue = 0.98692326671601;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case BAR:
                    calculatedValue = value;
                    return calculatedValue;
                case POUNDFORCEPERSQUAREINCH:
                    calculateValue = 14.503774389728;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case TORR:
                    calculateValue = 750.06150504341;
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
                    calculateValue = 0.068045961016531;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case BAR:
                    calculateValue = 0.06894757;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case POUNDFORCEPERSQUAREINCH:
                    calculatedValue = value;
                    return calculatedValue;
                case TORR:
                    calculateValue = 51.714918123286;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PASCAL:
                    calculateValue = 6894.757;
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
                    calculateValue = 0.0013157897853442;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case BAR:
                    calculateValue = 0.001333224;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case POUNDFORCEPERSQUAREINCH:
                    calculateValue = 0.019336780106971;
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
                    calculateValue = 0.0000098692326671601;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case BAR:
                    calculateValue = Math.pow(10, -5);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case POUNDFORCEPERSQUAREINCH:
                    calculateValue = 0.00014503774389728;
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

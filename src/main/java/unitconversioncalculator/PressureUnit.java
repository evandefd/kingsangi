package unitconversioncalculator;

import java.math.BigDecimal;

public enum PressureUnit {
    ATOMASPHERICPRESSURE{
        @Override
        public BigDecimal convert(BigDecimal value, PressureUnit pressureUnit) throws IllegalArgumentException, ArithmeticException{
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (pressureUnit) {
                case ATOMASPHERICPRESSURE:
                    calculatedValue = value;
                    return calculatedValue;
                case BAR:
                    calculateValue = "1.013";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case POUNDFORCEPERSQUAREINCH:
                    calculateValue = "14.696";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case TORR:
                    calculateValue = "760";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case PASCAL:
                    calculateValue = "101325";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    BAR{
        @Override
        public BigDecimal convert(BigDecimal value, PressureUnit pressureUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (pressureUnit) {
                case ATOMASPHERICPRESSURE:
                    calculateValue = "0.986923";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case BAR:
                    calculatedValue = value;
                    return calculatedValue;
                case POUNDFORCEPERSQUAREINCH:
                    calculateValue = "14.504";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case TORR:
                    calculateValue = "750";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case PASCAL:
                    calculateValue = "100000";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    POUNDFORCEPERSQUAREINCH{
        @Override
        public BigDecimal convert(BigDecimal value, PressureUnit pressureUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (pressureUnit) {
                case ATOMASPHERICPRESSURE:
                    calculateValue = "0.068046";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case BAR:
                    calculateValue = "0.0689476";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case POUNDFORCEPERSQUAREINCH:
                    calculatedValue = value;
                    return calculatedValue;
                case TORR:
                    calculateValue = "51.714952902379";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case PASCAL:
                    calculateValue = "6894.76";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    TORR{
        @Override
        public BigDecimal convert(BigDecimal value, PressureUnit pressureUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (pressureUnit) {
                case ATOMASPHERICPRESSURE:
                    calculateValue = "0.00131579";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case BAR:
                    calculateValue = "0.00133322";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case POUNDFORCEPERSQUAREINCH:
                    calculateValue = "0.0193368";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case TORR:
                    calculatedValue = value;
                    return calculatedValue;
                case PASCAL:
                    calculateValue = "133.322";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    PASCAL{
        @Override
        public BigDecimal convert(BigDecimal value, PressureUnit pressureUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (pressureUnit) {
                case ATOMASPHERICPRESSURE:
                    calculateValue = Double.toString(9.8692 * Math.pow(10, -6));
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case BAR:
                    calculateValue = Double.toString(Math.pow(10, -5));
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case POUNDFORCEPERSQUAREINCH:
                    calculateValue = "0.000145038";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case TORR:
                    calculateValue = "0.00750062";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case PASCAL:
                    calculatedValue = value;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    };
    public abstract BigDecimal convert(BigDecimal value, PressureUnit pressureUnit);
}

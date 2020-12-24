import java.math.BigDecimal;

public enum PressureUnitConvertor {
    ATOMASPHERICPRESSURE{
        @Override
        BigDecimal convert(BigDecimal value, PressureUnitConvertor pressureUnit) throws IllegalArgumentException, ArithmeticException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (pressureUnit){
                case ATOMASPHERICPRESSURE:
                    calculated_value = value;
                    return calculated_value;
                case BAR:
                    calculatevalue = "1.013";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case POUNDFORCEPERSQUAREINCH:
                    calculatevalue = "14.696";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case TORR:
                    calculatevalue = "760";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case PASCAL:
                    calculatevalue = "101325";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    BAR{
        @Override
        BigDecimal convert(BigDecimal value, PressureUnitConvertor pressureUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (pressureUnit){
                case ATOMASPHERICPRESSURE:
                    calculatevalue = "0.986923";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case BAR:
                    calculated_value = value;
                    return calculated_value;
                case POUNDFORCEPERSQUAREINCH:
                    calculatevalue = "14.504";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case TORR:
                    calculatevalue = "750";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case PASCAL:
                    calculatevalue = "100000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    POUNDFORCEPERSQUAREINCH{
        @Override
        BigDecimal convert(BigDecimal value, PressureUnitConvertor pressureUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (pressureUnit){
                case ATOMASPHERICPRESSURE:
                    calculatevalue = "0.068046";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case BAR:
                    calculatevalue = "0.0689476";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case POUNDFORCEPERSQUAREINCH:
                    calculated_value = value;
                    return calculated_value;
                case TORR:
                    calculatevalue = "51.714952902379";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case PASCAL:
                    calculatevalue = "6894.76";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    TORR{
        @Override
        BigDecimal convert(BigDecimal value, PressureUnitConvertor pressureUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (pressureUnit){
                case ATOMASPHERICPRESSURE:
                    calculatevalue = "0.00131579";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case BAR:
                    calculatevalue = "0.00133322";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case POUNDFORCEPERSQUAREINCH:
                    calculatevalue = "0.0193368";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case TORR:
                    calculated_value = value;
                    return calculated_value;
                case PASCAL:
                    calculatevalue = "133.322";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    PASCAL{
        @Override
        BigDecimal convert(BigDecimal value, PressureUnitConvertor pressureUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (pressureUnit){
                case ATOMASPHERICPRESSURE:
                    calculatevalue = Double.toString(9.8692 * Math.pow(10, -6));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case BAR:
                    calculatevalue = Double.toString(Math.pow(10, -5));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case POUNDFORCEPERSQUAREINCH:
                    calculatevalue = "0.000145038";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case TORR:
                    calculatevalue = "0.00750062";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case PASCAL:
                    calculated_value = value;
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    };
    abstract BigDecimal convert(BigDecimal value, PressureUnitConvertor pressureUnit);
}

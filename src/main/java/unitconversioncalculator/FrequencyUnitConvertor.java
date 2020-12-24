package java.unitconvertor;
import java.math.BigDecimal;

public enum FrequencyUnitConvertor {
    HERTZ{
        @Override
        BigDecimal convert(BigDecimal value, FrequencyUnitConvertor frequencyUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (frequencyUnit){
                case HERTZ:
                    calculated_value = value;
                    return calculated_value;
                case KILOHERTZ:
                    calculatevalue = "0.001";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MEGAHERTZ:
                    calculatevalue = Double.toString(Math.pow(10, -6));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case GIGAHERTZ:
                    calculatevalue = Double.toString(Math.pow(10, -9));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    KILOHERTZ{
        @Override
        BigDecimal convert(BigDecimal value, FrequencyUnitConvertor frequencyUnit) {
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (frequencyUnit){
                case HERTZ:
                    calculatevalue = "1000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOHERTZ:
                    calculated_value = value;
                    return calculated_value;
                case MEGAHERTZ:
                    calculatevalue = "0.001";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case GIGAHERTZ:
                    calculatevalue = Double.toString(Math.pow(10, -6));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    MEGAHERTZ{
        @Override
        BigDecimal convert(BigDecimal value, FrequencyUnitConvertor frequencyUnit) {
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (frequencyUnit){
                case HERTZ:
                    calculatevalue = Double.toString(Math.pow(10, 6));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOHERTZ:
                    calculatevalue = "1000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MEGAHERTZ:
                    calculated_value = value;
                    return calculated_value;
                case GIGAHERTZ:
                    calculatevalue = "0.001";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    GIGAHERTZ{
        @Override
        BigDecimal convert(BigDecimal value, FrequencyUnitConvertor frequencyUnit) {
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (frequencyUnit){
                case HERTZ:
                    calculatevalue = Double.toString(Math.pow(10, 9));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOHERTZ:
                    calculatevalue = Double.toString(Math.pow(10, 6));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MEGAHERTZ:
                    calculatevalue = "1000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case GIGAHERTZ:
                    calculated_value = value;
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    };
    abstract BigDecimal convert(BigDecimal value, FrequencyUnitConvertor frequencyUnit);
}

package unitconversioncalculator;
import java.math.BigDecimal;

public enum WeightUniutConvertor {
    TON{
        @Override
        BigDecimal convert(BigDecimal value, WeightUniutConvertor weightUnit) throws IllegalArgumentException{
            String calculatevalue;
            BigDecimal string_to_bigdecimal;
            BigDecimal calculated_value;
            switch (weightUnit) {
                case TON: {
                    calculated_value = value;
                    return calculated_value;
                }
                case BRITISH_TON: {
                    calculatevalue = "0.9842065276";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case US_TON: {
                    calculatevalue = "1.1023113109";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case POUND: {
                    calculatevalue = "2204.6226218488";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case OUNCE: {
                    calculatevalue = "35273.96194958";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case KILOGRAM: {
                    calculatevalue = "1000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case GRAM: {
                    calculatevalue = "1000000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
            }
            throw new IllegalArgumentException();
        }
    },
    BRITISH_TON{
        @Override
        BigDecimal convert(BigDecimal value, WeightUniutConvertor weightUnit) throws IllegalArgumentException{
            String calculatevalue;
            BigDecimal string_to_bigdecimal;
            BigDecimal calculated_value;
            switch (weightUnit) {
                case TON: {
                    calculatevalue = "1.0160469088";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case BRITISH_TON: {
                    calculated_value = value;
                    return calculated_value;
                }
                case US_TON: {
                    calculatevalue = "1.12";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case POUND: {
                    calculatevalue = "2240";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case OUNCE: {
                    calculatevalue = "35840";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case KILOGRAM: {
                    calculatevalue = "1016.0469088";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case GRAM: {
                    calculatevalue = "1016046.9088";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
            }
            throw new IllegalArgumentException();
        }
    },
    US_TON{
        @Override
        BigDecimal convert(BigDecimal value, WeightUniutConvertor weightUnit) throws IllegalArgumentException{
            String calculatevalue;
            BigDecimal string_to_bigdecimal;
            BigDecimal calculated_value;
            switch (weightUnit) {
                case TON: {
                    calculatevalue = "0.90718474";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case BRITISH_TON: {
                    calculatevalue = "0.8928571429";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case US_TON: {
                    calculated_value = value;
                    return calculated_value;
                }
                case POUND: {
                    calculatevalue = "2000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case OUNCE: {
                    calculatevalue = "32000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case KILOGRAM: {
                    calculatevalue = "907.18474";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case GRAM: {
                    calculatevalue = "907184.74";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
            }
            throw new IllegalArgumentException();
        }
    },
    POUND{
        @Override
        BigDecimal convert(BigDecimal value, WeightUniutConvertor weightUnit) throws IllegalArgumentException{
            String calculatevalue;
            BigDecimal string_to_bigdecimal;
            BigDecimal calculated_value;
            switch (weightUnit) {
                case TON: {
                    calculatevalue = "0.0004535924";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case BRITISH_TON: {
                    calculatevalue = "0.0004464286";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case US_TON: {
                    calculatevalue = "0.0005";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case POUND: {
                    calculated_value = value;
                    return calculated_value;
                }
                case OUNCE: {
                    calculatevalue = "16";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case KILOGRAM: {
                    calculatevalue = "0.45359237";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case GRAM: {
                    calculatevalue = "453.59237";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
            }
            throw new IllegalArgumentException();
        }
    },
    OUNCE{
        @Override
        BigDecimal convert(BigDecimal value, WeightUniutConvertor weightUnit) throws IllegalArgumentException{
            String calculatevalue;
            BigDecimal string_to_bigdecimal;
            BigDecimal calculated_value;
            switch (weightUnit) {
                case TON: {
                    calculatevalue = "0.0000283495";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case BRITISH_TON: {
                    calculatevalue = "0.0000279018";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case US_TON: {
                    calculatevalue = "0.00003125";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case POUND: {
                    calculatevalue = "0.0625";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case OUNCE: {
                    calculated_value = value;
                    return calculated_value;
                }
                case KILOGRAM: {
                    calculatevalue = "0.0283495231";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case GRAM: {
                    calculatevalue = "28.349523125";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
            }
            throw new IllegalArgumentException();
        }
    },
    KILOGRAM{
        @Override
        BigDecimal convert(BigDecimal value, WeightUniutConvertor weightUnit) throws IllegalArgumentException{
            String calculatevalue;
            BigDecimal string_to_bigdecimal;
            BigDecimal calculated_value;
            switch (weightUnit) {
                case TON: {
                    calculatevalue = "0.001";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case BRITISH_TON: {
                    calculatevalue = "0.0009842065";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case US_TON: {
                    calculatevalue = "0.0011023113";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case POUND: {
                    calculatevalue = "2.2046226218";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case OUNCE: {
                    calculatevalue = "35.2739619496";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case KILOGRAM: {
                    calculated_value = value;
                    return calculated_value;
                }
                case GRAM: {
                    calculatevalue = "1000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
            }
            throw new IllegalArgumentException();
        }
    },
    GRAM{
        @Override
        BigDecimal convert(BigDecimal value, WeightUniutConvertor weightUnit) throws IllegalArgumentException{
            String calculatevalue;
            BigDecimal string_to_bigdecimal;
            BigDecimal calculated_value;
            switch (weightUnit) {
                case TON: {
                    calculatevalue = "0.000001";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case BRITISH_TON: {
                    calculatevalue = Double.toString(9.84206528 * Math.pow(10, -7));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case US_TON: {
                    calculatevalue = "0.0000011023";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case POUND: {
                    calculatevalue = "0.0022046226";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case OUNCE: {
                    calculatevalue = "0.0352739619";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case KILOGRAM: {
                    calculatevalue = "0.001";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case GRAM: {
                    calculated_value = value;
                    return calculated_value;
                }
            }
            throw new IllegalArgumentException();
        }
    };
    abstract BigDecimal convert(BigDecimal value, WeightUniutConvertor weightUnit);
}

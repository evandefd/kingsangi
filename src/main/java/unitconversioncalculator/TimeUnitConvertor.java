package unitconversioncalculator;

import java.math.BigDecimal;

public enum TimeUnitConvertor {
    SECOND{
        @Override
        BigDecimal convert(BigDecimal value, TimeUnitConvertor timeUnit) {
            String calculatevalue;
            BigDecimal string_to_bigdecimal;
            BigDecimal calculated_value;
            switch (timeUnit) {
                case SECOND: {
                    calculated_value = value;
                    return calculated_value;
                }
                case MINUTE: {
                    calculatevalue = "0.0166666667";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case HOUR: {
                    calculatevalue = "0.0002777778";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case DAY: {
                    calculatevalue = "0.0000115741";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case WEEK: {
                    calculatevalue = "0.0000016534";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
            }
            throw new IllegalArgumentException();
        }
    },
    MINUTE{
        @Override
        BigDecimal convert(BigDecimal value, TimeUnitConvertor timeUnit) {
            String calculatevalue;
            BigDecimal string_to_bigdecimal;
            BigDecimal calculated_value;
            switch (timeUnit) {
                case SECOND: {
                    calculatevalue = "60";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case MINUTE: {
                    calculated_value = value;
                    return calculated_value;
                }
                case HOUR: {
                    calculatevalue = "0.0166666667";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case DAY: {
                    calculatevalue = "0.0006944444";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case WEEK: {
                    calculatevalue = "0.0000992063";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
            }
            throw new IllegalArgumentException();
        }
    },
    HOUR{
        @Override
        BigDecimal convert(BigDecimal value, TimeUnitConvertor timeUnit) {
            String calculatevalue;
            BigDecimal string_to_bigdecimal;
            BigDecimal calculated_value;
            switch (timeUnit) {
                case SECOND: {
                    calculatevalue = "3600";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case MINUTE: {
                    calculatevalue = "60";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case HOUR: {
                    calculated_value = value;
                    return calculated_value;
                }
                case DAY: {
                    calculatevalue = "0.0416666667";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case WEEK: {
                    calculatevalue = "0.005952381";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
            }
            throw new IllegalArgumentException();
        }
    },
    DAY{
        @Override
        BigDecimal convert(BigDecimal value, TimeUnitConvertor timeUnit) {
            String calculatevalue;
            BigDecimal string_to_bigdecimal;
            BigDecimal calculated_value;
            switch (timeUnit) {
                case SECOND: {
                    calculatevalue = "86400";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case MINUTE: {
                    calculatevalue = "1440";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case HOUR: {
                    calculatevalue = "24";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case DAY: {
                    calculated_value = value;
                    return calculated_value;
                }
                case WEEK: {
                    calculatevalue = "0.1428571429";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
            }
            throw new IllegalArgumentException();
        }
    },
    WEEK{
        @Override
        BigDecimal convert(BigDecimal value, TimeUnitConvertor timeUnit) {
            String calculatevalue;
            BigDecimal string_to_bigdecimal;
            BigDecimal calculated_value;
            switch (timeUnit) {
                case SECOND: {
                    calculatevalue = "604800";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case MINUTE: {
                    calculatevalue = "10080";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case HOUR: {
                    calculatevalue = "168";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case DAY: {
                    calculatevalue = "7";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                }
                case WEEK: {
                    calculated_value = value;
                    return calculated_value;
                }
            }
            throw new IllegalArgumentException();
        }
    };
    abstract BigDecimal convert(BigDecimal value, TimeUnitConvertor timeUnit);
}

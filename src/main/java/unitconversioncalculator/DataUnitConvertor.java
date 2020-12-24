import java.math.BigDecimal;
import java.math.RoundingMode;

public enum DataUnitConvertor {
    BIT{
        @Override
        BigDecimal convert(BigDecimal value, DataUnitConvertor dataUnit) throws IllegalArgumentException {
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (dataUnit) {
                case BIT:
                    calculated_value = value;
                    return calculated_value;
                case BYTE:
                    calculatevalue = "0.125";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOBYTE:
                    calculatevalue = "0.0001220703";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MEGABYTE:
                    calculatevalue = Double.toString(1.19209290 * Math.pow(10, -7));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case GIGABYTE:
                    calculatevalue = Double.toString(1.16415322 * Math.pow(10, -10));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case TERABYTE:
                    calculatevalue = Double.toString(1.13686838 * Math.pow(10, -13));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    BYTE{
        @Override
        BigDecimal convert(BigDecimal value, DataUnitConvertor dataUnit) throws IllegalArgumentException {
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (dataUnit) {
                case BIT:
                    calculatevalue = "8";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case BYTE:
                    calculated_value = value;
                    return calculated_value;
                case KILOBYTE:
                    calculatevalue = "0.0009765625";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MEGABYTE:
                    calculatevalue = Double.toString(9.53674316 * Math.pow(10, -7));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case GIGABYTE:
                    calculatevalue = Double.toString(9.31322575 * Math.pow(10, -10));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case TERABYTE:
                    calculatevalue = Double.toString(9.09494702 * Math.pow(10, -13));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    KILOBYTE{
        @Override
        BigDecimal convert(BigDecimal value, DataUnitConvertor dataUnit) throws IllegalArgumentException {
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (dataUnit) {
                case BIT:
                    calculatevalue = "8192";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case BYTE:
                    calculatevalue = "1024";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOBYTE:
                    calculated_value = value;
                    return calculated_value;
                case MEGABYTE:
                    calculatevalue = "0.0009765625";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case GIGABYTE:
                    calculatevalue = Double.toString(9.53674316 * Math.pow(10, -7));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case TERABYTE:
                    calculatevalue = Double.toString(9.31322575 * Math.pow(10, -10));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    MEGABYTE{
        @Override
        BigDecimal convert(BigDecimal value, DataUnitConvertor dataUnit) throws IllegalArgumentException {
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (dataUnit) {
                case BIT:
                    calculatevalue = "8388608";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case BYTE:
                    calculatevalue = "1048576";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOBYTE:
                    calculatevalue = "1024";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MEGABYTE:
                    calculated_value = value;
                    return calculated_value;
                case GIGABYTE:
                    calculatevalue = "0.0009765625";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case TERABYTE:
                    calculatevalue = Double.toString(9.53674316 * Math.pow(10, -7));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    GIGABYTE{
        @Override
        BigDecimal convert(BigDecimal value, DataUnitConvertor dataUnit) throws IllegalArgumentException {
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (dataUnit) {
                case BIT:
                    calculatevalue = "8589934592";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case BYTE:
                    calculatevalue = "1073741824";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOBYTE:
                    calculatevalue = "1048576";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MEGABYTE:
                    calculatevalue = "1024";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case GIGABYTE:
                    calculated_value = value;
                    return calculated_value;
                case TERABYTE:
                    calculatevalue = "0.0009765625";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    TERABYTE{
        @Override
        BigDecimal convert(BigDecimal value, DataUnitConvertor dataUnit) throws IllegalArgumentException {
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (dataUnit) {
                case BIT:
                    calculatevalue = "2796093022208";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case BYTE:
                    calculatevalue = "1099511627776.0";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOBYTE:
                    calculatevalue = "1073741824";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MEGABYTE:
                    calculatevalue = "1048576";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case GIGABYTE:
                    calculatevalue = "1024";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case TERABYTE:
                    calculated_value = value;
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    };
    abstract BigDecimal convert(BigDecimal value, DataUnitConvertor dataUnit);
}

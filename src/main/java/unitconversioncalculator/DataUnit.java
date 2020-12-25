package unitconversioncalculator;

import java.math.BigDecimal;

public enum DataUnit {
    BIT{
        @Override
        public BigDecimal convert(BigDecimal value, DataUnit dataUnit) throws IllegalArgumentException {
            String calculateValue;
            BigDecimal stringToBigDeicmal;
            BigDecimal calculatedValue;
            switch (dataUnit) {
                case BIT:
                    calculatedValue = value;
                    return calculatedValue;
                case BYTE:
                    calculateValue = "0.125";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case KILOBYTE:
                    calculateValue = "0.0001220703";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case MEGABYTE:
                    calculateValue = Double.toString(1.19209290 * Math.pow(10, -7));
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case GIGABYTE:
                    calculateValue = Double.toString(1.16415322 * Math.pow(10, -10));
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case TERABYTE:
                    calculateValue = Double.toString(1.13686838 * Math.pow(10, -13));
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    BYTE{
        @Override
        public BigDecimal convert(BigDecimal value, DataUnit dataUnit) throws IllegalArgumentException {
            String calculateValue;
            BigDecimal stringToBigDeicmal;
            BigDecimal calculatedValue;
            switch (dataUnit) {
                case BIT:
                    calculateValue = "8";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case BYTE:
                    calculatedValue = value;
                    return calculatedValue;
                case KILOBYTE:
                    calculateValue = "0.0009765625";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case MEGABYTE:
                    calculateValue = Double.toString(9.53674316 * Math.pow(10, -7));
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case GIGABYTE:
                    calculateValue = Double.toString(9.31322575 * Math.pow(10, -10));
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case TERABYTE:
                    calculateValue = Double.toString(9.09494702 * Math.pow(10, -13));
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    KILOBYTE{
        @Override
        public BigDecimal convert(BigDecimal value, DataUnit dataUnit) throws IllegalArgumentException {
            String calculateValue;
            BigDecimal stringToBigDeicmal;
            BigDecimal calculatedValue;
            switch (dataUnit) {
                case BIT:
                    calculateValue = "8192";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case BYTE:
                    calculateValue = "1024";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case KILOBYTE:
                    calculatedValue = value;
                    return calculatedValue;
                case MEGABYTE:
                    calculateValue = "0.0009765625";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case GIGABYTE:
                    calculateValue = Double.toString(9.53674316 * Math.pow(10, -7));
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case TERABYTE:
                    calculateValue = Double.toString(9.31322575 * Math.pow(10, -10));
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    MEGABYTE{
        @Override
        public BigDecimal convert(BigDecimal value, DataUnit dataUnit) throws IllegalArgumentException {
            String calculateValue;
            BigDecimal stringToBigDeicmal;
            BigDecimal calculatedValue;
            switch (dataUnit) {
                case BIT:
                    calculateValue = "8388608";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case BYTE:
                    calculateValue = "1048576";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case KILOBYTE:
                    calculateValue = "1024";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case MEGABYTE:
                    calculatedValue = value;
                    return calculatedValue;
                case GIGABYTE:
                    calculateValue = "0.0009765625";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case TERABYTE:
                    calculateValue = Double.toString(9.53674316 * Math.pow(10, -7));
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    GIGABYTE{
        @Override
        public BigDecimal convert(BigDecimal value, DataUnit dataUnit) throws IllegalArgumentException {
            String calculateValue;
            BigDecimal stringToBigDeicmal;
            BigDecimal calculatedValue;
            switch (dataUnit) {
                case BIT:
                    calculateValue = "8589934592";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case BYTE:
                    calculateValue = "1073741824";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case KILOBYTE:
                    calculateValue = "1048576";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case MEGABYTE:
                    calculateValue = "1024";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case GIGABYTE:
                    calculatedValue = value;
                    return calculatedValue;
                case TERABYTE:
                    calculateValue = "0.0009765625";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    TERABYTE{
        @Override
        public BigDecimal convert(BigDecimal value, DataUnit dataUnit) throws IllegalArgumentException {
            String calculateValue;
            BigDecimal stringToBigDeicmal;
            BigDecimal calculatedValue;
            switch (dataUnit) {
                case BIT:
                    calculateValue = "2796093022208";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case BYTE:
                    calculateValue = "1099511627776.0";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case KILOBYTE:
                    calculateValue = "1073741824";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case MEGABYTE:
                    calculateValue = "1048576";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case GIGABYTE:
                    calculateValue = "1024";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case TERABYTE:
                    calculatedValue = value;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    };
    public abstract BigDecimal convert(BigDecimal value, DataUnit dataUnit);
}

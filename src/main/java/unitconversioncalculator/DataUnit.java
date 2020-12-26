package unitconversioncalculator;

public enum DataUnit {
    BIT{
        @Override
        public double convert(double value, DataUnit dataUnit) throws IllegalArgumentException {
            double calculateValue;
            double calculatedValue;
            switch (dataUnit) {
                case BIT:
                    calculatedValue = value;
                    return calculatedValue;
                case BYTE:
                    calculateValue = 0.125;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOBYTE:
                    calculateValue = 0.0001220703;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MEGABYTE:
                    calculateValue = 1.19209290 * Math.pow(10, -7);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case GIGABYTE:
                    calculateValue = 1.16415322 * Math.pow(10, -10);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case TERABYTE:
                    calculateValue = 1.13686838 * Math.pow(10, -13);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PETABYTE:
                    calculateValue = 1.1102 * Math.pow(10, -16);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    BYTE{
        @Override
        public double convert(double value, DataUnit dataUnit) throws IllegalArgumentException {
            double calculateValue;
            double calculatedValue;
            switch (dataUnit) {
                case BIT:
                    calculateValue = 8;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case BYTE:
                    calculatedValue = value;
                    return calculatedValue;
                case KILOBYTE:
                    calculateValue = 0.0009765625;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MEGABYTE:
                    calculateValue = 9.53674316 * Math.pow(10, -7);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case GIGABYTE:
                    calculateValue = 9.31322575 * Math.pow(10, -10);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case TERABYTE:
                    calculateValue = 9.09494702 * Math.pow(10, -13);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PETABYTE:
                    calculateValue = 8.8818 * Math.pow(10, -16);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    KILOBYTE{
        @Override
        public double convert(double value, DataUnit dataUnit) throws IllegalArgumentException {
            double calculateValue;
            double calculatedValue;
            switch (dataUnit) {
                case BIT:
                    calculateValue = 8192;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case BYTE:
                    calculateValue = 1024;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOBYTE:
                    calculatedValue = value;
                    return calculatedValue;
                case MEGABYTE:
                    calculateValue = 0.0009765625;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case GIGABYTE:
                    calculateValue = 9.53674316 * Math.pow(10, -7);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case TERABYTE:
                    calculateValue = 9.31322575 * Math.pow(10, -10);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PETABYTE:
                    calculateValue = 9.0949 * Math.pow(10, -13);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    MEGABYTE{
        @Override
        public double convert(double value, DataUnit dataUnit) throws IllegalArgumentException {
            double calculateValue;
            double calculatedValue;
            switch (dataUnit) {
                case BIT:
                    calculateValue = 8388608;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case BYTE:
                    calculateValue = 1048576;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOBYTE:
                    calculateValue = 1024;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MEGABYTE:
                    calculatedValue = value;
                    return calculatedValue;
                case GIGABYTE:
                    calculateValue = 0.0009765625;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case TERABYTE:
                    calculateValue = 9.53674316 * Math.pow(10, -7);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PETABYTE:
                    calculateValue = 9.3132 * Math.pow(10, -10);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    GIGABYTE{
        @Override
        public double convert(double value, DataUnit dataUnit) throws IllegalArgumentException {
            double calculateValue;
            double calculatedValue;
            switch (dataUnit) {
                case BIT:
                    calculateValue = 8589934592.0;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case BYTE:
                    calculateValue = 1073741824;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOBYTE:
                    calculateValue = 1048576;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MEGABYTE:
                    calculateValue = 1024;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case GIGABYTE:
                    calculatedValue = value;
                    return calculatedValue;
                case TERABYTE:
                    calculateValue = 0.0009765625;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PETABYTE:
                    calculateValue = 9.5367 * Math.pow(10, -7);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    TERABYTE{
        @Override
        public double convert(double value, DataUnit dataUnit) throws IllegalArgumentException {
            double calculateValue;
            double calculatedValue;
            switch (dataUnit) {
                case BIT:
                    calculateValue = 2796093022208.0;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case BYTE:
                    calculateValue = 1099511627776.0;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOBYTE:
                    calculateValue = 1073741824;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MEGABYTE:
                    calculateValue = 1048576;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case GIGABYTE:
                    calculateValue = 1024;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case TERABYTE:
                    calculatedValue = value;
                    return calculatedValue;
                case PETABYTE:
                    calculateValue = 0.000977;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    PETABYTE{
        @Override
        public double convert(double value, DataUnit dataUnit) {
            double calculateValue;
            double calculatedValue;
            switch (dataUnit) {
                case BIT:
                    calculateValue = 9.0072 * Math.pow(10, 15);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case BYTE:
                    calculateValue = 1.1259 * Math.pow(10, 15);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOBYTE:
                    calculateValue = 1.0995 * Math.pow(10, 12);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MEGABYTE:
                    calculateValue = 1.0737 * Math.pow(10, 9);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case GIGABYTE:
                    calculateValue = 1048576;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case TERABYTE:
                    calculateValue = 1024;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PETABYTE:
                    calculatedValue = value;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    };
    public abstract double convert(double value, DataUnit dataUnit);
}

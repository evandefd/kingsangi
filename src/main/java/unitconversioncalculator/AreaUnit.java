package unitconversioncalculator;

public enum AreaUnit {
    ACRE{
        @Override
        public double convert(double value, AreaUnit areaUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculatedValue = value;
                    return calculatedValue;
                case ARE:
                    calculateValue = 40.468564224;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case HECTARE:
                    calculateValue = 0.4046856422;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_CENTIMETER:
                    calculateValue = 40468564.224;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_FEET:
                    calculateValue = 43560;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_INCH:
                    calculateValue = 6272640;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_METER:
                    calculateValue = 4046.8564224;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PYEONG:
                    calculateValue = 1224.1741136825;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    ARE {
        @Override
        public double convert(double value, AreaUnit areaUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculateValue = 0.0247105381;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case ARE:
                    calculatedValue = value;
                    return calculatedValue;
                case HECTARE:
                    calculateValue = 0.01;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_CENTIMETER:
                    calculateValue = 1000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_FEET:
                    calculateValue = 1076.391041671;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_INCH:
                    calculateValue = 155000.31000062;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_METER:
                    calculateValue = 100;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PYEONG:
                    calculateValue = 30.2500011344;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    HECTARE{
        @Override
        public double convert(double value, AreaUnit areaUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculateValue = 2.4710538147;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case ARE:
                    calculateValue = 100;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case HECTARE:
                    calculatedValue = value;
                    return calculatedValue;
                case SQUARE_CENTIMETER:
                    calculateValue = 100000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_FEET:
                    calculateValue = 107639.1041671;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_INCH:
                    calculateValue = 15500031.000062;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_METER:
                    calculateValue = 10000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PYEONG:
                    calculateValue = 3025.0001134375;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    SQUARE_CENTIMETER{
        @Override
        public double convert(double value, AreaUnit areaUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculateValue = 2.47105381 * Math.pow(10, -8);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case ARE:
                    calculateValue = Math.pow(10, -6);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case HECTARE:
                    calculateValue = Math.pow(10, -8);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_CENTIMETER:
                    calculatedValue = value;
                    return calculatedValue;
                case SQUARE_FEET:
                    calculateValue = 0.00107391;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_INCH:
                    calculateValue = 0.15500031;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_METER:
                    calculateValue = 0.0001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PYEONG:
                    calculateValue = 0.00003025;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    SQUARE_FEET{
        @Override
        public double convert(double value, AreaUnit areaUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculateValue = 0.0000229568;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case ARE:
                    calculateValue = 0.0009290304;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case HECTARE:
                    calculateValue = 0.0000092903;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_CENTIMETER:
                    calculateValue = 929.0304;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_FEET:
                    calculatedValue = value;
                    return calculatedValue;
                case SQUARE_INCH:
                    calculateValue = 144;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_METER:
                    calculateValue = 0.09290304;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PYEONG:
                    calculateValue = 0.0281031707;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    SQUARE_INCH{
        @Override
        public double convert(double value, AreaUnit areaUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculateValue = 1.59422508 * Math.pow(10, -7);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case ARE:
                    calculateValue = 0.0000064516;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case HECTARE:
                    calculateValue = 6.45160000 * Math.pow(10, -8);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_CENTIMETER:
                    calculateValue = 6.4516;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_FEET:
                    calculateValue = 0.0069444444;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_INCH:
                    calculatedValue = value;
                    return calculatedValue;
                case SQUARE_METER:
                    calculateValue = 0.00064516;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PYEONG:
                    calculateValue = 0.0001951609;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    SQUARE_METER{
        @Override
        public double convert(double value, AreaUnit areaUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculateValue = 0.0002471054;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case ARE:
                    calculateValue = 0.01;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case HECTARE:
                    calculateValue = 0.0001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_CENTIMETER:
                    calculateValue = 10000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_FEET:
                    calculateValue = 10.7639104167;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_INCH:
                    calculateValue = 1550.0031000062;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_METER:
                    calculatedValue = value;
                    return calculatedValue;
                case PYEONG:
                    calculateValue = 0.3025000113;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    PYEONG{
        @Override
        public double convert(double value, AreaUnit areaUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculateValue = 0.0008168773;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case ARE:
                    calculateValue = 0.03305785;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case HECTARE:
                    calculateValue = 0.0003305785;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_CENTIMETER:
                    calculateValue = 33057.85;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_FEET:
                    calculateValue = 35.5831735969;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_INCH:
                    calculateValue = 5123.946997954;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARE_METER:
                    calculateValue = 3.305785;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PYEONG:
                    calculatedValue = value;
                    return calculatedValue;
            }
                throw new IllegalArgumentException();
        }
    };
    public abstract double convert(double value, AreaUnit areaUnit);
}

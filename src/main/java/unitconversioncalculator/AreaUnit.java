package unitconversioncalculator;
import java.math.BigDecimal;

public enum AreaUnit {
    ACRE{
        @Override
        public BigDecimal convert(BigDecimal value, AreaUnit areaUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDeicmal;
            BigDecimal calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculatedValue = value;
                    return calculatedValue;
                case ARE:
                    calculateValue = "40.468564224";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case HECTARE:
                    calculateValue = "0.4046856422";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_CENTIMETER:
                    calculateValue = "40468564.224";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_FEET:
                    calculateValue = "43560";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_INCH:
                    calculateValue = "6272640";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_METER:
                    calculateValue = "4046.8564224";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case PYEONG:
                    calculateValue = "1224.1741136825";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    ARE {
        @Override
        public BigDecimal convert(BigDecimal value, AreaUnit areaUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDeicmal;
            BigDecimal calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculateValue = "0.0247105381";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case ARE:
                    calculatedValue = value;
                    return calculatedValue;
                case HECTARE:
                    calculateValue = "0.01";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_CENTIMETER:
                    calculateValue = "1000";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_FEET:
                    calculateValue = "1076.391041671";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_INCH:
                    calculateValue = "155000.31000062";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_METER:
                    calculateValue = "100";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case PYEONG:
                    calculateValue = "30.2500011344";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    HECTARE{
        @Override
        public BigDecimal convert(BigDecimal value, AreaUnit areaUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDeicmal;
            BigDecimal calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculateValue = "2.4710538147";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case ARE:
                    calculateValue = "100";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case HECTARE:
                    calculatedValue = value;
                    return calculatedValue;
                case SQUARE_CENTIMETER:
                    calculateValue = "100000";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_FEET:
                    calculateValue = "107639.1041671";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_INCH:
                    calculateValue = "15500031.000062";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_METER:
                    calculateValue = "10000";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case PYEONG:
                    calculateValue = "3025.0001134375";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    SQUARE_CENTIMETER{
        @Override
        public BigDecimal convert(BigDecimal value, AreaUnit areaUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDeicmal;
            BigDecimal calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculateValue = Double.toString(2.47105381 * Math.pow(10, -8));
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case ARE:
                    calculateValue = Double.toString(Math.pow(10, -6));
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case HECTARE:
                    calculateValue = Double.toString(Math.pow(10, -8));
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_CENTIMETER:
                    calculatedValue = value;
                    return calculatedValue;
                case SQUARE_FEET:
                    calculateValue = "0.00107391";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_INCH:
                    calculateValue = "0.15500031";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_METER:
                    calculateValue = "0.0001";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case PYEONG:
                    calculateValue = "0.00003025";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    SQUARE_FEET{
        @Override
        public BigDecimal convert(BigDecimal value, AreaUnit areaUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDeicmal;
            BigDecimal calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculateValue = "0.0000229568";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case ARE:
                    calculateValue = "0.0009290304";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case HECTARE:
                    calculateValue = "0.0000092903";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_CENTIMETER:
                    calculateValue = "929.0304";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_FEET:
                    calculatedValue = value;
                    return calculatedValue;
                case SQUARE_INCH:
                    calculateValue = "144";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_METER:
                    calculateValue = "0.09290304";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case PYEONG:
                    calculateValue = "0.0281031707";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    SQUARE_INCH{
        @Override
        public BigDecimal convert(BigDecimal value, AreaUnit areaUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDeicmal;
            BigDecimal calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculateValue = Double.toString(1.59422508 * Math.pow(10, -7));
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case ARE:
                    calculateValue = "0.0000064516";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case HECTARE:
                    calculateValue = Double.toString(6.45160000 * Math.pow(10, -8));
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_CENTIMETER:
                    calculateValue = "6.4516";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_FEET:
                    calculateValue = "0.0069444444";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_INCH:
                    calculatedValue = value;
                    return calculatedValue;
                case SQUARE_METER:
                    calculateValue = "0.00064516";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case PYEONG:
                    calculateValue = "0.0001951609";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    SQUARE_METER{
        @Override
        public BigDecimal convert(BigDecimal value, AreaUnit areaUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDeicmal;
            BigDecimal calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculateValue = "0.0002471054";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case ARE:
                    calculateValue = "0.01";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case HECTARE:
                    calculateValue = "0.0001";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_CENTIMETER:
                    calculateValue = "10000";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_FEET:
                    calculateValue = "10.7639104167";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_INCH:
                    calculateValue = "1550.0031000062";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_METER:
                    calculatedValue = value;
                    return calculatedValue;
                case PYEONG:
                    calculateValue = "0.3025000113";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    PYEONG{
        @Override
        public BigDecimal convert(BigDecimal value, AreaUnit areaUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDeicmal;
            BigDecimal calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculateValue = "0.0008168773";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case ARE:
                    calculateValue = "0.03305785";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case HECTARE:
                    calculateValue = "0.0003305785";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_CENTIMETER:
                    calculateValue = "33057.85";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_FEET:
                    calculateValue = "35.5831735969";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_INCH:
                    calculateValue = "5123.946997954";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case SQUARE_METER:
                    calculateValue = "3.305785";
                    stringToBigDeicmal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDeicmal);
                    return calculatedValue;
                case PYEONG:
                    calculatedValue = value;
                    return calculatedValue;
            }
                throw new IllegalArgumentException();
        }
    };
    public abstract BigDecimal convert(BigDecimal value, AreaUnit areaUnit);
}

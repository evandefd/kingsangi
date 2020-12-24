import java.math.BigDecimal;
import java.math.RoundingMode;

public enum AreaUnitConvertor {
    ACRE{
        @Override
        BigDecimal convert(BigDecimal value, AreaUnitConvertor areaUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (areaUnit){
                case ACRE:
                    calculated_value = value;
                    return calculated_value;
                case ARE:
                    calculatevalue = "40.468564224";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case HECTARE:
                    calculatevalue = "0.4046856422";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_CENTIMETER:
                    calculatevalue = "40468564.224";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_FEET:
                    calculatevalue = "43560";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_INCH:
                    calculatevalue = "6272640";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_METER:
                    calculatevalue = "4046.8564224";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case PYEONG:
                    calculatevalue = "1224.1741136825";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    ARE {
        @Override
        BigDecimal convert(BigDecimal value, AreaUnitConvertor areaUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (areaUnit){
                case ACRE:
                    calculatevalue = "0.0247105381";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case ARE:
                    calculated_value = value;
                    return calculated_value;
                case HECTARE:
                    calculatevalue = "0.01";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_CENTIMETER:
                    calculatevalue = "1000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_FEET:
                    calculatevalue = "1076.391041671";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_INCH:
                    calculatevalue = "155000.31000062";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_METER:
                    calculatevalue = "100";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case PYEONG:
                    calculatevalue = "30.2500011344";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    HECTARE{
        @Override
        BigDecimal convert(BigDecimal value, AreaUnitConvertor areaUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (areaUnit){
                case ACRE:
                    calculatevalue = "2.4710538147";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case ARE:
                    calculatevalue = "100";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case HECTARE:
                    calculated_value = value;
                    return calculated_value;
                case SQUARE_CENTIMETER:
                    calculatevalue = "100000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_FEET:
                    calculatevalue = "107639.1041671";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_INCH:
                    calculatevalue = "15500031.000062";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_METER:
                    calculatevalue = "10000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case PYEONG:
                    calculatevalue = "3025.0001134375";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    SQUARE_CENTIMETER{
        @Override
        BigDecimal convert(BigDecimal value, AreaUnitConvertor areaUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (areaUnit){
                case ACRE:
                    calculatevalue = Double.toString(2.47105381 * Math.pow(10, -8));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case ARE:
                    calculatevalue = Double.toString(Math.pow(10, -6));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case HECTARE:
                    calculatevalue = Double.toString(Math.pow(10, -8));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_CENTIMETER:
                    calculated_value = value;
                    return calculated_value;
                case SQUARE_FEET:
                    calculatevalue = "0.00107391";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_INCH:
                    calculatevalue = "0.15500031";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_METER:
                    calculatevalue = "0.0001";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case PYEONG:
                    calculatevalue = "0.00003025";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    SQUARE_FEET{
        @Override
        BigDecimal convert(BigDecimal value, AreaUnitConvertor areaUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (areaUnit){
                case ACRE:
                    calculatevalue = "0.0000229568";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case ARE:
                    calculatevalue = "0.0009290304";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case HECTARE:
                    calculatevalue = "0.0000092903";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_CENTIMETER:
                    calculatevalue = "929.0304";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_FEET:
                    calculated_value = value;
                    return calculated_value;
                case SQUARE_INCH:
                    calculatevalue = "144";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_METER:
                    calculatevalue = "0.09290304";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case PYEONG:
                    calculatevalue = "0.0281031707";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    SQUARE_INCH{
        @Override
        BigDecimal convert(BigDecimal value, AreaUnitConvertor areaUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (areaUnit){
                case ACRE:
                    calculatevalue = Double.toString(1.59422508 * Math.pow(10, -7));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case ARE:
                    calculatevalue = "0.0000064516";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case HECTARE:
                    calculatevalue = Double.toString(6.45160000*Math.pow(10, -8));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_CENTIMETER:
                    calculatevalue = "6.4516";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_FEET:
                    calculatevalue = "0.0069444444";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_INCH:
                    calculated_value = value;
                    return calculated_value;
                case SQUARE_METER:
                    calculatevalue = "0.00064516";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case PYEONG:
                    calculatevalue = "0.0001951609";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    SQUARE_METER{
        @Override
        BigDecimal convert(BigDecimal value, AreaUnitConvertor areaUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (areaUnit){
                case ACRE:
                    calculatevalue = "0.0002471054";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case ARE:
                    calculatevalue = "0.01";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case HECTARE:
                    calculatevalue = "0.0001";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_CENTIMETER:
                    calculatevalue = "10000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_FEET:
                    calculatevalue = "10.7639104167";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_INCH:
                    calculatevalue = "1550.0031000062";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_METER:
                    calculated_value = value;
                    return calculated_value;
                case PYEONG:
                    calculatevalue = "0.3025000113";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    PYEONG{
        @Override
        BigDecimal convert(BigDecimal value, AreaUnitConvertor areaUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (areaUnit){
                case ACRE:
                    calculatevalue = "0.0008168773";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case ARE:
                    calculatevalue = "0.03305785";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case HECTARE:
                    calculatevalue = "0.0003305785";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_CENTIMETER:
                    calculatevalue = "33057.85";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_FEET:
                    calculatevalue = "35.5831735969";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_INCH:
                    calculatevalue = "5123.946997954";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case SQUARE_METER:
                    calculatevalue = "3.305785";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case PYEONG:
                    calculated_value = value;
                    return calculated_value;
            }
                throw new IllegalArgumentException();
        }
    };
    abstract BigDecimal convert(BigDecimal value, AreaUnitConvertor areaUnit);
}

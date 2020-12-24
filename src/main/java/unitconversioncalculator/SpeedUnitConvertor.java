import java.math.BigDecimal;
import java.math.RoundingMode;

public enum SpeedUnitConvertor {
    METER_PER_SECOND{
        @Override
        BigDecimal convert(BigDecimal value, SpeedUnitConvertor speedUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (speedUnit){
                case METER_PER_SECOND:
                    calculated_value = value;
                    return calculated_value;
                case METER_PER_HOUR:
                    calculatevalue = "3600";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER_PER_SECOND:
                    calculatevalue = "0.001";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER_PER_HOUR:
                    calculatevalue = "3.6";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH_PER_SECOND:
                    calculatevalue = "39.3700787402";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH_PER_HOUR:
                    calculatevalue = "141732.28346457";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET_PER_SECOND:
                    calculatevalue = "3.280839895";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET_PER_HOUR:
                    calculatevalue = "11811.023622047";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE_PER_SECOND:
                    calculatevalue = "0.0006213712";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE_PER_HOUR:
                    calculatevalue = "2.2369362921";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KNOT:
                    calculatevalue = "1.9438444924";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    METER_PER_HOUR{
        @Override
        BigDecimal convert(BigDecimal value, SpeedUnitConvertor speedUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (speedUnit){
                case METER_PER_SECOND:
                    calculatevalue = "0.0002777778";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case METER_PER_HOUR:
                    calculated_value = value;
                    return calculated_value;
                case KILOMETER_PER_SECOND:
                    calculatevalue = Double.toString(2.77777778 * Math.pow(10, -7));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER_PER_HOUR:
                    calculatevalue = "0.001";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH_PER_SECOND:
                    calculatevalue = "0.010936133";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH_PER_HOUR:
                    calculatevalue = "39.3700787402";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET_PER_SECOND:
                    calculatevalue = "0.0009113444";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET_PER_HOUR:
                    calculatevalue = "3.280839895";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE_PER_SECOND:
                    calculatevalue = Double.toString(1.72603109 * Math.pow(10, -7));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE_PER_HOUR:
                    calculatevalue = "0.0006213712";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KNOT:
                    calculatevalue = "0.0005399568";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    KILOMETER_PER_SECOND{
        @Override
        BigDecimal convert(BigDecimal value, SpeedUnitConvertor speedUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (speedUnit){
                case METER_PER_SECOND:
                    calculatevalue = "1000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case METER_PER_HOUR:
                    calculatevalue = "3600000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER_PER_SECOND:
                    calculated_value = value;
                    return calculated_value;
                case KILOMETER_PER_HOUR:
                    calculatevalue = "3600";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH_PER_SECOND:
                    calculatevalue = "39370.078740158";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH_PER_HOUR:
                    calculatevalue = "141732283.46457";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET_PER_SECOND:
                    calculatevalue = "3280.8398950131";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET_PER_HOUR:
                    calculatevalue = "11811023";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE_PER_SECOND:
                    calculatevalue = "0.6213711922";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE_PER_HOUR:
                    calculatevalue = "2236.9362920544";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KNOT:
                    calculatevalue = "1943.8444924406";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    KILOMETER_PER_HOUR{
        @Override
        BigDecimal convert(BigDecimal value, SpeedUnitConvertor speedUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (speedUnit){
                case METER_PER_SECOND:
                    calculatevalue = "0.2777777778";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case METER_PER_HOUR:
                    calculatevalue = "1000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER_PER_SECOND:
                    calculatevalue = "0.0002777778";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER_PER_HOUR:
                    calculated_value = value;
                    return calculated_value;
                case INCH_PER_SECOND:
                    calculatevalue = "10.9361329834";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH_PER_HOUR:
                    calculatevalue = "39370.078740158";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET_PER_SECOND:
                    calculatevalue = "0.9113444153";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET_PER_HOUR:
                    calculatevalue = "3280.8398950131";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE_PER_SECOND:
                    calculatevalue = "0.0001726031";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE_PER_HOUR:
                    calculatevalue = "0.6213711922";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KNOT:
                    calculatevalue = "0.5399568035";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    INCH_PER_SECOND{
        @Override
        BigDecimal convert(BigDecimal value, SpeedUnitConvertor speedUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (speedUnit){
                case METER_PER_SECOND:
                    calculatevalue = "0.0254";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case METER_PER_HOUR:
                    calculatevalue = "91.44";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER_PER_SECOND:
                    calculatevalue = "0.0000254";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER_PER_HOUR:
                    calculatevalue = "0.09144";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH_PER_SECOND:
                    calculated_value = value;
                    return calculated_value;
                case INCH_PER_HOUR:
                    calculatevalue = "3600";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET_PER_SECOND:
                    calculatevalue = "0.0833333333";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET_PER_HOUR:
                    calculatevalue = "300";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE_PER_SECOND:
                    calculatevalue = "0.0000157828";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE_PER_HOUR:
                    calculatevalue = "0.0568181818";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KNOT:
                    calculatevalue = "0.0493736501";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    INCH_PER_HOUR{
        @Override
        BigDecimal convert(BigDecimal value, SpeedUnitConvertor speedUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (speedUnit){
                case METER_PER_SECOND:
                    calculatevalue = "0.0000070556";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case METER_PER_HOUR:
                    calculatevalue = "0.0254";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER_PER_SECOND:
                    calculatevalue = Double.toString(7.05555556 * Math.pow(10, -9));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER_PER_HOUR:
                    calculatevalue = "0.0000254";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH_PER_SECOND:
                    calculatevalue = "0.0002777778";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH_PER_HOUR:
                    calculated_value = value;
                    return calculated_value;
                case FEET_PER_SECOND:
                    calculatevalue = "0.0000231481";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET_PER_HOUR:
                    calculatevalue = "0.0833333333";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE_PER_SECOND:
                    calculatevalue = Double.toString(4.38411897 * Math.pow(10, -9));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE_PER_HOUR:
                    calculatevalue = "0.0000157828";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KNOT:
                    calculatevalue = "0.0000137149";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    FEET_PER_SECOND{
        @Override
        BigDecimal convert(BigDecimal value, SpeedUnitConvertor speedUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (speedUnit){
                case METER_PER_SECOND:
                    calculatevalue = "0.3048";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case METER_PER_HOUR:
                    calculatevalue = "1097.28";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER_PER_SECOND:
                    calculatevalue = "0.0003048";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER_PER_HOUR:
                    calculatevalue = "1.09728";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH_PER_SECOND:
                    calculatevalue = "12";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH_PER_HOUR:
                    calculatevalue = "43200";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET_PER_SECOND:
                    calculated_value = value;
                    return calculated_value;
                case FEET_PER_HOUR:
                    calculatevalue = "3600";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE_PER_SECOND:
                    calculatevalue = "0.0001893939";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE_PER_HOUR:
                    calculatevalue = "0.6818181818";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KNOT:
                    calculatevalue = "0.5924838013";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    FEET_PER_HOUR{
        @Override
        BigDecimal convert(BigDecimal value, SpeedUnitConvertor speedUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (speedUnit){
                case METER_PER_SECOND:
                    calculatevalue = "0.0000846667";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case METER_PER_HOUR:
                    calculatevalue = "0.3048";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER_PER_SECOND:
                    calculatevalue = Double.toString(8.46666667 * Math.pow(10, -8));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER_PER_HOUR:
                    calculatevalue = "0.0003048";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH_PER_SECOND:
                    calculatevalue = "0.0033333333";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH_PER_HOUR:
                    calculatevalue = "12";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET_PER_SECOND:
                    calculatevalue = "0.0002777778";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET_PER_HOUR:
                    calculated_value = value;
                    return calculated_value;
                case MILE_PER_SECOND:
                    calculatevalue = Double.toString(5.26094276 * Math.pow(10, -8));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE_PER_HOUR:
                    calculatevalue = "0.0001893939";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KNOT:
                    calculatevalue = "0.0001645788";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    MILE_PER_SECOND{
        @Override
        BigDecimal convert(BigDecimal value, SpeedUnitConvertor speedUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (speedUnit){
                case METER_PER_SECOND:
                    calculatevalue = "1609.344";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case METER_PER_HOUR:
                    calculatevalue = "5793638.4";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER_PER_SECOND:
                    calculatevalue = "1.609344";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER_PER_HOUR:
                    calculatevalue = "5793.6384";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH_PER_SECOND:
                    calculatevalue = "63360";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH_PER_HOUR:
                    calculatevalue = "228096000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET_PER_SECOND:
                    calculatevalue = "5280";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET_PER_HOUR:
                    calculatevalue = "19008000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE_PER_SECOND:
                    calculated_value = value;
                    return calculated_value;
                case MILE_PER_HOUR:
                    calculatevalue = "3600";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KNOT:
                    calculatevalue = "3128.3411708423";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    MILE_PER_HOUR{
        @Override
        BigDecimal convert(BigDecimal value, SpeedUnitConvertor speedUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (speedUnit){
                case METER_PER_SECOND:
                    calculatevalue = "0.44704";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case METER_PER_HOUR:
                    calculatevalue = "1609.344";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER_PER_SECOND:
                    calculatevalue = "0.00044704";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER_PER_HOUR:
                    calculatevalue = "1.609344";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH_PER_SECOND:
                    calculatevalue = "17.6";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH_PER_HOUR:
                    calculatevalue = "63360";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET_PER_SECOND:
                    calculatevalue = "1.4666666667";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET_PER_HOUR:
                    calculatevalue = "5280";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE_PER_SECOND:
                    calculatevalue = "0.0002777778";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE_PER_HOUR:
                    calculated_value = value;
                    return calculated_value;
                case KNOT:
                    calculatevalue = "0.8689762419";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    KNOT{
        @Override
        BigDecimal convert(BigDecimal value, SpeedUnitConvertor speedUnit) throws IllegalArgumentException{
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (speedUnit){
                case METER_PER_SECOND:
                    calculatevalue = "0.5144444444";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case METER_PER_HOUR:
                    calculatevalue = "1852";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER_PER_SECOND:
                    calculatevalue = "0.0005144444";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER_PER_HOUR:
                    calculatevalue = "1.852";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH_PER_SECOND:
                    calculatevalue = "20.2537182852";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH_PER_HOUR:
                    calculatevalue = "72913.385826772";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET_PER_SECOND:
                    calculatevalue = "1.6878095271";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET_PER_HOUR:
                    calculatevalue = "6076.1154855643";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE_PER_SECOND:
                    calculatevalue = "0.00319661";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE_PER_HOUR:
                    calculatevalue = "1.150779448";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KNOT:
                    calculated_value = value;
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    };
    abstract BigDecimal convert(BigDecimal value, SpeedUnitConvertor speedUnit);
}

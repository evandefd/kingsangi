package unitconversioncalculator;

import java.math.BigDecimal;

public enum SpeedUnit {
    METER_PER_SECOND{
        @Override
        public BigDecimal convert(BigDecimal value, SpeedUnit speedUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (speedUnit) {
                case METER_PER_SECOND:
                    calculatedValue = value;
                    return calculatedValue;
                case METER_PER_HOUR:
                    calculateValue = "3600";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER_PER_SECOND:
                    calculateValue = "0.001";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER_PER_HOUR:
                    calculateValue = "3.6";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH_PER_SECOND:
                    calculateValue = "39.3700787402";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH_PER_HOUR:
                    calculateValue = "141732.28346457";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET_PER_SECOND:
                    calculateValue = "3.280839895";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET_PER_HOUR:
                    calculateValue = "11811.023622047";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE_PER_SECOND:
                    calculateValue = "0.0006213712";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE_PER_HOUR:
                    calculateValue = "2.2369362921";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KNOT:
                    calculateValue = "1.9438444924";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    METER_PER_HOUR{
        @Override
        public BigDecimal convert(BigDecimal value, SpeedUnit speedUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (speedUnit) {
                case METER_PER_SECOND:
                    calculateValue = "0.0002777778";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case METER_PER_HOUR:
                    calculatedValue = value;
                    return calculatedValue;
                case KILOMETER_PER_SECOND:
                    calculateValue = Double.toString(2.77777778 * Math.pow(10, -7));
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER_PER_HOUR:
                    calculateValue = "0.001";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH_PER_SECOND:
                    calculateValue = "0.010936133";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH_PER_HOUR:
                    calculateValue = "39.3700787402";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET_PER_SECOND:
                    calculateValue = "0.0009113444";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET_PER_HOUR:
                    calculateValue = "3.280839895";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE_PER_SECOND:
                    calculateValue = Double.toString(1.72603109 * Math.pow(10, -7));
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE_PER_HOUR:
                    calculateValue = "0.0006213712";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KNOT:
                    calculateValue = "0.0005399568";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    KILOMETER_PER_SECOND{
        @Override
        public BigDecimal convert(BigDecimal value, SpeedUnit speedUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (speedUnit) {
                case METER_PER_SECOND:
                    calculateValue = "1000";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case METER_PER_HOUR:
                    calculateValue = "3600000";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER_PER_SECOND:
                    calculatedValue = value;
                    return calculatedValue;
                case KILOMETER_PER_HOUR:
                    calculateValue = "3600";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH_PER_SECOND:
                    calculateValue = "39370.078740158";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH_PER_HOUR:
                    calculateValue = "141732283.46457";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET_PER_SECOND:
                    calculateValue = "3280.8398950131";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET_PER_HOUR:
                    calculateValue = "11811023";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE_PER_SECOND:
                    calculateValue = "0.6213711922";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE_PER_HOUR:
                    calculateValue = "2236.9362920544";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KNOT:
                    calculateValue = "1943.8444924406";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    KILOMETER_PER_HOUR{
        @Override
        public BigDecimal convert(BigDecimal value, SpeedUnit speedUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (speedUnit) {
                case METER_PER_SECOND:
                    calculateValue = "0.2777777778";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case METER_PER_HOUR:
                    calculateValue = "1000";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER_PER_SECOND:
                    calculateValue = "0.0002777778";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER_PER_HOUR:
                    calculatedValue = value;
                    return calculatedValue;
                case INCH_PER_SECOND:
                    calculateValue = "10.9361329834";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH_PER_HOUR:
                    calculateValue = "39370.078740158";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET_PER_SECOND:
                    calculateValue = "0.9113444153";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET_PER_HOUR:
                    calculateValue = "3280.8398950131";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE_PER_SECOND:
                    calculateValue = "0.0001726031";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE_PER_HOUR:
                    calculateValue = "0.6213711922";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KNOT:
                    calculateValue = "0.5399568035";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    INCH_PER_SECOND{
        @Override
        public BigDecimal convert(BigDecimal value, SpeedUnit speedUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (speedUnit) {
                case METER_PER_SECOND:
                    calculateValue = "0.0254";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case METER_PER_HOUR:
                    calculateValue = "91.44";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER_PER_SECOND:
                    calculateValue = "0.0000254";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER_PER_HOUR:
                    calculateValue = "0.09144";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH_PER_SECOND:
                    calculatedValue = value;
                    return calculatedValue;
                case INCH_PER_HOUR:
                    calculateValue = "3600";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET_PER_SECOND:
                    calculateValue = "0.0833333333";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET_PER_HOUR:
                    calculateValue = "300";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE_PER_SECOND:
                    calculateValue = "0.0000157828";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE_PER_HOUR:
                    calculateValue = "0.0568181818";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KNOT:
                    calculateValue = "0.0493736501";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    INCH_PER_HOUR{
        @Override
        public BigDecimal convert(BigDecimal value, SpeedUnit speedUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (speedUnit) {
                case METER_PER_SECOND:
                    calculateValue = "0.0000070556";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case METER_PER_HOUR:
                    calculateValue = "0.0254";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER_PER_SECOND:
                    calculateValue = Double.toString(7.05555556 * Math.pow(10, -9));
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER_PER_HOUR:
                    calculateValue = "0.0000254";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH_PER_SECOND:
                    calculateValue = "0.0002777778";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH_PER_HOUR:
                    calculatedValue = value;
                    return calculatedValue;
                case FEET_PER_SECOND:
                    calculateValue = "0.0000231481";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET_PER_HOUR:
                    calculateValue = "0.0833333333";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE_PER_SECOND:
                    calculateValue = Double.toString(4.38411897 * Math.pow(10, -9));
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE_PER_HOUR:
                    calculateValue = "0.0000157828";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KNOT:
                    calculateValue = "0.0000137149";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    FEET_PER_SECOND{
        @Override
        public BigDecimal convert(BigDecimal value, SpeedUnit speedUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (speedUnit) {
                case METER_PER_SECOND:
                    calculateValue = "0.3048";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case METER_PER_HOUR:
                    calculateValue = "1097.28";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER_PER_SECOND:
                    calculateValue = "0.0003048";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER_PER_HOUR:
                    calculateValue = "1.09728";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH_PER_SECOND:
                    calculateValue = "12";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH_PER_HOUR:
                    calculateValue = "43200";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET_PER_SECOND:
                    calculatedValue = value;
                    return calculatedValue;
                case FEET_PER_HOUR:
                    calculateValue = "3600";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE_PER_SECOND:
                    calculateValue = "0.0001893939";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE_PER_HOUR:
                    calculateValue = "0.6818181818";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KNOT:
                    calculateValue = "0.5924838013";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    FEET_PER_HOUR{
        @Override
        public BigDecimal convert(BigDecimal value, SpeedUnit speedUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (speedUnit) {
                case METER_PER_SECOND:
                    calculateValue = "0.0000846667";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case METER_PER_HOUR:
                    calculateValue = "0.3048";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER_PER_SECOND:
                    calculateValue = Double.toString(8.46666667 * Math.pow(10, -8));
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER_PER_HOUR:
                    calculateValue = "0.0003048";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH_PER_SECOND:
                    calculateValue = "0.0033333333";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH_PER_HOUR:
                    calculateValue = "12";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET_PER_SECOND:
                    calculateValue = "0.0002777778";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET_PER_HOUR:
                    calculatedValue = value;
                    return calculatedValue;
                case MILE_PER_SECOND:
                    calculateValue = Double.toString(5.26094276 * Math.pow(10, -8));
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE_PER_HOUR:
                    calculateValue = "0.0001893939";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KNOT:
                    calculateValue = "0.0001645788";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    MILE_PER_SECOND{
        @Override
        public BigDecimal convert(BigDecimal value, SpeedUnit speedUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (speedUnit) {
                case METER_PER_SECOND:
                    calculateValue = "1609.344";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case METER_PER_HOUR:
                    calculateValue = "5793638.4";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER_PER_SECOND:
                    calculateValue = "1.609344";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER_PER_HOUR:
                    calculateValue = "5793.6384";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH_PER_SECOND:
                    calculateValue = "63360";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH_PER_HOUR:
                    calculateValue = "228096000";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET_PER_SECOND:
                    calculateValue = "5280";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET_PER_HOUR:
                    calculateValue = "19008000";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE_PER_SECOND:
                    calculatedValue = value;
                    return calculatedValue;
                case MILE_PER_HOUR:
                    calculateValue = "3600";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KNOT:
                    calculateValue = "3128.3411708423";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    MILE_PER_HOUR{
        @Override
        public BigDecimal convert(BigDecimal value, SpeedUnit speedUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (speedUnit) {
                case METER_PER_SECOND:
                    calculateValue = "0.44704";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case METER_PER_HOUR:
                    calculateValue = "1609.344";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER_PER_SECOND:
                    calculateValue = "0.00044704";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER_PER_HOUR:
                    calculateValue = "1.609344";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH_PER_SECOND:
                    calculateValue = "17.6";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH_PER_HOUR:
                    calculateValue = "63360";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET_PER_SECOND:
                    calculateValue = "1.4666666667";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET_PER_HOUR:
                    calculateValue = "5280";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE_PER_SECOND:
                    calculateValue = "0.0002777778";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE_PER_HOUR:
                    calculatedValue = value;
                    return calculatedValue;
                case KNOT:
                    calculateValue = "0.8689762419";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    KNOT{
        @Override
        public BigDecimal convert(BigDecimal value, SpeedUnit speedUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (speedUnit) {
                case METER_PER_SECOND:
                    calculateValue = "0.5144444444";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case METER_PER_HOUR:
                    calculateValue = "1852";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER_PER_SECOND:
                    calculateValue = "0.0005144444";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER_PER_HOUR:
                    calculateValue = "1.852";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH_PER_SECOND:
                    calculateValue = "20.2537182852";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH_PER_HOUR:
                    calculateValue = "72913.385826772";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET_PER_SECOND:
                    calculateValue = "1.6878095271";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET_PER_HOUR:
                    calculateValue = "6076.1154855643";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE_PER_SECOND:
                    calculateValue = "0.00319661";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE_PER_HOUR:
                    calculateValue = "1.150779448";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KNOT:
                    calculatedValue = value;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    };
    public abstract BigDecimal convert(BigDecimal value, SpeedUnit speedUnit);
}

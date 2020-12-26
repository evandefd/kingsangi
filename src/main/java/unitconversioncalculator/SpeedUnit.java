package unitconversioncalculator;

public enum SpeedUnit {
    METER_PER_SECOND{
        @Override
        public double convert(double value, SpeedUnit speedUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (speedUnit) {
                case METER_PER_SECOND:
                    calculatedValue = value;
                    return calculatedValue;
                case METER_PER_HOUR:
                    calculateValue = 3600;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER_PER_SECOND:
                    calculateValue = 0.001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER_PER_HOUR:
                    calculateValue = 3.6;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH_PER_SECOND:
                    calculateValue = 39.3700787402;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH_PER_HOUR:
                    calculateValue = 141732.28346457;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET_PER_SECOND:
                    calculateValue = 3.28084;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET_PER_HOUR:
                    calculateValue = 11811.0236;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE_PER_SECOND:
                    calculateValue = 0.000621;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE_PER_HOUR:
                    calculateValue = 2.236936;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KNOT:
                    calculateValue = 1.943844;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    METER_PER_HOUR{
        @Override
        public double convert(double value, SpeedUnit speedUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (speedUnit) {
                case METER_PER_SECOND:
                    calculateValue = 0.0002777778;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METER_PER_HOUR:
                    calculatedValue = value;
                    return calculatedValue;
                case KILOMETER_PER_SECOND:
                    calculateValue = 2.77777778 * Math.pow(10, -7);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER_PER_HOUR:
                    calculateValue = 0.001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH_PER_SECOND:
                    calculateValue = 0.010936133;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH_PER_HOUR:
                    calculateValue = 39.3700787402;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET_PER_SECOND:
                    calculateValue = 0.0009113444;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET_PER_HOUR:
                    calculateValue = 3.280839895;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE_PER_SECOND:
                    calculateValue = 1.72603109 * Math.pow(10, -7);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE_PER_HOUR:
                    calculateValue = 0.0006213712;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KNOT:
                    calculateValue = 0.0005399568;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    KILOMETER_PER_SECOND{
        @Override
        public double convert(double value, SpeedUnit speedUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (speedUnit) {
                case METER_PER_SECOND:
                    calculateValue = 1000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METER_PER_HOUR:
                    calculateValue = 3600000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER_PER_SECOND:
                    calculatedValue = value;
                    return calculatedValue;
                case KILOMETER_PER_HOUR:
                    calculateValue = 3600;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH_PER_SECOND:
                    calculateValue = 39370.078740158;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH_PER_HOUR:
                    calculateValue = 141732283.46457;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET_PER_SECOND:
                    calculateValue = 3280.8398950131;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET_PER_HOUR:
                    calculateValue = 11811023;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE_PER_SECOND:
                    calculateValue = 0.6213711922;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE_PER_HOUR:
                    calculateValue = 2236.9362920544;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KNOT:
                    calculateValue = 1943.8444924406;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    KILOMETER_PER_HOUR{
        @Override
        public double convert(double value, SpeedUnit speedUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (speedUnit) {
                case METER_PER_SECOND:
                    calculateValue = 0.2777777778;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METER_PER_HOUR:
                    calculateValue = 1000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER_PER_SECOND:
                    calculateValue = 0.0002777778;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER_PER_HOUR:
                    calculatedValue = value;
                    return calculatedValue;
                case INCH_PER_SECOND:
                    calculateValue = 10.9361329834;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH_PER_HOUR:
                    calculateValue = 39370.078740158;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET_PER_SECOND:
                    calculateValue = 0.9113444153;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET_PER_HOUR:
                    calculateValue = 3280.8398950131;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE_PER_SECOND:
                    calculateValue = 0.0001726031;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE_PER_HOUR:
                    calculateValue = 0.6213711922;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KNOT:
                    calculateValue = 0.5399568035;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    INCH_PER_SECOND{
        @Override
        public double convert(double value, SpeedUnit speedUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (speedUnit) {
                case METER_PER_SECOND:
                    calculateValue = 0.0254;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METER_PER_HOUR:
                    calculateValue = 91.44;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER_PER_SECOND:
                    calculateValue = 0.0000254;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER_PER_HOUR:
                    calculateValue = 0.09144;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH_PER_SECOND:
                    calculatedValue = value;
                    return calculatedValue;
                case INCH_PER_HOUR:
                    calculateValue = 3600;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET_PER_SECOND:
                    calculateValue = 0.0833333333;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET_PER_HOUR:
                    calculateValue = 300;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE_PER_SECOND:
                    calculateValue = 0.0000157828;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE_PER_HOUR:
                    calculateValue = 0.0568181818;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KNOT:
                    calculateValue = 0.0493736501;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    INCH_PER_HOUR{
        @Override
        public double convert(double value, SpeedUnit speedUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (speedUnit) {
                case METER_PER_SECOND:
                    calculateValue = 0.0000070556;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METER_PER_HOUR:
                    calculateValue = 0.0254;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER_PER_SECOND:
                    calculateValue = 7.05555556 * Math.pow(10, -9);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER_PER_HOUR:
                    calculateValue = 0.0000254;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH_PER_SECOND:
                    calculateValue = 0.0002777778;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH_PER_HOUR:
                    calculatedValue = value;
                    return calculatedValue;
                case FEET_PER_SECOND:
                    calculateValue = 0.0000231481;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET_PER_HOUR:
                    calculateValue = 0.0833333333;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE_PER_SECOND:
                    calculateValue = 4.38411897 * Math.pow(10, -9);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE_PER_HOUR:
                    calculateValue = 0.0000157828;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KNOT:
                    calculateValue = 0.0000137149;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    FEET_PER_SECOND{
        @Override
        public double convert(double value, SpeedUnit speedUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (speedUnit) {
                case METER_PER_SECOND:
                    calculateValue = 0.3048;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METER_PER_HOUR:
                    calculateValue = 1097.28;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER_PER_SECOND:
                    calculateValue = 0.0003048;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER_PER_HOUR:
                    calculateValue = 1.09728;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH_PER_SECOND:
                    calculateValue = 12;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH_PER_HOUR:
                    calculateValue = 43200;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET_PER_SECOND:
                    calculatedValue = value;
                    return calculatedValue;
                case FEET_PER_HOUR:
                    calculateValue = 3600;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE_PER_SECOND:
                    calculateValue = 0.0001893939;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE_PER_HOUR:
                    calculateValue = 0.6818181818;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KNOT:
                    calculateValue = 0.5924838013;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    FEET_PER_HOUR{
        @Override
        public double convert(double value, SpeedUnit speedUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (speedUnit) {
                case METER_PER_SECOND:
                    calculateValue = 0.0000846667;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METER_PER_HOUR:
                    calculateValue = 0.3048;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER_PER_SECOND:
                    calculateValue = 8.46666667 * Math.pow(10, -8);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER_PER_HOUR:
                    calculateValue = 0.0003048;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH_PER_SECOND:
                    calculateValue = 0.0033333333;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH_PER_HOUR:
                    calculateValue = 12;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET_PER_SECOND:
                    calculateValue = 0.0002777778;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET_PER_HOUR:
                    calculatedValue = value;
                    return calculatedValue;
                case MILE_PER_SECOND:
                    calculateValue = 5.26094276 * Math.pow(10, -8);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE_PER_HOUR:
                    calculateValue = 0.0001893939;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KNOT:
                    calculateValue = 0.0001645788;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    MILE_PER_SECOND{
        @Override
        public double convert(double value, SpeedUnit speedUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (speedUnit) {
                case METER_PER_SECOND:
                    calculateValue = 1609.344;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METER_PER_HOUR:
                    calculateValue = 5793638.4;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER_PER_SECOND:
                    calculateValue = 1.609344;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER_PER_HOUR:
                    calculateValue = 5793.6384;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH_PER_SECOND:
                    calculateValue = 63360;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH_PER_HOUR:
                    calculateValue = 228096000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET_PER_SECOND:
                    calculateValue = 5280;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET_PER_HOUR:
                    calculateValue = 19008000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE_PER_SECOND:
                    calculatedValue = value;
                    return calculatedValue;
                case MILE_PER_HOUR:
                    calculateValue = 3600;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KNOT:
                    calculateValue = 3128.3411708423;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    MILE_PER_HOUR{
        @Override
        public double convert(double value, SpeedUnit speedUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (speedUnit) {
                case METER_PER_SECOND:
                    calculateValue = 0.44704;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METER_PER_HOUR:
                    calculateValue = 1609.344;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER_PER_SECOND:
                    calculateValue = 0.00044704;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER_PER_HOUR:
                    calculateValue = 1.609344;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH_PER_SECOND:
                    calculateValue = 17.6;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH_PER_HOUR:
                    calculateValue = 63360;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET_PER_SECOND:
                    calculateValue = 1.4666666667;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET_PER_HOUR:
                    calculateValue = 5280;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE_PER_SECOND:
                    calculateValue = 0.0002777778;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE_PER_HOUR:
                    calculatedValue = value;
                    return calculatedValue;
                case KNOT:
                    calculateValue = 0.8689762419;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    KNOT{
        @Override
        public double convert(double value, SpeedUnit speedUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (speedUnit) {
                case METER_PER_SECOND:
                    calculateValue = 0.5144444444;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METER_PER_HOUR:
                    calculateValue = 1852;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER_PER_SECOND:
                    calculateValue = 0.0005144444;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER_PER_HOUR:
                    calculateValue = 1.852;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH_PER_SECOND:
                    calculateValue = 20.2537182852;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH_PER_HOUR:
                    calculateValue = 72913.385826772;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET_PER_SECOND:
                    calculateValue = 1.6878095271;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET_PER_HOUR:
                    calculateValue = 6076.1154855643;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE_PER_SECOND:
                    calculateValue = 0.00319661;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE_PER_HOUR:
                    calculateValue = 1.150779448;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KNOT:
                    calculatedValue = value;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    };
    public abstract double convert(double value, SpeedUnit speedUnit);
}

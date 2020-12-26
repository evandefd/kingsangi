package unitconversioncalculator;

public enum LengthUnit {
    MILLIMETER{
        @Override
        public double convert(double value, LengthUnit lengthUnit) throws IllegalArgumentException {
            double calculateValue;
            double calculatedValue;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculatedValue = value;
                    return calculatedValue;
                case CENTIMETER:
                    calculateValue = 0.1;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METER:
                    calculateValue = 0.001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER:
                    calculateValue = 0.000001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH:
                    calculateValue = 0.0393700787;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET:
                    calculateValue = 0.0032808399;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case YARD:
                    calculateValue = 0.0010936133;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE:
                    calculateValue = 6.2137119 * Math.pow(10, -7);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case NMILE:
                    calculateValue = 5.39956803 * Math.pow(10, -7);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MIL:
                    calculateValue = 39.3700787402;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    CENTIMETER{
        @Override
        public double convert(double value, LengthUnit lengthUnit) throws IllegalArgumentException {
            double calculateValue;
            double calculatedValue;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculateValue = 10;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CENTIMETER:
                    calculatedValue = value;
                    return calculatedValue;
                case METER:
                    calculateValue = 0.01;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER:
                    calculateValue = 0.00001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH:
                    calculateValue = 0.3937007874;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET:
                    calculateValue = 0.032808399;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case YARD:
                    calculateValue = 0.010936133;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE:
                    calculateValue = 0.0000062137;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case NMILE:
                    calculateValue = 0.0000053996;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MIL:
                    calculateValue = 393.7007874016;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    METER{
        @Override
        public double convert(double value, LengthUnit lengthUnit) throws IllegalArgumentException {
            double calculateValue;
            double calculatedValue;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculateValue = 1000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CENTIMETER:
                    calculateValue = 100;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METER:
                    calculatedValue = value;
                    return calculatedValue;
                case KILOMETER:
                    calculateValue = 0.001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH:
                    calculateValue = 39.3700787402;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET:
                    calculateValue = 3.280839895;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case YARD:
                    calculateValue = 1.0936132983;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE:
                    calculateValue = 0.0006213712;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case NMILE:
                    calculateValue = 0.0005399568;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MIL:
                    calculateValue = 39370.078740158;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    KILOMETER{
        @Override
        public double convert(double value, LengthUnit lengthUnit) throws IllegalArgumentException {
            double calculateValue;
            double calculatedValue;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculateValue = 1000000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CENTIMETER:
                    calculateValue = 100000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METER:
                    calculateValue = 1000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER:
                    calculatedValue = value;
                    return calculatedValue;
                case INCH:
                    calculateValue = 39370.078740158;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET:
                    calculateValue = 3280.8398950131;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case YARD:
                    calculateValue = 1093.6132983377;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE:
                    calculateValue = 0.621371192;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case NMILE:
                    calculateValue = 0.5399568035;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MIL:
                    calculateValue = 39370.078740157;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    INCH{
        @Override
        public double convert(double value, LengthUnit lengthUnit) throws IllegalArgumentException {
            double calculateValue;
            double calculatedValue;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculateValue = 25.4;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CENTIMETER:
                    calculateValue = 2.54;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METER:
                    calculateValue = 0.0254;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER:
                    calculateValue = 0.0000254;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH:
                    calculatedValue = value;
                    return calculatedValue;
                case FEET:
                    calculateValue = 0.0833333333;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case YARD:
                    calculateValue = 0.0277777778;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE:
                    calculateValue = 0.0000157828;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case NMILE:
                    calculateValue = 0.0000137149;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MIL:
                    calculateValue = 1000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    FEET{
        @Override
        public double convert(double value, LengthUnit lengthUnit) throws IllegalArgumentException {
            double calculateValue;
            double calculatedValue;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculateValue = 304.8;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CENTIMETER:
                    calculateValue = 30.48;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METER:
                    calculateValue = 0.3048;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER:
                    calculateValue = 0.0003048;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH:
                    calculateValue = 12;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET:
                    calculatedValue = value;
                    return calculatedValue;
                case YARD:
                    calculateValue = 0.33333333;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE:
                    calculateValue = 0.0001893939;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case NMILE:
                    calculateValue = 0.0001645788;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MIL:
                    calculateValue = 12000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    YARD{
        @Override
        public double convert(double value, LengthUnit lengthUnit) throws IllegalArgumentException {
            double calculateValue;
            double calculatedValue;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculateValue = 914.4;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CENTIMETER:
                    calculateValue = 91.44;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METER:
                    calculateValue = 0.9144;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER:
                    calculateValue = 0.0009144;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH:
                    calculateValue = 36;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET:
                    calculateValue = 3;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case YARD:
                    calculatedValue = value;
                    return calculatedValue;
                case MILE:
                    calculateValue = 0.0005681818;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case NMILE:
                    calculateValue = 0.0004937365;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MIL:
                    calculateValue = 36000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    MILE{
        @Override
        public double convert(double value, LengthUnit lengthUnit) throws IllegalArgumentException {
            double calculateValue;
            double calculatedValue;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculateValue = 1609344;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CENTIMETER:
                    calculateValue = 160934.4;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METER:
                    calculateValue = 1609.344;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER:
                    calculateValue = 1.609344;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH:
                    calculateValue = 63360;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET:
                    calculateValue = 5280;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case YARD:
                    calculateValue = 1760;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE:
                    calculatedValue = value;
                    return calculatedValue;
                case NMILE:
                    calculateValue = 0.8689762419;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MIL:
                    calculateValue = 63360000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    NMILE{
        @Override
        public double convert(double value, LengthUnit lengthUnit) throws IllegalArgumentException {
            double calculateValue;
            double calculatedValue;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculateValue = 1852000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CENTIMETER:
                    calculateValue = 185200;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METER:
                    calculateValue = 1852;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER:
                    calculateValue = 1.852;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH:
                    calculateValue = 72913.385826772;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET:
                    calculateValue = 6076.1154855643;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case YARD:
                    calculateValue = 2025.3718285214;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE:
                    calculateValue = 1.150779448;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case NMILE:
                    calculatedValue = value;
                    return calculatedValue;
                case MIL:
                    calculateValue = 72913385.826772;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    MIL{
        @Override
        public double convert(double value, LengthUnit lengthUnit) throws IllegalArgumentException {
            double calculateValue;
            double calculatedValue;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculateValue = 0.0254;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CENTIMETER:
                    calculateValue = 0.00254;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METER:
                    calculateValue = 0.0000254;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETER:
                    calculateValue = 2.54000000 * Math.pow(10, -8);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH:
                    calculateValue = 0.001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET:
                    calculateValue = 0.0000833333;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case YARD:
                    calculateValue = 0.0000277778;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE:
                    calculateValue = 1.57828283 * Math.pow(10, -8);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case NMILE:
                    calculateValue = 1.37149028 * Math.pow(10, -8);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MIL:
                    calculatedValue = value;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    };
    public abstract double convert(double value, LengthUnit lengthUnit);
}

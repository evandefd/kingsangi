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
                    calculateValue = 0.039370078740157;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET:
                    calculateValue = 0.0032808398950131;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case YARD:
                    calculateValue = 0.0010936132983377;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE:
                    calculateValue = 6.2137119223733 * Math.pow(10, -7);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case NMILE:
                    calculateValue = 5.3995680345572 * Math.pow(10, -7);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MIL:
                    calculateValue = 39.370078740157;
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
                    calculateValue = 0.39370078740157;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET:
                    calculateValue = 0.032808398950131;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case YARD:
                    calculateValue = 0.010936132983377;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE:
                    calculateValue = 6.2137119223733 * Math.pow(10, -6);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case NMILE:
                    calculateValue = 5.3995680345572 * Math.pow(10, -6);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MIL:
                    calculateValue = 393.70078740157;
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
                    calculateValue = 3.2808398950131;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case YARD:
                    calculateValue = 1.0936132983377;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE:
                    calculateValue = 0.00062137119223733;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case NMILE:
                    calculateValue = 0.00053995680345572;
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
                    calculateValue = 39370.078740157;
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
                    calculateValue = 0.62137119223733;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case NMILE:
                    calculateValue = 0.53995680345572;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MIL:
                    calculateValue = 39370078.740157;
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
                    calculateValue = 0.08333333333;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case YARD:
                    calculateValue = 0.027777777777778;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE:
                    calculateValue = 0.000015782828282828;
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
                    calculateValue = 0.3333333;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE:
                    calculateValue = 0.00018939393939394;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case NMILE:
                    calculateValue = 0.0001645788336933;
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
                    calculateValue = 0.00056818181818182;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case NMILE:
                    calculateValue = 0.00049373650107991;
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
                    calculateValue = 0.86897624190065;
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
                    calculateValue = 1.1507794480235;
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
                    calculateValue = 0.0000000254000000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCH:
                    calculateValue = 0.001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEET:
                    calculateValue = 0.00008333333333;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case YARD:
                    calculateValue = 0.000027777777777778;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILE:
                    calculateValue = 1.5782828282828 * Math.pow(10, -8);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case NMILE:
                    calculateValue = 1.3714902807775 * Math.pow(10, -8);
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

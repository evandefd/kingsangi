package unitconversioncalculator;

import java.math.BigDecimal;

public enum LengthUnit {
    MILLIMETER{
        @Override
        public BigDecimal convert(BigDecimal value, LengthUnit lengthUnit) throws IllegalArgumentException {
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculatedValue = value;
                    return calculatedValue;
                case CENTIMETER:
                    calculateValue = "0.1";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case METER:
                    calculateValue = "0.001";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER:
                    calculateValue = "0.000001";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH:
                    calculateValue = "0.0393700787";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET:
                    calculateValue = "0.0032808399";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case YARD:
                    calculateValue = "0.0010936133";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE:
                    calculateValue = Double.toString(6.2137119 * Math.pow(10, -7));
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case NMILE:
                    calculateValue = Double.toString(5.39956803 * Math.pow(10, -7));
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MIL:
                    calculateValue = "39.3700787402";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    CENTIMETER{
        @Override
        public BigDecimal convert(BigDecimal value, LengthUnit lengthUnit) throws IllegalArgumentException {
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculateValue = "10";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case CENTIMETER:
                    calculatedValue = value;
                    return calculatedValue;
                case METER:
                    calculateValue = "0.01";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER:
                    calculateValue = "0.00001";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH:
                    calculateValue = "0.3937007874";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET:
                    calculateValue = "0.032808399";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case YARD:
                    calculateValue = "0.010936133";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE:
                    calculateValue = "0.0000062137";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case NMILE:
                    calculateValue = "0.0000053996";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MIL:
                    calculateValue = "393.7007874016";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    METER{
        @Override
        public BigDecimal convert(BigDecimal value, LengthUnit lengthUnit) throws IllegalArgumentException {
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculateValue = "1000";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case CENTIMETER:
                    calculateValue = "100";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case METER:
                    calculatedValue = value;
                    return calculatedValue;
                case KILOMETER:
                    calculateValue = "0.001";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH:
                    calculateValue = "39.3700787402";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET:
                    calculateValue = "3.280839895";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case YARD:
                    calculateValue = "1.0936132983";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE:
                    calculateValue = "0.0006213712";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case NMILE:
                    calculateValue = "0.0005399568";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MIL:
                    calculateValue = "39370.078740158";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    KILOMETER{
        @Override
        public BigDecimal convert(BigDecimal value, LengthUnit lengthUnit) throws IllegalArgumentException {
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculateValue = "1000000";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case CENTIMETER:
                    calculateValue = "100000";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case METER:
                    calculateValue = "1000";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER:
                    calculatedValue = value;
                    return calculatedValue;
                case INCH:
                    calculateValue = "39370.078740158";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET:
                    calculateValue = "3280.8398950131";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case YARD:
                    calculateValue = "1093.6132983377";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE:
                    calculateValue = "0.621371192";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case NMILE:
                    calculateValue = "0.5399568035";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MIL:
                    calculateValue = "39370.078740157";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    INCH{
        @Override
        public BigDecimal convert(BigDecimal value, LengthUnit lengthUnit) throws IllegalArgumentException {
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculateValue = "25.4";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case CENTIMETER:
                    calculateValue = "2.54";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case METER:
                    calculateValue = "0.0254";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER:
                    calculateValue = "0.0000254";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH:
                    calculatedValue = value;
                    return calculatedValue;
                case FEET:
                    calculateValue = "0.0833333333";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case YARD:
                    calculateValue = "0.0277777778";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE:
                    calculateValue = "0.0000157828";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case NMILE:
                    calculateValue = "0.0000137149";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MIL:
                    calculateValue = "1000";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    FEET{
        @Override
        public BigDecimal convert(BigDecimal value, LengthUnit lengthUnit) throws IllegalArgumentException {
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculateValue = "304.8";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case CENTIMETER:
                    calculateValue = "30.48";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case METER:
                    calculateValue = "0.3048";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER:
                    calculateValue = "0.0003048";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH:
                    calculateValue = "12";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET:
                    calculatedValue = value;
                    return calculatedValue;
                case YARD:
                    calculateValue = "0.33333333";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE:
                    calculateValue = "0.0001893939";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case NMILE:
                    calculateValue = "0.0001645788";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MIL:
                    calculateValue = "12000";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    YARD{
        @Override
        public BigDecimal convert(BigDecimal value, LengthUnit lengthUnit) throws IllegalArgumentException {
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculateValue = "914.4";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case CENTIMETER:
                    calculateValue = "91.44";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case METER:
                    calculateValue = "0.9144";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER:
                    calculateValue = "0.0009144";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH:
                    calculateValue = "36";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET:
                    calculateValue = "3";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case YARD:
                    calculatedValue = value;
                    return calculatedValue;
                case MILE:
                    calculateValue = "0.0005681818";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case NMILE:
                    calculateValue = "0.0004937365";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MIL:
                    calculateValue = "36000";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    MILE{
        @Override
        public BigDecimal convert(BigDecimal value, LengthUnit lengthUnit) throws IllegalArgumentException {
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculateValue = "1609344";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case CENTIMETER:
                    calculateValue = "160934.4";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case METER:
                    calculateValue = "1609.344";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER:
                    calculateValue = "1.609344";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH:
                    calculateValue = "63360";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET:
                    calculateValue = "5280";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case YARD:
                    calculateValue = "1760";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE:
                    calculatedValue = value;
                    return calculatedValue;
                case NMILE:
                    calculateValue = "0.8689762419";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MIL:
                    calculateValue = "63360000";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    NMILE{
        @Override
        public BigDecimal convert(BigDecimal value, LengthUnit lengthUnit) throws IllegalArgumentException {
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculateValue = "1852000";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case CENTIMETER:
                    calculateValue = "185200";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case METER:
                    calculateValue = "1852";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER:
                    calculateValue = "1.852";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH:
                    calculateValue = "72913.385826772";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET:
                    calculateValue = "6076.1154855643";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case YARD:
                    calculateValue = "2025.3718285214";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE:
                    calculateValue = "1.150779448";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case NMILE:
                    calculatedValue = value;
                    return calculatedValue;
                case MIL:
                    calculateValue = "72913385.826772";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    MIL{
        @Override
        public BigDecimal convert(BigDecimal value, LengthUnit lengthUnit) throws IllegalArgumentException {
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculateValue = "0.0254";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case CENTIMETER:
                    calculateValue = "0.00254";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case METER:
                    calculateValue = "0.0000254";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOMETER:
                    calculateValue = Double.toString(2.54000000 * Math.pow(10, -8));
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case INCH:
                    calculateValue = "0.001";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case FEET:
                    calculateValue = "0.0000833333";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case YARD:
                    calculateValue = "0.0000277778";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MILE:
                    calculateValue = Double.toString(1.57828283 * Math.pow(10, -8));
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case NMILE:
                    calculateValue = Double.toString(1.37149028 * Math.pow(10, -8));
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case MIL:
                    calculatedValue = value;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    };
    public abstract BigDecimal convert(BigDecimal value, LengthUnit lengthUnit);
}

import java.math.BigDecimal;
import java.math.RoundingMode;

public enum LengthUnitConvertor {
    MILLIMETER{
        @Override
        BigDecimal convert(BigDecimal value, LengthUnitConvertor lengthUnit) throws IllegalArgumentException {
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculated_value = value;
                    return calculated_value;
                case CENTIMETER:
                    calculatevalue = "0.1";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case METER:
                    calculatevalue = "0.001";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER:
                    calculatevalue = "0.000001";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH:
                    calculatevalue = "0.0393700787";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET:
                    calculatevalue = "0.0032808399";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case YARD:
                    calculatevalue = "0.0010936133";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE:
                    calculatevalue = Double.toString(6.2137119 * Math.pow(10, -7));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case NMILE:
                    calculatevalue = Double.toString(5.39956803 * Math.pow(10, -7));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MIL:
                    calculatevalue = "39.3700787402";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    CENTIMETER{
        @Override
        BigDecimal convert(BigDecimal value, LengthUnitConvertor lengthUnit) throws IllegalArgumentException {
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculatevalue = "10";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CENTIMETER:
                    calculated_value = value;
                    return calculated_value;
                case METER:
                    calculatevalue = "0.01";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER:
                    calculatevalue = "0.00001";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH:
                    calculatevalue = "0.3937007874";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET:
                    calculatevalue = "0.032808399";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case YARD:
                    calculatevalue = "0.010936133";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE:
                    calculatevalue = "0.0000062137";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case NMILE:
                    calculatevalue = "0.0000053996";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MIL:
                    calculatevalue = "393.7007874016";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    METER{
        @Override
        BigDecimal convert(BigDecimal value, LengthUnitConvertor lengthUnit) throws IllegalArgumentException {
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculatevalue = "1000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CENTIMETER:
                    calculatevalue = "100";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case METER:
                    calculated_value = value;
                    return calculated_value;
                case KILOMETER:
                    calculatevalue = "0.001";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH:
                    calculatevalue = "39.3700787402";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET:
                    calculatevalue = "3.280839895";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case YARD:
                    calculatevalue = "1.0936132983";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE:
                    calculatevalue = "0.0006213712";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case NMILE:
                    calculatevalue = "0.0005399568";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MIL:
                    calculatevalue = "39370.078740158";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    KILOMETER{
        @Override
        BigDecimal convert(BigDecimal value, LengthUnitConvertor lengthUnit) throws IllegalArgumentException {
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculatevalue = "1000000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CENTIMETER:
                    calculatevalue = "100000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case METER:
                    calculatevalue = "1000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER:
                    calculated_value = value;
                    return calculated_value;
                case INCH:
                    calculatevalue = "39370.078740158";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET:
                    calculatevalue = "3280.8398950131";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case YARD:
                    calculatevalue = "1093.6132983377";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE:
                    calculatevalue = "0.621371192";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case NMILE:
                    calculatevalue = "0.5399568035";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MIL:
                    calculatevalue = "39370.078740157";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    INCH{
        @Override
        BigDecimal convert(BigDecimal value, LengthUnitConvertor lengthUnit) throws IllegalArgumentException {
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculatevalue = "25.4";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CENTIMETER:
                    calculatevalue = "2.54";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case METER:
                    calculatevalue = "0.0254";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER:
                    calculatevalue = "0.0000254";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH:
                    calculated_value = value;
                    return calculated_value;
                case FEET:
                    calculatevalue = "0.0833333333";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case YARD:
                    calculatevalue = "0.0277777778";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE:
                    calculatevalue = "0.0000157828";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case NMILE:
                    calculatevalue = "0.0000137149";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MIL:
                    calculatevalue = "1000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    FEET{
        @Override
        BigDecimal convert(BigDecimal value, LengthUnitConvertor lengthUnit) throws IllegalArgumentException {
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculatevalue = "304.8";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CENTIMETER:
                    calculatevalue = "30.48";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case METER:
                    calculatevalue = "0.3048";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER:
                    calculatevalue = "0.0003048";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH:
                    calculatevalue = "12";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET:
                    calculated_value = value;
                    return calculated_value;
                case YARD:
                    calculatevalue = "0.33333333";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE:
                    calculatevalue = "0.0001893939";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case NMILE:
                    calculatevalue = "0.0001645788";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MIL:
                    calculatevalue = "12000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    YARD{
        @Override
        BigDecimal convert(BigDecimal value, LengthUnitConvertor lengthUnit) throws IllegalArgumentException {
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculatevalue = "914.4";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CENTIMETER:
                    calculatevalue = "91.44";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case METER:
                    calculatevalue = "0.9144";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER:
                    calculatevalue = "0.0009144";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH:
                    calculatevalue = "36";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET:
                    calculatevalue = "3";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case YARD:
                    calculated_value = value;
                    return calculated_value;
                case MILE:
                    calculatevalue = "0.0005681818";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case NMILE:
                    calculatevalue = "0.0004937365";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MIL:
                    calculatevalue = "36000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    MILE{
        @Override
        BigDecimal convert(BigDecimal value, LengthUnitConvertor lengthUnit) throws IllegalArgumentException {
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculatevalue = "1609344";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CENTIMETER:
                    calculatevalue = "160934.4";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case METER:
                    calculatevalue = "1609.344";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER:
                    calculatevalue = "1.609344";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH:
                    calculatevalue = "63360";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET:
                    calculatevalue = "5280";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case YARD:
                    calculatevalue = "1760";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE:
                    calculated_value = value;
                    return calculated_value;
                case NMILE:
                    calculatevalue = "0.8689762419";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MIL:
                    calculatevalue = "63360000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    NMILE{
        @Override
        BigDecimal convert(BigDecimal value, LengthUnitConvertor lengthUnit) throws IllegalArgumentException {
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculatevalue = "1852000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CENTIMETER:
                    calculatevalue = "185200";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case METER:
                    calculatevalue = "1852";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER:
                    calculatevalue = "1.852";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH:
                    calculatevalue = "72913.385826772";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET:
                    calculatevalue = "6076.1154855643";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case YARD:
                    calculatevalue = "2025.3718285214";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE:
                    calculatevalue = "1.150779448";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case NMILE:
                    calculated_value = value;
                    return calculated_value;
                case MIL:
                    calculatevalue = "72913385.826772";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    MIL{
        @Override
        BigDecimal convert(BigDecimal value, LengthUnitConvertor lengthUnit) throws IllegalArgumentException {
            String calculatevalue = "";
            BigDecimal string_to_bigdecimal = BigDecimal.ZERO;
            BigDecimal calculated_value = BigDecimal.ZERO;
            switch (lengthUnit) {
                case MILLIMETER:
                    calculatevalue = "0.0254";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CENTIMETER:
                    calculatevalue = "0.00254";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case METER:
                    calculatevalue = "0.0000254";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case KILOMETER:
                    calculatevalue = Double.toString(2.54000000 * Math.pow(10, -8));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case INCH:
                    calculatevalue = "0.001";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case FEET:
                    calculatevalue = "0.0000833333";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case YARD:
                    calculatevalue = "0.0000277778";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILE:
                    calculatevalue = Double.toString(1.57828283 * Math.pow(10, -8));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case NMILE:
                    calculatevalue = Double.toString(1.37149028 * Math.pow(10, -8));
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MIL:
                    calculated_value = value;
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    };
    abstract BigDecimal convert(BigDecimal value, LengthUnitConvertor lengthUnit);
}

package unitconversioncalculator;

import java.math.BigDecimal;

public enum VolumeUnit {
    BRITISH_GALLON{
        @Override
        public BigDecimal convert(BigDecimal value, VolumeUnit volumeUnit) {
            String calculatevalue;
            BigDecimal string_to_bigdecimal;
            BigDecimal calculated_value;
            switch (volumeUnit) {
                case BRITISH_GALLON: 
                    calculated_value = value;
                    return calculated_value;
                case US_GALLON: 
                    calculatevalue = "1.2009499255";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case LITER: 
                    calculatevalue = "4.54609";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILLILITER:
                case CUBIC_CENTIMETER: 
                    calculatevalue = "4546.09";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CUBIC_METER: 
                    calculatevalue = "0.00454609";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CUBIC_INCH: 
                    calculatevalue = "277.4194327916";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CUBIC_FEET: 
                    calculatevalue = "0.1605436532";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    US_GALLON{
        @Override
        public BigDecimal convert(BigDecimal value, VolumeUnit volumeUnit) {
            String calculatevalue;
            BigDecimal string_to_bigdecimal;
            BigDecimal calculated_value;
            switch (volumeUnit) {
                case BRITISH_GALLON: 
                    calculatevalue = "0.8326741846";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case US_GALLON: 
                    calculated_value = value;
                    return calculated_value;
                case LITER: 
                    calculatevalue = "3.785411784";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILLILITER:
                case CUBIC_CENTIMETER: 
                    calculatevalue = "3785.411784";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CUBIC_METER: 
                    calculatevalue = "0.0037854118";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CUBIC_INCH: 
                    calculatevalue = "231";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CUBIC_FEET: 
                    calculatevalue = "0.1336805556";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    LITER{
        @Override
        public BigDecimal convert(BigDecimal value, VolumeUnit volumeUnit) {
            String calculatevalue;
            BigDecimal string_to_bigdecimal;
            BigDecimal calculated_value;
            switch (volumeUnit) {
                case BRITISH_GALLON: 
                    calculatevalue = "0.2199692483";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case US_GALLON: 
                    calculatevalue = "0.2641720524";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case LITER: 
                    calculated_value = value;
                    return calculated_value;
                case MILLILITER:
                case CUBIC_CENTIMETER: 
                    calculatevalue = "1000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CUBIC_METER: 
                    calculatevalue = "0.001";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CUBIC_INCH: 
                    calculatevalue = "61.0237440947";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CUBIC_FEET: 
                    calculatevalue = "0.0353146667";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    MILLILITER{
        @Override
        public BigDecimal convert(BigDecimal value, VolumeUnit volumeUnit) {
            String calculatevalue;
            BigDecimal string_to_bigdecimal;
            BigDecimal calculated_value;
            switch (volumeUnit) {
                case BRITISH_GALLON: 
                    calculatevalue = "0.0002199692";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case US_GALLON: 
                    calculatevalue = "0.0002641721";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case LITER: 
                    calculatevalue = "0.001";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILLILITER:
                case CUBIC_CENTIMETER: 
                    calculated_value = value;
                    return calculated_value;
                case CUBIC_METER: 
                    calculatevalue = "0.000001";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CUBIC_INCH: 
                    calculatevalue = "0.0610237441";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CUBIC_FEET: 
                    calculatevalue = "0.0000353147";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    CUBIC_CENTIMETER{
        @Override
        public BigDecimal convert(BigDecimal value, VolumeUnit volumeUnit) {
            String calculatevalue;
            BigDecimal string_to_bigdecimal;
            BigDecimal calculated_value;
            switch (volumeUnit) {
                case BRITISH_GALLON: 
                    calculatevalue = "0.0002199692";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case US_GALLON: 
                    calculatevalue = "0.0002641721";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case LITER: 
                    calculatevalue = "0.001";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILLILITER:
                case CUBIC_CENTIMETER: 
                    calculated_value = value;
                    return calculated_value;
                case CUBIC_METER: 
                    calculatevalue = "0.000001";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CUBIC_INCH: 
                    calculatevalue = "0.0610237441";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CUBIC_FEET: 
                    calculatevalue = "0.0000353147";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    CUBIC_METER{
        @Override
        public BigDecimal convert(BigDecimal value, VolumeUnit volumeUnit) {
            String calculatevalue;
            BigDecimal string_to_bigdecimal;
            BigDecimal calculated_value;
            switch (volumeUnit) {
                case BRITISH_GALLON: 
                    calculatevalue = "219.9692482991";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case US_GALLON: 
                    calculatevalue = "234.1720523581";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case LITER: 
                    calculatevalue = "1000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILLILITER:
                case CUBIC_CENTIMETER: 
                    calculatevalue = "1000000";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CUBIC_METER: 
                    calculated_value = value;
                    return calculated_value;
                case CUBIC_INCH: 
                    calculatevalue = "61023.744094732";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CUBIC_FEET: 
                    calculatevalue = "35.3146667215";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    CUBIC_INCH{
        @Override
        public BigDecimal convert(BigDecimal value, VolumeUnit volumeUnit) {
            String calculatevalue;
            BigDecimal string_to_bigdecimal;
            BigDecimal calculated_value;
            switch (volumeUnit) {
                case BRITISH_GALLON: 
                    calculatevalue = "0.0036046501";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case US_GALLON: 
                    calculatevalue = "0.0043290043";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case LITER: 
                    calculatevalue = "0.016387064";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILLILITER:
                case CUBIC_CENTIMETER: 
                    calculatevalue = "16.387064";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CUBIC_METER: 
                    calculatevalue = "0.0000163871";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CUBIC_INCH: 
                    calculated_value = value;
                    return calculated_value;
                case CUBIC_FEET: 
                    calculatevalue = "0.0005787037";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    },
    CUBIC_FEET{
        @Override
        public BigDecimal convert(BigDecimal value, VolumeUnit volumeUnit) {
            String calculatevalue;
            BigDecimal string_to_bigdecimal;
            BigDecimal calculated_value;
            switch (volumeUnit) {
                case BRITISH_GALLON: 
                    calculatevalue = "6.228835459";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case US_GALLON: 
                    calculatevalue = "7.4805194805";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case LITER: 
                    calculatevalue = "28.316846592";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case MILLILITER:
                case CUBIC_CENTIMETER: 
                    calculatevalue = "28316.846592";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CUBIC_METER: 
                    calculatevalue = "0.0283168466";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CUBIC_INCH: 
                    calculatevalue = "1728";
                    string_to_bigdecimal = new BigDecimal(calculatevalue);
                    calculated_value = value.multiply(string_to_bigdecimal);
                    return calculated_value;
                case CUBIC_FEET: 
                    calculated_value = value;
                    return calculated_value;
            }
            throw new IllegalArgumentException();
        }
    };
    public abstract BigDecimal convert(BigDecimal value, VolumeUnit volumeUnit);
}

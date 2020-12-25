package unitconversioncalculator;
import java.math.BigDecimal;

public enum WeightUnit {
    TON{
        @Override
        public BigDecimal convert(BigDecimal value, WeightUnit weightUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (weightUnit) {
                case TON: 
                    calculatedValue = value;
                    return calculatedValue;
                case BRITISH_TON:
                    calculateValue = "0.9842065276";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case US_TON:
                    calculateValue = "1.1023113109";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case POUND: 
                    calculateValue = "2204.6226218488";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case OUNCE: 
                    calculateValue = "35273.96194958";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOGRAM: 
                    calculateValue = "1000";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case GRAM: 
                    calculateValue = "1000000";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    BRITISH_TON{
        @Override
        public BigDecimal convert(BigDecimal value, WeightUnit weightUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (weightUnit) {
                case TON: 
                    calculateValue = "1.0160469088";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case BRITISH_TON: 
                    calculatedValue = value;
                    return calculatedValue;
                case US_TON: 
                    calculateValue = "1.12";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case POUND: 
                    calculateValue = "2240";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case OUNCE: 
                    calculateValue = "35840";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOGRAM: 
                    calculateValue = "1016.0469088";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case GRAM: 
                    calculateValue = "1016046.9088";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    US_TON{
        @Override
        public BigDecimal convert(BigDecimal value, WeightUnit weightUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (weightUnit) {
                case TON:
                    calculateValue = "0.90718474";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case BRITISH_TON:
                    calculateValue = "0.8928571429";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case US_TON:
                    calculatedValue = value;
                    return calculatedValue;
                case POUND:
                    calculateValue = "2000";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case OUNCE:
                    calculateValue = "32000";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOGRAM:
                    calculateValue = "907.18474";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case GRAM:
                    calculateValue = "907184.74";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    POUND{
        @Override
        public BigDecimal convert(BigDecimal value, WeightUnit weightUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (weightUnit) {
                case TON:
                    calculateValue = "0.0004535924";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case BRITISH_TON:
                    calculateValue = "0.0004464286";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case US_TON:
                    calculateValue = "0.0005";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case POUND:
                    calculatedValue = value;
                    return calculatedValue;
                case OUNCE:
                    calculateValue = "16";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOGRAM:
                    calculateValue = "0.45359237";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case GRAM:
                    calculateValue = "453.59237";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    OUNCE{
        @Override
        public BigDecimal convert(BigDecimal value, WeightUnit weightUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (weightUnit) {
                case TON:
                    calculateValue = "0.0000283495";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case BRITISH_TON:
                    calculateValue = "0.0000279018";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case US_TON:
                    calculateValue = "0.00003125";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case POUND:
                    calculateValue = "0.0625";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case OUNCE:
                    calculatedValue = value;
                    return calculatedValue;
                case KILOGRAM:
                    calculateValue = "0.0283495231";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case GRAM:
                    calculateValue = "28.349523125";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    KILOGRAM{
        @Override
        public BigDecimal convert(BigDecimal value, WeightUnit weightUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (weightUnit) {
                case TON:
                    calculateValue = "0.001";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case BRITISH_TON:
                    calculateValue = "0.0009842065";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case US_TON:
                    calculateValue = "0.0011023113";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case POUND:
                    calculateValue = "2.2046226218";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case OUNCE:
                    calculateValue = "35.2739619496";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOGRAM:
                    calculatedValue = value;
                    return calculatedValue;
                case GRAM:
                    calculateValue = "1000";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    GRAM{
        @Override
        public BigDecimal convert(BigDecimal value, WeightUnit weightUnit) throws IllegalArgumentException{
            String calculateValue;
            BigDecimal stringToBigDecimal;
            BigDecimal calculatedValue;
            switch (weightUnit) {
                case TON:
                    calculateValue = "0.000001";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case BRITISH_TON:
                    calculateValue = Double.toString(9.84206528 * Math.pow(10, -7));
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case US_TON:
                    calculateValue = "0.0000011023";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case POUND:
                    calculateValue = "0.0022046226";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case OUNCE:
                    calculateValue = "0.0352739619";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case KILOGRAM:
                    calculateValue = "0.001";
                    stringToBigDecimal = new BigDecimal(calculateValue);
                    calculatedValue = value.multiply(stringToBigDecimal);
                    return calculatedValue;
                case GRAM:
                    calculatedValue = value;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    };
    public abstract BigDecimal convert(BigDecimal value, WeightUnit weightUnit);
}

package unitconversioncalculator;

public enum VolumeUnit {
    BRITISH_GALLON{
        @Override
        public double convert(double value, VolumeUnit volumeUnit) {
            double calculateValue;
            
            double calculatedValue;
            switch (volumeUnit) {
                case BRITISH_GALLON: 
                    calculatedValue = value;
                    return calculatedValue;
                case US_GALLON: 
                    calculateValue = 1.2009499255;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case LITER: 
                    calculateValue = 4.54609;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILLILITER:
                case CUBIC_CENTIMETER: 
                    calculateValue = 4546.09;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBIC_METER: 
                    calculateValue = 220;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case CUBIC_INCH: 
                    calculateValue = 277.4194327916;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBIC_FEET: 
                    calculateValue = 6.229;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    US_GALLON{
        @Override
        public double convert(double value, VolumeUnit volumeUnit) {
            double calculateValue;
            double calculatedValue;
            switch (volumeUnit) {
                case BRITISH_GALLON: 
                    calculateValue = 1.201;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case US_GALLON: 
                    calculatedValue = value;
                    return calculatedValue;
                case LITER: 
                    calculateValue = 3.785411784;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILLILITER:
                case CUBIC_CENTIMETER: 
                    calculateValue = 3785.411784;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBIC_METER: 
                    calculateValue = 264;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case CUBIC_INCH: 
                    calculateValue = 231;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBIC_FEET: 
                    calculateValue = 7.481;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    LITER{
        @Override
        public double convert(double value, VolumeUnit volumeUnit) {
            double calculateValue;
            double calculatedValue;
            switch (volumeUnit) {
                case BRITISH_GALLON: 
                    calculateValue = 4.546;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case US_GALLON: 
                    calculateValue = 3.785;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case LITER: 
                    calculatedValue = value;
                    return calculatedValue;
                case MILLILITER:
                case CUBIC_CENTIMETER: 
                    calculateValue = 1000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBIC_METER: 
                    calculateValue = 1000;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case CUBIC_INCH: 
                    calculateValue = 61.0237440947;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBIC_FEET: 
                    calculateValue = 28.317;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    MILLILITER{
        @Override
        public double convert(double value, VolumeUnit volumeUnit) {
            double calculateValue;
            double calculatedValue;
            switch (volumeUnit) {
                case BRITISH_GALLON: 
                    calculateValue = 4546;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case US_GALLON: 
                    calculateValue = 0.0002641721;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case LITER: 
                    calculateValue = 3785;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case MILLILITER:
                case CUBIC_CENTIMETER: 
                    calculatedValue = value;
                    return calculatedValue;
                case CUBIC_METER: 
                    calculateValue = 0.000001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBIC_INCH: 
                    calculateValue = 16.387;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case CUBIC_FEET: 
                    calculateValue = 28317;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    CUBIC_CENTIMETER{
        @Override
        public double convert(double value, VolumeUnit volumeUnit) {
            double calculateValue;
            double calculatedValue;
            switch (volumeUnit) {
                case BRITISH_GALLON:
                    calculateValue = 4546;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case US_GALLON:
                    calculateValue = 0.0002641721;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case LITER:
                    calculateValue = 3785;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case MILLILITER:
                case CUBIC_CENTIMETER:
                    calculatedValue = value;
                    return calculatedValue;
                case CUBIC_METER:
                    calculateValue = 0.000001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBIC_INCH:
                    calculateValue = 16.387;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case CUBIC_FEET:
                    calculateValue = 28317;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    CUBIC_METER{
        @Override
        public double convert(double value, VolumeUnit volumeUnit) {
            double calculateValue;
            
            double calculatedValue;
            switch (volumeUnit) {
                case BRITISH_GALLON: 
                    calculateValue = 219.9692482991;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case US_GALLON: 
                    calculateValue = 234.1720523581;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case LITER: 
                    calculateValue = 1000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILLILITER:
                case CUBIC_CENTIMETER: 
                    calculateValue = 1000000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBIC_METER: 
                    calculatedValue = value;
                    return calculatedValue;
                case CUBIC_INCH: 
                    calculateValue = 61023.744094732;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBIC_FEET: 
                    calculateValue = 35.3146667215;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    CUBIC_INCH{
        @Override
        public double convert(double value, VolumeUnit volumeUnit) {
            double calculateValue;
            double calculatedValue;
            switch (volumeUnit) {
                case BRITISH_GALLON: 
                    calculateValue = 277;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case US_GALLON: 
                    calculateValue = 231;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case LITER: 
                    calculateValue = 61.024;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILLILITER:
                case CUBIC_CENTIMETER: 
                    calculateValue = 16.387064;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBIC_METER: 
                    calculateValue = 61024;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case CUBIC_INCH: 
                    calculatedValue = value;
                    return calculatedValue;
                case CUBIC_FEET: 
                    calculateValue = 1728;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    CUBIC_FEET{
        @Override
        public double convert(double value, VolumeUnit volumeUnit) {
            double calculateValue;
            double calculatedValue;
            switch (volumeUnit) {
                case BRITISH_GALLON: 
                    calculateValue = 6.228835459;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case US_GALLON: 
                    calculateValue = 7.4805194805;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case LITER: 
                    calculateValue = 28.316846592;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILLILITER:
                case CUBIC_CENTIMETER: 
                    calculateValue = 28316.846592;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBIC_METER: 
                    calculateValue = 35.315;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBIC_INCH: 
                    calculateValue = 1728;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBIC_FEET: 
                    calculatedValue = value;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    };
    public abstract double convert(double value, VolumeUnit volumeUnit);
}

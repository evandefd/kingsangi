package unitconversioncalculator;

public enum VolumeUnit {
    BRITISHGALLON{
        @Override
        public double convert(double value, VolumeUnit volumeUnit) {
            double calculateValue;
            
            double calculatedValue;
            switch (volumeUnit) {
                case BRITISHGALLON: 
                    calculatedValue = value;
                    return calculatedValue;
                case USGALLON: 
                    calculateValue = 1.2009499255;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case LITER: 
                    calculateValue = 4.54609;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILLILITER:
                case CUBICCENTIMETER: 
                    calculateValue = 4546.09;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICMETER: 
                    calculateValue = 220;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case CUBICINCH: 
                    calculateValue = 277.4194327916;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICFEET: 
                    calculateValue = 6.229;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    USGALLON{
        @Override
        public double convert(double value, VolumeUnit volumeUnit) {
            double calculateValue;
            double calculatedValue;
            switch (volumeUnit) {
                case BRITISHGALLON: 
                    calculateValue = 1.201;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case USGALLON: 
                    calculatedValue = value;
                    return calculatedValue;
                case LITER: 
                    calculateValue = 3.785411784;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILLILITER:
                case CUBICCENTIMETER: 
                    calculateValue = 3785.411784;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICMETER: 
                    calculateValue = 264;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case CUBICINCH: 
                    calculateValue = 231;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICFEET: 
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
                case BRITISHGALLON: 
                    calculateValue = 4.546;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case USGALLON: 
                    calculateValue = 3.785;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case LITER: 
                    calculatedValue = value;
                    return calculatedValue;
                case MILLILITER:
                case CUBICCENTIMETER: 
                    calculateValue = 1000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICMETER: 
                    calculateValue = 1000;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case CUBICINCH: 
                    calculateValue = 61.0237440947;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICFEET: 
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
                case BRITISHGALLON: 
                    calculateValue = 4546;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case USGALLON: 
                    calculateValue = 0.0002641721;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case LITER: 
                    calculateValue = 3785;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case MILLILITER:
                case CUBICCENTIMETER: 
                    calculatedValue = value;
                    return calculatedValue;
                case CUBICMETER: 
                    calculateValue = 0.000001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICINCH: 
                    calculateValue = 16.387;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case CUBICFEET: 
                    calculateValue = 28317;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    CUBICCENTIMETER{
        @Override
        public double convert(double value, VolumeUnit volumeUnit) {
            double calculateValue;
            double calculatedValue;
            switch (volumeUnit) {
                case BRITISHGALLON:
                    calculateValue = 4546;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case USGALLON:
                    calculateValue = 0.0002641721;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case LITER:
                    calculateValue = 3785;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case MILLILITER:
                case CUBICCENTIMETER:
                    calculatedValue = value;
                    return calculatedValue;
                case CUBICMETER:
                    calculateValue = 0.000001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICINCH:
                    calculateValue = 16.387;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case CUBICFEET:
                    calculateValue = 28317;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    CUBICMETER{
        @Override
        public double convert(double value, VolumeUnit volumeUnit) {
            double calculateValue;
            
            double calculatedValue;
            switch (volumeUnit) {
                case BRITISHGALLON: 
                    calculateValue = 219.9692482991;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case USGALLON: 
                    calculateValue = 234.1720523581;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case LITER: 
                    calculateValue = 1000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILLILITER:
                case CUBICCENTIMETER: 
                    calculateValue = 1000000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICMETER: 
                    calculatedValue = value;
                    return calculatedValue;
                case CUBICINCH: 
                    calculateValue = 61023.744094732;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICFEET: 
                    calculateValue = 35.3146667215;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    CUBICINCH{
        @Override
        public double convert(double value, VolumeUnit volumeUnit) {
            double calculateValue;
            double calculatedValue;
            switch (volumeUnit) {
                case BRITISHGALLON: 
                    calculateValue = 277;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case USGALLON: 
                    calculateValue = 231;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case LITER: 
                    calculateValue = 61.024;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILLILITER:
                case CUBICCENTIMETER: 
                    calculateValue = 16.387064;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICMETER: 
                    calculateValue = 61024;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case CUBICINCH: 
                    calculatedValue = value;
                    return calculatedValue;
                case CUBICFEET: 
                    calculateValue = 1728;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    CUBICFEET{
        @Override
        public double convert(double value, VolumeUnit volumeUnit) {
            double calculateValue;
            double calculatedValue;
            switch (volumeUnit) {
                case BRITISHGALLON: 
                    calculateValue = 6.228835459;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case USGALLON: 
                    calculateValue = 7.4805194805;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case LITER: 
                    calculateValue = 28.316846592;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILLILITER:
                case CUBICCENTIMETER: 
                    calculateValue = 28316.846592;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICMETER: 
                    calculateValue = 35.315;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICINCH: 
                    calculateValue = 1728;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICFEET: 
                    calculatedValue = value;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    };
    public abstract double convert(double value, VolumeUnit volumeUnit);
}

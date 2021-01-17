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
                    calculateValue = 1.0320567434887;
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
                    calculateValue = 0.00454609;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICINCH: 
                    calculateValue = 277.41943279162;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICFEET: 
                    calculateValue = 0.16054365323589;
                    calculatedValue = value * calculateValue;
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
                    calculateValue = 0.96893897192093;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case USGALLON: 
                    calculatedValue = value;
                    return calculatedValue;
                case LITER: 
                    calculateValue = 4.40488377086;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILLILITER:
                case CUBICCENTIMETER: 
                    calculateValue = 4404.88377086;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICMETER: 
                    calculateValue = 0.00440488377086;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICINCH: 
                    calculateValue = 268.8025;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICFEET: 
                    calculateValue = 0.15555700231;
                    calculatedValue = value * calculateValue;
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
                    calculateValue = 0.22702074606721;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case USGALLON: 
                    calculateValue = 0.21996924829909;
                    calculatedValue = value * calculateValue;
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
                    calculateValue = 61.023744094732;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICFEET: 
                    calculateValue = 0.035314666721489;
                    calculatedValue = value * calculateValue;
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
                    calculateValue = 0.00022702074606721;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case USGALLON: 
                    calculateValue = 0.00021996924829909;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case LITER: 
                    calculateValue = 0.001;
                    calculatedValue = value * calculateValue;
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
                    calculateValue = 0.061023744094732;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICFEET: 
                    calculateValue = 0.000035314666721489;
                    calculatedValue = value * calculateValue;
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
                    calculateValue = 0.00022702074606721;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case USGALLON:
                    calculateValue = 0.00021996924829909;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case LITER:
                    calculateValue = 0.001;
                    calculatedValue = value * calculateValue;
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
                    calculateValue = 0.061023744094732;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICFEET:
                    calculateValue = 0.000035314666721489;
                    calculatedValue = value * calculateValue;
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
                    calculateValue = 227.02074606721;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case USGALLON: 
                    calculateValue = 219.96924829909;
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
                    calculateValue = 35.314666721489;
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
                    calculateValue = 0.0037202034951312;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case USGALLON: 
                    calculateValue = 0.003604650149909;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case LITER: 
                    calculateValue = 0.016387064;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILLILITER:
                case CUBICCENTIMETER: 
                    calculateValue = 16.387064;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICMETER: 
                    calculateValue = 0.000016387064;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case CUBICINCH: 
                    calculatedValue = value;
                    return calculatedValue;
                case CUBICFEET: 
                    calculateValue = 5.787037037037 * Math.pow(10, -4);
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
                    calculateValue = 6.4285116395867;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case USGALLON: 
                    calculateValue = 6.2288354590428;
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
                    calculateValue = 0.028316846592;
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

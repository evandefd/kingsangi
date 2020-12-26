package unitconversioncalculator;

public enum TimeUnit {
    SECOND{
        @Override
        public double convert(double value, TimeUnit timeUnit) {
            double calculateValue;
            double calculatedValue;
            switch (timeUnit) {
                case SECOND:
                    calculatedValue = value;
                    return calculatedValue;
                case MINUTE:
                    calculateValue = 60;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case HOUR:
                    calculateValue = 3600;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case DAY:
                    calculateValue = 86400;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case WEEK:
                    calculateValue = 604800;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    MINUTE{
        @Override
        public double convert(double value, TimeUnit timeUnit) {
            double calculateValue;
            double calculatedValue;
            switch (timeUnit) {
                case SECOND:
                    calculateValue = 60;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MINUTE:
                    calculatedValue = value;
                    return calculatedValue;
                case HOUR:
                    calculateValue = 60;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case DAY:
                    calculateValue = 1440;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case WEEK:
                    calculateValue = 10080;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    HOUR{
        @Override
        public double convert(double value, TimeUnit timeUnit) {
            double calculateValue;
            double calculatedValue;
            switch (timeUnit) {
                case SECOND:
                    calculateValue = 3600;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MINUTE:
                    calculateValue = 60;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case HOUR:
                    calculatedValue = value;
                    return calculatedValue;
                case DAY:
                    calculateValue = 24;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
                case WEEK:
                    calculateValue = 168;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    DAY{
        @Override
        public double convert(double value, TimeUnit timeUnit) {
            double calculateValue;
            double calculatedValue;
            switch (timeUnit) {
                case SECOND:
                    calculateValue = 86400;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MINUTE:
                    calculateValue = 1440;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case HOUR:
                    calculateValue = 24;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case DAY:
                    calculatedValue = value;
                    return calculatedValue;
                case WEEK:
                    calculateValue = 7;
                    calculatedValue = value / calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    WEEK{
        @Override
        public double convert(double value, TimeUnit timeUnit) {
            double calculateValue;
            double calculatedValue;
            switch (timeUnit) {
                case SECOND:
                    calculateValue = 604800;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MINUTE:
                    calculateValue = 10080;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case HOUR:
                    calculateValue = 168;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case DAY:
                    calculateValue = 7;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case WEEK:
                    calculatedValue = value;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    };
    public abstract double convert(double value, TimeUnit timeUnit);
}

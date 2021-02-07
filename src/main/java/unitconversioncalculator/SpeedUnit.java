package unitconversioncalculator;

public enum SpeedUnit {
    METERPERSECOND{
        @Override
        public double convert(double value, SpeedUnit speedUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (speedUnit) {
                case METERPERSECOND:
                    calculatedValue = value;
                    return calculatedValue;
                case METERPERHOUR:
                    calculateValue = 3600;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETERPERSECOND:
                    calculateValue = 0.001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETERPERHOUR:
                    calculateValue = 3.6;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCHPERSECOND:
                    calculateValue = 39.370078740157;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCHPERHOUR:
                    calculateValue = 141732.28346457;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEETPERSECOND:
                    calculateValue = 3.2808398950131;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEETPERHOUR:
                    calculateValue = 11811.02362204;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILEPERSECOND:
                    calculateValue = 0.00062137119223733;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILEPERHOUR:
                    calculateValue = 2.2369362920544;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KNOT:
                    calculateValue = 1.9438461717893;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    METERPERHOUR{
        @Override
        public double convert(double value, SpeedUnit speedUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (speedUnit) {
                case METERPERSECOND:
                    calculateValue = 0.00027777777777778;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METERPERHOUR:
                    calculatedValue = value;
                    return calculatedValue;
                case KILOMETERPERSECOND:
                    calculateValue = 2.777777777778 * Math.pow(10, -7);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETERPERHOUR:
                    calculateValue = 0.001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCHPERSECOND:
                    calculateValue = 0.010936132983377;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCHPERHOUR:
                    calculateValue = 39.370078740157;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEETPERSECOND:
                    calculateValue = 0.00091134441528142;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEETPERHOUR:
                    calculateValue = 3.2808398950131;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILEPERSECOND:
                    calculateValue = 1.7260310895481 * Math.pow(10, -7);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILEPERHOUR:
                    calculateValue = 0.00062137119223733;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KNOT:
                    calculateValue = 0.00053995726994149;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    KILOMETERPERSECOND{
        @Override
        public double convert(double value, SpeedUnit speedUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (speedUnit) {
                case METERPERSECOND:
                    calculateValue = 1000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METERPERHOUR:
                    calculateValue = 3600000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETERPERSECOND:
                    calculatedValue = value;
                    return calculatedValue;
                case KILOMETERPERHOUR:
                    calculateValue = 3600;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCHPERSECOND:
                    calculateValue = 39370.078740157;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCHPERHOUR:
                    calculateValue = 141732283.4;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEETPERSECOND:
                    calculateValue = 3280.8398950131;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEETPERHOUR:
                    calculateValue = 11811023.622047;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILEPERSECOND:
                    calculateValue = 0.6213711922373;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILEPERHOUR:
                    calculateValue = 2236.9362920544;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KNOT:
                    calculateValue = 1943.8461717893;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    KILOMETERPERHOUR{
        @Override
        public double convert(double value, SpeedUnit speedUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (speedUnit) {
                case METERPERSECOND:
                    calculateValue = 0.27777777777778;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METERPERHOUR:
                    calculateValue = 1000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETERPERSECOND:
                    calculateValue = 0.00027777777777778;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETERPERHOUR:
                    calculatedValue = value;
                    return calculatedValue;
                case INCHPERSECOND:
                    calculateValue = 10.936132983377;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCHPERHOUR:
                    calculateValue = 39370.078740157;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEETPERSECOND:
                    calculateValue = 0.91134441528142;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEETPERHOUR:
                    calculateValue = 3280.8398950131;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILEPERSECOND:
                    calculateValue = 0.00017260310895481;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILEPERHOUR:
                    calculateValue = 0.6213711922373;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KNOT:
                    calculateValue = 0.53995726994149;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    INCHPERSECOND{
        @Override
        public double convert(double value, SpeedUnit speedUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (speedUnit) {
                case METERPERSECOND:
                    calculateValue = 0.0254;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METERPERHOUR:
                    calculateValue = 91.44;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETERPERSECOND:
                    calculateValue = 0.0000254;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETERPERHOUR:
                    calculateValue = 0.0914;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCHPERSECOND:
                    calculatedValue = value;
                    return calculatedValue;
                case INCHPERHOUR:
                    calculateValue = 3600;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEETPERSECOND:
                    calculateValue = 0.08333333333333;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEETPERHOUR:
                    calculateValue = 300;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILEPERSECOND:
                    calculateValue = 0.000015782828282828;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILEPERHOUR:
                    calculateValue = 0.05681818181818;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KNOT:
                    calculateValue = 0.049373692763449;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    INCHPERHOUR{
        @Override
        public double convert(double value, SpeedUnit speedUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (speedUnit) {
                case METERPERSECOND:
                    calculateValue = 7.0555555555556 * Math.pow(10, -6);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METERPERHOUR:
                    calculateValue = 0.0254;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETERPERSECOND:
                    calculateValue = 7.0555555555556 * Math.pow(10, -9);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETERPERHOUR:
                    calculateValue = 0.0000254;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCHPERSECOND:
                    calculateValue = 7.0555555555556 * Math.pow(10, -4);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCHPERHOUR:
                    calculatedValue = value;
                    return calculatedValue;
                case FEETPERSECOND:
                    calculateValue = 0.000023148148148148;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEETPERHOUR:
                    calculateValue = 0.08333333333333;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILEPERSECOND:
                    calculateValue = 4.3841189674523 * Math.pow(10, -9);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILEPERHOUR:
                    calculateValue = 0.000015782828282828;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KNOT:
                    calculateValue = 0.000013714914656514;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    FEETPERSECOND{
        @Override
        public double convert(double value, SpeedUnit speedUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (speedUnit) {
                case METERPERSECOND:
                    calculateValue = 0.3048;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METERPERHOUR:
                    calculateValue = 1097.28;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETERPERSECOND:
                    calculateValue = 0.0003048;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETERPERHOUR:
                    calculateValue = 1.09728;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCHPERSECOND:
                    calculateValue = 12;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCHPERHOUR:
                    calculateValue = 43200;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEETPERSECOND:
                    calculatedValue = value;
                    return calculatedValue;
                case FEETPERHOUR:
                    calculateValue = 3600;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILEPERSECOND:
                    calculateValue = 0.00018939393939394;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILEPERHOUR:
                    calculateValue = 0.68181818181818;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KNOT:
                    calculateValue = 0.59248431316139;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    FEETPERHOUR{
        @Override
        public double convert(double value, SpeedUnit speedUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (speedUnit) {
                case METERPERSECOND:
                    calculateValue = 0.000084666666666667;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METERPERHOUR:
                    calculateValue = 0.3048;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETERPERSECOND:
                    calculateValue = 8.4666666666667 * Math.pow(10, -8);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETERPERHOUR:
                    calculateValue = 0.0003048;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCHPERSECOND:
                    calculateValue = 0.0033333333333333;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCHPERHOUR:
                    calculateValue = 12;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEETPERSECOND:
                    calculateValue = 0.00027777777777778;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEETPERHOUR:
                    calculatedValue = value;
                    return calculatedValue;
                case MILEPERSECOND:
                    calculateValue = 5.2609427609428 * Math.pow(10, -8);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILEPERHOUR:
                    calculateValue = 0.00018939393939394;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KNOT:
                    calculateValue = 0.00016457897587816;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    MILEPERSECOND{
        @Override
        public double convert(double value, SpeedUnit speedUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (speedUnit) {
                case METERPERSECOND:
                    calculateValue = 1609.344;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METERPERHOUR:
                    calculateValue = 5793638.4;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETERPERSECOND:
                    calculateValue = 1.609344;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETERPERHOUR:
                    calculateValue = 5793.6384;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCHPERSECOND:
                    calculateValue = 63360;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCHPERHOUR:
                    calculateValue = 228096000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEETPERSECOND:
                    calculateValue = 5280;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEETPERHOUR:
                    calculateValue = 19008000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILEPERSECOND:
                    calculatedValue = value;
                    return calculatedValue;
                case MILEPERHOUR:
                    calculateValue = 3600;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KNOT:
                    calculateValue = 3128.317173492;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    MILEPERHOUR{
        @Override
        public double convert(double value, SpeedUnit speedUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (speedUnit) {
                case METERPERSECOND:
                    calculateValue = 0.44704;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METERPERHOUR:
                    calculateValue = 1609.344;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETERPERSECOND:
                    calculateValue = 0.00044704;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETERPERHOUR:
                    calculateValue = 1.609344;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCHPERSECOND:
                    calculateValue = 17.6;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCHPERHOUR:
                    calculateValue = 63360;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEETPERSECOND:
                    calculateValue = 1.4666666666667;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEETPERHOUR:
                    calculateValue = 5280;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILEPERSECOND:
                    calculateValue = 0.00027777777777778;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILEPERHOUR:
                    calculatedValue = value;
                    return calculatedValue;
                case KNOT:
                    calculateValue = 0.86897699263671;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    KNOT{
        @Override
        public double convert(double value, SpeedUnit speedUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (speedUnit) {
                case METERPERSECOND:
                    calculateValue = 0.514444;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case METERPERHOUR:
                    calculateValue = 1851.9984;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETERPERSECOND:
                    calculateValue = 5.14444 * Math.pow(10, -4);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KILOMETERPERHOUR:
                    calculateValue = 1.8519984;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCHPERSECOND:
                    calculateValue = 20.253700787402;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case INCHPERHOUR:
                    calculateValue = 72913.322834646;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEETPERSECOND:
                    calculateValue = 1.6878083989501;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case FEETPERHOUR:
                    calculateValue = 6076.1102362205;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILEPERSECOND:
                    calculateValue = 0.00031966068161934;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case MILEPERHOUR:
                    calculateValue = 1.1507784538296;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case KNOT:
                    calculatedValue = value;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    };
    public abstract double convert(double value, SpeedUnit speedUnit);
}

package unitconversioncalculator;

public enum AreaUnit {
    ACRE{
        @Override
        public double convert(double value, AreaUnit areaUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculatedValue = value;
                    return calculatedValue;
                case ARE:
                    calculateValue = 40.468564224;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case HECTARE:
                    calculateValue = 0.404685642;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARECENTIMETER:
                    calculateValue = 40468564.224;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUAREFEET:
                    calculateValue = 43560;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUAREINCH:
                    calculateValue = 6272640;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUAREMETER:
                    calculateValue = 4046.8564224;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PYEONG:
                    calculateValue = 1224.1741136825;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    ARE {
        @Override
        public double convert(double value, AreaUnit areaUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculateValue = 0.024710538;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case ARE:
                    calculatedValue = value;
                    return calculatedValue;
                case HECTARE:
                    calculateValue = 0.01;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARECENTIMETER:
                    calculateValue = 1000000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUAREFEET:
                    calculateValue = 1076.391041671;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUAREINCH:
                    calculateValue = 155000.31000062;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUAREMETER:
                    calculateValue = 100;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PYEONG:
                    calculateValue = 30.2500011344;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    HECTARE{
        @Override
        public double convert(double value, AreaUnit areaUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculateValue = 2.4710538147;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case ARE:
                    calculateValue = 100;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case HECTARE:
                    calculatedValue = value;
                    return calculatedValue;
                case SQUARECENTIMETER:
                    calculateValue = Math.pow(10, 8);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUAREFEET:
                    calculateValue = 107639.1041671;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUAREINCH:
                    calculateValue = 15500031.000062;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUAREMETER:
                    calculateValue = 10000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PYEONG:
                    calculateValue = 3025.00011344;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    SQUARECENTIMETER{
        @Override
        public double convert(double value, AreaUnit areaUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculateValue = 2.4710538146717 * Math.pow(10, -8);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case ARE:
                    calculateValue = Math.pow(10, -6);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case HECTARE:
                    calculateValue = Math.pow(10, -8);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARECENTIMETER:
                    calculatedValue = value;
                    return calculatedValue;
                case SQUAREFEET:
                    calculateValue = 0.001076391041671;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUAREINCH:
                    calculateValue = 0.15500031000062;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUAREMETER:
                    calculateValue = 0.0001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PYEONG:
                    calculateValue = 0.00003025;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    SQUAREFEET{
        @Override
        public double convert(double value, AreaUnit areaUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculateValue = 0.000022956841138659;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case ARE:
                    calculateValue = 0.0009290304;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case HECTARE:
                    calculateValue = 0.000009290304;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARECENTIMETER:
                    calculateValue = 929.0304;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUAREFEET:
                    calculatedValue = value;
                    return calculatedValue;
                case SQUAREINCH:
                    calculateValue = 144;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUAREMETER:
                    calculateValue = 0.09290304;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PYEONG:
                    calculateValue = 0.0281031707;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    SQUAREINCH{
        @Override
        public double convert(double value, AreaUnit areaUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculateValue = 1.5942250790736 * Math.pow(10, -7);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case ARE:
                    calculateValue = 0.0000064516;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case HECTARE:
                    calculateValue = 6.45160000 * Math.pow(10, -8);
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARECENTIMETER:
                    calculateValue = 6.4516;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUAREFEET:
                    calculateValue = 0.0069444444444444;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUAREINCH:
                    calculatedValue = value;
                    return calculatedValue;
                case SQUAREMETER:
                    calculateValue = 0.00064516;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PYEONG:
                    calculateValue = 0.000195161;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    SQUAREMETER{
        @Override
        public double convert(double value, AreaUnit areaUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculateValue = 0.00024710538146717;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case ARE:
                    calculateValue = 0.01;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case HECTARE:
                    calculateValue = 0.0001;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARECENTIMETER:
                    calculateValue = 10000;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUAREFEET:
                    calculateValue = 10.76391041671;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUAREINCH:
                    calculateValue = 1550.0031000062;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUAREMETER:
                    calculatedValue = value;
                    return calculatedValue;
                case PYEONG:
                    calculateValue = 0.3025000113;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
            }
            throw new IllegalArgumentException();
        }
    },
    PYEONG{
        @Override
        public double convert(double value, AreaUnit areaUnit) throws IllegalArgumentException{
            double calculateValue;
            double calculatedValue;
            switch (areaUnit) {
                case ACRE:
                    calculateValue = 0.0008168772941145;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case ARE:
                    calculateValue = 0.03305785124;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case HECTARE:
                    calculateValue = 0.0003305785124;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUARECENTIMETER:
                    calculateValue = 33057.8512;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUAREFEET:
                    calculateValue = 35.58317493163;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUAREINCH:
                    calculateValue = 5123.9771902;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case SQUAREMETER:
                    calculateValue = 3.30578512;
                    calculatedValue = value * calculateValue;
                    return calculatedValue;
                case PYEONG:
                    calculatedValue = value;
                    return calculatedValue;
            }
                throw new IllegalArgumentException();
        }
    };
    public abstract double convert(double value, AreaUnit areaUnit);
}

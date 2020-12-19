public class WeightConversion {
    private static final StringBuilder result = new StringBuilder();
    private enum weightEnum{
        TON,
        BRITISH_TON,
        US_TON,
        POUND,
        OUNCE,
        KILOGRAM,
        GRAM
    }
    public static String weightConversion(String before_command, String after_command, double num){
        if(before_command.equals(String.valueOf(weightEnum.TON))){
            if(after_command.equals(String.valueOf(weightEnum.TON))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(weightEnum.BRITISH_TON))){
                result.append(num * 0.9842065276);
            }
            else if(after_command.equals(String.valueOf(weightEnum.US_TON))){
                result.append(num * 1.1023113109);
            }
            else if(after_command.equals(String.valueOf(weightEnum.POUND))){
                result.append(num * 2204.6226218488);
            }
            else if(after_command.equals(String.valueOf(weightEnum.OUNCE))){
                result.append(num * 35273.96194958);
            }
            else if(after_command.equals(String.valueOf(weightEnum.KILOGRAM))){
                result.append(num * 1000);
            }
            else if(after_command.equals(String.valueOf(weightEnum.GRAM))){
                result.append(num * 1000000);
            }
        }
        else if(before_command.equals(String.valueOf(weightEnum.BRITISH_TON))){
            if(after_command.equals(String.valueOf(weightEnum.TON))){
                result.append(num * 1.0160469088);
            }
            else if(after_command.equals(String.valueOf(weightEnum.BRITISH_TON))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(weightEnum.US_TON))){
                result.append(num * 1.12);
            }
            else if(after_command.equals(String.valueOf(weightEnum.POUND))){
                result.append(num * 2240);
            }
            else if(after_command.equals(String.valueOf(weightEnum.OUNCE))){
                result.append(num * 35840);
            }
            else if(after_command.equals(String.valueOf(weightEnum.KILOGRAM))){
                result.append(num * 1016.0469088);
            }
            else if(after_command.equals(String.valueOf(weightEnum.GRAM))){
                result.append(num * 1016046.9088);
            }
        }
        else if(before_command.equals(String.valueOf(weightEnum.US_TON))){
            if(after_command.equals(String.valueOf(weightEnum.TON))){
                result.append(num * 0.90718474);
            }
            else if(after_command.equals(String.valueOf(weightEnum.BRITISH_TON))){
                result.append(num * 0.8928571429);
            }
            else if(after_command.equals(String.valueOf(weightEnum.US_TON))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(weightEnum.POUND))){
                result.append(num * 2000);
            }
            else if(after_command.equals(String.valueOf(weightEnum.OUNCE))){
                result.append(num * 32000);
            }
            else if(after_command.equals(String.valueOf(weightEnum.KILOGRAM))){
                result.append(num * 907.18474);
            }
            else if(after_command.equals(String.valueOf(weightEnum.GRAM))){
                result.append(num * 907184.74);
            }
        }
        else if(before_command.equals(String.valueOf(weightEnum.POUND))){
            if(after_command.equals(String.valueOf(weightEnum.TON))){
                result.append(num * 0.0004535924);
            }
            else if(after_command.equals(String.valueOf(weightEnum.BRITISH_TON))){
                result.append(num * 0.0004464286);
            }
            else if(after_command.equals(String.valueOf(weightEnum.US_TON))){
                result.append(num * 0.0005);
            }
            else if(after_command.equals(String.valueOf(weightEnum.POUND))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(weightEnum.OUNCE))){
                result.append(num * 16);
            }
            else if(after_command.equals(String.valueOf(weightEnum.KILOGRAM))){
                result.append(num * 0.45359237);
            }
            else if(after_command.equals(String.valueOf(weightEnum.GRAM))){
                result.append(num * 453.59237);
            }
        }
        else if(before_command.equals(String.valueOf(weightEnum.OUNCE))){
            if(after_command.equals(String.valueOf(weightEnum.TON))){
                result.append(num * 0.0000283495);
            }
            else if(after_command.equals(String.valueOf(weightEnum.BRITISH_TON))){
                result.append(num * 0.0000279018);
            }
            else if(after_command.equals(String.valueOf(weightEnum.US_TON))){
                result.append(num * 0.00003125);
            }
            else if(after_command.equals(String.valueOf(weightEnum.POUND))){
                result.append(num * 0.0625);
            }
            else if(after_command.equals(String.valueOf(weightEnum.OUNCE))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(weightEnum.KILOGRAM))){
                result.append(num * 0.0283495231);
            }
            else if(after_command.equals(String.valueOf(weightEnum.GRAM))){
                result.append(num * 28.349523125);
            }
        }
        else if(before_command.equals(String.valueOf(weightEnum.KILOGRAM))){
            if(after_command.equals(String.valueOf(weightEnum.TON))){
                result.append(num * 0.001);
            }
            else if(after_command.equals(String.valueOf(weightEnum.BRITISH_TON))){
                result.append(num * 0.0009842065);
            }
            else if(after_command.equals(String.valueOf(weightEnum.US_TON))){
                result.append(num * 0.0011023113);
            }
            else if(after_command.equals(String.valueOf(weightEnum.POUND))){
                result.append(num * 2.2046226218);
            }
            else if(after_command.equals(String.valueOf(weightEnum.OUNCE))){
                result.append(num * 35.2739619496);
            }
            else if(after_command.equals(String.valueOf(weightEnum.KILOGRAM))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(weightEnum.GRAM))){
                result.append(num * 1000);
            }
        }
        else if(before_command.equals(String.valueOf(weightEnum.GRAM))){
            if(after_command.equals(String.valueOf(weightEnum.TON))){
                result.append(num * 0.000001);
            }
            else if(after_command.equals(String.valueOf(weightEnum.BRITISH_TON))){
                result.append(num * 9.84206528 * Math.pow(10, -7));
            }
            else if(after_command.equals(String.valueOf(weightEnum.US_TON))){
                result.append(num * 0.0000011023);
            }
            else if(after_command.equals(String.valueOf(weightEnum.POUND))){
                result.append(num * 0.0022046226);
            }
            else if(after_command.equals(String.valueOf(weightEnum.OUNCE))){
                result.append(num * 0.0352739619);
            }
            else if(after_command.equals(String.valueOf(weightEnum.KILOGRAM))){
                result.append(num * 0.001);
            }
            else if(after_command.equals(String.valueOf(weightEnum.GRAM))){
                result.append(num);
            }
        }
        return result.toString();
    }
}

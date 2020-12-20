public class AreaConversion {
    private static final StringBuilder result = new StringBuilder();
    private enum areaEnum{
        ACRE,
        ARE,
        HECTARE,
        SQUARE_CENTIMETER,
        SQUARE_FEET,
        SQUARE_INCH,
        SQUARE_METER,
        PYEONG
    }
    public static String areaConversion(Enum before_command, Enum after_command, double num){
        if(before_command.equals(String.valueOf(areaEnum.ACRE))){
            if(after_command.equals(String.valueOf(areaEnum.ACRE))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(areaEnum.ARE))){
                result.append(num * 40.468564224);
            }
            else if(after_command.equals(String.valueOf(areaEnum.HECTARE))){
                result.append(num * 0.4046856422);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_CENTIMETER))){
                result.append(num * 40468564.224);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_FEET))){
                result.append(num * 43560);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_INCH))){
                result.append(num * 6272640);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_METER))){
                result.append(num * 4046.8564224);
            }
            else if(after_command.equals(String.valueOf(areaEnum.PYEONG))){
                result.append(num * 1224.1741136825);
            }
        }
        else if(before_command.equals(String.valueOf(areaEnum.ARE))){
            if(after_command.equals(String.valueOf(areaEnum.ACRE))){
                result.append(num * 0.0247105381);
            }
            else if(after_command.equals(String.valueOf(areaEnum.ARE))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(areaEnum.HECTARE))){
                result.append(num * 0.01);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_CENTIMETER))){
                result.append(num * 1000);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_FEET))){
                result.append(num * 1076.391041671);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_INCH))){
                result.append(num * 155000.31000062);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_METER))){
                result.append(num * 100);
            }
            else if(after_command.equals(String.valueOf(areaEnum.PYEONG))){
                result.append(num * 30.2500011344);
            }
        }
        else if(before_command.equals(String.valueOf(areaEnum.HECTARE))){
            if(after_command.equals(String.valueOf(areaEnum.ACRE))){
                result.append(num * 2.4710538147);
            }
            else if(after_command.equals(String.valueOf(areaEnum.ARE))){
                result.append(num * 100);
            }
            else if(after_command.equals(String.valueOf(areaEnum.HECTARE))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_CENTIMETER))){
                result.append(num * 100000);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_FEET))){
                result.append(num * 107639.1041671);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_INCH))){
                result.append(num * 15500031.000062);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_METER))){
                result.append(num * 10000);
            }
            else if(after_command.equals(String.valueOf(areaEnum.PYEONG))){
                result.append(num * 3025.0001134375);
            }
        }
        else if(before_command.equals(String.valueOf(areaEnum.SQUARE_CENTIMETER))){
            if(after_command.equals(String.valueOf(areaEnum.ACRE))){
                result.append(num * 2.47105381 * Math.pow(10, -8));
            }
            else if(after_command.equals(String.valueOf(areaEnum.ARE))){
                result.append(num * Math.pow(10, -6));
            }
            else if(after_command.equals(String.valueOf(areaEnum.HECTARE))){
                result.append(num * Math.pow(10, -8));
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_CENTIMETER))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_FEET))){
                result.append(num * 0.00107391);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_INCH))){
                result.append(num * 0.15500031);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_METER))){
                result.append(num * 0.0001);
            }
            else if(after_command.equals(String.valueOf(areaEnum.PYEONG))){
                result.append(num * 0.00003025);
            }
        }
        else if(before_command.equals(String.valueOf(areaEnum.SQUARE_FEET))){
            if(after_command.equals(String.valueOf(areaEnum.ACRE))){
                result.append(num * 0.0000229568);
            }
            else if(after_command.equals(String.valueOf(areaEnum.ARE))){
                result.append(num * 0.0009290304);
            }
            else if(after_command.equals(String.valueOf(areaEnum.HECTARE))){
                result.append(num * 0.0000092903);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_CENTIMETER))){
                result.append(num * 929.0304);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_FEET))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_INCH))){
                result.append(num * 144);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_METER))){
                result.append(num * 0.09290304);
            }
            else if(after_command.equals(String.valueOf(areaEnum.PYEONG))){
                result.append(num * 0.0281031707);
            }
        }
        else if(before_command.equals(String.valueOf(areaEnum.SQUARE_INCH))){
            if(after_command.equals(String.valueOf(areaEnum.ACRE))){
                result.append(num * 1.59422508 * Math.pow(10, -7));
            }
            else if(after_command.equals(String.valueOf(areaEnum.ARE))){
                result.append(num * 0.0000064516);
            }
            else if(after_command.equals(String.valueOf(areaEnum.HECTARE))){
                result.append(num * 6.45160000*Math.pow(10, -8));
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_CENTIMETER))){
                result.append(num * 6.4516);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_FEET))){
                result.append(num * 0.0069444444);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_INCH))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_METER))){
                result.append(num * 0.00064516);
            }
            else if(after_command.equals(String.valueOf(areaEnum.PYEONG))){
                result.append(num * 0.0001951609);
            }
        }
        else if(before_command.equals(String.valueOf(areaEnum.SQUARE_METER))){
            if(after_command.equals(String.valueOf(areaEnum.ACRE))) {
                result.append(num * 0.0002471054);
            }
            else if(after_command.equals(String.valueOf(areaEnum.ARE))){
                result.append(num * 0.01);
            }
            else if(after_command.equals(String.valueOf(areaEnum.HECTARE))){
                result.append(num * 0.0001);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_CENTIMETER))){
                result.append(num * 10000);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_FEET))){
                result.append(num * 10.7639104167);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_INCH))){
                result.append(num * 1550.0031000062);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_METER))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(areaEnum.PYEONG))){
                result.append(num * 0.3025000113);
            }
        }
        else if(before_command.equals(String.valueOf(areaEnum.PYEONG))){
            if(after_command.equals(String.valueOf(areaEnum.ACRE))) {
                result.append(num * 0.0008168773);
            }
            else if(after_command.equals(String.valueOf(areaEnum.ARE))){
                result.append(num * 0.03305785);
            }
            else if(after_command.equals(String.valueOf(areaEnum.HECTARE))){
                result.append(num * 0.0003305785);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_CENTIMETER))){
                result.append(num * 33057.85);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_FEET))){
                result.append(num * 35.5831735969);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_INCH))){
                result.append(num * 5123.946997954);
            }
            else if(after_command.equals(String.valueOf(areaEnum.SQUARE_METER))){
                result.append(num * 3.305785);
            }
            else if(after_command.equals(String.valueOf(areaEnum.PYEONG))){
                result.append(num);
            }
        }
        return result.toString();
    }
}

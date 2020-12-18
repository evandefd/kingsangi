public class DataConversion {
    private static final String[] BEFORE_DATA_UNIT = {"bit", "byte", "kilobyte", "megabyte", "gigabyte", "terabyte"};
    private static final String[] AFTER_DATA_UNIT = {"bit", "byte", "kilobyte", "megabyte", "gigabyte", "terabyte"};
    private static final StringBuilder result = new StringBuilder();
    public static String dataConversion(String before_command, String after_command, double num){
        if(before_command.equals(BEFORE_DATA_UNIT[0])){
            if(after_command.equals(AFTER_DATA_UNIT[0])){
                result.append(num);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[1])){
                result.append(num * 0.125);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[2])){
                result.append(num * 0.0001220703);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[3])){
                result.append(num * 1.19209290 * Math.pow(10, -7));
            }
            else if(after_command.equals(AFTER_DATA_UNIT[4])){
                result.append(num * 1.16415322 * Math.pow(10, -10));
            }
            else if(after_command.equals(AFTER_DATA_UNIT[5])){
                result.append(num * 1.13686838 * Math.pow(10, -13));
            }
        }
        else if(before_command.equals(BEFORE_DATA_UNIT[1])){
            if(after_command.equals(AFTER_DATA_UNIT[0])){
                result.append(num * 8);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[1])){
                result.append(num);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[2])){
                result.append(num * 0.0009765625);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[3])){
                result.append(num * 9.53674316 * Math.pow(10, -7));
            }
            else if(after_command.equals(AFTER_DATA_UNIT[4])){
                result.append(num * 9.31322575 * Math.pow(10, -10));
            }
            else if(after_command.equals(AFTER_DATA_UNIT[5])){
                result.append(num * 9.09494702 * Math.pow(10, -13));
            }
        }
        else if(before_command.equals(BEFORE_DATA_UNIT[2])){
            if(after_command.equals(AFTER_DATA_UNIT[0])){
                result.append(num * 8192);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[1])){
                result.append(num * 1024);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[2])){
                result.append(num);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[3])){
                result.append(num * 0.0009765625);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[4])){
                result.append(num * 9.53674316 * Math.pow(10, -7));
            }
            else if(after_command.equals(AFTER_DATA_UNIT[5])){
                result.append(num * 9.31322575 * Math.pow(10, -10));
            }
        }
        else if(before_command.equals(BEFORE_DATA_UNIT[3])){
            if(after_command.equals(AFTER_DATA_UNIT[0])){
                result.append(num * 8388608);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[1])){
                result.append(num * 1048576);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[2])){
                result.append(num * 1024);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[3])){
                result.append(num);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[4])){
                result.append(num * 0.0009765625);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[5])){
                result.append(num * 9.53674316 * Math.pow(10, -7));
            }
        }
        else if(before_command.equals(BEFORE_DATA_UNIT[4])){
            if(after_command.equals(AFTER_DATA_UNIT[0])){
                result.append(num * 8589934592.0);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[1])){
                result.append(num * 1073741824);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[2])){
                result.append(num * 1048576);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[3])){
                result.append(num * 1024);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[4])){
                result.append(num);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[5])){
                result.append(num * 0.0009765625);
            }
        }
        else if(before_command.equals(BEFORE_DATA_UNIT[5])){
            if(after_command.equals(AFTER_DATA_UNIT[0])){
                result.append(num * 2796093022208.0);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[1])){
                result.append(num * 1099511627776.0);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[2])){
                result.append(num * 1073741824);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[3])){
                result.append(num * 1048576);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[4])){
                result.append(num * 1024);
            }
            else if(after_command.equals(AFTER_DATA_UNIT[5])){
                result.append(num);
            }
        }
        return result.toString();
    }
}

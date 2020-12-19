public class DataConversion {
    private static final StringBuilder result = new StringBuilder();
    private enum dataEnum{
        BIT,
        BYTE,
        KILOBYTE,
        MEGABYTE,
        GIGABYTE,
        TERABYTE
    }
    public static String dataConversion(String before_command, String after_command, double num){
        if(before_command.equals(String.valueOf(dataEnum.BIT))){
            if(after_command.equals(String.valueOf(dataEnum.BIT))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(dataEnum.BYTE))){
                result.append(num * 0.125);
            }
            else if(after_command.equals(String.valueOf(dataEnum.KILOBYTE))){
                result.append(num * 0.0001220703);
            }
            else if(after_command.equals(String.valueOf(dataEnum.MEGABYTE))){
                result.append(num * 1.19209290 * Math.pow(10, -7));
            }
            else if(after_command.equals(String.valueOf(dataEnum.GIGABYTE))){
                result.append(num * 1.16415322 * Math.pow(10, -10));
            }
            else if(after_command.equals(String.valueOf(dataEnum.TERABYTE))){
                result.append(num * 1.13686838 * Math.pow(10, -13));
            }
        }
        else if(before_command.equals(String.valueOf(dataEnum.BYTE))){
            if(after_command.equals(String.valueOf(dataEnum.BIT))){
                result.append(num * 8);
            }
            else if(after_command.equals(String.valueOf(dataEnum.BYTE))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(dataEnum.KILOBYTE))){
                result.append(num * 0.0009765625);
            }
            else if(after_command.equals(String.valueOf(dataEnum.MEGABYTE))){
                result.append(num * 9.53674316 * Math.pow(10, -7));
            }
            else if(after_command.equals(String.valueOf(dataEnum.GIGABYTE))){
                result.append(num * 9.31322575 * Math.pow(10, -10));
            }
            else if(after_command.equals(String.valueOf(dataEnum.TERABYTE))){
                result.append(num * 9.09494702 * Math.pow(10, -13));
            }
        }
        else if(before_command.equals(String.valueOf(dataEnum.KILOBYTE))){
            if(after_command.equals(String.valueOf(dataEnum.BIT))){
                result.append(num * 8192);
            }
            else if(after_command.equals(String.valueOf(dataEnum.BYTE))){
                result.append(num * 1024);
            }
            else if(after_command.equals(String.valueOf(dataEnum.KILOBYTE))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(dataEnum.MEGABYTE))){
                result.append(num * 0.0009765625);
            }
            else if(after_command.equals(String.valueOf(dataEnum.GIGABYTE))){
                result.append(num * 9.53674316 * Math.pow(10, -7));
            }
            else if(after_command.equals(String.valueOf(dataEnum.TERABYTE))){
                result.append(num * 9.31322575 * Math.pow(10, -10));
            }
        }
        else if(before_command.equals(String.valueOf(dataEnum.MEGABYTE))){
            if(after_command.equals(String.valueOf(dataEnum.BIT))){
                result.append(num * 8388608);
            }
            else if(after_command.equals(String.valueOf(dataEnum.BYTE))){
                result.append(num * 1048576);
            }
            else if(after_command.equals(String.valueOf(dataEnum.KILOBYTE))){
                result.append(num * 1024);
            }
            else if(after_command.equals(String.valueOf(dataEnum.MEGABYTE))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(dataEnum.GIGABYTE))){
                result.append(num * 0.0009765625);
            }
            else if(after_command.equals(String.valueOf(dataEnum.TERABYTE))){
                result.append(num * 9.53674316 * Math.pow(10, -7));
            }
        }
        else if(before_command.equals(String.valueOf(dataEnum.GIGABYTE))){
            if(after_command.equals(String.valueOf(dataEnum.BIT))){
                result.append(num * 8589934592.0);
            }
            else if(after_command.equals(String.valueOf(dataEnum.BYTE))){
                result.append(num * 1073741824);
            }
            else if(after_command.equals(String.valueOf(dataEnum.KILOBYTE))){
                result.append(num * 1048576);
            }
            else if(after_command.equals(String.valueOf(dataEnum.MEGABYTE))){
                result.append(num * 1024);
            }
            else if(after_command.equals(String.valueOf(dataEnum.GIGABYTE))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(dataEnum.TERABYTE))){
                result.append(num * 0.0009765625);
            }
        }
        else if(before_command.equals(String.valueOf(dataEnum.TERABYTE))){
            if(after_command.equals(String.valueOf(dataEnum.BIT))){
                result.append(num * 2796093022208.0);
            }
            else if(after_command.equals(String.valueOf(dataEnum.BYTE))){
                result.append(num * 1099511627776.0);
            }
            else if(after_command.equals(String.valueOf(dataEnum.KILOBYTE))){
                result.append(num * 1073741824);
            }
            else if(after_command.equals(String.valueOf(dataEnum.MEGABYTE))){
                result.append(num * 1048576);
            }
            else if(after_command.equals(String.valueOf(dataEnum.GIGABYTE))){
                result.append(num * 1024);
            }
            else if(after_command.equals(String.valueOf(dataEnum.TERABYTE))){
                result.append(num);
            }
        }
        return result.toString();
    }
}

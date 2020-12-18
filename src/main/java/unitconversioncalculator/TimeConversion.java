public class TimeConversion {
    private static final String[] BEFORE_TIME_UNIT = {"second", "minute", "hour", "day", "week"};
    public static final String[] AFTER_TIME_UNIT = {"second", "minute", "hour", "day", "week"};
    public static final StringBuilder result = new StringBuilder();
    public static String timeConversion(String before_command, String after_command, double num){
        if(before_command.equals(BEFORE_TIME_UNIT[0])){
            if(after_command.equals(AFTER_TIME_UNIT[0])){
                result.append(num);
            }
            else if(after_command.equals(AFTER_TIME_UNIT[1])){
                result.append(num * 0.0166666667);
            }
            else if(after_command.equals(AFTER_TIME_UNIT[2])){
                result.append(num * 0.0002777778);
            }
            else if(after_command.equals(AFTER_TIME_UNIT[3])){
                result.append(num * 0.0000115741);
            }
            else if(after_command.equals(AFTER_TIME_UNIT[4])){
                result.append(num * 0.0000016534);
            }
        }
        else if(before_command.equals(BEFORE_TIME_UNIT[1])){
            if(after_command.equals(AFTER_TIME_UNIT[0])){
                result.append(num * 60);
            }
            else if(after_command.equals(AFTER_TIME_UNIT[1])){
                result.append(num);
            }
            else if(after_command.equals(AFTER_TIME_UNIT[2])){
                result.append(num * 0.0166666667);
            }
            else if(after_command.equals(AFTER_TIME_UNIT[3])){
                result.append(num * 0.0006944444);
            }
            else if(after_command.equals(AFTER_TIME_UNIT[4])){
                result.append(num * 0.0000992063);
            }
        }
        else if(before_command.equals(BEFORE_TIME_UNIT[2])){
            if(after_command.equals(AFTER_TIME_UNIT[0])){
                result.append(num * 3600);
            }
            else if(after_command.equals(AFTER_TIME_UNIT[1])){
                result.append(num * 60);
            }
            else if(after_command.equals(AFTER_TIME_UNIT[2])){
                result.append(num);
            }
            else if(after_command.equals(AFTER_TIME_UNIT[3])){
                result.append(num * 0.0416666667);
            }
            else if(after_command.equals(AFTER_TIME_UNIT[4])){
                result.append(num * 0.005952381);
            }
        }
        else if(before_command.equals(BEFORE_TIME_UNIT[3])){
            if(after_command.equals(AFTER_TIME_UNIT[0])){
                result.append(num * 86400);
            }
            else if(after_command.equals(AFTER_TIME_UNIT[1])){
                result.append(num * 1440);
            }
            else if(after_command.equals(AFTER_TIME_UNIT[2])){
                result.append(num * 24);
            }
            else if(after_command.equals(AFTER_TIME_UNIT[3])){
                result.append(num);
            }
            else if(after_command.equals(AFTER_TIME_UNIT[4])){
                result.append(num * 0.1428571429);
            }
        }
        else if(before_command.equals(BEFORE_TIME_UNIT[4])){
            if(after_command.equals(AFTER_TIME_UNIT[0])){
                result.append(num * 604800);
            }
            else if(after_command.equals(AFTER_TIME_UNIT[1])){
                result.append(num * 10080);
            }
            else if(after_command.equals(AFTER_TIME_UNIT[2])){
                result.append(num * 168);
            }
            else if(after_command.equals(AFTER_TIME_UNIT[3])){
                result.append(num * 7);
            }
            else if(after_command.equals(AFTER_TIME_UNIT[4])){
                result.append(num);
            }
        }
        return result.toString();
    }
}

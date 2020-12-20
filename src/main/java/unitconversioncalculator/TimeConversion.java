public class TimeConversion {
    public static final StringBuilder result = new StringBuilder();
    private enum timeEnum{
        SECOND,
        MINUTE,
        HOUR,
        DAY,
        WEEK
    }
    public static String timeConversion(Enum before_command, Enum after_command, double num){
        if(before_command == timeEnum.SECOND){
            if(after_command == timeEnum.SECOND){
                result.append(num);
            }
            else if(after_command == timeEnum.MINUTE){
                result.append(num * 0.0166666667);
            }
            else if(after_command == timeEnum.HOUR){
                result.append(num * 0.0002777778);
            }
            else if(after_command == timeEnum.DAY){
                result.append(num * 0.0000115741);
            }
            else if(after_command == timeEnum.WEEK){
                result.append(num * 0.0000016534);
            }
        }
        else if(before_command == timeEnum.MINUTE){
            if(after_command == timeEnum.SECOND){
                result.append(num * 60);
            }
            else if(after_command == timeEnum.MINUTE){
                result.append(num);
            }
            else if(after_command == timeEnum.HOUR){
                result.append(num * 0.0166666667);
            }
            else if(after_command == timeEnum.DAY){
                result.append(num * 0.0006944444);
            }
            else if(after_command == timeEnum.WEEK){
                result.append(num * 0.0000992063);
            }
        }
        else if(before_command == timeEnum.HOUR){
            if(after_command == timeEnum.SECOND){
                result.append(num * 3600);
            }
            else if(after_command == timeEnum.MINUTE){
                result.append(num * 60);
            }
            else if(after_command == timeEnum.HOUR){
                result.append(num);
            }
            else if(after_command == timeEnum.DAY){
                result.append(num * 0.0416666667);
            }
            else if(after_command == timeEnum.WEEK){
                result.append(num * 0.005952381);
            }
        }
        else if(before_command == timeEnum.DAY){
            if(after_command == timeEnum.SECOND){
                result.append(num * 86400);
            }
            else if(after_command == timeEnum.MINUTE){
                result.append(num * 1440);
            }
            else if(after_command == timeEnum.HOUR){
                result.append(num * 24);
            }
            else if(after_command == timeEnum.DAY){
                result.append(num);
            }
            else if(after_command == timeEnum.WEEK){
                result.append(num * 0.1428571429);
            }
        }
        else if(before_command == timeEnum.WEEK){
            if(after_command == timeEnum.SECOND){
                result.append(num * 604800);
            }
            else if(after_command == timeEnum.MINUTE){
                result.append(num * 10080);
            }
            else if(after_command == timeEnum.HOUR){
                result.append(num * 168);
            }
            else if(after_command == timeEnum.DAY){
                result.append(num * 7);
            }
            else if(after_command == timeEnum.WEEK){
                result.append(num);
            }
        }
        return result.toString();
    }
}

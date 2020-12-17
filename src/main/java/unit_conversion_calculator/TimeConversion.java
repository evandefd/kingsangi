import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeConversion {
    private static final String[] before_Area_Unit = {"second", "minute", "hour", "day", "week"};
    public static final String[] after_Area_Unit = {"second", "minute", "hour", "day", "week"};
    public static final StringBuilder result = new StringBuilder();
    public static String timeConversion() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the original unit(second, minute, hour, day, week)");
        String before_command = br.readLine();
        System.out.println("Please enter the unit to be changed(second, minute, hour, day, week)");
        String after_command = br.readLine();
        System.out.println("Input num");
        double num = Double.parseDouble(br.readLine());
        if(before_command.equals(before_Area_Unit[0])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 0.0166666667);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 0.0002777778);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 0.0000115741);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 0.0000016534);
            }
        }
        else if(before_command.equals(before_Area_Unit[1])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 60);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 0.0166666667);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 0.0006944444);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 0.0000992063);
            }
        }
        else if(before_command.equals(before_Area_Unit[2])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 3600);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 60);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 0.0416666667);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 0.005952381);
            }
        }
        else if(before_command.equals(before_Area_Unit[3])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 86400);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 1440);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 24);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 0.1428571429);
            }
        }
        else if(before_command.equals(before_Area_Unit[4])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 604800);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 10080);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 168);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 7);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num);
            }
        }
        return result.toString();
    }
}

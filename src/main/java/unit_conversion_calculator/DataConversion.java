import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataConversion {
    private static final String[] before_Area_Unit = {"bit", "byte", "kilobyte", "megabyte", "gigabyte", "terabyte"};
    private static final String[] after_Area_Unit = {"bit", "byte", "kilobyte", "megabyte", "gigabyte", "terabyte"};
    private static final StringBuilder result = new StringBuilder();
    public static String dataConversion() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the original unit(bit, byte, kilobyte, megabyte, gigabyte, terabyte)");
        String before_command = br.readLine();
        System.out.println("Please enter the unit to be changed(bit, byte, kilobyte, megabyte, gigabyte, terabyte)");
        String after_command = br.readLine();
        System.out.println("Input num");
        double num = Double.parseDouble(br.readLine());
        if(before_command.equals(before_Area_Unit[0])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 0.125);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 0.0001220703);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 1.19209290 * Math.pow(10, -7));
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 1.16415322 * Math.pow(10, -10));
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 1.13686838 * Math.pow(10, -13));
            }
        }
        else if(before_command.equals(before_Area_Unit[1])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 8);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 0.0009765625);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 9.53674316 * Math.pow(10, -7));
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 9.31322575 * Math.pow(10, -10));
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 9.09494702 * Math.pow(10, -13));
            }
        }
        else if(before_command.equals(before_Area_Unit[2])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 8192);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 1024);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 0.0009765625);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 9.53674316 * Math.pow(10, -7));
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 9.31322575 * Math.pow(10, -10));
            }
        }
        else if(before_command.equals(before_Area_Unit[3])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 8388608);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 1048576);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 1024);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 0.0009765625);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 9.53674316 * Math.pow(10, -7));
            }
        }
        else if(before_command.equals(before_Area_Unit[4])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 8589934592.0);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 1073741824);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 1048576);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 1024);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 0.0009765625);
            }
        }
        else if(before_command.equals(before_Area_Unit[5])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 2796093022208.0);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 1099511627776.0);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 1073741824);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 1048576);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 1024);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num);
            }
        }
        return result.toString();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaConversion {
    private static final String[] before_Area_Unit = {"acre", "are", "hectare", "square_centimeter", "square_feet", "square_inch", "square_meter", "pyeong"};
    private static final String[] after_Area_Unit = {"acre", "are", "hectare", "square_centimeter", "square_feet", "square_inch", "square_meter", "pyeong"};
    private static final StringBuilder result = new StringBuilder();
    public static String areaConversion() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String before_command = br.readLine();
        String after_command = br.readLine();
        System.out.println("Input num");
        double num = Double.parseDouble(br.readLine());
        if(before_command.equals(before_Area_Unit[0])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 40.468564224);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 0.4046856422);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 40468564.224);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 43560);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 6272640);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 4046.8564224);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 1224.1741136825);
            }
        }
        else if(before_command.equals(before_Area_Unit[1])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 0.0247105381);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 0.01);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 1000);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 1076.391041671);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 155000.31000062);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 100);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 30.2500011344);
            }
        }
        else if(before_command.equals(before_Area_Unit[2])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 2.4710538147);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 100);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 100000);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 107639.1041671);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 15500031.000062);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 10000);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 3025.0001134375);
            }
        }
        else if(before_command.equals(before_Area_Unit[3])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 2.47105381 * Math.pow(10, -8));
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * Math.pow(10, -6));
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * Math.pow(10, -8));
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 0.00107391);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 0.15500031);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 0.0001);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 0.00003025);
            }
        }
        else if(before_command.equals(before_Area_Unit[4])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 0.0000229568);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 0.0009290304);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 0.0000092903);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 929.0304);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 144);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 0.09290304);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 0.0281031707);
            }
        }
        else if(before_command.equals(before_Area_Unit[5])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 1.59422508 * Math.pow(10, -7));
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 0.0000064516);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 6.45160000*Math.pow(10, -8));
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 6.4516);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 0.0069444444);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 0.00064516);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 0.0001951609);
            }
        }
        else if(before_command.equals(before_Area_Unit[6])){
            if(after_command.equals(after_Area_Unit[0])) {
                result.append(num * 0.0002471054);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 0.01);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 0.0001);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 10000);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 10.7639104167);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 1550.0031000062);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 0.3025000113);
            }
        }
        else if(before_command.equals(before_Area_Unit[7])){
            if(after_command.equals(after_Area_Unit[0])) {
                result.append(num * 0.0008168773);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 0.03305785);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 0.0003305785);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 33057.85);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 35.5831735969);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 5123.946997954);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 3.305785);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num);
            }
        }
        return result.toString();
    }
}

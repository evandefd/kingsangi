import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureConversion {
    private static final String[] before_Area_Unit = {"celsius", "fahrenheit", "kelvin"};
    private static final String[] after_Area_Unit = {"celsius", "fahrenheit", "kelvin"};
    private static final StringBuilder result = new StringBuilder();
    public static String temperatureConversion() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the original unit(celsius, fahrenheit, kelvin)");
        String before_command = br.readLine();
        System.out.println("Please enter the unit to be changed(celsius, fahrenheit, kelvin)");
        String after_command = br.readLine();
        System.out.println("Input num");
        double num = Double.parseDouble(br.readLine());
        if(before_command.equals(before_Area_Unit[0])) {
            if (after_command.equals(after_Area_Unit[0])) {
                result.append(num);
            } else if (after_command.equals(after_Area_Unit[1])) {
                result.append(num * 33.8);
            } else if (after_command.equals(after_Area_Unit[2])) {
                result.append(num * 274.15);
            }
        }
        else if(before_command.equals(before_Area_Unit[1])) {
            if (after_command.equals(after_Area_Unit[0])) {
                result.append(num * -17.2222222222);
            } else if (after_command.equals(after_Area_Unit[1])) {
                result.append(num);
            } else if (after_command.equals(after_Area_Unit[2])) {
                result.append(num * 255.9277777778);
            }
        }
        else if(before_command.equals(before_Area_Unit[2])) {
            if (after_command.equals(after_Area_Unit[0])) {
                result.append(num * -272.15);
            } else if (after_command.equals(after_Area_Unit[1])) {
                result.append(num * -457.87);
            } else if (after_command.equals(after_Area_Unit[2])) {
                result.append(num);
            }
        }
        return result.toString();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnitConversionCalculator {
    public static String[] select = {"area", "length", "temperature", "volume", "weight", "data", "speed", "time"};
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args, String before_command, String after_command, double num) throws IOException {
        while(true){
            String command = br.readLine();
            if(command.equals(select[0])){
                AreaConversion.areaConversion(before_command, after_command, num);
            }
            else if(command.equals(select[1])){
                LengthConversion.lengthConversion(before_command, after_command, num);
            }
            else if(command.equals(select[2])){
                TemperatureConversion.temperatureConversion(before_command, after_command, num);
            }
            else if(command.equals(select[3])){
                VolumeConversion.volumeConversion(before_command, after_command, num);
            }
            else if(command.equals(select[4])){
                WeightConversion.weightConversion(before_command, after_command, num);
            }
            else if(command.equals(select[5])){
                DataConversion.dataConversion(before_command, after_command, num);
            }
            else if(command.equals(select[6])){
                SpeedConversion.speedConversion(before_command, after_command, num);
            }
            else if(command.equals(select[7])){
                TimeConversion.timeConversion(before_command, after_command, num);
            }
        }
    }
}
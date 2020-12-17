import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnitConversionCalculator {
    public static String[] select = {"area", "length", "temperature", "volume", "weight", "data", "speed", "time"};
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        while(true){
            String command = br.readLine();
            if(command.equals(select[0])){
                AreaConversion.areaConversion();
            }
            else if(command.equals(select[1])){
                LengthConversion.lengthConversion();
            }
            else if(command.equals(select[2])){
                TemperatureConversion.temperatureConversion();
            }
            else if(command.equals(select[3])){
                VolumeConversion.volumeConversion();
            }
            else if(command.equals(select[4])){
                WeightConversion.weightConversion();
            }
            else if(command.equals(select[5])){
                DataConversion.dataConversion();
            }
            else if(command.equals(select[6])){
                SpeedConversion.speedConversion();
            }
            else if(command.equals(select[7])){
                TimeConversion.timeConversion();
            }
        }
    }
}
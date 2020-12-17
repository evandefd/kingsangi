import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VolumeConversion {
    private static final String[] before_Area_Unit = {"british_gallon", "us_gallon", "liter", "milliliter", "cubic_centimeter", "cubic_meter", "cubic_inch", "cubic_feet"};
    private static final String[] after_Area_Unit = {"british_gallon", "us_gallon", "liter", "milliliter", "cubic_centimeter", "cubic_meter", "cubic_inch", "cubic_feet"};
    private static final StringBuilder result = new StringBuilder();
    public static String volumeConversion() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the original unit(british_gallon, us_gallon, liter, milliliter, cuboc_centimeter, cubic_meter, cubic_inch, cubic_feet)");
        String before_command = br.readLine();
        System.out.println("Please enter the unit to be changed(british_gallon, us_gallon, liter, milliliter, cuboc_centimeter, cubic_meter, cubic_inch, cubic_feet)");
        String after_command = br.readLine();
        System.out.println("Input num");
        double num = Double.parseDouble(br.readLine());
        if(before_command.equals(before_Area_Unit[0])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 1.2009499255);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 4.54609);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 4546.09);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 4546.09);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 0.00454609);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 277.4194327916);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 0.1605436532);
            }
        }
        else if(before_command.equals(before_Area_Unit[1])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 0.8326741846);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 3.785411784);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 3785.411784);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 3785.411784);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 0.0037854118);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 231);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 0.1336805556);
            }
        }
        else if(before_command.equals(before_Area_Unit[2])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 0.2199692483);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 0.2641720524);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 1000);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 1000);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 0.001);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 61.0237440947);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 0.0353146667);
            }
        }
        else if(before_command.equals(before_Area_Unit[3])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 0.0002199692);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 0.0002641721);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 0.001);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 0.000001);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 0.0610237441);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 0.0000353147);
            }
        }
        else if(before_command.equals(before_Area_Unit[4])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 0.0002199692);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 0.0002641721);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 0.001);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 0.000001);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 0.0610237441);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 0.0000353147);
            }
        }
        else if(before_command.equals(before_Area_Unit[5])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 219.9692482991);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 234.1720523581);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 1000);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 1000000);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 1000000);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 61023.744094732);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 35.3146667215);
            }
        }
        else if(before_command.equals(before_Area_Unit[6])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 0.0036046501);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 0.0043290043);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 0.016387064);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 16.387064);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 16.387064);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 0.0000163871);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 0.0005787037);
            }
        }
        else if(before_command.equals(before_Area_Unit[7])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 6.228835459);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 7.4805194805);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 28.316846592);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 28316.846592);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 28316.846592);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 0.0283168466);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 1728);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num);
            }
        }
        return result.toString();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpeedConversion {
    private static final String[] before_Area_Unit = {"meter_per_second", "meter_per_hour", "kilometer_per_second", "kilometer_per_hour", "inch_per_second", "inch_per_hour",
            "feet_per_second", "feet_per_hour", "mile_per_second", "mile_per_hour", "knot"};
    public static final String[] after_Area_Unit = {"meter_per_second", "meter_per_hour", "kilometer_per_second", "kilometer_per_hour", "inch_per_second", "inch_per_hour",
            "feet_per_second", "feet_per_hour", "mile_per_second", "mile_per_hour", "knot"};
    private static final StringBuilder result = new StringBuilder();
    public static String speedConversion() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the original unit(meter_per_second, meter_per_hour, kilometer_per_second, kilometer_per_hour, inch_per_second," +
                " inch_per_hour, feet_per_second, feet_per_hour, mile_per_second, mile_per_hour, knot)");
        String before_command = br.readLine();
        System.out.println("Please enter the unit to be changed(meter_per_second, meter_per_hour, kilometer_per_second, kilometer_per_hour, inch_per_second," +
                " inch_per_hour, feet_per_second, feet_per_hour, mile_per_second, mile_per_hour, knot)");
        String after_command = br.readLine();
        System.out.println("Input num");
        double num = Double.parseDouble(br.readLine());
        if(before_command.equals(before_Area_Unit[0])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 3600);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 0.001);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 3.6);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 39.3700787402);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 141732.28346457);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 3.280839895);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 11811.023622047);
            }
            else if(after_command.equals(after_Area_Unit[8])){
                result.append(num * 0.0006213712);
            }
            else if(after_command.equals(after_Area_Unit[9])){
                result.append(num * 2.2369362921);
            }
            else if(after_command.equals(after_Area_Unit[10])){
                result.append(num * 1.9438444924);
            }
        }
        else if(before_command.equals(before_Area_Unit[1])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 0.0002777778);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 2.77777778 * Math.pow(10, -7));
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 0.001);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 0.010936133);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 39.3700787402);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 0.0009113444);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 3.280839895);
            }
            else if(after_command.equals(after_Area_Unit[8])){
                result.append(num * 1.72603109 * Math.pow(10, -7));
            }
            else if(after_command.equals(after_Area_Unit[9])){
                result.append(num * 0.0006213712);
            }
            else if(after_command.equals(after_Area_Unit[10])){
                result.append(num * 0.0005399568);
            }
        }
        else if(before_command.equals(before_Area_Unit[2])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 1000);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 3600000);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 3600);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 39370.078740158);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 141732283.46457);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 3280.8398950131);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 11811023.622047);
            }
            else if(after_command.equals(after_Area_Unit[8])){
                result.append(num * 0.6213711922);
            }
            else if(after_command.equals(after_Area_Unit[9])){
                result.append(num * 2236.9362920544);
            }
            else if(after_command.equals(after_Area_Unit[10])){
                result.append(num * 1943.8444924406);
            }
        }
        else if(before_command.equals(before_Area_Unit[3])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 0.2777777778);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 1000);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 0.0002777778);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 10.9361329834);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 39370.078740158);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 0.9113444153);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 3280.8398950131);
            }
            else if(after_command.equals(after_Area_Unit[8])){
                result.append(num * 0.0001726031);
            }
            else if(after_command.equals(after_Area_Unit[9])){
                result.append(num * 0.6213711922);
            }
            else if(after_command.equals(after_Area_Unit[10])){
                result.append(num * 0.5399568035);
            }
        }
        else if(before_command.equals(before_Area_Unit[4])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 0.0254);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 91.44);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 0.0000254);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 0.09144);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 3600);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 0.0833333333);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 300);
            }
            else if(after_command.equals(after_Area_Unit[8])){
                result.append(num * 0.0000157828);
            }
            else if(after_command.equals(after_Area_Unit[9])){
                result.append(num * 0.0568181818);
            }
            else if(after_command.equals(after_Area_Unit[10])){
                result.append(num * 0.0493736501);
            }
        }
        else if(before_command.equals(before_Area_Unit[5])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 0.0000070556);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 0.0254);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 7.05555556 * Math.pow(10, -9));
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 0.0000254);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 0.0002777778);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 0.0000231481);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 0.0833333333);
            }
            else if(after_command.equals(after_Area_Unit[8])){
                result.append(num * 4.38411897 * Math.pow(10, -9));
            }
            else if(after_command.equals(after_Area_Unit[9])){
                result.append(num * 0.0000157828);
            }
            else if(after_command.equals(after_Area_Unit[10])){
                result.append(num * 0.0000137149);
            }
        }
        else if(before_command.equals(before_Area_Unit[6])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 0.3048);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 1097.28);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 0.0003048);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 1.09728);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 12);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 43200);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 3600);
            }
            else if(after_command.equals(after_Area_Unit[8])){
                result.append(num * 0.0001893939);
            }
            else if(after_command.equals(after_Area_Unit[9])){
                result.append(num * 0.6818181818);
            }
            else if(after_command.equals(after_Area_Unit[10])){
                result.append(num * 0.5924838013);
            }
        }
        else if(before_command.equals(before_Area_Unit[7])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 0.0000846667);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 0.3048);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 8.46666667 * Math.pow(10, -8));
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 0.0003048);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 0.0033333333);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 12);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 0.0002777778);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[8])){
                result.append(num * 5.26094276 * Math.pow(10, -8));
            }
            else if(after_command.equals(after_Area_Unit[9])){
                result.append(num * 0.0001893939);
            }
            else if(after_command.equals(after_Area_Unit[10])){
                result.append(num * 0.0001645788);
            }
        }
        else if(before_command.equals(before_Area_Unit[8])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 1609.344);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 5793638.4);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 1.609344);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 5793.6384);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 63360);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 228096000);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 5280);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 19008000);
            }
            else if(after_command.equals(after_Area_Unit[8])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[9])){
                result.append(num * 3600);
            }
            else if(after_command.equals(after_Area_Unit[10])){
                result.append(num * 3128.3411708423);
            }
        }
        else if(before_command.equals(before_Area_Unit[9])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 0.44704);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 1609.344);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 0.00044704);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 1.609344);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 17.6);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 63360);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 1.4666666667);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 5280);
            }
            else if(after_command.equals(after_Area_Unit[8])){
                result.append(num * 0.0002777778);
            }
            else if(after_command.equals(after_Area_Unit[9])){
                result.append(num);
            }
            else if(after_command.equals(after_Area_Unit[10])){
                result.append(num * 0.8689762419);
            }
        }
        else if(before_command.equals(before_Area_Unit[10])){
            if(after_command.equals(after_Area_Unit[0])){
                result.append(num * 0.5144444444);
            }
            else if(after_command.equals(after_Area_Unit[1])){
                result.append(num * 1852);
            }
            else if(after_command.equals(after_Area_Unit[2])){
                result.append(num * 0.0005144444);
            }
            else if(after_command.equals(after_Area_Unit[3])){
                result.append(num * 1852);
            }
            else if(after_command.equals(after_Area_Unit[4])){
                result.append(num * 20.2537182852);
            }
            else if(after_command.equals(after_Area_Unit[5])){
                result.append(num * 72913.385826772);
            }
            else if(after_command.equals(after_Area_Unit[6])){
                result.append(num * 1.6878095271);
            }
            else if(after_command.equals(after_Area_Unit[7])){
                result.append(num * 6076.1154855643);
            }
            else if(after_command.equals(after_Area_Unit[8])){
                result.append(num * 0.00319661);
            }
            else if(after_command.equals(after_Area_Unit[9])){
                result.append(num * 1.150779448);
            }
            else if(after_command.equals(after_Area_Unit[10])){
                result.append(num);
            }
        }
        return result.toString();
    }
}

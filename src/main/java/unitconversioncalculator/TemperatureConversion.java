public class TemperatureConversion {
    private static final String[] BEFORE_TEMPERATURE_UNIT = {"celsius", "fahrenheit", "kelvin"};
    private static final String[] AFTER_TEMPERATURE_UNIT = {"celsius", "fahrenheit", "kelvin"};
    private static final StringBuilder result = new StringBuilder();
    public static String temperatureConversion(String before_command, String after_command, double num){
        if(before_command.equals(BEFORE_TEMPERATURE_UNIT[0])) {
            if (after_command.equals(AFTER_TEMPERATURE_UNIT[0])) {
                result.append(num);
            } else if (after_command.equals(AFTER_TEMPERATURE_UNIT[1])) {
                result.append(num * 33.8);
            } else if (after_command.equals(AFTER_TEMPERATURE_UNIT[2])) {
                result.append(num * 274.15);
            }
        }
        else if(before_command.equals(BEFORE_TEMPERATURE_UNIT[1])) {
            if (after_command.equals(AFTER_TEMPERATURE_UNIT[0])) {
                result.append(num * -17.2222222222);
            } else if (after_command.equals(AFTER_TEMPERATURE_UNIT[1])) {
                result.append(num);
            } else if (after_command.equals(AFTER_TEMPERATURE_UNIT[2])) {
                result.append(num * 255.9277777778);
            }
        }
        else if(before_command.equals(BEFORE_TEMPERATURE_UNIT[2])) {
            if (after_command.equals(AFTER_TEMPERATURE_UNIT[0])) {
                result.append(num * -272.15);
            } else if (after_command.equals(AFTER_TEMPERATURE_UNIT[1])) {
                result.append(num * -457.87);
            } else if (after_command.equals(AFTER_TEMPERATURE_UNIT[2])) {
                result.append(num);
            }
        }
        return result.toString();
    }
}

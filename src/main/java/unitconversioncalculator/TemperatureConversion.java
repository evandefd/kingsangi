public class TemperatureConversion {
    private enum temperatureEnum{
        CELSIUS,
        FAHRENHEIT,
        KELVIN
    }
    private static final StringBuilder result = new StringBuilder();
    public static String temperatureConversion(String before_command, String after_command, double num){
        if(before_command.equals(String.valueOf(temperatureEnum.CELSIUS))) {
            if (after_command.equals(String.valueOf(temperatureEnum.CELSIUS))) {
                result.append(num);
            } else if (after_command.equals(String.valueOf(temperatureEnum.FAHRENHEIT))) {
                result.append(num * 33.8);
            } else if (after_command.equals(String.valueOf(temperatureEnum.KELVIN))) {
                result.append(num * 274.15);
            }
        }
        else if(before_command.equals(String.valueOf(temperatureEnum.FAHRENHEIT))) {
            if (after_command.equals(String.valueOf(temperatureEnum.CELSIUS))) {
                result.append(num * -17.2222222222);
            } else if (after_command.equals(String.valueOf(temperatureEnum.FAHRENHEIT))) {
                result.append(num);
            } else if (after_command.equals(String.valueOf(temperatureEnum.KELVIN))) {
                result.append(num * 255.9277777778);
            }
        }
        else if(before_command.equals(String.valueOf(temperatureEnum.KELVIN))) {
            if (after_command.equals(String.valueOf(temperatureEnum.CELSIUS))) {
                result.append(num * -272.15);
            } else if (after_command.equals(String.valueOf(temperatureEnum.FAHRENHEIT))) {
                result.append(num * -457.87);
            } else if (after_command.equals(String.valueOf(temperatureEnum.KELVIN))) {
                result.append(num);
            }
        }
        return result.toString();
    }
}

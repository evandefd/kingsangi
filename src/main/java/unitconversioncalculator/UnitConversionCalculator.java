public class UnitConversionCalculator {
    public static void main(String[] args, String unit_command, String before_command, String after_command, double num) {
        if (unit_command.equals(String.valueOf(UnitEnum.AREA))) {
            AreaConversion.areaConversion(before_command, after_command, num);
        } else if (unit_command.equals(String.valueOf(UnitEnum.LENGTH))) {
            LengthConversion.lengthConversion(before_command, after_command, num);
        } else if (unit_command.equals(String.valueOf(UnitEnum.TEMPERATURE))) {
            TemperatureConversion.temperatureConversion(before_command, after_command, num);
        } else if (unit_command.equals(String.valueOf(UnitEnum.VOLUME))) {
            VolumeConversion.volumeConversion(before_command, after_command, num);
        } else if (unit_command.equals(String.valueOf(UnitEnum.WEIGHT))) {
            WeightConversion.weightConversion(before_command, after_command, num);
        } else if (unit_command.equals(String.valueOf(UnitEnum.DATA))) {
            DataConversion.dataConversion(before_command, after_command, num);
        } else if (unit_command.equals(String.valueOf(UnitEnum.SPEED))) {
            SpeedConversion.speedConversion(before_command, after_command, num);
        } else if (unit_command.equals(String.valueOf(UnitEnum.TIME))) {
            TimeConversion.timeConversion(before_command, after_command, num);
        }
    }
}

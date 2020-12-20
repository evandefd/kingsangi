public class UnitConversionCalculator {
    public static void main(String[] args, Enum unit_command, Enum before_command, Enum after_command, double num) {
        if (unit_command == UnitEnum.AREA) {
            AreaConversion.areaConversion(before_command, after_command, num);
        } else if (unit_command == UnitEnum.LENGTH) {
            LengthConversion.lengthConversion(before_command, after_command, num);
        } else if (unit_command == UnitEnum.TEMPERATURE) {
            TemperatureConversion.temperatureConversion(before_command, after_command, num);
        } else if (unit_command == UnitEnum.VOLUME) {
            VolumeConversion.volumeConversion(before_command, after_command, num);
        } else if (unit_command == UnitEnum.WEIGHT) {
            WeightConversion.weightConversion(before_command, after_command, num);
        } else if (unit_command == UnitEnum.DATA) {
            DataConversion.dataConversion(before_command, after_command, num);
        } else if (unit_command == UnitEnum.SPEED) {
            SpeedConversion.speedConversion(before_command, after_command, num);
        } else if (unit_command == UnitEnum.TIME) {
            TimeConversion.timeConversion(before_command, after_command, num);
        }
    }
}

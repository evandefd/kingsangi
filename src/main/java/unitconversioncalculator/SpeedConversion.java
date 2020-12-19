public class SpeedConversion {
    private static final StringBuilder result = new StringBuilder();
    private enum speedEnum{
        METER_PER_SECOND,
        METER_PER_HOUR,
        KILOMETER_PER_SECOND,
        KILOMETER_PER_HOUR,
        INCH_PER_SECOND,
        INCH_PER_HOUR,
        FEET_PER_SECOND,
        FEET_PER_HOUR,
        MILE_PER_SECOND,
        MILE_PER_HOUR,
        KNOT
    }
    public static String speedConversion(String before_command, String after_command, double num){
        if(before_command.equals(String.valueOf(speedEnum.METER_PER_SECOND))){
            if(after_command.equals(String.valueOf(speedEnum.METER_PER_SECOND))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(speedEnum.METER_PER_HOUR))){
                result.append(num * 3600);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KILOMETER_PER_SECOND))){
                result.append(num * 0.001);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KILOMETER_PER_HOUR))){
                result.append(num * 3.6);
            }
            else if(after_command.equals(String.valueOf(speedEnum.INCH_PER_SECOND))){
                result.append(num * 39.3700787402);
            }
            else if(after_command.equals(String.valueOf(speedEnum.INCH_PER_HOUR))){
                result.append(num * 141732.28346457);
            }
            else if(after_command.equals(String.valueOf(speedEnum.FEET_PER_SECOND))){
                result.append(num * 3.280839895);
            }
            else if(after_command.equals(String.valueOf(speedEnum.FEET_PER_HOUR))){
                result.append(num * 11811.023622047);
            }
            else if(after_command.equals(String.valueOf(speedEnum.MILE_PER_SECOND))){
                result.append(num * 0.0006213712);
            }
            else if(after_command.equals(String.valueOf(speedEnum.MILE_PER_HOUR))){
                result.append(num * 2.2369362921);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KNOT))){
                result.append(num * 1.9438444924);
            }
        }
        else if(before_command.equals(String.valueOf(speedEnum.METER_PER_HOUR))){
            if(after_command.equals(String.valueOf(speedEnum.METER_PER_SECOND))){
                result.append(num * 0.0002777778);
            }
            else if(after_command.equals(String.valueOf(speedEnum.METER_PER_HOUR))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KILOMETER_PER_SECOND))){
                result.append(num * 2.77777778 * Math.pow(10, -7));
            }
            else if(after_command.equals(String.valueOf(speedEnum.KILOMETER_PER_HOUR))){
                result.append(num * 0.001);
            }
            else if(after_command.equals(String.valueOf(speedEnum.INCH_PER_SECOND))){
                result.append(num * 0.010936133);
            }
            else if(after_command.equals(String.valueOf(speedEnum.INCH_PER_HOUR))){
                result.append(num * 39.3700787402);
            }
            else if(after_command.equals(String.valueOf(speedEnum.FEET_PER_SECOND))){
                result.append(num * 0.0009113444);
            }
            else if(after_command.equals(String.valueOf(speedEnum.FEET_PER_HOUR))){
                result.append(num * 3.280839895);
            }
            else if(after_command.equals(String.valueOf(speedEnum.MILE_PER_SECOND))){
                result.append(num * 1.72603109 * Math.pow(10, -7));
            }
            else if(after_command.equals(String.valueOf(speedEnum.MILE_PER_HOUR))){
                result.append(num * 0.0006213712);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KNOT))){
                result.append(num * 0.0005399568);
            }
        }
        else if(before_command.equals(String.valueOf(speedEnum.KILOMETER_PER_SECOND))){
            if(after_command.equals(String.valueOf(speedEnum.METER_PER_SECOND))){
                result.append(num * 1000);
            }
            else if(after_command.equals(String.valueOf(speedEnum.METER_PER_HOUR))){
                result.append(num * 3600000);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KILOMETER_PER_SECOND))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KILOMETER_PER_HOUR))){
                result.append(num * 3600);
            }
            else if(after_command.equals(String.valueOf(speedEnum.INCH_PER_SECOND))){
                result.append(num * 39370.078740158);
            }
            else if(after_command.equals(String.valueOf(speedEnum.INCH_PER_HOUR))){
                result.append(num * 141732283.46457);
            }
            else if(after_command.equals(String.valueOf(speedEnum.FEET_PER_SECOND))){
                result.append(num * 3280.8398950131);
            }
            else if(after_command.equals(String.valueOf(speedEnum.FEET_PER_HOUR))){
                result.append(num * 11811023.622047);
            }
            else if(after_command.equals(String.valueOf(speedEnum.MILE_PER_SECOND))){
                result.append(num * 0.6213711922);
            }
            else if(after_command.equals(String.valueOf(speedEnum.MILE_PER_HOUR))){
                result.append(num * 2236.9362920544);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KNOT))){
                result.append(num * 1943.8444924406);
            }
        }
        else if(before_command.equals(String.valueOf(speedEnum.KILOMETER_PER_HOUR))){
            if(after_command.equals(String.valueOf(speedEnum.METER_PER_SECOND))){
                result.append(num * 0.2777777778);
            }
            else if(after_command.equals(String.valueOf(speedEnum.METER_PER_HOUR))){
                result.append(num * 1000);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KILOMETER_PER_SECOND))){
                result.append(num * 0.0002777778);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KILOMETER_PER_HOUR))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(speedEnum.INCH_PER_SECOND))){
                result.append(num * 10.9361329834);
            }
            else if(after_command.equals(String.valueOf(speedEnum.INCH_PER_HOUR))){
                result.append(num * 39370.078740158);
            }
            else if(after_command.equals(String.valueOf(speedEnum.FEET_PER_SECOND))){
                result.append(num * 0.9113444153);
            }
            else if(after_command.equals(String.valueOf(speedEnum.FEET_PER_HOUR))){
                result.append(num * 3280.8398950131);
            }
            else if(after_command.equals(String.valueOf(speedEnum.MILE_PER_SECOND))){
                result.append(num * 0.0001726031);
            }
            else if(after_command.equals(String.valueOf(speedEnum.MILE_PER_HOUR))){
                result.append(num * 0.6213711922);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KNOT))){
                result.append(num * 0.5399568035);
            }
        }
        else if(before_command.equals(String.valueOf(speedEnum.INCH_PER_SECOND))){
            if(after_command.equals(String.valueOf(speedEnum.METER_PER_SECOND))){
                result.append(num * 0.0254);
            }
            else if(after_command.equals(String.valueOf(speedEnum.METER_PER_HOUR))){
                result.append(num * 91.44);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KILOMETER_PER_SECOND))){
                result.append(num * 0.0000254);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KILOMETER_PER_HOUR))){
                result.append(num * 0.09144);
            }
            else if(after_command.equals(String.valueOf(speedEnum.INCH_PER_SECOND))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(speedEnum.INCH_PER_HOUR))){
                result.append(num * 3600);
            }
            else if(after_command.equals(String.valueOf(speedEnum.FEET_PER_SECOND))){
                result.append(num * 0.0833333333);
            }
            else if(after_command.equals(String.valueOf(speedEnum.FEET_PER_HOUR))){
                result.append(num * 300);
            }
            else if(after_command.equals(String.valueOf(speedEnum.MILE_PER_SECOND))){
                result.append(num * 0.0000157828);
            }
            else if(after_command.equals(String.valueOf(speedEnum.MILE_PER_HOUR))){
                result.append(num * 0.0568181818);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KNOT))){
                result.append(num * 0.0493736501);
            }
        }
        else if(before_command.equals(String.valueOf(speedEnum.INCH_PER_HOUR))){
            if(after_command.equals(String.valueOf(speedEnum.METER_PER_SECOND))){
                result.append(num * 0.0000070556);
            }
            else if(after_command.equals(String.valueOf(speedEnum.METER_PER_HOUR))){
                result.append(num * 0.0254);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KILOMETER_PER_SECOND))){
                result.append(num * 7.05555556 * Math.pow(10, -9));
            }
            else if(after_command.equals(String.valueOf(speedEnum.KILOMETER_PER_HOUR))){
                result.append(num * 0.0000254);
            }
            else if(after_command.equals(String.valueOf(speedEnum.INCH_PER_SECOND))){
                result.append(num * 0.0002777778);
            }
            else if(after_command.equals(String.valueOf(speedEnum.INCH_PER_HOUR))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(speedEnum.FEET_PER_SECOND))){
                result.append(num * 0.0000231481);
            }
            else if(after_command.equals(String.valueOf(speedEnum.FEET_PER_HOUR))){
                result.append(num * 0.0833333333);
            }
            else if(after_command.equals(String.valueOf(speedEnum.MILE_PER_SECOND))){
                result.append(num * 4.38411897 * Math.pow(10, -9));
            }
            else if(after_command.equals(String.valueOf(speedEnum.MILE_PER_HOUR))){
                result.append(num * 0.0000157828);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KNOT))){
                result.append(num * 0.0000137149);
            }
        }
        else if(before_command.equals(String.valueOf(speedEnum.FEET_PER_SECOND))){
            if(after_command.equals(String.valueOf(speedEnum.METER_PER_SECOND))){
                result.append(num * 0.3048);
            }
            else if(after_command.equals(String.valueOf(speedEnum.METER_PER_HOUR))){
                result.append(num * 1097.28);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KILOMETER_PER_SECOND))){
                result.append(num * 0.0003048);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KILOMETER_PER_HOUR))){
                result.append(num * 1.09728);
            }
            else if(after_command.equals(String.valueOf(speedEnum.INCH_PER_SECOND))){
                result.append(num * 12);
            }
            else if(after_command.equals(String.valueOf(speedEnum.INCH_PER_HOUR))){
                result.append(num * 43200);
            }
            else if(after_command.equals(String.valueOf(speedEnum.FEET_PER_SECOND))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(speedEnum.FEET_PER_HOUR))){
                result.append(num * 3600);
            }
            else if(after_command.equals(String.valueOf(speedEnum.MILE_PER_SECOND))){
                result.append(num * 0.0001893939);
            }
            else if(after_command.equals(String.valueOf(speedEnum.MILE_PER_HOUR))){
                result.append(num * 0.6818181818);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KNOT))){
                result.append(num * 0.5924838013);
            }
        }
        else if(before_command.equals(String.valueOf(speedEnum.FEET_PER_HOUR))){
            if(after_command.equals(String.valueOf(speedEnum.METER_PER_SECOND))){
                result.append(num * 0.0000846667);
            }
            else if(after_command.equals(String.valueOf(speedEnum.METER_PER_HOUR))){
                result.append(num * 0.3048);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KILOMETER_PER_SECOND))){
                result.append(num * 8.46666667 * Math.pow(10, -8));
            }
            else if(after_command.equals(String.valueOf(speedEnum.KILOMETER_PER_HOUR))){
                result.append(num * 0.0003048);
            }
            else if(after_command.equals(String.valueOf(speedEnum.INCH_PER_SECOND))){
                result.append(num * 0.0033333333);
            }
            else if(after_command.equals(String.valueOf(speedEnum.INCH_PER_HOUR))){
                result.append(num * 12);
            }
            else if(after_command.equals(String.valueOf(speedEnum.FEET_PER_SECOND))){
                result.append(num * 0.0002777778);
            }
            else if(after_command.equals(String.valueOf(speedEnum.FEET_PER_HOUR))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(speedEnum.MILE_PER_SECOND))){
                result.append(num * 5.26094276 * Math.pow(10, -8));
            }
            else if(after_command.equals(String.valueOf(speedEnum.MILE_PER_HOUR))){
                result.append(num * 0.0001893939);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KNOT))){
                result.append(num * 0.0001645788);
            }
        }
        else if(before_command.equals(String.valueOf(speedEnum.MILE_PER_SECOND))){
            if(after_command.equals(String.valueOf(speedEnum.METER_PER_SECOND))){
                result.append(num * 1609.344);
            }
            else if(after_command.equals(String.valueOf(speedEnum.METER_PER_HOUR))){
                result.append(num * 5793638.4);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KILOMETER_PER_SECOND))){
                result.append(num * 1.609344);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KILOMETER_PER_HOUR))){
                result.append(num * 5793.6384);
            }
            else if(after_command.equals(String.valueOf(speedEnum.INCH_PER_SECOND))){
                result.append(num * 63360);
            }
            else if(after_command.equals(String.valueOf(speedEnum.INCH_PER_HOUR))){
                result.append(num * 228096000);
            }
            else if(after_command.equals(String.valueOf(speedEnum.FEET_PER_SECOND))){
                result.append(num * 5280);
            }
            else if(after_command.equals(String.valueOf(speedEnum.FEET_PER_HOUR))){
                result.append(num * 19008000);
            }
            else if(after_command.equals(String.valueOf(speedEnum.MILE_PER_SECOND))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(speedEnum.MILE_PER_HOUR))){
                result.append(num * 3600);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KNOT))){
                result.append(num * 3128.3411708423);
            }
        }
        else if(before_command.equals(String.valueOf(speedEnum.MILE_PER_HOUR))){
            if(after_command.equals(String.valueOf(speedEnum.METER_PER_SECOND))){
                result.append(num * 0.44704);
            }
            else if(after_command.equals(String.valueOf(speedEnum.METER_PER_HOUR))){
                result.append(num * 1609.344);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KILOMETER_PER_SECOND))){
                result.append(num * 0.00044704);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KILOMETER_PER_HOUR))){
                result.append(num * 1.609344);
            }
            else if(after_command.equals(String.valueOf(speedEnum.INCH_PER_SECOND))){
                result.append(num * 17.6);
            }
            else if(after_command.equals(String.valueOf(speedEnum.INCH_PER_HOUR))){
                result.append(num * 63360);
            }
            else if(after_command.equals(String.valueOf(speedEnum.FEET_PER_SECOND))){
                result.append(num * 1.4666666667);
            }
            else if(after_command.equals(String.valueOf(speedEnum.FEET_PER_HOUR))){
                result.append(num * 5280);
            }
            else if(after_command.equals(String.valueOf(speedEnum.MILE_PER_SECOND))){
                result.append(num * 0.0002777778);
            }
            else if(after_command.equals(String.valueOf(speedEnum.MILE_PER_HOUR))){
                result.append(num);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KNOT))){
                result.append(num * 0.8689762419);
            }
        }
        else if(before_command.equals(String.valueOf(speedEnum.KNOT))){
            if(after_command.equals(String.valueOf(speedEnum.METER_PER_SECOND))){
                result.append(num * 0.5144444444);
            }
            else if(after_command.equals(String.valueOf(speedEnum.METER_PER_HOUR))){
                result.append(num * 1852);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KILOMETER_PER_SECOND))){
                result.append(num * 0.0005144444);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KILOMETER_PER_HOUR))){
                result.append(num * 1852);
            }
            else if(after_command.equals(String.valueOf(speedEnum.INCH_PER_SECOND))){
                result.append(num * 20.2537182852);
            }
            else if(after_command.equals(String.valueOf(speedEnum.INCH_PER_HOUR))){
                result.append(num * 72913.385826772);
            }
            else if(after_command.equals(String.valueOf(speedEnum.FEET_PER_SECOND))){
                result.append(num * 1.6878095271);
            }
            else if(after_command.equals(String.valueOf(speedEnum.FEET_PER_HOUR))){
                result.append(num * 6076.1154855643);
            }
            else if(after_command.equals(String.valueOf(speedEnum.MILE_PER_SECOND))){
                result.append(num * 0.00319661);
            }
            else if(after_command.equals(String.valueOf(speedEnum.MILE_PER_HOUR))){
                result.append(num * 1.150779448);
            }
            else if(after_command.equals(String.valueOf(speedEnum.KNOT))){
                result.append(num);
            }
        }
        return result.toString();
    }
}

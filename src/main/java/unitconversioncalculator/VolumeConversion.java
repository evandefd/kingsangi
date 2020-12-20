public class VolumeConversion {
    private static final StringBuilder result = new StringBuilder();
    private enum volumeEnum{
        BRITISH_GALLON,
        US_GALLON,
        LITER,
        MILLILITER,
        CUBIC_CENTIMETER,
        CUBIC_METER,
        CUBIC_INCH,
        CUBIC_FEET
    }
    public static String volumeConversion(Enum before_command, Enum after_command, double num){
        if(before_command == volumeEnum.BRITISH_GALLON){
            if(after_command == volumeEnum.BRITISH_GALLON){
                result.append(num);
            }
            else if(after_command == volumeEnum.US_GALLON){
                result.append(num * 1.2009499255);
            }
            else if(after_command == volumeEnum.LITER){
                result.append(num * 4.54609);
            }
            else if(after_command == volumeEnum.MILLILITER){
                result.append(num * 4546.09);
            }
            else if(after_command == volumeEnum.CUBIC_CENTIMETER){
                result.append(num * 4546.09);
            }
            else if(after_command == volumeEnum.CUBIC_METER){
                result.append(num * 0.00454609);
            }
            else if(after_command == volumeEnum.CUBIC_INCH){
                result.append(num * 277.4194327916);
            }
            else if(after_command == volumeEnum.CUBIC_FEET){
                result.append(num * 0.1605436532);
            }
        }
        else if(before_command == volumeEnum.US_GALLON){
            if(after_command == volumeEnum.BRITISH_GALLON){
                result.append(num * 0.8326741846);
            }
            else if(after_command == volumeEnum.US_GALLON){
                result.append(num);
            }
            else if(after_command == volumeEnum.LITER){
                result.append(num * 3.785411784);
            }
            else if(after_command == volumeEnum.MILLILITER){
                result.append(num * 3785.411784);
            }
            else if(after_command == volumeEnum.CUBIC_CENTIMETER){
                result.append(num * 3785.411784);
            }
            else if(after_command == volumeEnum.CUBIC_METER){
                result.append(num * 0.0037854118);
            }
            else if(after_command == volumeEnum.CUBIC_INCH){
                result.append(num * 231);
            }
            else if(after_command == volumeEnum.CUBIC_FEET){
                result.append(num * 0.1336805556);
            }
        }
        else if(before_command == volumeEnum.LITER){
            if(after_command == volumeEnum.BRITISH_GALLON){
                result.append(num * 0.2199692483);
            }
            else if(after_command == volumeEnum.US_GALLON){
                result.append(num * 0.2641720524);
            }
            else if(after_command == volumeEnum.LITER){
                result.append(num);
            }
            else if(after_command == volumeEnum.MILLILITER){
                result.append(num * 1000);
            }
            else if(after_command == volumeEnum.CUBIC_CENTIMETER){
                result.append(num * 1000);
            }
            else if(after_command == volumeEnum.CUBIC_METER){
                result.append(num * 0.001);
            }
            else if(after_command == volumeEnum.CUBIC_INCH){
                result.append(num * 61.0237440947);
            }
            else if(after_command == volumeEnum.CUBIC_FEET){
                result.append(num * 0.0353146667);
            }
        }
        else if(before_command == volumeEnum.MILLILITER){
            if(after_command == volumeEnum.BRITISH_GALLON){
                result.append(num * 0.0002199692);
            }
            else if(after_command == volumeEnum.US_GALLON){
                result.append(num * 0.0002641721);
            }
            else if(after_command == volumeEnum.LITER){
                result.append(num * 0.001);
            }
            else if(after_command == volumeEnum.MILLILITER){
                result.append(num);
            }
            else if(after_command == volumeEnum.CUBIC_CENTIMETER){
                result.append(num);
            }
            else if(after_command == volumeEnum.CUBIC_METER){
                result.append(num * 0.000001);
            }
            else if(after_command == volumeEnum.CUBIC_INCH){
                result.append(num * 0.0610237441);
            }
            else if(after_command == volumeEnum.CUBIC_FEET){
                result.append(num * 0.0000353147);
            }
        }
        else if(before_command == volumeEnum.CUBIC_CENTIMETER){
            if(after_command == volumeEnum.BRITISH_GALLON){
                result.append(num * 0.0002199692);
            }
            else if(after_command == volumeEnum.US_GALLON){
                result.append(num * 0.0002641721);
            }
            else if(after_command == volumeEnum.LITER){
                result.append(num * 0.001);
            }
            else if(after_command == volumeEnum.MILLILITER){
                result.append(num);
            }
            else if(after_command == volumeEnum.CUBIC_CENTIMETER){
                result.append(num);
            }
            else if(after_command == volumeEnum.CUBIC_METER){
                result.append(num * 0.000001);
            }
            else if(after_command == volumeEnum.CUBIC_INCH){
                result.append(num * 0.0610237441);
            }
            else if(after_command == volumeEnum.CUBIC_FEET){
                result.append(num * 0.0000353147);
            }
        }
        else if(before_command == volumeEnum.CUBIC_METER){
            if(after_command == volumeEnum.BRITISH_GALLON){
                result.append(num * 219.9692482991);
            }
            else if(after_command == volumeEnum.US_GALLON){
                result.append(num * 234.1720523581);
            }
            else if(after_command == volumeEnum.LITER){
                result.append(num * 1000);
            }
            else if(after_command == volumeEnum.MILLILITER){
                result.append(num * 1000000);
            }
            else if(after_command == volumeEnum.CUBIC_CENTIMETER){
                result.append(num * 1000000);
            }
            else if(after_command == volumeEnum.CUBIC_METER){
                result.append(num);
            }
            else if(after_command == volumeEnum.CUBIC_INCH){
                result.append(num * 61023.744094732);
            }
            else if(after_command == volumeEnum.CUBIC_FEET){
                result.append(num * 35.3146667215);
            }
        }
        else if(before_command == volumeEnum.CUBIC_INCH){
            if(after_command == volumeEnum.BRITISH_GALLON){
                result.append(num * 0.0036046501);
            }
            else if(after_command == volumeEnum.US_GALLON){
                result.append(num * 0.0043290043);
            }
            else if(after_command == volumeEnum.LITER){
                result.append(num * 0.016387064);
            }
            else if(after_command == volumeEnum.MILLILITER){
                result.append(num * 16.387064);
            }
            else if(after_command == volumeEnum.CUBIC_CENTIMETER){
                result.append(num * 16.387064);
            }
            else if(after_command == volumeEnum.CUBIC_METER){
                result.append(num * 0.0000163871);
            }
            else if(after_command == volumeEnum.CUBIC_INCH){
                result.append(num);
            }
            else if(after_command == volumeEnum.CUBIC_FEET){
                result.append(num * 0.0005787037);
            }
        }
        else if(before_command == volumeEnum.CUBIC_FEET){
            if(after_command == volumeEnum.BRITISH_GALLON){
                result.append(num * 6.228835459);
            }
            else if(after_command == volumeEnum.US_GALLON){
                result.append(num * 7.4805194805);
            }
            else if(after_command == volumeEnum.LITER){
                result.append(num * 28.316846592);
            }
            else if(after_command == volumeEnum.MILLILITER){
                result.append(num * 28316.846592);
            }
            else if(after_command == volumeEnum.CUBIC_CENTIMETER){
                result.append(num * 28316.846592);
            }
            else if(after_command == volumeEnum.CUBIC_METER){
                result.append(num * 0.0283168466);
            }
            else if(after_command == volumeEnum.CUBIC_INCH){
                result.append(num * 1728);
            }
            else if(after_command == volumeEnum.CUBIC_FEET){
                result.append(num);
            }
        }
        return result.toString();
    }
}

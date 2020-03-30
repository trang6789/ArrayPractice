package Array;

public class ConvertNumberToMonthName {
    public static String monthName(int num) {
        String dayString;
        switch (num) {
            case 1:
                dayString = "January";
                break;
            case 2:
                dayString = "February";
                break;
            case 3:
                dayString = "March";
                break;
            case 4:
                dayString = "April";
                break;
            case 5:
                dayString = "May";
                break;
            case 6:
                dayString = "June";
                break;
            case 7:
                dayString = "July";
                break;
            case 8:
                dayString = "August";
                break;
            case 9:
                dayString = "September";
                break;
            case 10:
                dayString = "October";
                break;
            case 11:
                dayString = "November";
                break;
            case 12:
                dayString = "December";
                break;
            default:
                dayString = "Invalid day";
                break;
        }

        return dayString;

    }

    public static void main(String[] args)
    {
        int num = 5;
        System.out.println(monthName(num));

    }

}

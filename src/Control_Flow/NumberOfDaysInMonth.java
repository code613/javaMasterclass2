package Control_Flow;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        int monthNum = 1;
        String month = switch (monthNum) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Month number";
        };
        int year = 2024;
        System.out.println("There are " + getDaysInMonth(monthNum, year) + " days in " + month + " of " + year);
    }

    // write code here
    public static boolean isLeapYear(int year) {

        if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && (year >= 1 && year <= 9999)) {
            return true;
        } else {
            return false;
        }

    }

    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999) {
            return -1;
        }
        int days = switch (month) {
            case 11, 4, 6, 9 ->  30;
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> {
                if (isLeapYear(year)) {
                     yield 28;
                } else {
                    yield 29;
                }
            }
            default -> -1;

        };
        return days;
    }
}

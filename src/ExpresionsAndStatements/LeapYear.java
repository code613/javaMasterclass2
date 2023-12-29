package ExpresionsAndStatements;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;
       if (isLeapYear(year) == true) {
           System.out.println(year + " is a leap year.");
       } else {
           System.out.println(year + " is not a leap year.");
       }
    }


    // write code here
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {

            return false;

        } else if ((year % 4 == 0 && year % 100 != 0) ||
                (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)) {

            return true;

        } else {

            return false;
        }
    }
}





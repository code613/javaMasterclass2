package Control_Flow;

public class SwitchExpressionChallenge {

    public static void main(String[] args) {
        int num = 7;
        printDayOfWeek(num);
        printWeekDay(num);
    }

    public static void printDayOfWeek(int day) {

        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Entry";
        };
        System.out.println(day + " is " + dayOfWeek);
    }

    public static void printWeekDay(int day) {

//        Instructor code just assigned it originally to Invalid Entry
//        and reassigned it in the if statements.
        String dayOfWeek = "";
        if (day >= 0 && day <= 6) {


            if (day == 0) {
                dayOfWeek = "Sunday";
            } else if (day == 1) {
                dayOfWeek = "Monday";
            } else if (day == 2) {
                dayOfWeek = "Tuesday";
            } else if (day == 3) {
                dayOfWeek = "Wednesday";
            } else if (day == 4) {
                dayOfWeek = "Thursday";
            } else if (day == 5) {
                dayOfWeek = "Friday";
            } else if (day == 6) {
                dayOfWeek = "Saturday";
            }
            System.out.println(day + " = " + dayOfWeek);
        } else System.out.println("Invalid Number");


    }
}

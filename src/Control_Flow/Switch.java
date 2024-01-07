package Control_Flow;

public class Switch {
    public static void main(String[] args) {
        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("was a 3, a 4, or a 5");
                System.out.println("Actually was a " + switchValue);
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;

        }
        String month = "xys";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }
    public static String getQuarter(String month) {
        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}

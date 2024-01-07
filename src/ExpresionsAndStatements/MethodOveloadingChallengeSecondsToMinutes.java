package ExpresionsAndStatements;

public class MethodOveloadingChallengeSecondsToMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(78, 26));
        System.out.println(getDurationString(4706));
    }

    public static String getDurationString(int seconds) {

        if (seconds >= 0) {
            return getDurationString(seconds / 60, seconds % 60);
        } else { return "Please enter number greater than zero"; }
    }

    public static String getDurationString(int minutes, int seconds) {

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        if (minutes < 0) {
            return "Please enter minutes greater than zero";
        } else
        if (seconds >= 0 && seconds <=59) {
            return (hours + "h " + remainingMinutes + "m " + seconds + "s");
        } else { return "Please enter value between 0 and 59"; }
    }
}

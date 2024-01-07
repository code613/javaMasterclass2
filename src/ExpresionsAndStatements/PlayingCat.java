package ExpresionsAndStatements;

public class PlayingCat {
    public static void main(String[] args) {
        int temperature = 46;
        if (isCatPlaying(true,temperature)) {
            System.out.println("Cat is playing");
        }
        if (isCatPlaying(true,temperature)) {
            System.out.println("Instructor code also works. Cat is playing");
        }
    }
    // write code here
    //My code
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer && temperature >= 25 && temperature <= 45 ||
                !summer && temperature >= 25 && temperature <= 35) {
            return true;
        } else {
            return false;
        }
    }

    //instructors solution
    public static boolean isCatPlayingInstructors(boolean summer, int temperature) {
        int max = summer ? 45 : 35;
        return temperature >= 25 && temperature <= max;
    }
}

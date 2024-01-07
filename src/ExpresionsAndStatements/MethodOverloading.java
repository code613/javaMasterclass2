package ExpresionsAndStatements;

public class MethodOverloading {
    public static void main(String[] args) {

        System.out.println("New score is " + calculateScore("Tim", 500));
        System.out.println("New score is " + calculateScore(10));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return  score * 1000;
    }

    public static int calculateScore(int score) {
        return calculateScore("Anonymous", score);
    }
    public static int calculateScore() {
        System.out.println("No Player name. No player score");
        return  0;
    }
    //Doesn't help to just change the return type
//    public static void calculateScore() {
//        System.out.println("No Player name. No player score");
//
//    }
}

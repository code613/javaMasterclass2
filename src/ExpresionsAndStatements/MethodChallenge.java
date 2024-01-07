package ExpresionsAndStatements;

public class MethodChallenge {
    public static void main(String[] args) {

        //My code

        displayHighScorePosition("Mendel", calculateHighScorePosition(1500));
        displayHighScorePosition("Jo", calculateHighScorePosition(1000));
        displayHighScorePosition("Chaim", calculateHighScorePosition(500));
        displayHighScorePosition("Fred", calculateHighScorePosition(100));
        displayHighScorePosition("Sarah", calculateHighScorePosition(25));

        //Instructors method

//        int position = calculateHighScorePosition(1500);
//        displayHighScorePosition("Sarah", position);

        //repeating 5x with different names and scores

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " +
                playerPosition +
                " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
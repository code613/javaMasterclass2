package ExpresionsAndStatements;

public class StatementsWhiteSpacingAndIndenting {
    public static void main(String[] args) {

        int myVariable = 50;

        myVariable++;
        myVariable--;

        System.out.println("this is a test");

        // a string in even in () on different lines needs closing "" and a + symbol
        //not like this:
//        System.out.println("this is
//                another
//                still more");
        //like this:
        System.out.println("this is " +
                "another " +
                "still more");


        if (myVariable == 0) {
            System.out.println(myVariable);
        }
    }
}

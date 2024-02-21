package Control_Flow;

import java.util.Scanner;
public class MinMaxChallenge {

    //program will except user input and keep track of the min and max number the user
    // entered.
    //the instructor in the course did a few things more simple and conventional than the
    // way I did it and i will point those out in the comments below.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int min = 0;
        int max = 0;
        Boolean firstNumber = true;
        Boolean charEntered = false;

        while (!charEntered) {
            System.out.println("Enter number. To quit, enter any Char.");

            String entry = scanner.nextLine();

            try {

                // the first number the user enters has to be set to min and max but only
                // on the first iteration, for any further iterations min and max have to
                // stay set to what they were so we can run the if statements and see if the
                // new number is min or max. That's why I created this boolean on first number
                // user enters only. the instructor simply use a loop count and in each of the
                // if statements added an || loopcount == 0.
                if (firstNumber == true) {
                    min = Integer.parseInt(entry);
                    max = Integer.parseInt(entry);
                }

                if (Integer.parseInt(entry) > max) {
                    max = Integer.parseInt(entry);
                }

                if (Integer.parseInt(entry) < min) {
                    min = Integer.parseInt(entry);
                }

                firstNumber = false;

            } catch (NumberFormatException enteredChar){
                // Instructor simply set the while loop condition to true and used a break here.
                charEntered = true;
            }

            System.out.println("Your min number is " + min + " and your max is " + max + ".");
        }
        System.out.println("Thank you!");
    }
}

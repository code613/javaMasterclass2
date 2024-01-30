package Control_Flow;

import java.util.Scanner;

public class ReadingUserInput {

    //In this program we will show how to except user input using System.console
    // and scanner method

    public static void main(String[] args) {
        int currentYear = 2024; //setting current year so the rest of the code can calculate
                                // age based on it.

        try {
            System.out.println(getInputFromConsole(currentYear)); //System.console only
                                                            // only works in the terminal
                                                            //not in intelij console
        } catch (NullPointerException e) {               //we catch the error for intelij console
            System.out.println(getInputFromScanner(currentYear)); // and use scanner
        }
    }
    public static String getInputFromConsole(int currentYear) {

        //variable name will be whatever user inputs after prompt
        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");
        //will cget date of birth from user, calculate age and spit it out
        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

        //String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi, What's your name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course!");

        //String dateOfBirth = System.console().readLine("What year were you born? ");
        System.out.println("What year were you born? ");

        boolean validDOB = false;
        int age = 0;
        //we can do a simple enter date of birth but we want to keep it in range and
        // only except possible ages, so no negative numbers no future dob's and none
        // older than 120
        do {
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 125) + " and <= " + (currentYear));
            //we catch error if user uses a letter character and prompt him to enter
            // only numbers
            try {
                // age is invoking checkData method and second thing is coming from
                // user input. validDOB is checked
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
                //if invalid character was entered the catch phrase will show and loop
                // will continue
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed!!! Try again.");
            }
            //if bad dob was entered user will be prompted again, else age will be returned
        } while (!validDOB);

        return "So you are " + age + " years old";
    }

    //checks dob to make sure it's in valid range.
    public static int checkData(int currentYear, String dateOfBirth) {

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return (currentYear - dob);
        }
    }


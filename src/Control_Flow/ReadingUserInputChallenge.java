package Control_Flow;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int sum = 0;
    String num = "";
    //I used a for loop. a while loop may have been more efficient
    for (int i = 1; i < 6; i++) {
        System.out.println("Enter number #" + i + ":");
        num = scanner.nextLine();
        try {
            sum += Integer.parseInt(num);
        } catch (NumberFormatException badUserData) {
            i--;
            System.out.println("Invalid Number");
        }
    }
    System.out.println("Sum = " + sum);
    }
}

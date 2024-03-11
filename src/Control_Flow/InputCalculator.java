package Control_Flow;

import java.util.Scanner;

public class InputCalculator {
    //program takes number from user calculates the sum and the average
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long avg = 0;
        int count = 0;

        do {
            String entry = scanner.nextLine();
            try {

                sum += Integer.parseInt(entry);
                //increase count and sum will be divided by count when parseInt triggers catch
                count ++;

            } catch (NumberFormatException enteredChar) {

                avg = Math.round((double)sum/count);

                break;
            }
        } while (true);

        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}

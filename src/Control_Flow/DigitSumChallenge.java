package Control_Flow;

public class DigitSumChallenge {

    public static void main(String[] args) {

        //Testing code
        System.out.println("Sum of each digit in " + 1234 + " = " + sumDigits(1234) );
        System.out.println("Sum of each digit in " + -125 + " = " + sumDigits(-125) );
        System.out.println("Sum of each digit in " + 4 + " = " + sumDigits(4) );
        System.out.println("Sum of each digit in " + 32123 + " = " + sumDigits(32123) );

    }

    // My solution. See instructors solution bellow
    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }

        int sumDigits = 0;
        int n = 0;
        while (true) {
           n = number % 10;
           sumDigits += n;
           number = number / 10;
           if (number == 0) {
               break;
           }

        }
        return sumDigits;
    }

    public static int sumDigitsInstructorSolution(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 9) {
            sum += (number % 10);
            number = number / 10;
        }

        sum += number;

        return sum;
    }
}

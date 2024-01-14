package Control_Flow;

public class SumOddRange {
// I add this main method to test the methods from the exercise
    public static void main(String[] args) {
        int start = 1;
        int end = 500;
        System.out.println("Sum of odd numbers from " + start + " to " + end + " is " + sumOdd(start, end));
    }

// Here after is from the exercise in Udemy
    // write code here
    public static boolean isOdd(int number) {
        if (number > 0 && number % 2 != 0) {
            return true;
        } else return false;
    }

    public static int sumOdd( int start, int end) {

        if (start < 1 || end < 1 || start > end) {
            return -1;
        }

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}


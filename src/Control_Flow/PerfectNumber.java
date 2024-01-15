package Control_Flow;

public class PerfectNumber {

    public static void main(String[] args) {
        //Testing code
        System.out.println(isPerfectNumber(6));
    }

    // write code here
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int factors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                factors += i;
            }
        }
        return factors == number;
    }
}

package Control_Flow;

public class LastDigitChecker {

    public static void main(String[] args) {
        //Testing code
        System.out.println(hasSameLastDigit(18,99,17));
    }

    // write code here
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }

        if (num1 % 10 == num2 % 10 ||
                num1 % 10 == num3 % 10 ||
                num2 % 10 == num3 % 10 ) {
            return true;
        }

        return false;
    }

    public static boolean isValid(int num) {
        if (num < 10 || num > 1000) {
            return false;
        }

        return true;
    }
}

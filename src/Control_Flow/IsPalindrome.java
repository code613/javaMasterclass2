package Control_Flow;

public class IsPalindrome {

    public static void main(String[] args) {
        //Testing code
        System.out.println(isPalindrome(112));
    }

    // write code here
    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int lastDigit = 0;
        int interimNum = number;

        while (true) {

            lastDigit = interimNum % 10;
            interimNum = interimNum / 10;
            reverse = (reverse * 10) + lastDigit;
            if (interimNum == 0) {
                if (number == reverse) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
}

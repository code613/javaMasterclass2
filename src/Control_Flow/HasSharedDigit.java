package Control_Flow;

public class HasSharedDigit {

    public static void main(String[] args) {
        //Testing code
        System.out.println(hasSharedDigit(18,99));
    }

    // write code here
    public static boolean hasSharedDigit(int num1, int num2) {

        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        int originalNum2 = num2;
        int lastNum1 = 0;
        int lastNum2 = 0;

        while (num1 > 0) {
            lastNum1 = num1 % 10;
            num1 /= 10;
            num2 = originalNum2;
            while (num2 > 0) {
                lastNum2 = num2 % 10;
                num2 /= 10;
                if (lastNum1 == lastNum2) {
                    return true;
                }

            }
        }
        return false;
    }
}

package Control_Flow;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        //Testing code
        System.out.println(getGreatestCommonDivisor(25,15));
    }

    public static int getGreatestCommonDivisor(int num1, int num2) {
        if (num1 < 10 || num2 < 10) {
            return -1;
        }

        if (num2 < num1) {
            for (int i = num2; i > 0; i--) {
                if (num1 % i == 0 && num2 % i == 0) {
                    return i;
                }
            }
        } else if (num1 < num2) {
            for (int i = num1; i > 0; i--) {
                if (num1 % i == 0 && num2 % i == 0) {
                    return i;
                }
            }
        }
        return num1;
    }
}

package Control_Flow;

public class GetEvenDigitSum {

    public static void main(String[] args) {
        //Testing code
        System.out.println(getEvenDigitSum(112));
    }

    // write code here
    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int lastNumber = 0;

        while (number != 0) {

            lastNumber = number % 10;
            number /= 10;

            if (lastNumber % 2 == 0) {
                sum += lastNumber;
            }
        }
        return sum;
    }
}

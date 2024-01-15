package Control_Flow;

public class SumFirstAndLastDigit {

    public static void main(String[] args) {
        //Testing code
        System.out.println(sumFirstAndLastDigit(1234));
    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }


        int firstNumber = 0;
        int sum = (number % 10);

        while (number > 0) {
            firstNumber = number;
            number = (number / 10);
            if (number == 0) {
                sum += firstNumber;
            }
        }
        return sum;
    }
}

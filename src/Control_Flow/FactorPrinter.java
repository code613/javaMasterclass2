package Control_Flow;

public class FactorPrinter {
    // write code here

    public static void main(String[] args) {
        int number = 100;

        if (number < 1) {
            System.out.println("Invalid Value");
        } else {

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

    }

}

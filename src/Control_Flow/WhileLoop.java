package Control_Flow;

public class WhileLoop {

    public static void main(String[] args) {
        //Standard for loop here to compare to the while loop
        for (int i = 1; i <= 5; i++) {
        System.out.println(i);
        }

        // And now the while loop
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        // Here the condition is in the while loop
        int k = 1;
        while (true) {
            if (k > 5) {
                break;
            }
            System.out.println(k);
            k++;
        }

        // Here's the do while loop
        boolean isReady = false;
        int m = 1;
        do {
            if (m > 5) {
                break;
            }
            System.out.println(m);
            m++;
            isReady = (j > 0);
        } while (isReady);

         // example of continue statement
        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.println(number + "_");
        }
    }
}

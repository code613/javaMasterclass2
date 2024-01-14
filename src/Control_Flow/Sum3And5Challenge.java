package Control_Flow;

public class Sum3And5Challenge {
// writing a program, checks numbers 1 - 1000 if divisible by 3 and 5
    // evenly, adds those numbers together. Stops after it finds 3 numbers.
    public static void main(String[] args) {
        // will be used in the for loop to calculate sum
        int sum = 0;
        // variable will be used to stop for loop after three numbers are found
        int counter = 0;
        for (int i = 1; i <=1000; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                System.out.println(i);
                counter++;
                if (counter == 5) {
                    break;
                }
            };
        }
        System.out.println("Sum: " + sum);
    }
        

}

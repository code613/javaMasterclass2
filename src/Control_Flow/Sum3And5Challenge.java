package Control_Flow;

public class Sum3And5Challenge {
// writing a program, checks numbers 1 - 1000 if divisible by 3 and 5
    // evenly, adds those numbers together. Stops after it finds 3 numbers.
    public static void main(String[] args) {
        // will be used in the for loop to calculate sum
        int sumOfMatches = 0;
        // variable will be used to stop for loop after five numbers are found
        int countOfMatches = 0;
        for (int loopNumber = 1; loopNumber <=1000; loopNumber++) {

            if (loopNumber % 3 == 0 && loopNumber % 5 == 0) {
                sumOfMatches += loopNumber;
                System.out.println(loopNumber);
                countOfMatches++;
                if (countOfMatches == 5) {
                    break;
                }
            };
        }
        System.out.println("Sum: " + sumOfMatches);
    }
        

}

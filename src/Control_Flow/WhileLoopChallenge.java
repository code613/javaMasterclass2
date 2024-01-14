package Control_Flow;

public class WhileLoopChallenge {

    public static void main(String[] args) {
        int number = 4;
        int lastNumber = 20;
        int oddCount = 0;
        int evenCount = 0;
        while (number <= lastNumber) {

            number++;

            if (!(isEvenNumber(number))) {
                oddCount++;
                continue;
            }
            evenCount++;
            System.out.println(number);
            if (evenCount >= 5) {
                System.out.println("Total amount of even numbers: " + evenCount
                 + " Total amount of odd numbers: " + oddCount);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        }
        return false;
    }
}

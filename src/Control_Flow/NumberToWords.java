package Control_Flow;

public class NumberToWords {

    public static void main(String[] args) {
        //Testing code
        numberToWords(0);
        //Testing getDigitCount
        System.out.println(getDigitCount(0) + " Digits");
        //Testing reverse
        System.out.println(reverse(1234));
    }

    //The basic method will be to chop off the last digit (number % 10) and print it out with a switch statement inside
    //a while loop. The problem is it will print the number backwards, so we reverse the number with the reverse method.
    //Also for numbers with trailing zeros, we will run into a problem because the condition of the while loop is until
    //the number = 0 and in this case the loop will cut out early. For that we count the digits in the number and compare
    //the digit count of the original number to that of the reversed number and if they are different we print zeros
    //in the amount of the difference.
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reversedNumber = reverse(number);
        do  {
            switch (reversedNumber % 10) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            reversedNumber /= 10;
        } while (reversedNumber != 0);
        if (getDigitCount(reverse(number)) != getDigitCount(number)) {
            for (int i = getDigitCount(number) - getDigitCount(reverse(number)); i > 0; i--) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            reversedNumber = (reversedNumber * 10) + (number % 10);
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int counter = 0;
        do  {
            number /= 10;
            counter++;
        } while (number != 0);
        return counter;
    }
}

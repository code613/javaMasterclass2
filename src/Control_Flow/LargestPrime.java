package Control_Flow;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(16));
        //System.out.println(isPrime(3));
    }

    public static int getLargestPrime(int number) {

        boolean isPrime = false;

        for (int i = number; i > 1; i--) {
            if (number % i == 0) {         //is factor
                for (int j = (i - 1); j > 1; j--) { //check if prime
                    if (i % j == 0) {
                        break;
                    }
                    if (j == 2) {
                        isPrime = true;
                        break;
                    }
                }
                if (isPrime || i == 2) {
                    return i;
                }
            }
        }
        return -1;
    }
}


//    public static boolean isPrime(int number) {
//
//        for (int i = (number - 1); i > 1; i--) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }




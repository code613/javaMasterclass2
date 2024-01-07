package ExpresionsAndStatements;

public class TeenNumberChecker {
    public static void main(String[] args) {
        if (hasTeen(12, 11, 10)) {
            System.out.println("One of them is a teen");
        } else {
            System.out.println("No Teens");
        }
    }

        // write code here
        public static boolean hasTeen ( int num1, int num2, int num3){
            // I initially wrote it like this but the idea was to use isTeen in hasTeen
            //return (num1 > 12 && num1 < 20 || num2 > 12 && num2 < 20 || num3 > 12 && num3 < 20);
            return isTeen(num1) || isTeen(num2) || isTeen(num3);
        }

        public static boolean isTeen ( int num){
            return num > 12 && num < 20;
        }
    }


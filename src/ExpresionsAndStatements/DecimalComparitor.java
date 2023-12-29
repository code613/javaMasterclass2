package ExpresionsAndStatements;

public class DecimalComparitor {

    public static void main(String[] args) {
        if (areEqualByThreeDecimalPlaces(2.2375, 2.2366) == true) {

            System.out.println("Numbers are equal to three decimal places");
        } else {
            System.out.println("Numbers are not equal to three decimal places");
        }
    }

        // write code here
        public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {


            if ((int)(num1 * 1000) == (int)(num2 * 1000)) {

                return true;
            }

            return false;

        }
    }


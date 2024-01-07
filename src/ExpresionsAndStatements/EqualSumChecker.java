package ExpresionsAndStatements;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class EqualSumChecker {
    public static void main(String[] args) {
        if (hasEqualSum(2,2,5)) {
            System.out.println("Numbers have equal sum");
        } else {
            System.out.println("Numbers don't have equal sum");
        }

    }
    public static boolean hasEqualSum(int num1, int num2, int num3) {

        return num1 + num2 == num3;

    }
}

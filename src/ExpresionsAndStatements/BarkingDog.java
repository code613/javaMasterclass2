package ExpresionsAndStatements;

public class BarkingDog {
    public static void main(String[] args) {
        if (shouldWakeUp(true, 4) == true) {
            System.out.println("stop barking");
        } else {
            System.out.println("there is no barking");
        }
    }
    // write code here

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (!barking || hourOfDay < 0 || (hourOfDay >= 8 && hourOfDay <= 22) || hourOfDay > 23) {

            return false;
        } else {
            return true;
        }
    }
}

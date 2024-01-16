package Control_Flow;

public class FlourPacker {

    public static void main(String[] args) {
        //Testing code
        if (canPack(2, 2, 12)) {
            System.out.println("True");
        } else System.out.println("False");
    }

    // write code here

    //Goal here is to check if we can pack packages of flower in the goal amount. bigCount = 5 kg, smallCount = 1kg
    //whatever goal is it has to fit. If goal is 9 and you have one bigCount and at least 4 smallCounts you can put
    //together a package of 9 kg. It's ok if there are leftover. But if you only had two bigCounts and less than 4
    //smallCounts there would be no way to get exactly 9.
    //I see there were much simpler solutions but this is what I came up with after some time.
    //A simpler solution would have just been to check if bigCount % 5 is >= to smallCount.
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        //checks that there are no negative numbers
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        // makes sure there is enough to reach the goal.
        if ((bigCount * 5) + smallCount < goal) {
            return false;
        }
        //we know there is enough to reach the goal but can I reach exactly the goal?
        do {

            if (goal % 5 == 0) { //checks if it is evenly divided by 5 we know we can pack exactly
                return true;
            }
            goal -= 1;          //if it doesn't divide evenly by 5 we reduce goal and check again, as long as there are smallCounts left
            smallCount -= 1;

        } while (smallCount > -1);
        return false;
    }
}

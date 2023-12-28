package ExpresionsAndStatements;

public class SpeedConverter {
    // write code here
    public static long toMilesPerHour(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            return -1;
        }
        long milesPerHour = Math.round(kilometerPerHour/1.609);
        return milesPerHour;
    }
    public static void printConversion(double kilometerPerHour) {
        if (toMilesPerHour(kilometerPerHour) == -1) {
            System.out.println("Invalid Value");
        }  else {
            System.out.println(kilometerPerHour + " km/h = " + toMilesPerHour(kilometerPerHour) + " mi/h");
        }
    }
}



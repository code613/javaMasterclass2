package ExpresionsAndStatements;

public class MethodOverloadingChallenge {
    public static void main(String[] args) {

        convertToCentimeters(5,8);
        System.out.println("5 feet 8 inches = " + convertToCentimeters(5,8) + "cm");
        System.out.println("68 inches = " + convertToCentimeters(68) + "cm");

    }
    public static double convertToCentimeters(int totalInches) {
        double centimeters = totalInches * 2.54;
        return centimeters;
    }

    public static double convertToCentimeters(int feet, int inches) {
        int totalInches = (feet * 12) + inches;
        return convertToCentimeters(totalInches);
    }


}

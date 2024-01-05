package ExpresionsAndStatements;


public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(5, 30));

    }
    // write code here. for commit
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        } else return radius * radius * 3.14159;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        } else return x * y;
    }
}

package Control_Flow;

public class Switch {
    public static void main(String[] args) {
        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("was a 3, a 4, or a 5");
                System.out.println("Actually was a " + switchValue);
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;

        }
    }
}

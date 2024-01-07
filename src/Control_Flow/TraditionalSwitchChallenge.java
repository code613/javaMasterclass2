package Control_Flow;

public class TraditionalSwitchChallenge {
    public static void main(String[] args) {
        char letter = 'b';

        switch (letter) {
            case 'A':
                System.out.println(letter + " = Able");
                break;
            case 'B':
                System.out.println(letter + " = Baker");
                break;
            case 'C':
                System.out.println(letter + " = Charlie");
                break;
            case 'D':
                System.out.println(letter + " = Dog");
                break;
            case 'E':
                System.out.println(letter + " = Easy");
                break;
            default: System.out.println(letter +" is not valid");
            break;
        }
    }
}

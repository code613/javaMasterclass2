package ExpresionsAndStatements;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }
    // write code here
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {


        int remainder = kiloBytes % 1024;
        int megaBytes = kiloBytes  / 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }
    }
}
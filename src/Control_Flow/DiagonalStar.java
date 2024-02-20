package Control_Flow;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
    }

    // write code here


    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }

        int rowCount = number;
        int rowNumber = 1;

        //Row loop
        while (rowNumber <= rowCount && number > 4) {

            //Column loop
            for (int columnNumber = 1; columnNumber <= rowCount; columnNumber++) {

                if (columnNumber == 1 || rowNumber == 1 || columnNumber == rowCount || rowNumber == rowCount || columnNumber == rowNumber || columnNumber == (rowCount - rowNumber) + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
            rowNumber++;
        }
    }
}


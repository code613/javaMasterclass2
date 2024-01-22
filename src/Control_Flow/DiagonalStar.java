package Control_Flow;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
    }

    // write code here
    //small program that will print a square of number x number e.g. 5 x 5. and print and x in the middle, two diagonal
    //lines crossing each other

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }

        int rowCount = number;
        int rowNumber = 1;
        //We are going to go through each row of the square and check four conditions that will either print a "*"
        // or " ".

        //Row loop
        while (rowNumber <= rowCount && number > 4) {  //had to add number > 4 so number less than 5 doesn't go into
                                                        // the loop. Above if statement doesn't stop it.
            //condition 1: First or last row always stars. It is the top and bottom of the box
            //condition 2: first or last column, top and bottom of box
            //condition 3: the diagonal from top left to bottom right will always be same row number and column number
            //condition 4: Diagonal from top right corner to bottom left corner will always be where
            // column number == (total rows - current row) + 1

            //Column loop
            for (int columnNumber = 1; columnNumber <= rowCount; columnNumber++) {   //for row one check conditions on
                                                                                     // each column
                if (columnNumber == 1 || rowNumber == 1 || columnNumber == rowCount || rowNumber == rowCount || columnNumber == rowNumber || columnNumber == (rowCount - rowNumber) + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //break out of column loop
            System.out.println(); //skip line
            rowNumber++;  // start checking next row
        }
    }
}


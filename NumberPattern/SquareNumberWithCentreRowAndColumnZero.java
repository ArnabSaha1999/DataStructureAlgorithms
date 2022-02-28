package NumberPattern;

import java.util.Scanner;

public class SquareNumberWithCentreRowAndColumnZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter the Number of Columns : ");
        int col = sc.nextInt();
        sc.close();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == (row - 1) / 2 || j == (col - 1) / 2) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}

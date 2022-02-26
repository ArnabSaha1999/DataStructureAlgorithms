package StarPattern;

import java.util.Scanner;

public class HollowRhombusStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter the Number of cols : ");
        int col = sc.nextInt();
        sc.close();
        for (int i = 0; i < row; i++) {
            for (int sp = 1; sp < row - i; sp++) {
                System.out.print(" ");
            }
            for (int j = 0; j < col; j++) {
                if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

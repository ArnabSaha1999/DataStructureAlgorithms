package StarPattern;

import java.util.Scanner;

public class RightDiamondStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows : ");
        int row = sc.nextInt();
        sc.close();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < row; i++) {
            for (int j = row - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

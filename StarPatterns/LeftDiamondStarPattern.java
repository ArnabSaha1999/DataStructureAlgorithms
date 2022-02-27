package StarPattern;

import java.util.Scanner;

public class LeftDiamondStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows : ");
        int row = sc.nextInt();
        sc.close();
        for (int i = 0; i < row; i++) {
            for (int sp = row - i - 1; sp > 0; sp--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < row; i++) {
            for (int sp = 0; sp < i; sp++) {
                System.out.print(" ");
            }
            for (int j = 0; j < row - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*
                *
               **
              ***
             ****
            *****
             ****
              ***
               **
                *
*/

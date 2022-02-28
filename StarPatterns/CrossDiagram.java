package StarPattern;

import java.util.Scanner;

public class CrossDiagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows : ");
        int row = sc.nextInt();
        sc.close();
        for (int i = 0; i < row; i++) {
            for (int sp = 1; sp <= i; sp++) {
                System.out.print(" ");
            }
            for (int j = 0; j < row - i; j++) {
                if (j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int k = 1; k < row - i; k++) {
                if (k == row - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i < row; i++) {
            for (int sp = 1; sp < row - i; sp++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int k = 1; k <= i; k++) {
                if (k == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

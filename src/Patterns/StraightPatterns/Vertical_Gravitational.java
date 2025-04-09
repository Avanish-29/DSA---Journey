package Patterns.StraightPatterns;

import java.util.Scanner;

public class Vertical_Gravitational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = input.nextInt();
        pyramid(n);
    }
    public static void pyramid(int n){
        for (int i = 1; i <=n ; i++) {
            //for space
            for (int j = 0; j <n-i ; j++) {
                System.out.print(" ");
            }
            //for stars
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            //for space
            for (int j = 0; j < n-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 1; i <=n; i++) {
            //for space
            for (int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            //for stars
            for (int j = 0; j < 2*(n-i) - 1; j++) {
                System.out.print("*");
            }
            //for space again
            for (int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

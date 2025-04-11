package Patterns.StraightPatterns;

import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = input.nextInt();
        pyramid(n);
    }
    public static void pyramid(int n){
        int space = 0;
        for (int i = 1; i <=n ; i++) {
            //for stars
            for (int j = 1; j < n-i+1 ; j++) {
                System.out.print("*");
            }
            //for spaces
            for (int j = 0; j<space ; j++) {
                System.out.print(" ");
            }
            //for stars
            for (int j = 1; j < n-i+1 ; j++) {
                System.out.print("*");
            }
            space +=2;
            System.out.println();
        }
        int iniS = 8;
        for (int i = 1; i<=n ; i++) {
            //for stars
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            //for spaces
            for (int j = 1; j <iniS ; j++) {
                System.out.print(" ");
            }
            //for stars
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            iniS-=2;
            System.out.println();
        }
    }
}

package Patterns.StraightPatterns;

import java.util.Scanner;

public class ascendingLetterPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = input.nextInt();
        pyramid(n);
    }

    public static void pyramid(int n) {
        for (int i = 1; i <=n ; i++) {
            // for space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //for char
            char c = 'A';
            int breakPoint = (2*i-1)/2;
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print(c);
                if (j<=breakPoint) c++;
                else c--;
            }
            // for space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
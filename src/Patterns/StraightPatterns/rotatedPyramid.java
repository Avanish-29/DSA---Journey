package Patterns.StraightPatterns;

import java.util.Scanner;

public class rotatedPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = input.nextInt();
        pyramid(n);
    }
    public static void pyramid(int n){
        for (int i = 1; i<=2*n-1; i++) {
            int stars = i;
            if (i>n) stars = 2*n -i;
            for (int j = 1; j<stars ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

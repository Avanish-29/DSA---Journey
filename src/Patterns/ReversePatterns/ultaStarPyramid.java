package Patterns.ReversePatterns;

import java.util.Scanner;

public class ultaStarPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = input.nextInt();
        pyramid(n);
    }
    public static void pyramid(int n){
        for (int i = 0; i <=n; i++) {
            for (int j = 1; j<n-i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

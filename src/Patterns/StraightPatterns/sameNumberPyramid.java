package Patterns;

import java.util.Scanner;

public class sameNumberPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = input.nextInt();
    pyramid(n);
    }
    public static void pyramid(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

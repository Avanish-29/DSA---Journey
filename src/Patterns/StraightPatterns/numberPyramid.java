package Patterns;

import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = input.nextInt();
        numPyramid(n);
    }
    public static void numPyramid(int n){
        for (int i = 0; i < n ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

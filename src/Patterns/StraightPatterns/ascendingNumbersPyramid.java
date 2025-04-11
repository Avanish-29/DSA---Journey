package Patterns.StraightPatterns;

import java.util.Scanner;

public class ascendingNumbersPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = input.nextInt();
        pyramid(n);
    }
    public static void pyramid(int n){
        int num = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

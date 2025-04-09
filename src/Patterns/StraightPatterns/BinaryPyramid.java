package Patterns.StraightPatterns;

import java.util.Scanner;

public class BinaryPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = input.nextInt();
        pyramid(n);
    }
    public static void pyramid(int n){
        int start = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                if (start % 2 == 0) start = 0;
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
}

package Patterns.ReversePatterns;

import java.util.Scanner;

public class reversedDescendingPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = input.nextInt();
        pyramid(n);
    }
    public static void pyramid(int n){
        for (int i = 1; i <=n ; i++) {
            for (char c = (char) ('G'-i); c<'G'; c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

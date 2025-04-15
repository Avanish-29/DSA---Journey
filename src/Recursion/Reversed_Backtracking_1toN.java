package Recursion;

import java.util.Scanner;

public class Reversed_Backtracking_1toN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number till which you want to print the digits in reversed order...");
        int n = input.nextInt();

    }
    public static void print(int n){
        if(n==0) return;
        print(n);
    }
}

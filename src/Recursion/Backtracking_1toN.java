package Recursion;

import java.util.Scanner;

public class Backtracking_1toN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number till which you want to print the digits...");
        int n = input.nextInt();
        print(n);
    }
    public static void print(int n){
        if (n<=0) return;
        System.out.println(n);
        print(n-1);
    }
}

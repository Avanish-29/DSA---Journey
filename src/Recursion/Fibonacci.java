package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        fibonacci(n);
    }
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    // Loop Wala Method
//    public static void fibonacci(int n){
//        if (n<=1) System.out.print("");;
//        int first = 0;int second = 1;
//        System.out.print(" 0 1 ");
//        while(second<=n){
//            int temp = first + second;
//            first = second;
//            second = temp;
//            System.out.print( " "+second);
//        }
//    }
}
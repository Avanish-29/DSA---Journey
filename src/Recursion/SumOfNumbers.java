package Recursion;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number till which you want to add numbers...");
        int n = input.nextInt();
        System.out.println("The sum of all numbers till "+ n + " is : " + sumPrint(n));
    }
//    public static void sumPrint(int n,int sum){
//        if(n<1){
//            System.out.println("The sum is :" + sum);
//            return;
//        }
//        sumPrint(n-1,sum+n);
//    }
    public static int sumPrint(int n){
        if (n==0) return 0;
        else {
            return n+sumPrint(n-1);
        }
    }
}

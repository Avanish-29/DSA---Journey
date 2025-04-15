package Recursion;

import java.util.Scanner;

public class reversePrintTill_N {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number till where you want to print the digits in reversed order....");
        int n = input.nextInt();
        printCount(n,0);
    }
    public static void printCount(int n,int i){
        if (n>i){
            System.out.println(n);
            printCount(n-1,i);
        }
    }
}

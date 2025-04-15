package Recursion;

import java.util.Scanner;

public class printTill_N {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number till where you want to print the digits....");
        int n = input.nextInt();
        printCount(n,1);
    }
    public static void printCount(int n,int i){
        if(i<=n){
            System.out.println(i);
            printCount(n,i+1);
        }
    }
}

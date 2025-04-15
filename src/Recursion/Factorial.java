package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        System.out.println("The factorial of the number "+ n + " is : "+ printFactorial(n));
    }

    //Recursion ke through
    public static long printFactorial(int n){
    if(n<=1) return 1;
    else return n* printFactorial(n-1);
    }

     /*Loop ke through
    public static long printFactorial(int n){
        if (n<=1) return 1;
        long fact = 1;
        for (int i = 2; i <=n ; i++) {
            fact = fact*i;
        }
        return fact;
    }*/
}

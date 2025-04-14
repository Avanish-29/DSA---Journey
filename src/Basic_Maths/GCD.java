package Basic_Maths;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        System.out.println("GCD of the numbers " + a +"," + b + " is :" + findGCD(a,b));
    }
    public static int findGCD(int a,int b){
       while(a>0 && b>0) {
           if(a>b) a = a %b;
           else b = b%a;
       }
       if (a==0) return b;
       else return a;
    }
}
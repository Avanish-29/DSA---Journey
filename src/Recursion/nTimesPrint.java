package Recursion;

import java.util.Scanner;

public class nTimesPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many times you want to print the name ?");
        int n = input.nextInt();
        System.out.println("Enter your name: ");
        String name = input.next();
        printName(n,name);
    }
    public static void printName(int n,String name){
        if(n>0){
            System.out.println(name);
            printName(n-1,name);
        }
    }
}

package Recursion;

import java.util.Scanner;

public class stringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = input.next();
        String cleaned = str.replaceAll("[^a-zA-Z]"," ").toUpperCase();
        boolean isPalindrome = checkPalindrome(0,cleaned);
        String result = isPalindrome ? "Yes it is Palindrome" : " This is not a palindrome.";
        System.out.println(result);
        System.out.println("The cleaned String was : " + cleaned);
    }
    public static boolean checkPalindrome(int i, String str){
        if (i>=str.length()/2) return true;
        if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        return checkPalindrome(i+1,str);
    }
}

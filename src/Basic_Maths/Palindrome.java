package Basic_Maths;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        System.out.println("Reversed number is : " + reverse(n));
        boolean isPalindrome = checkPalindrome(n);
        if(isPalindrome) System.out.println("The number is Palindrome.");
        else System.out.println("The number is not Palindrome.");
    }
        public static int reverse(int n){
        int reversedNumber = 0;
        while(n > 0){
            reversedNumber = (reversedNumber * 10) + n%10;
            n = n/10;
        }
        return reversedNumber;
        }
    public static boolean checkPalindrome(int n){
        if (n == reverse(n)){
            return true;
        }
        else  return  false;
    }
}

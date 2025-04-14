package Basic_Maths;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        boolean isArmstrong = checkArmstrong(n);
        if (isArmstrong)
            System.out.println("The number "+ n + " is Armstrong");
        else
            System.out.println("The number "+ n + " is not Armstrong");
    }
    public static boolean checkArmstrong(int n){
        // Pehle Digits count karenge
        int temp = n;
        int digits = 0;
        while(temp!=0){
            temp = temp /10;
            digits++;
        }

        // ab check karte hain
        int originalNumber = n;
        int lastDigit = 0;
        int sum = 0;
        while(n!=0){
            lastDigit = n % 10;
            sum = (int) (sum + Math.pow(lastDigit,digits));
            n = n/10;
        }
        if (sum == originalNumber) return true;
        else return false;
    }
}

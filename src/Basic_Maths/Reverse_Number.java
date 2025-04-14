package Basic_Maths;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        System.out.println("The reverse of " + n + " is " + reversed(n));
    }
    public static int reversed(int n) {
        int reversedNumber = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            if (reversedNumber > Integer.MAX_VALUE / 10 || (reversedNumber == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0;
            }
            if (reversedNumber < Integer.MIN_VALUE / 10 || (reversedNumber == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;
            }

            reversedNumber = reversedNumber * 10 + lastDigit;
            n = n / 10;
        }
        return reversedNumber;
    }
}

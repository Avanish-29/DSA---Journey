package Basic_Maths;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        boolean isPrime = checkPrime(n);
        if (isPrime) System.out.println(n + " is a Prime Number");
        else System.out.println(n + " is not a Prime Number");
    }
    public static boolean checkPrime(int n){
        for (int i = 2; i < n ; i++) {
            if (n%i == 0) return false;
        }
        return true;
    }
}

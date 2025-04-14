package Basic_Maths;

import java.util.Scanner;

public class PrintAllDivisors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        divisor(n);
    }
    public static void divisor(int n){
        for(int i = 1; i<=n; i++){
            if (n%i == 0){
                System.out.print(i + " ");
            }
        }
    }
}

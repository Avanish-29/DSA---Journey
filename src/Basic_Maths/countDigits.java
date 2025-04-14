//You are given an integer n. You need to return the number of digits in the number.
package Basic_Maths;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
//        int count = count(n);
        System.out.println("Total digits in number " + n + " is " + count(n));
    }
    public static int count(int n){
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }
}

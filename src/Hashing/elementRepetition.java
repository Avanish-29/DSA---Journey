package Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class elementRepetition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array");
        int n = input.nextInt();
        int[] arr = new int[n];
         for(int i=0; i<n ;i++){
             System.out.println("Enter the element at "+i+"th position..");
             arr[i] = input.nextInt();
         }
        System.out.println("The Array is : " + Arrays.toString(arr));
         int[] hash = new int[12];
        for (int i = 0; i <n; i++) {
            hash[arr[i]] += 1;
        }
        System.out.println("Enter the number of queries..");
        int q = input.nextInt();
        while(q-- != 0){
            System.out.println("Enter the query");
            int value = input.nextInt();
            System.out.println(hash[value]);
        }
    }
}
//    public static int check(int n, int[] arr){
//        int count = 0;
//        for(int t : arr){
//            if (t == n)
//                count++;
//        }
//        return count;
//    }


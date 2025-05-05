package Array;

import java.util.Scanner;

public class kadaneAlgo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value at " + i + "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The maximum sum of the subarray is : " + maximumSubarraySum(arr));
    }
    public static int maximumSubarraySum(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(sum < 0){
                sum = 0;
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}

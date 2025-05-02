package Array;

import java.util.Scanner;

public class longestSubarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value at " + i + "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("Value of 'k' ? : ");
        int k = input.nextInt();
        System.out.println("Answer : " + longestK(arr,k));
    }
    public static int longestK(int[] arr, int k){
        int start = 0,end = 0,sum = arr[0],max = 0;
        while(end < arr.length){
            while(start<=end && sum > k){
                sum = sum - arr[start];
                start++;
            }
            if(sum == k){
                max = Math.max(max,end - start +1);
            }
            end++;
            if(end < arr.length){
                sum = sum + arr[end];
            }
        }
        return max;
    }
}

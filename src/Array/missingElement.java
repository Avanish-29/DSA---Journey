package Array;

import java.util.Scanner;

public class missingElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value at " + i + "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The missing element in the array was : " + missing(arr));
    }
    public static int missing(int[] nums){
        int n = nums.length;
        int sum1 = n*(n+1)/2;
        int sum2 = 0;
        for(int i=0;i<n;i++){
            sum2 = sum2 + nums[i];
        }
        return sum1-sum2;
    }
}
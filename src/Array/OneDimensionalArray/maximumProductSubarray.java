package Array.OneDimensionalArray;

import java.util.Scanner;

public class maximumProductSubarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the value at "+i+"th position :");
            arr[i] = input.nextInt();
        }
        System.out.println("The maximum product of subarray is : " + maxProduct(arr));
    }
    public static int maxProduct(int[] arr){
        int product = 1;
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            product = product * arr[i];
            ans = Math.max(ans,product);
            if(arr[i] == 0){
                product = 1;
            }
        }
        product = 1;
        for(int i=arr.length-1; i>0; i--){
            product = product * arr[i];
            ans = Math.max(ans,product);
            if(arr[i]==0){
                product = 1;
            }
        }
        return ans;
    }
}

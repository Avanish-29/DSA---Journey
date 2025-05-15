package Array.OneDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class rotateLeftByZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array: ");
        int n = input.nextInt();
        System.out.println("Value of 'k' ? ");
        int k = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value at " +i+ "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("Actual Array: " + Arrays.toString(arr));
        rotate(arr,k);
        System.out.println("After rotating: " + Arrays.toString(arr));

    }
    public static int[] rotate(int[] arr,int k){
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
       return arr;
    }

    public static void reverse(int[] arr,int start,int end){
        int i = start;
        int j = end;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

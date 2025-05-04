package Array;

import java.util.Arrays;
import java.util.Scanner;

public class rotateLeftRightbyK {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number of element in the array: ");
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the value at " + i + "th position: ");
                arr[i] = input.nextInt();
            }
            System.out.println("Value of 'k' ? ");
            int k = input.nextInt();
            System.out.println("The array is: " + Arrays.toString(arr));
            System.out.println("Press 1 for Left Rotation or Press 0 for Right Rotation");
            int x = input.nextInt();
            if(x==1){
                System.out.println("Array after left rotating by "+k+" place : " + Arrays.toString(rotateLeft(arr,k)));

            }
            else if (x==0) {
                System.out.println("Array after right rotating by " + k + " place : " + Arrays.toString(rotateRight(arr, k)));
            }
            else System.out.println("Press only 1 or 2...");
    }
    public static int[] rotateRight(int[] arr,int k){
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        return arr;
    }
    public static int[] rotateLeft(int[] arr,int k){
            reverse(arr,0,arr.length-1);
            reverse(arr,0,k);
            reverse(arr,k+1,arr.length-1);
            return arr;
    }
    public static void reverse(int[] arr,int start,int end){
            while(start<=end){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                start++;end--;
            }
    }
}

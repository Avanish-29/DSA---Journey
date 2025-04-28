package Array;

import java.util.Arrays;
import java.util.Scanner;

public class largestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter the value at "+i+"th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The Array is : " + Arrays.toString(arr));
        System.out.println("The largest element of the array is: " + largest(arr));
    }

    public static int largest(int[] arr){
        int largest = arr[0];
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}

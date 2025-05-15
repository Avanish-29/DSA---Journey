package Array.OneDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class secondLargest_Smallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number of element in the array: ");
//        int n = input.nextInt();
//        int[] arr = new int[n];
//        for (int i=0;i<n;i++){
//            System.out.println("Enter the value at "+i+"th position: ");
//            arr[i] = input.nextInt();
//        }
        int[] arr = {15,89,65,32,97,12};
        System.out.println("The Array is : " + Arrays.toString(arr));
        System.out.println("The largest element of the array is: " + secondLargest(arr));
        System.out.println("The smallest element of the array is: " + secondSmallest(arr));
    }

    public static int secondLargest(int[] arr){
        int largest = arr[0];
        int Slargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                Slargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>Slargest){
                Slargest = arr[i];
            }
        }
        return Slargest;
    }

    public static int secondSmallest(int[] arr){
        int smallest = arr[0];
        int small2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<smallest){
                small2 = smallest;
                smallest = arr[i];
            }
            else if(arr[i]>smallest && arr[i]<small2){
                small2 = arr[i];
            }
        }
        return small2;
    }
}

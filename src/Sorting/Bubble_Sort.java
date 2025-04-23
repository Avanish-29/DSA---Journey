package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the value for "+i+"th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("Before swapping: " + Arrays.toString(arr));
        bubbleSort(arr,n);
        System.out.println("After swapping: " + Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr,int n){
        for(int i=n-1;i>=0;i--){
            boolean swapped = false;
            for (int j = 0; j<i ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}

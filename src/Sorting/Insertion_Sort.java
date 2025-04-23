package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value at "+i+"th position.");
            arr[i] = input.nextInt();
        }
        System.out.println("Before Sorting: "+ Arrays.toString(arr));
        insertionSort(arr,n);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr,int n){
        for(int i=0;i<=n-1;i++){
            int j = i;
                while(j>0 && arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    j--;
                }
        }
    }
}

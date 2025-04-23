package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the value at "+i+"th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The actual array was : "+ Arrays.toString(arr));
        selection(arr,n);
        System.out.println("The sorted array is : " + Arrays.toString(arr));
    }
    public static void selection(int[] arr,int n){
        for(int i = 0;i<=n-1;i++){
            int minElement = i;
            for(int j=i;j<n;j++){
                if (arr[j]<arr[minElement]){
                    minElement = j;
                }
            }
            int temp = arr[minElement];
            arr[minElement] = arr[i];
            arr[i] = temp;
        }
    }
}

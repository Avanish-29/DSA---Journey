package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Quick_Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the value at "+i+"th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The array is: " + Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("The array after sorting is: " + Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int start,int end){
        if(start<end){
            int pivot = partition(arr,start,end);
            quickSort(arr,start,pivot);
            quickSort(arr,pivot+1,end);
        }
    }

    public static int partition(int[] arr,int start, int end){
        int pivot = arr[start];
        int i = start-1;
        int j= end+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);

            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j){
                return j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}

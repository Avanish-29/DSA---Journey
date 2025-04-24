package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Merge_Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value at "+i+"th position:");
            arr[i] = input.nextInt();
        }
        System.out.println("The array is : " + Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println("Array after merge sort: " + Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr,int start,int end){
        if(start<end){
            int mid = start + (end - start)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }

    public static void merge(int[] arr,int start,int mid,int end){
        ArrayList<Integer> temp = new ArrayList<>();
        int i=start,j=mid+1;
        while(i<= mid && j<= end){
            if(arr[i] <= arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else {
                temp.add(arr[j]);
                j++;
            }
        }

        while(i<= mid){
            temp.add(arr[i]);
            i++;
        }
        while(j<= end){
            temp.add(arr[j]);
            j++;
        }

        for (int k =start; k <= end; k++) {
            arr[k] = temp.get(k-start);
        }
    }
}

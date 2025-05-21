package Array.OneDimensionalArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class countInversions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value at " + i + "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("Number of inversions in the given array is : " + inversionCount(arr));
    }
    public static int inversionCount(int[] arr){
        return mergeSort(arr,0,arr.length-1);
    }
    public static int mergeSort(int[] arr, int start, int end){
        int count = 0;
        if(start<end){
            int mid = start + (end-start)/2;
            count  = count + mergeSort(arr,start,mid);
            count = count + mergeSort(arr,mid+1,end);
            count = count + merge(arr,start,mid,end);
        }
        return count;
    }
    public static int merge(int[] arr, int start, int mid, int end){
        int inversionCount = 0;
        List<Integer> temp = new ArrayList<>();
        int i = start, j = mid+1;
        while(i<= mid && j<= end){
            if(arr[i]<=arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else {
                temp.add(arr[j]);
                inversionCount = inversionCount + (mid-i+1);
                j++;
            }
        }
        while (i<=mid){
            temp.add(arr[i]);
            i++;
        }
        while(j<=end){
            temp.add(arr[j]);
            j++;
        }
        for(int k =0; k<temp.size(); k++){
            arr[start+k] = temp.get(k);;
        }
        return inversionCount;
    }
}

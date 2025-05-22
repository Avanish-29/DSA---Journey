package Binary_Search;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class simpleBinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at : " + i + "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = input.nextInt();
        System.out.println("The target element "+target+" is found in the array: " + Arrays.toString(arr) + " at "+ binarySearch(arr,target) + " position");
    }
    public static int binarySearch(int[] arr,int target){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) start = mid +1;
            else end = mid-1;
        }
        return -1;
    }
}

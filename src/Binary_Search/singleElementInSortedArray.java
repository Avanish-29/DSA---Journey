package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class singleElementInSortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at : " + i + "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The single element in the whole array "+ Arrays.toString(arr)+" is "+singleElement(arr));
    }
    public static int singleElement(int[] arr){
        int start = 0, end = arr.length -1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid] == arr[mid^1]){
                start = mid+1;
            }
            else {
                end = mid;
            }
        }
        return arr[start];
    }
}

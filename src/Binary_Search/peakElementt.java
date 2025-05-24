package Binary_Search;

import java.util.Scanner;

public class peakElementt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at : " + i + "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The peak element is at : " + peak(arr) + "nd index");
    }
    public static int peak(int[] arr){
        int start = 0, end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }
}

package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class firstAndLastPosition {
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
        System.out.println("The first and last occurence of "+target+" in the given array is: " + Arrays.toString(firstLast(arr,target)));
    }
    public static int[] firstLast(int[] arr, int target){
        int x=-1,y=-1;
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                x = mid;
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }

        start = 0; end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                y = mid;
                start = mid+1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return new int[]{x,y};
    }
}

package Binary_Search;

import java.util.Scanner;

public class KthRotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at : " + i + "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The array was rotated "+rotation(arr)+ " times.");
    }
    public static int rotation(int[] arr){
        int start = 0, end = arr.length-1, index = -1, minimum = Integer.MAX_VALUE;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[start]<arr[end]){
                index = start;
                minimum = arr[start];
                break;
            }
            if(arr[start]<=arr[mid]){
                minimum = Math.min(minimum,arr[start]);
                index = start;
                start = mid+1;
            }
            else{
                minimum = Math.min(minimum,arr[mid]);
                index = mid;
                end = mid-1;
            }
        }
        return index;
    }
}

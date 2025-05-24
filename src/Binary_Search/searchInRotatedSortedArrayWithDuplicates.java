package Binary_Search;

import java.util.Scanner;

public class searchInRotatedSortedArrayWithDuplicates {
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
        boolean result = search(arr,target);
        String ans = result ? target+" is found in the array" : target+ " is not found in the array";
        System.out.println(ans);
    }
    public static boolean search(int[] arr, int target){
        int start = 0, end = arr.length;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target) return true;
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                start++; end--;
                continue;
            }
            if(arr[start] < arr[mid]){
                if(target>=arr[start] && target<=arr[mid]){
                    end = mid-1;
                }
                else start = mid+1;
            }
            else{
                if(target>arr[mid] && target<=arr[end]){
                    start = mid+1;
                }
                else end = mid-1;
            }
        }
        return false;
    }
}

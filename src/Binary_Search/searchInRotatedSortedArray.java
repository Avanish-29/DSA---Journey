package Binary_Search;

import java.util.Scanner;

public class searchInRotatedSortedArray {
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
        System.out.println("The element is found at: " + search(arr,target));
    }
    public static int search(int[] arr, int target){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target) return mid;
            if(arr[start]<=arr[mid]){
                if(target>=arr[start] && target<arr[mid]){
                    end = mid-1;
                }
                else start = mid+1;
            }
            else{
                if(target>=arr[mid] && target<=arr[end]){
                    start = mid+1;
                }
                else end = mid-1;
            }
        }
        return -1;
    }
    }

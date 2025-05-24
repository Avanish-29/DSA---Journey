package Binary_Search;

import java.util.Scanner;

public class minimumElementInRotatedSorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at : " + i + "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The minimum element is : " + minimum(arr));
    }
    public static int minimum(int[] arr){
        int start = 0, end = arr.length-1;
        int ans = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[start]<=arr[mid]){
                ans = Math.min(ans,arr[start]);
                start = mid+1;
            }
            else{
                ans = Math.min(ans,arr[mid]);
                end = mid-1;
            }
        }
        return ans;
        }
    }

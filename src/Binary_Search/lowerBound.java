package Binary_Search;

import java.util.Scanner;

public class lowerBound {
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
        System.out.println("The lower bound of the target element in the given array is : " + lowBound(arr,target));
    }
        public static int lowBound(int[] arr, int target) {
            int ans = arr.length;
            int start =0,end = arr.length-1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(arr[mid]>=target){
                    ans = mid;
                    end = mid-1;
                }
                else
                    start = mid +1;
            }
            return ans;
        }
    }

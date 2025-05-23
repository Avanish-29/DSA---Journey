package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class numberOfOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at : " + i + "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the target");
        int target = input.nextInt();
        System.out.println("The number of occurence of element "+target+" is "+occurrence(arr,target));
    }
    public static int occurrence(int[] arr, int target){
                Arrays.sort(arr);
                int floor = -1,ceil =-1;
                int start = 0, end = arr.length-1;
                //pehle first occurence
                while(start<=end){
                    int mid = start + (end-start)/2;
                    if(arr[mid]==target){
                        floor = mid;
                        end = mid-1;
                    }
                    else if(arr[mid]>target){
                        end = mid-1;
                    }
                    else start = mid+1;
                }

                // ab last occurence
                start=0;
                end = arr.length-1;
                while(start<=end){
                    int mid = start + (end-start)/2;
                    if(arr[mid]==target){
                        ceil = mid;
                        start = mid+1;
                    }
                    else if(arr[mid]<target) {
                        start = mid+1;
                    }
                    else end = mid-1;
                }
                if(floor == -1) return 0;
                return ceil-floor+1;
            }
        }

package Array;

import java.util.Arrays;
import java.util.Scanner;

public class nextPermutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter the value at "+i+"th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The actual array was : " + Arrays.toString(arr));
        System.out.println("The next permutation is : " + Arrays.toString(perumutation(arr)));
    }
    public static int[] perumutation(int[] arr){
        int i = arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i>=0){
            int j = arr.length-1;
            while(arr[j]<=arr[i]){
                j--;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        reverse(arr,i+1,arr.length-1);
        return arr;
    }
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++; end--;
        }
    }
}

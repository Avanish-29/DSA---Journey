package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        //Asli array
        for(int n : arr){
            System.out.print(n + " ");
        }
        reverse(arr,0,arr.length-1);

        //reversed array
        System.out.println(" \nReversed array is: ");
        for(int n : arr){
            System.out.print(n + " ");
        }
    }
public static void reverse(int[] arr,int left,int right){
    if(left>=right) return;
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
    reverse(arr,left+1,right -1);
}




    // LOOP WALA METHOD
//    public static void reverse(int[] arr){
//        int left = 0;
//        int right = arr.length-1;
//        while(left< arr.length/2){
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left++;
//            right--;
//        }
//    }
}

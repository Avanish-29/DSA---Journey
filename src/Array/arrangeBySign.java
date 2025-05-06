package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class arrangeBySign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value at " + i + "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The rearranged array accoring to alternate sign is : " + Arrays.toString(rearrange(arr,n)));
    }
    public static int[] rearrange(int[] arr,int n){
        List<Integer> positve = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(arr[i]>0){
                positve.add(arr[i]);
            }
            else negative.add(arr[i]);
        }
        for (int i = 0; i < n/2; i++) {
            arr[2*i] = positve.get(i);
            arr[2*i+1] = negative.get(i);
        }
        return arr;
    }
}

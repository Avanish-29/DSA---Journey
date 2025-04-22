package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Highest_Lowest_Frequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at "+i+"th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The Array is : " + Arrays.toString(arr));
        highLowFrequency(arr,n);
    }
    public static void highLowFrequency(int[] arr,int n){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else map.put(arr[i],1);
        }
        int max = 0,min = 0, lowFreq = n,highFreq = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            int count = entry.getValue();
            int element = entry.getKey();
            if (count > highFreq){
                highFreq = count;
                max = element;
            }
            if(count<lowFreq){
                lowFreq = count;
                min = element;
            }
        }
        System.out.printf("The maximum frequency element is %d which appeard %d times.\n",max,highFreq);
        System.out.printf("The minimum frequency element is %d which appeared %d times. \n", min,lowFreq);
    }
}

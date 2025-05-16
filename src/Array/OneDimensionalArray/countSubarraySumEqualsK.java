package Array.OneDimensionalArray;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countSubarraySumEqualsK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value at " + i + "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the value of K :");
        int k = input.nextInt();
        System.out.println("The maximum count of subarrays whose sum is equals to K is : " + countSubarray(arr,k));
    }
    public static int countSubarray(int[] arr, int k){
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0,sum = 0;
        map.put(0,1);
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            int remove = sum -k;
            count = count + map.getOrDefault(remove,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}

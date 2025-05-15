package Array;

import javax.lang.model.type.ArrayType;
import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value at " + i + "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The longest sequence of the given array "+ Arrays.toString(arr) + " is " + longestSequence(arr));
    }
    public static int longestSequence(int[] arr){
        int longest = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }

        for (int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i]-1)){
                int currentNum = arr[i];
                int cnt = 1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    cnt++;
                }
                longest = Math.max(longest,cnt);
            }

        }
        return longest;
    }
}

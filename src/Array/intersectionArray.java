package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class intersectionArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the first array: ");
        int n = input.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value at " + i + "th position: ");
            arr1[i] = input.nextInt();
        }
        System.out.println("Enter the number of element in the second array: ");
        int m = input.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.println("Enter the value at " + i + "th position: ");
            arr2[i] = input.nextInt();
        }
        System.out.println("The First Array is: " + Arrays.toString(arr1));
        System.out.println("The second Array is: " + Arrays.toString(arr2));
        System.out.println("The Intersection of these both arrays is : " + Arrays.toString(intersection(arr1, arr2)));
    }

    public static int[] intersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Set<Integer> temp = new HashSet<>();
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                temp.add(arr1[i]);
                i++;j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else j++;
        }
        int[] result = new int[temp.size()];
        int k =0;
        for(int n : temp){
            result[k++] = n;
        }
        return result;
    }
}

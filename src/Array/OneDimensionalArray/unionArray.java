package Array.OneDimensionalArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class unionArray {
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
        System.out.println("The Union element of both these array is: " + Arrays.toString(union(arr1, arr2)));
    }

    public static int[] union(int[] arr1, int[] arr2) {
        Set<Integer> temp = new HashSet<>();
        for(int i=0; i<arr1.length;i++){
            temp.add(arr1[i]);
        }
        for(int i=0; i< arr2.length;i++){
            if (temp.contains(arr2[i])){
                continue;
            }
            else temp.add(arr2[i]);
        }
        int[] arr = new int[temp.size()];
        int k =0;
        for(int n : temp){
            arr[k++] = n;
        }
        return arr;
    }
}

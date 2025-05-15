package Array.OneDimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class moveZeroesToEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value at " + i + "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("Actual Array: " + Arrays.toString(arr));
        int[] moved = moveZeroes(arr);
        System.out.println("After moving zeroes: " + Arrays.toString(moved));
    }

    public static int[] moveZeroes(int[] arr) {
        int n = arr.length;
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }
        int nonZeroes = temp.size();
        for (int i = 0; i < nonZeroes; i++) {
            arr[i] = temp.get(i);
        }
        for (int i = nonZeroes; i < n; i++) {
            arr[i] = 0;
        }
        return arr;
    }
}


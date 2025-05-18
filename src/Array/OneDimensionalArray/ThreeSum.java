package Array.OneDimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at : " + i + "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("Triplets whose sum equals to zero are : " + triplets(arr));
    }

    public static List<List<Integer>> triplets(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i != 0 && arr[i] == arr[i - 1]) continue;
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) j++;
                else if (sum > 0) k--;
                else {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    res.add(temp);
                    j++;
                    k--;
                    while (arr[j] == arr[j - 1]) j++;
                    while (arr[k] == arr[k] + 1) k--;
                }
            }
        }
        return res;
    }
}

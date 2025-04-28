package Array;

import java.util.Scanner;

public class removeDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value at " + i + "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The unique count of the array is: " + uniqueCount(arr));
    }

    // Brute Force APproach
//    public static int uniqueCount(int[] arr) {
//        Set<Integer> unique = new HashSet<>();
//        for (int i = 0; i < arr.length-1; i++) {
//            unique.add(arr[i]);
//        }
//        int count = unique.size();
//        return count;
//    }
//}

public static int uniqueCount(int[] arr){
        int i=0;
    for (int j = 1; j < arr.length; j++) {
        if(arr[i] != arr[j]){
            arr[i+1] = arr[j];
            i++;
        }
    }
    return i+1;
}
}


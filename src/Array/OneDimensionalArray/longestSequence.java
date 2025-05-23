package Array.OneDimensionalArray;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class longestSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the first array: ");
        int n = input.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value at " + i + "th position: ");
            arr1[i] = input.nextInt();
        }

    }
    public static int longestSuccessiveElements(int[] a) {
        int n = a.length;
           if (n == 0)
               return 0;

           int longest = 1;
            Set<Integer> set = new HashSet<>();

            // put all the array elements into set
            for (int i = 0; i < n; i++) {
                set.add(a[i]);
            }

            // Find the longest sequence
            for (int it : set) {
                // if 'it' is a starting number
                if (!set.contains(it - 1)) {
                    // find consecutive numbers
                    int cnt = 1;
                    int x = it;
                    while (set.contains(x + 1)) {
                        x = x + 1;
                        cnt = cnt + 1;
                    }
                    longest = Math.max(longest, cnt);
                }
            }
            return longest;
        }
    }

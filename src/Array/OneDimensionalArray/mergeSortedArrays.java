package Array.OneDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class mergeSortedArrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the first array : ");
        int n = input.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the number of element in the second array : ");
        int m = input.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at : " + i + "th position: ");
            arr1[i] = input.nextInt();
        }
        for (int i = 0; i < m; i++) {
            System.out.println("Enter the element at : " + i + "th position: ");
            arr2[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        sort(arr1,arr2,n,m);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));



    }
    public static void sort(int[] a, int[] b, int n, int m){
        int len = m+n;
        int gap = (len/2) + (len%2);
        while(gap>0){
            int left = 0, right = left+gap;
            while(right<len){
                // if left and right are in a and b
                if(left < n && right>= n) {
                    if (a[left] > b[right - n]) {
                        int temp = a[left];
                        a[left] = b[right - n];
                        b[right - n] = temp;
                    }
                }

                // if left and right both are in b
                else if(left>=n) {
                    if (b[left - n] > b[right - n]) {
                        int temp = b[right - n];
                        b[right - n] = b[left - n];
                        b[left - n] = temp;
                    }
                }

                // if both are in a
                else {
                    if (a[left] > a[right]) {
                        int temp = a[left];
                        a[left] = a[right];
                        a[right] = temp;
                    }
                }
                left++; right++;
            }
            if(gap == 1) break;
            gap = (gap/2) + (gap%2);
        }
    }
}

package Array.OneDimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class repeatingAndMissing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value at " + i + "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The repeating and missing elements are : " + repeatMissing(arr));
    }
    public static List<Integer> repeatMissing(int[] arr){
        int x = 0 , y =0;
        int n = arr.length;
        int sumN = n*(n+1)/2;
        int sumSqN = n*(n+1)*(2*n+1)/6;
        int sumA =0, sumSqA=0;
        for(int i=0; i<n; i++){
            sumA = sumA + arr[i];
            sumSqA = sumSqA + arr[i]*arr[i];
        }

        int diff1 = sumA-sumN;
        int diff2 = sumSqA - sumSqN;
        int sumXY = diff2/diff1;
        x = (diff1+sumXY)/2;
        y = x - diff1;
        return new ArrayList<>(Arrays.asList(x,y));
    }
}

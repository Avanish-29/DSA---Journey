package Array;

import java.util.Scanner;

public class maximumConsecutive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value at " + i + "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The maximum number of consecutive 1s is : "+maxConsecutive(arr));
    }
    public static int maxConsecutive(int[] arr){
        int count =0,max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                count++;
                max = Math.max(count,max);
            }
            else{
                count =0;
            }
        }
        return max;
    }
}

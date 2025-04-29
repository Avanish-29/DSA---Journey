package Array;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value at " + i + "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("Enter which element you want to find in the Array :");
        int x = input.nextInt();
        System.out.println(find(arr,x));
    }
    public static int find(int[] arr,int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                System.out.println("The element is present at Index: " + i);
                return i;
            }
        }
        System.out.println("The element is not present in the Array.");
        return -1;
    }
}

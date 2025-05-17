package Array.OneDimensionalArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class majorityElement_nBy3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            System.out.println("Enter the element at : "+i+"th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The majority elements who occured more than n/3 times are: " + majorityElement(arr));
    }
    public static List<Integer> majorityElement(int[] arr){
        int count1=0,count2=0,element1=Integer.MIN_VALUE, element2= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(count1 == 0 && element2 != arr[i]){
                count1++;
                element1 = arr[i];
            }
            else if(count2 == 0 && element1 != arr[i]){
                count2++;
                element2 = arr[i];
            }
            else if(element1 == arr[i]) count1++;
            else if (element2 == arr[i])count2++;
            else{
                count1--; count2--;
            }
        }
        List<Integer> result = new ArrayList<>();
        int cnt1=0,cnt2=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element1) cnt1++;
            if(arr[i]==element2) cnt2++;
        }
        if(cnt1>arr.length/3) result.add(element1);
        if(cnt2>arr.length/3) result.add(element2);
        return result;
    }
}

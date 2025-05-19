package Array.OneDimensionalArray;

import java.util.HashMap;
import java.util.Scanner;

public class subarrayXOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array : ");
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at : " + i + "th position: ");
            nums[i] = input.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = input.nextInt();
        System.out.println("The number of subarray with XOR target is : "+ xorSum(nums,target));
    }
    public static int xorSum(int[] arr,int target){
        HashMap<Integer,Integer> temp = new HashMap<>();
        int count = 0,xor=0;
        temp.put(xor,1);
        for(int i=0; i<arr.length; i++){
            xor = xor ^ arr[i];
            int required = xor ^ target;
            if(temp.containsKey(required)){
                count = count + temp.get(required);
            }
            if(temp.containsKey(xor)){
                temp.put(xor,temp.get(xor)+1);
            }
            else temp.put(xor,1);
        }
        return count;
    }
}

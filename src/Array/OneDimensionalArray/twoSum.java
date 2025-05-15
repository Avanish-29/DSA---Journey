package Array.OneDimensionalArray;


import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value at " + i + "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the target : ");
        int target = input.nextInt();
        System.out.println("The two indices which will return the sum = "+target+ " are " + Arrays.toString(sum(arr,target)));
    }

    public static int[] sum(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <arr.length ; j++) {
                if(arr[j] + arr[j-i] == target){
                    return new int[] {(j-i),j};
                }
            }
        }
        return new int[] {};
    }



//    Better Solution
//    public static int[] sum(int[] arr, int target){
//        Map<Integer,Integer> temp = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            int compliment = target - arr[i];
//            if(temp.containsKey(compliment)){
//                return new int[] {temp.get(compliment),i};
//            }
//            temp.put(arr[i],i);
//        }
//        return new int[] {};
//    }

    // Brute SOlution
//    public static int[] sum(int[] arr, int target){
//        int[] result = new int[2];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length-1 ; j++) {
//                if(arr[i] + arr[j] == target){
//                    result[0] = i;
//                    result[1] = j;
//                }
//            }
//        }
//        return result;
//    }
}
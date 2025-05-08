package Array;

import java.util.*;

public class leaderArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value at " + i + "th position: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The actual array is: " + Arrays.toString(arr));
        System.out.println("The leader array is: " + Arrays.toString(leader(arr)));
    }
    public static Object[] leader(int[] arr){
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean leader = true;
            for (int j =i+1; j <arr.length ; j++) {
                if(arr[j]>arr[i]){
                    leader = false;
                    break;
                }
            }
            if (leader) res.add(arr[i]);

        }
        return res.toArray();
    }


        public static ArrayList<Integer> findLeaders(ArrayList<Integer> elements, int n) {
            // Write your code here.
            ArrayList<Integer> result = new ArrayList<>();
            int max = Integer.MIN_VALUE;
            for(int i=n-1;i>=0;i--){
                if(elements.get(i) > max){
                    result.add(elements.get(i));
                    max = elements.get(i);
                }
            }
            Collections.reverse(result);
            return result;
        }

    }

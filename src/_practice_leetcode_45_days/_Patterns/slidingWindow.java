package _practice_leetcode_45_days._Patterns;

import java.util.Arrays;

public class slidingWindow {


    // O(n^2)
    public static boolean maximumSumOfSubArray(int[] arr, int k){
        int maxSum = -100;
        int[] maxSubArr = new int[k];

        if (arr == null || arr.length < k || k <= 0) {
            System.out.println("Invalid input: Check array and k");
            return false;
        }
        for (int i = 0; i < arr.length-k+1; i++) {
            int[] subArr = new int[k];

            for (int j = 0; j < k; j++) {
                subArr[j] = arr[j+i];
            }
            System.out.println(Arrays.toString(subArr));
            int sum = Arrays.stream(subArr).sum();
            if(maxSum < sum) {
                maxSum = sum;
                maxSubArr = subArr;
            }
        }
        System.out.println("Max sub Array:" + Arrays.toString(maxSubArr));
        System.out.println("Max sum:" + maxSum);
        return true;
    }

    // O(n)
    public static void optimizedMaximumSumOfSubArray(){

    }

    public static void main(String[] args) {

        // Maximum Sum of Subarray of Size K
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 1;

        maximumSumOfSubArray(arr, k);
    }
}

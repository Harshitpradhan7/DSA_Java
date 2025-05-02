package arrays;

import java.sql.Array;
import java.util.Arrays;

public class _6_leftRotateByKIndex {

    public static void func(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        System.out.println(Arrays.toString(temp));
        for (int i = k; i < n; i++) {
            arr[i-k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[n-k+i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        func(arr,11);
    }
}



// Notes: Here time complexity is O(d) + O(n-d) + O(d) = O(n+d) and space complexity is O(d)
//         cause we are creating and temp array taking space d.
// Now it can further be optimized : (26:01) gtva
//
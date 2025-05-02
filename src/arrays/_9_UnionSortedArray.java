package arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class _9_UnionSortedArray {
    public static void func(int[] arr, int[] arr1){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        System.out.println(new ArrayList<>(set));
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,6,9,10};
        int[] arr1 = {1,2,2,3,4,4,6,7,8};
//        ArrayList<Integer> union = new ArrayList<>();
        func(arr, arr1);
    }
}

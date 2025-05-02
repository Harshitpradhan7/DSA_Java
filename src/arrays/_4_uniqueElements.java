package arrays;

import java.util.HashSet;
import java.util.Set;

public class _4_uniqueElements {

    public static int uniqueElem(int[] arr){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        System.out.println(set.size());
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,1,4,5,2,3,2,11,12,14};
        int a = uniqueElem(arr);
        System.out.println();
    }
}

package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class _7_moveZerosToEnd {

    public static void func(int[] arr){
        int n = arr.length;
        ArrayList<Integer> temp =  new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0){
                temp.add(arr[i]);
            }
        }
        for (int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }
        for (int i = temp.size(); i < n; i++) {
            arr[i] = 0;
        }

//        System.out.println(temp);
        System.out.println(Arrays.toString(arr));
    }

    public static void funcOptimal(int[] arr){
        // We are gonna use two pointer approach:
    }
    public static void main(String[] args) {

        int[] arr = {1,2,0,9,0,4,7,0,5,8,0,22};
        System.out.println(Arrays.toString(arr));
        func(arr);
    }
}

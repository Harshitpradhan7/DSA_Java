package arrays;

import java.util.Arrays;

public class _5_left_rotate {

    public static void leftRotate(int[] arr){
        int n = arr.length -1;
        int temp = arr[0];
        for (int i = 0; i <= n; i++) {
            if(i == n){
                arr[i] = temp;
                break;
            }
            arr[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        leftRotate(arr);
    }
}

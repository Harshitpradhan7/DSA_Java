package arrays;

public class _10_missingNumber {
    static int func(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i+1 != arr[i]){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,9};
        func(arr);
        int res = func(arr);
        System.out.println(res);
    }
}

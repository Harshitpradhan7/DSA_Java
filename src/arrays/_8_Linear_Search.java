package arrays;

public class _8_Linear_Search {

    public static int func(int[] arr, int search){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int res = func(arr, 6);
        System.out.println(res);
    }
}

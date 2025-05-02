package arrays;
public class _3_arraySortedOrNot {
    public static boolean arraySortedOrNot(int[] arr){
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i+1] < arr[i]){
                    return false;
                }
            }
            return true;
    }
    public static boolean arraySortedOrNotRotated(int[] nums){
        int count = 0, n = nums.length;
        for (int i = 0; i < n; i++)
            if (nums[i] > nums[(i+1) % n] && ++count > 1)
                return false;
        return count <= 1;
        }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,15,8,9,6};
        boolean a = arraySortedOrNot(arr);
        System.out.println(a);
    }
}




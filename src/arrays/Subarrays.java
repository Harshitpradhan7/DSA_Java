package arrays;

public class Subarrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int len =  arr.length;

        for (int st = 0; st < len ; st++) {
            for (int end = st; end < len; end++) {
                for (int i = st; i <=end ; i++) {
                    System.out.print(arr[i]);
                }
                System.out.println();
            }
        }
    }
}

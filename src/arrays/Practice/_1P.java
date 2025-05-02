package arrays.Practice;

public class _1P {
//    int[] arr = new int[5];

    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        int sum = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(sum);
        System.out.println(max);

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }


 }

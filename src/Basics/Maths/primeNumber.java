package Basics.Maths;

public class primeNumber {

    public static boolean checkPrime(int n){
        if (n == 1 || n == 0 || n < 0 ) {
            return false;
        }
        for (int i = 2; i <= n/2 ; i++) {
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = -1000000;
        boolean res = checkPrime(num);
        System.out.println(res);
    }
}

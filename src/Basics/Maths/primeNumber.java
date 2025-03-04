package Basics.Maths;

public class primeNumber {
    public static void main(String[] args) {
        int num = 17;
        int i = 2;
        while(i <= num/2){
            if (num%i == 0){
                System.out.println("Not a prime");
                i++;
            }

        }

    }
}

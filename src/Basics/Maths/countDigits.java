package Basics.Maths;

public class countDigits {
    public static void main(String[] args) {
        int num = 123;
        int digits = 1;

        while(num > 10){
            num = num/10;
            digits++;
        }
        System.out.println("hello");
        System.out.println(digits);
    }
}

package Basics.Maths;

public class reverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int revsNum = 0;

        for (int i = 0; i < 5; i++) {
            revsNum =  revsNum*10 + num%10;
            num = num/10;
        }
        System.out.println(revsNum);
        System.out.println(num);
    }
}

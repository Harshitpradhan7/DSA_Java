package Basics.Maths;

public class armstrongNumber {
    public static int digitCount(int num){
        int digit = 0;
        while(num > 0){
            num = num / 10;
            digit++;
        }
        return digit;
    }
    public static boolean checkPalindrom(int num){
        int digits = digitCount(num);
        int newNum = num;
        int prevSum = 0;
        int check = 0;
        for (int i = 1; i <= digits; i++) {
            int lastDigit = newNum % 10;
            check += Math.pow(lastDigit, digits);
            newNum = newNum/10;
        }
        if(check == num){
            System.out.println(check);
            System.out.println(num);
            return true;
        }else{
            System.out.println(check);
            System.out.println(num);
            return false;
        }
    }
    public static void main(String[] args) {

//        digitCount(5214862);
        boolean result = checkPalindrom(153);
        System.out.println(result);

    }
}

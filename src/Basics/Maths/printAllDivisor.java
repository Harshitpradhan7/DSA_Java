package Basics.Maths;

public class printAllDivisor {
    public static void main(String[] args) {
        int a = 173;
        for (int i = 1; i <= a; i++) {
            if (a%i == 0){
                System.out.print(i+" ");
            }
        }
    }
}

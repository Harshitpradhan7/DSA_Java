package stack;

public class Main {
    public static void main(String[] args) {
        Stack s1 = new Stack(5);
//        System.out.println(s1);
//        s1.printStack();
//        s1.getTop();
//        s1.getHeight();
        s1.push(8);
        s1.push(14);
        s1.push(9);
        s1.printStack();
//        s1.getTop();
//        s1.getHeight();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.printStack();
//        s1.getTop();
        s1.getHeight();
    }
}

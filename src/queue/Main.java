package queue;

public class Main {
    public static void main(String[] args) {
        Queue q1 =  new Queue(1);
        q1.enqueue(75);
        q1.enqueue(35);
        q1.enqueue(25);
        q1.enqueue(15);
        System.out.println(q1);
        q1.printQueue();
        q1.dequeue();
        q1.printQueue();
    }
}

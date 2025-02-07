package queue;

public class Queue {
    private Node start;
    private Node end;
    private int length;

    class Node{
        Node next;
        int value;
        Node(int value){
            this.value = value;
        }
    }

    public Queue(int value){
        Node newNode = new Node(value);
        start = newNode;
        end =  newNode;
        length = 1;
    }

    public void printQueue(){
        Node temp = start;
        while (temp != null){
            System.out.println(temp.value);
            temp= temp.next;
        }
    }
    public void getLength(){
        System.out.println("Length: " +length);
    }

    public void getFirst(){
        System.out.println("First: " + start);
    }

    public void getLast(){
        System.out.println("Last: " + end);
    }

    public void enqueue(int value){
        Node newNode = new Node(value);
        if (length == 0) {
            start = newNode;
            end =newNode;
        }
        else{
            end.next = newNode;
            end = end.next;
        }
        length ++;
    }

    public Node dequeue(){
        if (length == 0) return null;
        Node temp = start;
        if (length == 1){
           start = null;
           end = null;
        }else{
            start = start.next;
            temp.next = null;
        }
        length --;
        return temp;
    }
}

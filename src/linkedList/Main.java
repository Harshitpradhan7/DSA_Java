package linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList(5);
        System.out.println(l1);
        //l1.printList();
        l1.append(7);
        l1.append(9);
        l1.printList();
//
//        l1.removeLast();
//        l1.removeLast();
//        l1.removeLast();

        System.out.println();
//        l1.printList();

        l1.prepend(99);
        l1.printList();


    }
}

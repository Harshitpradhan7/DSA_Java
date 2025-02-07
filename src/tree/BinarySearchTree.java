package tree;

public class BinarySearchTree {
    Node root;
    private int height;

    class Node {
        int value;
        Node left;
        Node right;
        Node(int value) {
            this.value = value;
        }
    }

}
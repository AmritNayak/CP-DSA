package DSA.LinkedList;

public class LinkedList<T> {

    Node<T> head;

    public LinkedList () {
        head = null;
    }

    void insert(Node<T> node) {
        node.next = head;
        head = node;
    }

    void printLL() {
        Node<T> start = this.head;
        while (start.next != null) {
            System.out.print(start.data + " -> ");
            start = start.next;
        }
        System.out.println(start.data);
    }
}

 class Node<T> {
    int data;
    Node<T> next;

    public Node(int data) {
        this.data = data;
        this.next = null;
     }
}

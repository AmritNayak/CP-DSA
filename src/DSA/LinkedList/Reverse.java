package DSA.LinkedList;

public class Reverse {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(new Node<>(40));
        list.insert(new Node<>(30));
        list.insert(new Node<>(20));
        list.insert(new Node<>(10));
        list.printLL();
        LinkedList<Integer> res = reverse(list);
        res.printLL();
    }

    static LinkedList<Integer> reverse(LinkedList<Integer> list) {
        Node<Integer> prev = null, curr = list.head, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        LinkedList<Integer> res = new LinkedList<>();
        res.head = prev;
        return res;
    }
}

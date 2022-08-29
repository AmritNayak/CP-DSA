package DSA.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class RightView {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(8);
        tree.root.right.right = new Node(15);
        tree.root.right.left = new Node(12);
        tree.root.right.right.left = new Node(14);

        System.out.print("Right view -> ");
        rightView(tree.root);
    }

    static void rightView(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int nodes = queue.size();
            for (int i=0; i<nodes; i++) {
                Node current = queue.poll();
                if (i == nodes-1) {
                    System.out.print(current.data + " ");
                }
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }

        System.out.println();
    }
}

package DSA.BinaryTrees;

import java.util.Stack;

public class ZigZagTraversal {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.generateTree();

        /*
                 50
              /     \
           25         75
         /   \       /   \
        12   37     62   87
            /  \   /  \
           30  40 60  70

         */

//        tree.levelOrderTraversal();
        printZigZag(tree.root);
    }

    static void printZigZag(Node root) {
        Stack<Node> curr = new Stack<>();
        Stack<Node> next = new Stack<>();

        boolean leftToRight = true;

        curr.push(root);
        while (!curr.isEmpty()) {
            Node temp = curr.pop();
            System.out.print(temp.data + " ");
            if (leftToRight) {
                if (temp.left != null) {
                    next.push(temp.left);
                }
                if (temp.right != null) {
                    next.push(temp.right);
                }
            } else {
                if (temp.right != null) {
                    next.push(temp.right);
                }
                if (temp.left != null) {
                    next.push(temp.left);
                }
            }

            if (curr.isEmpty()) {
                leftToRight = !leftToRight;
                Stack<Node> t = curr;
                curr = next;
                next = t;
            }
        }

        System.out.println();
    }
}

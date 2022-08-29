package DSA.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    Node root;

    BinaryTree() {
        root = null;
    }

    BinaryTree(int data) {
        root = new Node(data);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
//        tree.root = new Node(10);
//        tree.root.left = new Node(20);
//        tree.root.right = new Node(30);
//        tree.root.left.left = new Node(40);

        for (int i = 1; i <= 5; i++) {
            tree.insert(i * 10);
        }

        tree.inorderTraversal();
        tree.preorderTraversal();
        tree.postorderTraversal();
        tree.levelOrderTraversal();

    }

    void insert(int key) {
        insert(root, key);
    }

    // Wrapper functions
    void inorderTraversal() {
        inorderTraversal(root);
        System.out.println();
    }
    void preorderTraversal() {
        preorderTraversal(root);
        System.out.println();

    }
    void postorderTraversal() {
        postorderTraversal(root);
        System.out.println();

    }
    void levelOrderTraversal() {
        levelOrderTraversal(root);
        System.out.println();

    }

    void inorderTraversal(Node root) {
        // Depth First Search
        if (root == null)
            return;

        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    void preorderTraversal(Node root) {
        // Depth First Search
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    void postorderTraversal(Node root) {
        // Depth First Search
        if (root == null)
            return;

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    void levelOrderTraversal(Node root) {
        // Breadth First Search
        if (root == null) {
            return;
        }
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            Node temp = nodes.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                nodes.add(temp.left);
            }
            if (temp.right != null) {
                nodes.add(temp.right);
            }
        }
    }

    void insert(Node node, int key) {
        if (node == null) {
            root = new Node(key);
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else {
                queue.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else {
                queue.add(temp.right);
            }
        }

    }

//    ******************** TREE TEMPLATE ********************
//
//    BinaryTree tree = new BinaryTree(50);
//    Node root = new Node(50);
//    root.left = new Node(25);
//    root.right = new Node(75);
//    root.left.left = new Node(12);
//    root.left.right = new Node(37);
//    root.right.left = new Node(62);
//    root.right.right = new Node(87);
//    root.left.right.left = new Node(30);
//    root.left.right.right = new Node(40);
//    root.right.left.left = new Node(60);
//    root.right.left.right = new Node(70);
//    tree.root = root;
//
    /*
                 50
              /     \
           25         75
         /   \       /   \
        12   37     62   87
            /  \   /  \
           30  40 60  70

         */

    void generateTree() {
        root = new Node(50);
        root.left = new Node(25);
        root.right = new Node(75);
        root.left.left = new Node(12);
        root.left.right = new Node(37);
        root.right.left = new Node(62);
        root.right.right = new Node(87);
        root.left.right.left = new Node(30);
        root.left.right.right = new Node(40);
        root.right.left.left = new Node(60);
        root.right.left.right = new Node(70);
    }

}

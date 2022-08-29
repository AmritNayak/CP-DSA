package DSA.BinaryTrees;

import java.util.ArrayList;

public class NodesKLevelFar {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.generateTree();

        int data = 25, k = 2;
        printKNodesFar(tree.root, data, k);
    }

    static void printKNodesFar(Node node, int data, int k) {
        ArrayList<Node> path = new ArrayList<>();
        nodeToRootPath(node, data, path);

        for (int i = 0; i < path.size(); i++) {
            printKLevelsDown(path.get(i), k - i, (i == 0) ? null : path.get(i - 1));
        }
        System.out.println();
    }

    static void printKLevelsDown(Node node, int k, Node block) {
        if (node == null || k < 0 || node == block)
            return;

        // preorder
        if (k == 0) {
            System.out.print(node.data + " ");
            return;
        }
        printKLevelsDown(node.left, k - 1, block);
        printKLevelsDown(node.right, k - 1, block);
    }

    static boolean nodeToRootPath(Node node, int data, ArrayList<Node> path) {
        if (node == null)
            return false;

        if (node.data == data) {
            path.add(node);
            return true;
        }

        boolean leftST = nodeToRootPath(node.left, data, path);
        if (leftST) {
            path.add(node);
            return true;
        }

        boolean rightST = nodeToRootPath(node.right, data, path);
        if (rightST) {
            path.add(node);
            return true;
        }

        return false;
    }
}

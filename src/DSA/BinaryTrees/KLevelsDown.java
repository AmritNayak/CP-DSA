package DSA.BinaryTrees;

public class KLevelsDown {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.generateTree();
        printKLevelsDown(tree.root, 2);
    }

    static void printKLevelsDown(Node node, int k) {
        if (node == null || k < 0)
            return;

        // preorder
        if (k == 0) {
            System.out.println(node.data);
            return;
        }
        printKLevelsDown(node.left, k - 1);
        printKLevelsDown(node.right, k - 1);
    }
}

package DSA.BinaryTrees;

public class RemoveLeaves {
    public static void main(String[] args) {
        BinaryTree tree= new BinaryTree();
        tree.generateTree();
        tree.preorderTraversal();

        tree.root = removeLeaves(tree.root);
        tree.preorderTraversal();
    }

    static Node removeLeaves(Node node) {
        if (node == null)
            return null;

        if (node.left == null && node.right == null)
            return null;

        node.left = removeLeaves(node.left);
        node.right = removeLeaves(node.right);

        return node;
    }
}

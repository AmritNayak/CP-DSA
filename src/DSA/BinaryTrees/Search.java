package DSA.BinaryTrees;

public class Search {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        for (int i = 1; i <= 5; i++) {
            tree.insert(i * 10);
        }
        int key = 40;
        System.out.println((exists(tree.root, key)) ? "Yes" : "No");
        int key1 = 80;
        System.out.println((exists(tree.root, key1)) ? "Yes" : "No");
    }

    static boolean exists(Node root, int key) {
        if (root == null)
            return false;

        // preorder traversal
        if (root.data == key)
            return true;

        boolean left = exists(root.left, key);
        if (left)
            return true;

        boolean right = exists(root.right, key);
        if (right)
            return true;

        return false;
    }
}

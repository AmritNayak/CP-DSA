package DSA.BinaryTrees;

public class HeightSizeSumMax {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        for (int i = 1; i <= 5; i++) {
            tree.insert(i * 10);
        }
        tree.levelOrderTraversal();
        System.out.println(heightOfTree(tree.root));
        System.out.println(size(tree.root));
        System.out.println(sum(tree.root));
        System.out.println(max(tree.root));
    }

    // depth of deepest node
    static int heightOfTree(Node root) {
        if (root == null) {
            // for nodes
            return 0;
            // for edges
            // return -1;
        }
        int leftSubTreeHeight = heightOfTree(root.left);
        int rightSubTreeHeight = heightOfTree(root.right);

        return Math.max(leftSubTreeHeight, rightSubTreeHeight) + 1;
    }

    // total number of nodes
    static int size(Node root) {
        if (root == null)
            return 0;

        int leftST = size(root.left);
        int rightST = size(root.right);
        return leftST + rightST + 1;
    }

    // sum of all nodes
    static int sum(Node root) {
        if (root == null)
            return 0;

        int leftST = sum(root.left);
        int rightST = sum(root.right);
        return leftST + rightST + root.data;
    }

    // max of all nodes
    static int max(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;

        int leftST = max(root.left);
        int rightST = max(root.right);

        return Math.max(root.data, Math.max(leftST, rightST));
    }
}

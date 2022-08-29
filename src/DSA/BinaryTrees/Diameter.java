package DSA.BinaryTrees;

public class Diameter {

    static class TreeHeight {
        int h;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        for (int i = 1; i <= 7; i++) {
            tree.insert(i * 10);
        }
        tree.levelOrderTraversal();
        int diameter = diameter(tree.root);
        System.out.println(diameter);
        int diameterN = diameterOrderN(tree.root, new TreeHeight());
        System.out.println(diameterN);
    }

    static int diameterOrderN(Node root, TreeHeight height) {
        // Order N
        if (root == null) {
            height.h = 0;
            return 0;
        }
        TreeHeight lHeight = new TreeHeight();
        TreeHeight rHeight = new TreeHeight();

        int lDiameter = diameterOrderN(root.left, lHeight);
        int rDiameter = diameterOrderN(root.right, rHeight);

        int currentDiameter = lHeight.h + rHeight.h + 1;
        height.h = Math.max(lHeight.h, rHeight.h) + 1;

        return Math.max(currentDiameter, Math.max(lDiameter, rDiameter));
    }

    static int diameter(Node root) {
        // Order N^2
        if (root == null)
            // for nodes 0, for edges -1
            return 0;

        int lHeight = height(root.left);
        int rHeight = height(root.right);
        int currentDiameter = lHeight + rHeight + 1;

        int lDiameter = diameter(root.left);
        int rDiameter = diameter(root.right);

        return Math.max(currentDiameter, Math.max(lDiameter, rDiameter));
    }

    static int height(Node root) {
        if (root == null)
            // for nodes 0, for edges -1
            return 0;
        int lHeight = height(root.left);
        int rHeight = height(root.right);
        return Math.max(lHeight,rHeight) + 1;
    }
}

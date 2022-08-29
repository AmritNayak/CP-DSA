package DSA.BinaryTrees;

public class SumRootToLeaf {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.generateTree();

        pathToLeafFromRoot(tree.root, "", 0, 100, 250);
    }

    static void pathToLeafFromRoot(Node node, String path, int sum, int low, int high) {
        if (node == null)
            return;

        // leaf node reached
        if (node.left == null && node.right == null) {
            sum += node.data;
            if (sum >= low && sum <= high)
                System.out.println(path + node.data);

            return;
        }

        pathToLeafFromRoot(node.left, path + node.data + " ", sum + node.data, low, high);
        pathToLeafFromRoot(node.right, path + node.data + " ", sum + node.data, low, high);
    }
}

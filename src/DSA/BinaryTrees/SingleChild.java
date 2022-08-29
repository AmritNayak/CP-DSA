package DSA.BinaryTrees;

public class SingleChild {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = new Node(50);
        root.left = new Node(25);
        root.right = new Node(75);
        root.left.left = new Node(12);
        root.left.right = new Node(37);
        root.right.left = new Node(62);
        root.left.left.left = new Node(30);
        root.right.left.left = new Node(60);
        tree.root = root;

        printSingleChildNodes(tree.root, null);
    }

    static void printSingleChildNodes(Node node, Node parent) {
        if (node == null)
            return;

        if (parent != null && parent.left == node && parent.right == null) {
            System.out.println(node.data);
        } else if (parent != null && parent.left == null && parent.right == node) {
            System.out.println(node.data);
        }

        printSingleChildNodes(node.left, node);
        printSingleChildNodes(node.right, node);
    }
}

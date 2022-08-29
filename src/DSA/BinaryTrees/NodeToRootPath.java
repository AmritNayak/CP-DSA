package DSA.BinaryTrees;

import java.util.ArrayList;

public class NodeToRootPath {

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

        ArrayList<Integer> path = new ArrayList<>();
        System.out.println(nodeToRootPath(tree.root, 70, path));
        System.out.println(path.toString());
    }


    static boolean nodeToRootPath(Node node, int data, ArrayList<Integer> path) {
        if (node == null)
            return false;

        if (node.data == data) {
            path.add(node.data);
            return true;
        }

        boolean leftST = nodeToRootPath(node.left, data, path);
        if (leftST) {
            path.add(node.data);
            return true;
        }

        boolean rightST = nodeToRootPath(node.right, data, path);
        if (rightST) {
            path.add(node.data);
            return true;
        }

        return false;
    }

}

package DSA.BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class VerticalOrder {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        verticalOrderTraversal(tree.root);
    }

    static void verticalOrderTraversal(Node root) {
        // TreeMap sorts key, value pairs with respect to keys
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        generateVerticalOrder(root, 0, map);

        for (Map.Entry<Integer, List<Integer>> keys : map.entrySet()) {
            // Print each vertical column
            System.out.println(keys.getValue().toString());
        }
    }

    static void generateVerticalOrder(Node root, int horizontalDistance, TreeMap<Integer, List<Integer>> map) {
        if (root == null) return;

        List<Integer> temp = map.get(horizontalDistance);

        if (temp == null) {
            temp = new ArrayList<>();
        }
        temp.add(root.data);

        map.put(horizontalDistance, temp);

        generateVerticalOrder(root.left, horizontalDistance - 1, map);
        generateVerticalOrder(root.right, horizontalDistance + 1, map);
    }

}

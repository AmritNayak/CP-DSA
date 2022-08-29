package DSA.BinaryTrees;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopView {

    static class Pair {
        Node node;
        int hd;

        Pair() {}

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        topViewTraversal(tree.root);
    }

    static void topViewTraversal(Node tree) {
        Map<Integer, Node> map = new TreeMap<>();
        generateTopView(tree, map);
        for (Map.Entry<Integer, Node> entry: map.entrySet()) {
            System.out.print(entry.getValue().data + " ");
        }
        System.out.println();
    }

    static void generateTopView(Node tree, Map<Integer, Node> map) {
        if (tree == null) return;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(tree, 0));

        while (!q.isEmpty()) {
            Pair temp = q.poll();
            if (!map.containsKey(temp.hd)) {
                map.put(temp.hd, temp.node);
            }
            if (temp.node.left != null) {
                q.add(new Pair(temp.node.left, temp.hd - 1));
            }
            if (temp.node.right != null) {
                q.add(new Pair(temp.node.right, temp.hd + 1));
            }
        }
    }

}

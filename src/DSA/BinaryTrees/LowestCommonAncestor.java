package DSA.BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {

    static List<Integer> path1 = new ArrayList<>();
    static List<Integer> path2 = new ArrayList<>();

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        for (int i = 1; i <= 7; i++) {
            tree.insert(i);
        }
        int n1 = 2, n2 = 7;

//        Integer lca = lcaOf(tree.root, n1, n2);
//        if (lca != null)
//            System.out.println("LCA of (" + n1 + ", " + n2 + ") -> " + lca);
//        else
//            System.out.println("LCA doesn't exist");

        Node lca = lcaOfOptimized(tree.root, n1, n2);
        if (lca != null)
            System.out.println("LCA of (" + n1 + ", " + n2 + ") -> " + lca.data);
        else
            System.out.println("LCA doesn't exist");

    }

    static Integer lcaOf(Node root, int n1, int n2) {

        if (!findPath(root, n1, path1) || !findPath(root, n2, path2)) {
            if (path1.size() <= 0)
                System.out.println("Path to " + n1 + " is missing");
            if (path2.size() <= 0)
                System.out.println("Path to " + n2 + " is missing");
            return null;
        }

        int pathChange, size = Math.min(path1.size(), path2.size());
        for (pathChange = 0; pathChange < size; pathChange++) {
            if (!path1.get(pathChange).equals(path2.get(pathChange)))
                break;
        }

        return path1.get(pathChange-1);
    }

    static Node lcaOfOptimized(Node root, int n1, int n2) {
        if (root == null)
            return null;

        if (root.data == n1 || root.data == n2)
            return root;

        Node leftLCA = lcaOfOptimized(root.left, n1, n2);
        Node rightLCA = lcaOfOptimized(root.right, n1, n2);

        if (leftLCA != null && rightLCA != null)
            return root;

        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    static boolean findPath(Node root, int n, List<Integer> path) {
        if (root == null)
            return false;

        path.add(root.data);
        if (root.data == n)
            return true;

        if (findPath(root.left, n, path) || findPath(root.right, n, path))
            return true;

        path.remove(path.size() - 1);
        return false;
    }
}

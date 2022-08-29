package DSA.RecursionAndBacktracking;

import java.util.Arrays;

public class Permutations {
    public static void main(String[] args) {
        int n = 4, r = 2;
        permutations(new int[n], 1, r);
        System.out.println();
        permutationsFromCombinations(1, n, new int[n], 0, r, "");
    }

    static void permutations(int[] boxes, int currItem, int rItems) {
        if (currItem > rItems) {
            System.out.println(Arrays.toString(boxes));
            return;
        }

        for (int i = 0; i < boxes.length; i++)  {
            if (boxes[i] == 0) {
                boxes[i] = currItem;
                permutations(boxes, currItem + 1, rItems);
                boxes[i] = 0;
            }
        }
    }

    static void permutationsFromCombinations(int currBox, int nBoxes, int[] items, int setSoFar, int rItems, String res) {
        if (currBox > nBoxes) {
            if (setSoFar == rItems)
                System.out.println(res);
            return;
        }

        for (int i = 0; i < rItems; i++) {
            if (items[i] == 0) {
                items[i] = 1;
                permutationsFromCombinations(currBox + 1, nBoxes, items, setSoFar + 1, rItems, res + (i + 1));
                items[i] = 0;
            }
        }
        permutationsFromCombinations(currBox + 1, nBoxes, items, setSoFar, rItems, res + "0");

    }
}

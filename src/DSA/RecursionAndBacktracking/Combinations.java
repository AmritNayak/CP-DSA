package DSA.RecursionAndBacktracking;

import java.util.Arrays;

public class Combinations {
    public static void main(String[] args) {
        int boxes = 4, items = 2;
        combinations(0, boxes, 0, items, "");
        combinationsFromPermutations(new boolean[boxes], 0, items, -1);
    }

    static void combinations(int currBox, int nBoxes, int selectionsSoFar, int rSelections, String res) {
        if (currBox == nBoxes) {
            if (selectionsSoFar == rSelections)
                System.out.println(res);
            return;
        }

        combinations(currBox + 1, nBoxes, selectionsSoFar, rSelections, res + "_");
        combinations(currBox + 1, nBoxes, selectionsSoFar + 1, rSelections, res + "Y");
    }

    static void combinationsFromPermutations(boolean[] boxes, int currItem, int rItems, int lastBox) {
        if (currItem == rItems) {
            System.out.println(Arrays.toString(boxes));
            return;
        }

        for (int i = lastBox + 1; i < boxes.length; i++) {
            if (!boxes[i]) {
                boxes[i] = true;
                combinationsFromPermutations(boxes, currItem + 1, rItems, i);
                boxes[i] = false;
            }
        }
    }
}

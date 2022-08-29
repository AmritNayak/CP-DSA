package DSA.RecursionAndBacktracking;

import java.util.HashSet;
import java.util.Set;

public class WordsKSelection {
    public static void main(String[] args) {
        String s = "abcabc";
        int k = 2;
        Set<Character> unique = new HashSet<>();
        StringBuilder uniqueStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!unique.contains(c)) {
                uniqueStr.append(c);
                unique.add(c);
            }
        }
//        System.out.println(uniqueStr.toString());
//        kDistinctSelection(0, uniqueStr.toString(), 0, k, "");
        kDistinctSelectionR(uniqueStr.toString(), 1, k, -1, "");
    }

    // without repetition
    static void kDistinctSelection(int i, String uniqueStr, int selection, int totalSelection, String res) {
        if (i == uniqueStr.length()) {
            if (selection == totalSelection) {
                System.out.println(res);
            }
            return;
        }

        kDistinctSelection(i + 1, uniqueStr, selection + 1, totalSelection, res + uniqueStr.charAt(i));
        kDistinctSelection(i + 1, uniqueStr, selection, totalSelection, res + "");
    }

    // with repetition
    static void kDistinctSelectionR(String uniqueStr, int currentSelection, int totalSelection, int lastChar, String res) {
        if (currentSelection > totalSelection) {
            System.out.println(res);
            return;
        }

        for (int i = lastChar + 1; i < uniqueStr.length(); i++) {
            kDistinctSelectionR(uniqueStr, currentSelection + 1, totalSelection, i, res + uniqueStr.charAt(i));
        }
    }
}

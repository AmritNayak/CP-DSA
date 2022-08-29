package DSA.RecursionAndBacktracking;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KLengthWords {
    public static void main(String[] args) {
        String s = "abcabc";
        int k = 3;
        Set<Character> uniqueChars = new HashSet<>();
        StringBuilder uniqueStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!uniqueChars.contains(c)) {
                uniqueStr.append(c);
                uniqueChars.add(c);
            }
        }

//        kLengthWords(0, uniqueStr.toString(), 0, k, new Character[k]);
//        System.out.println();
        kLengthWords2(1, k, uniqueStr.toString(), new HashSet<>(), "");
    }

    static void kLengthWords(int curr, String s, int selectionSoFar, int totalSelection, Character[] spots) {
        if (curr == s.length()) {
            if (selectionSoFar == totalSelection)
                System.out.println(Arrays.toString(spots));
            return;
        }

        for (int i = 0; i < spots.length; i++) {
            if (spots[i] == null) {
                spots[i] = s.charAt(curr);
                kLengthWords(curr + 1, s, selectionSoFar + 1, totalSelection, spots);
                spots[i] = null;
            }
        }
        kLengthWords(curr + 1, s, selectionSoFar, totalSelection, spots);
    }

    static void kLengthWords2(int curr, int totalSlots, String s, HashSet<Character> used, String res) {
        if (curr > totalSlots) {
            System.out.println(res);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!used.contains(c)) {
                used.add(c);
                kLengthWords2(curr + 1, totalSlots, s, used, res + c);
                used.remove(c);
            }
        }
    }
}

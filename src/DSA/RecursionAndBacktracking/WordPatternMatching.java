package DSA.RecursionAndBacktracking;

import java.util.HashMap;

public class WordPatternMatching {
    public static void main(String[] args) {
        String word = "geeksforgeeks";
        String pattern = "aba";
        HashMap<Character, String> map = new HashMap<>();
        wordPatternMatching(word, pattern, map);
    }

    static void wordPatternMatching(String word, String pattern, HashMap<Character, String> map) {
        if (pattern.isEmpty()) {
            if (word.isEmpty()) {
                System.out.println(map.toString());
            }
            return;
        }

        // char to map
        char ch = pattern.charAt(0);
        // rest of pattern
        String rop = pattern.substring(1);

        if (map.containsKey(ch)) {
            String prev = map.get(ch);

            if (word.length() >= prev.length()) {
                // check for match with previous mapping
                String left = word.substring(0, prev.length());
                // rest of word
                String right = word.substring(prev.length());

                if (left.equals(prev)) {
                    wordPatternMatching(right, rop, map);
                }
            }
        } else {
            for (int i = 0; i < word.length(); i++) {
                // left part map to char of pattern
                String left = word.substring(0, i + 1);
                // rest of word
                String right = word.substring(i + 1);
                map.put(ch, left);
                wordPatternMatching(right, rop, map);
                // backtrack
                map.remove(ch);
            }
        }
    }
}

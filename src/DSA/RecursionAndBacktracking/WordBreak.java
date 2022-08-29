package DSA.RecursionAndBacktracking;

import java.util.Arrays;
import java.util.HashSet;

public class WordBreak {
    public static void main(String[] args) {
        String sentence = "microsofthiring";
        String allWords = "micro soft hi ring microsoft hiring";
        HashSet<String> words = new HashSet<>(Arrays.asList(allWords.split(" ")));
        wordBreak(sentence, words, "");
    }

    static void wordBreak(String sentence, HashSet<String> words, String res) {
        if (sentence.isEmpty()) {
            System.out.println(res);
            return;
        }

        for (int i = 0; i < sentence.length(); i++) {
            String left = sentence.substring(0, i + 1);
            String right = sentence.substring(i + 1);
            if (words.contains(left)) {
                wordBreak(right, words, res + left + " ");
            }
        }
    }
}

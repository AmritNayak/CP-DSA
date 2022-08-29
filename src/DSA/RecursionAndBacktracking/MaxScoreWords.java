package DSA.RecursionAndBacktracking;

import java.util.Scanner;

public class MaxScoreWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfWords = sc.nextInt();
        String[] words = new String[noOfWords];
        for (int i = 0; i < noOfWords; i++) {
            words[i] = sc.next();
        }

        int noOfLetters = sc.nextInt();
        char[] letters = new char[noOfLetters];
        for (int i = 0; i < noOfLetters; i++) {
            letters[i] = sc.next().charAt(0);
        }

        int[] freq = new int[26];
        for (char ch : letters) {
            freq[ch - 'a']++;
        }

        int[] score = new int[26];
        for (int i = 0; i < 26; i++) {
            score[i] = sc.nextInt();
        }

        System.out.println(maxScore(words, freq, score, 0));

        //    4
        //    dog cat dad good
        //    9
        //    a b c d d d g o o
        //    1 0 9 5 0 0 3 0 0 0 0 0 0 0 2 0 0 0 0 0 0 0 0 0 0 0

        //    Ans = 23 [dad -> 11, good -> 23]
    }

    static int maxScore(String[] words, int[] freq, int[] score, int idx) {
        if (idx == words.length)
            return 0;

        int no = maxScore(words, freq, score, idx + 1);

        int scoreIdxWord = 0;
        String word = words[idx];
        boolean flag = true;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (freq[ch - 'a'] == 0) {
                flag = false;
            }

            freq[ch - 'a']--;
            scoreIdxWord += score[ch - 'a'];
        }

        int yes = 0;
        if (flag)
            yes = scoreIdxWord + maxScore(words, freq, score, idx + 1);

        for (int i = 0; i < word.length(); i++) {
            freq[word.charAt(i) - 'a']++;
        }

        return Math.max(no, yes);
    }
}

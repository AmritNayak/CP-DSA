package DSA.RecursionAndBacktracking;

import java.util.HashMap;

public class CryptArithmetic {
    public static void main(String[] args) {
        String s1 = "send";
        String s2 = "more";
        String s3 = "money";

        HashMap<Character, Integer> charIntMap = new HashMap<>();
        StringBuilder unique = new StringBuilder();

        for (char c: s1.toCharArray()) {
            if (!charIntMap.containsKey(c)) {
                charIntMap.put(c, -1);
                unique.append(c);
            }
        }

        for (char c: s2.toCharArray()) {
            if (!charIntMap.containsKey(c)) {
                charIntMap.put(c, -1);
                unique.append(c);
            }
        }

        for (char c: s3.toCharArray()) {
            if (!charIntMap.containsKey(c)) {
                charIntMap.put(c, -1);
                unique.append(c);
            }
        }

        boolean[] usedNumbers = new boolean[10];
        cryptArithmetic(unique.toString(), 0, charIntMap, usedNumbers, s1, s2, s3);
    }

    static void cryptArithmetic(
            String unique,
            int idx,
            HashMap<Character, Integer> charIntMap,
            boolean[] usedNumbers,
            String s1, String s2, String s3) {

        if (idx == unique.length()) {
            int num1 = getNum(s1, charIntMap);
            int num2 = getNum(s2, charIntMap);
            int num3 = getNum(s3, charIntMap);

            if (num1 + num2 == num3) {
                for (int i = 0; i < 26; i++) {
                    char ch = (char) ('a' + i);
                    if (charIntMap.containsKey(ch)) {
                        System.out.print(ch + "-" + charIntMap.get(ch) + " ");
                    }
                }
                System.out.println();
            }
            return;
        }

        char ch = unique.charAt(idx);
        for (int num = 0; num <= 9; num++) {
            if (!usedNumbers[num]) {
                charIntMap.put(ch, num);
                usedNumbers[num] = true;
                cryptArithmetic(unique, idx + 1, charIntMap, usedNumbers, s1, s2, s3);
                usedNumbers[num] = false;
                charIntMap.put(ch, -1);
            }
        }
    }

    static int getNum(String s, HashMap<Character, Integer> charIntMap) {
        String num = "";
        for (int i = 0; i < s.length(); i++) {
            num += charIntMap.get(s.charAt(i));
        }

        return Integer.parseInt(num);
    }
}

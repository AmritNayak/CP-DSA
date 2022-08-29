package DSA.RecursionAndBacktracking;

import java.util.HashMap;

public class PalindromicPermutations {
    public static void main(String[] args) {
        String s = "aabbccd";
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
        }

        Character odd = null;
        int odds = 0;
        int len = 0;
        for (char c : freq.keySet()) {
            int f = freq.get(c);
            if (f % 2 == 1) {
                if (odds == 1) {
                    System.out.println(-1);
                    return;
                }
                odd = c;
                odds++;
            }
            freq.put(c, f / 2);
            len += f / 2;
        }
        System.out.println(freq.toString());

        palindromicPermutations(1, len, freq, odd, "");
    }

    static void palindromicPermutations(int curr, int total, HashMap<Character, Integer> freq, Character odd, String res) {
        if (curr > total) {
            String rev = reverse(res, res.length());

            if (odd != null) {
                res += odd;
            }
            res += rev;

            System.out.println(res);
            return;
        }

        for (char c : freq.keySet()) {
            if (freq.get(c) > 0) {
                freq.put(c, freq.get(c) - 1);
                palindromicPermutations(curr + 1, total, freq, odd, res + c);
                freq.put(c, freq.get(c) + 1);
            }
        }

    }

    static String reverse(String s, int n) {
        StringBuilder rev = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }
        return rev.toString();
    }

}

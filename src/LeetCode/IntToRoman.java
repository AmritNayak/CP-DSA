package LeetCode;

import java.util.HashMap;

public class IntToRoman {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.intToRoman(1994));
    }

    static class Solution {
        public String intToRoman(int num) {
            HashMap<Integer, Character> map = new HashMap<>();
            map.put(1, 'I');
            map.put(5, 'V');
            map.put(10, 'X');
            map.put(50, 'L');
            map.put(100, 'C');
            map.put(500, 'D');
            map.put(1000, 'M');

            StringBuilder res = new StringBuilder();

            int divisor = (int) Math.pow(10, Math.floor(Math.log10(num)));
            while (num > 0) {
                int msb = num / divisor;

                if (msb <= 3) {
                    while (msb-- != 0) {
                        res.append(map.get(divisor));
                    }
                } else if (msb == 4) {
                    res.append(map.get(divisor));
                    res.append(map.get(divisor * 5));
                } else if (msb <= 8) {
                    res.append(map.get(divisor * 5));
                    while (msb-- - 5 != 0) {
                        res.append(map.get(divisor));
                    }
                } else {
                    res.append(map.get(divisor));
                    res.append(map.get(divisor * 10));
                }

                num %= divisor;
                divisor /= 10;
            }

            return res.toString();
        }
    }
}

package DSA.RecursionAndBacktracking;

import java.util.HashMap;
import java.util.Map;

public class StringPermutations {
    public static void main(String[] args) {
        String s = "aabb";
//        printAllPermutations(s, "");

        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (freqMap.containsKey(c))
                freqMap.put(c, freqMap.get(c) + 1);
            else
                freqMap.put(c, 1);
        }
        printDistinctPermutations(1, s.length(), freqMap, "");
    }

    static void printAllPermutations(String s, String res) {
        if (s.length() == 0) {
            System.out.println(res);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            String left = s.substring(0, i);
            String right = s.substring(i + 1);
            printAllPermutations(left + right, res + s.charAt(i));
        }
    }

    static void printDistinctPermutations(int currSpot, int totalSpots, Map<Character, Integer> freqMap, String res) {
        if (currSpot > totalSpots) {
            System.out.println(res);
            return;
        }

        for (char c : freqMap.keySet()) {
            if (freqMap.get(c) > 0) {
                freqMap.put(c, freqMap.get(c) - 1);
                printDistinctPermutations(currSpot + 1, totalSpots, freqMap, res + c);
                freqMap.put(c, freqMap.get(c) + 1);
            }
        }
    }
}

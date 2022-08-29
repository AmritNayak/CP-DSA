package DSA.Stacks_and_Queues;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class First_Non_Repeating_Char {

    static void firstNonRepeating(String s) {
        HashMap<Character, Integer> counter = new HashMap<>();
        Queue<Character> chars = new LinkedList<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (!chars.contains(c))
                chars.add(s.charAt(i));
            counter.put(c, counter.getOrDefault(c,0)+1);
            while (!chars.isEmpty()) {
                if (counter.get(chars.peek()) > 1) {
                    chars.remove();
                    counter.put(c, counter.get(c)-1);
                }
                else {
                    System.out.print(-1 + " ");
                    break;
                }
            }
            if (chars.isEmpty())
            System.out.print(-1 + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String s = "abaccc";
        firstNonRepeating(s);
    }
}

package BulaBuli;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        printPermutations(str, "");
//        System.out.println(str.substring(1));
    }

    static void printPermutations(String str, String res) {
        if (str.isEmpty()) {
            System.out.println(res);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            String curr = left + right;
            printPermutations(curr, res + ch);
        }
    }
}

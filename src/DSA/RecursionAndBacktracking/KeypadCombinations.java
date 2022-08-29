package DSA.RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class KeypadCombinations {

    static String[] codes = {".", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        String number = "573";
//        List<String> res = getMnemonics(number);
//        System.out.println(res);
//        System.out.println(res.size());
        printMnemonics(number, "");
    }

    static void printMnemonics(String num, String ans) {
        if (num.length() == 0) {
            System.out.println(ans);
            return;
        }

        String code = codes[num.charAt(0)-'0'];
        for (int i = 0; i < code.length(); i++) {
            printMnemonics(num.substring(1), ans + code.charAt(i));
        }
    }

    static List<String> getMnemonics(String number) {
        if (number.length() == 0) {
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        int codeIndex = number.charAt(0) - '0';
        List<String> nextMnemonics = getMnemonics(number.substring(1));

        String code = codes[codeIndex];
        List<String> res = new ArrayList<>();
        for (int i = 0; i < code.length(); i++) {
            for (String item : nextMnemonics) {
                res.add(code.charAt(i) + item);
            }
        }

        return res;
    }
}

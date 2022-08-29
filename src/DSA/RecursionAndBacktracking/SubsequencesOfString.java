package DSA.RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class SubsequencesOfString {
    public static void main(String[] args) {
        String s = "abc";
//        List<String> res = new ArrayList<>();
//        res = getAllSubsequences(s);
//        System.out.println(res);
        printAllSubsequences(s, "");
    }

    static void printAllSubsequences(String s, String res) {
        if (s.length() == 0) {
            System.out.println(res);
            return;
        }

        printAllSubsequences(s.substring(1), res + "");
        printAllSubsequences(s.substring(1), res + s.charAt(0));
    }

    static List<String> getAllSubsequences(String s) {
        if (s.length() == 0) {
            List<String> baseRes = new ArrayList<>();
            baseRes.add("");
            return baseRes;
        }

        char c = s.charAt(0);
        List<String> nextSubsequences = getAllSubsequences(s.substring(1));

        List<String> res = new ArrayList<>();
        for (String temp : nextSubsequences) {
            res.add("_" + temp);
            res.add(c + temp);
        }

        return res;
    }
}

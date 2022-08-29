package DSA.Strings;

public class AllSubsequences {
    public static void main(String[] args) {
        String s = "abc";
        printAllSubsequences(s, "");
    }

    static void printAllSubsequences(String s, String res) {
        if (s.length() == 0) {
            System.out.println(res);
            return;
        }

        printAllSubsequences(s.substring(1), res);
        printAllSubsequences(s.substring(1), res + s.charAt(0));
    }
}

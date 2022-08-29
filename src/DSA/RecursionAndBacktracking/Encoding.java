package DSA.RecursionAndBacktracking;

public class Encoding {
    public static void main(String[] args) {
        String s = "123";
        printEncodings(s, "");
    }

    static void printEncodings(String s, String res) {
        if (s.length() == 0) {
            System.out.println(res);

        } else if (s.length() == 1) {
            char c = s.charAt(0);
            if (c == '0')
                return;

            int ch = c - '0';
            System.out.println(res + (char) ('a' + ch - 1));

        } else {
            char c = s.charAt(0);
            if (c == '0')
                return;
            else {
                int ch = c - '0';
                printEncodings(s.substring(1), res + (char) ('a' + ch - 1));
            }

            int ch2 = Integer.parseInt(s.substring(0, 2));
            if (ch2 <= 26)
                printEncodings(s.substring(2), res + (char) ('a' + ch2 - 1));
        }

    }
}

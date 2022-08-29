package LeetCode;

public class CountNSay {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countAndSay(4));
    }

    static String countAndSay(int n) {
        if (n == 1)
            return "1";

        String temp = countAndSay(n-1);
        String res = "";

        int i = 0, c = 1, l = temp.length();
        while (i < l - 1) {
            if (temp.charAt(i) == temp.charAt(i+1)) {
                c++;
            } else {
                res += Integer.toString(c) + temp.charAt(i);
                c = 1;
            }
            i++;
        }
        res += Integer.toString(c) + temp.charAt(i);
        return res;
    }
}

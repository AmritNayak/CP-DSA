package DSA.Strings;

public class CountAndSay {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(cns(n));
    }

    static String cns(int n) {
        if (n == 1)
            return "1";

        String temp = cns(n-1);
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

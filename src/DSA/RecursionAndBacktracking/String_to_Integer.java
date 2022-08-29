package DSA.RecursionAndBacktracking;

public class String_to_Integer {

    static int toInteger(String s) {
        if (s.length() == 1)
            return s.charAt(0) - '0';
        int a = toInteger(s.substring(1));
        int b = s.charAt(0) - '0';
        b = (int) (b * Math.pow(10, s.length()-1) + a);
        return b;
    }

    public static void main(String[] args) {
        String s = "12345";
        int n = toInteger(s);
        System.out.println(n);
    }
}

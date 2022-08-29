package DSA.Strings;

public class CheckRotation {
    public static void main(String[] args) {
        String s1 = "qwerty";
        String s2 = "ertyqw";
        System.out.println(check(s1, s2));
    }

    static boolean check(String s1, String s2) {
        return (s1.length() == s2.length()) &&
                (s1.concat(s1).contains(s2));
    }
}

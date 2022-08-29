package DSA.RecursionAndBacktracking;

public class Replace_All_Pi {

    static String replacePi(String s) {
        if (s.length() <= 1)
            return s;
        else if (s.charAt(0) == 'p' && s.charAt(1) == 'i')
            return "3.14" + replacePi(s.substring(2));
        else
            return s.charAt(0) + replacePi(s.substring(1));
    }

    public static void main(String[] args) {
        String s = "pippppiiiipi";
        System.out.println(replacePi(s));
    }
}

package BulaBuli;

public class ReplacePi {
    public static void main(String[] args) {
        String s = "i";
//        System.out.println(replace(s));
        System.out.println(s.charAt(0));
//        System.out.println(s.substring(2));
    }

    static String replace(String s) {
        if (s.length() == 0) {
            return "";
        }
        if (!(s.length() < 2) && s.substring(0, 2).equals("pi")) {// piippi
            String right = replace(s.substring(2));// ippi
            String left = "3.14";
            return left + right;
        } else {
            String right = replace(s.substring(1));//npiz
            char left = s.charAt(0);
            return left + right;
        }
    }
}

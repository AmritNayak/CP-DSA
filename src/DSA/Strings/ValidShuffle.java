package DSA.Strings;

public class ValidShuffle {
    public static void main(String[] args) {
        String s1 = "aajv";
        String s2 = "aggimmnoprr";
        String inp = "javaprogramming";
        System.out.println(isValid(s1, s2, inp));
    }

    static boolean isValid(String s1, String s2, String inp) {
        int l1 = s1.length();
        int l2 = s2.length();
        int l = inp.length();

        if (l != l1 + l2)
            return false;

        int[] f = new int[256];
        for (int i=0; i<l1; i++) {
            f[s1.charAt(i)]++;
        }
        for (int i=0; i<l2; i++) {
            f[s2.charAt(i)]++;
        }

        char c;
        for (int i=0; i<l; i++) {
            c = inp.charAt(i);
            if (f[c] == 0)
                return false;
            f[c]--;
        }
        return true;
    }
}

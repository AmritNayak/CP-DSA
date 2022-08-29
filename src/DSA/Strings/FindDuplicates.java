package DSA.Strings;

public class FindDuplicates {
    public static void main(String[] args) {
        String s = "Hello World";
        printDuplicates(s, s.length());
    }

    static void printDuplicates(String s, int n) {
        int[] chars = new int[256];
        for (int i = 0; i < n; i++) {
            chars[s.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (chars[i] > 1)
                System.out.println((char) i + " -> " + chars[i]);
        }
    }
}

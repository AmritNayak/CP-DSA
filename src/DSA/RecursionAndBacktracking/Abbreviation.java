package DSA.RecursionAndBacktracking;

public class Abbreviation {
    public static void main(String[] args) {
        String str = "abc";
        printAbbreviations(str, "", 0, 0);
    }

    static void printAbbreviations(String str, String asf, int count, int pos) {

        if (pos == str.length()) {
            if (count == 0)
                System.out.println(asf);
            else
                System.out.println(asf + count);

            return;
        }

        if (count > 0)
            printAbbreviations(str, asf + count + str.charAt(pos), 0, pos + 1);
        else
            printAbbreviations(str, asf + str.charAt(pos), 0, pos + 1);

        printAbbreviations(str, asf, count + 1, pos + 1);
    }
}

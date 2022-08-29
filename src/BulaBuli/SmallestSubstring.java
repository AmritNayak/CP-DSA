package BulaBuli;

public class SmallestSubstring {
    public static void main(String[] args) throws Exception {
        System.out.println(GetSubString("I am the greatest", "Imt"));
    }

    static String GetSubString(String input1, String input2)  {
        int n1 = input1.length(), n2 = input2.length();
        int[] hash1 = new int[256], hash2 = new int[256];
        for (int i=0; i<n2; i++)
            hash2[input2.charAt(i)]++;
        int c = 0, start = 0, idx = -1, min = Integer.MAX_VALUE;

        for (int i=0; i<n1; i++) {
            hash1[input1.charAt(i)]++;
            if (hash1[input1.charAt(i)] <= hash2[input1.charAt(i)])
                c++;
            if (c == n2) {
                System.out.println(start + " " + i);
                while (hash1[input1.charAt(start)] > hash2[input1.charAt(start)] || hash2[input1.charAt(start)] == 0) {
                    if (hash1[input1.charAt(start)] > hash2[input1.charAt(start)])
                        hash1[input1.charAt(start)]--;
                    start++;
                }

                int len = i - start + 1;
                if (min > len) {
                    min = len;
                    idx = start;
                }
            }
        }
        return input1.substring(idx, idx + min);
    }

    /*
    .change {
        border-style: dashed;
        background-color: #71E5F4;
    }
    document.getElementById("p").classList.add("change");
    select Title, Book_Desc from book
    where book.Book
     */
}

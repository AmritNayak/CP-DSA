package LeetCode;

public class PalindromeInteger {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(132231));
    }

    static class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0)
                return false;

            int length = (int)Math.floor(Math.log10(x));
            System.out.println(length);
            int mask = (int)Math.pow(10, length);
            for (int i = 0; i <= length / 2; i++) {
                if (x / mask != x % 10)
                    return false;
                x %= mask;
                x /= 10;
                mask /= 100;
            }
            return true;
        }
    }
}

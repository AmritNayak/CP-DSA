package LeetCode;

public class ReverseInteger {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = -123;
        System.out.println(solution.reverse(x));
    }

    static class Solution {
        public int reverse(int x) {
            boolean isNeg = x < 0;
            x = Math.abs(x);
            long rev = 0;

            while (x > 0) {
                rev = rev * 10 + x % 10;
                if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE)
                    return 0;
                x /= 10;
            }

            return isNeg ?  (int)rev * -1 : (int)rev;
        }
    }
}

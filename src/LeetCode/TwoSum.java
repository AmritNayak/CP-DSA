package LeetCode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] res = new int[2];
            int length = nums.length;
            for (int i=0; i<length-1; i++) {
                for (int j=i+1; j<length; j++) {
                    if (nums[i] + nums[j] == target) {
                        res[0] = i;
                        res[1] = j;
                    }
                }
            }
            return res;
        }
    }
}


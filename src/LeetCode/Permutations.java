package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> res = permute(nums);
        System.out.println(res.toString());
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permuteHelper(nums, res, 0);
        return res;
    }

    public static void permuteHelper(int[] nums, List<List<Integer>> res, int i) {
        if (i == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int n: nums)
                temp.add(n);
            res.add(temp);
        }
        for (int j=i; j<nums.length; j++) {
            swap(nums, i, j);
            permuteHelper(nums, res, i+1);
            swap(nums, i, j);
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}

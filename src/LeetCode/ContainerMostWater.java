package LeetCode;

import java.util.Scanner;

public class ContainerMostWater {

    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int left = 0, right = height.length-1, res = Integer.MIN_VALUE;
        while (left < right) {
            res = Math.max(res, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return res;
    }
}

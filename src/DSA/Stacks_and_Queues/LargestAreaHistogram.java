package DSA.Stacks_and_Queues;

import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) {
        int[] arr = {6,2,5,4,5,1,6};
        int[] rb = rightBoundary(arr);
        int[] lb = leftBoundary(arr);
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            int area = arr[i] * (rb[i] - lb[i] - 1);
            max = Math.max(area, max);
        }
        System.out.println(max);
    }

    // next small right index
    static int[] rightBoundary(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i= arr.length-1; i>=0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i])
                stack.pop();
            res[i] = stack.isEmpty() ? arr.length : stack.peek();
            stack.push(i);
        }
        return res;
    }

    // next small left index
    static int[] leftBoundary(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i])
                stack.pop();
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return res;
    }
}

package DSA.Stacks_and_Queues;

import java.util.Stack;

public class Next_Greater_Element {

    static void nextGreater(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        for (int i=n-1; i>=0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i])
                stack.pop();
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        for (int i=0; i<n; i++)
            System.out.print(res[i] + " ");
    }

    public static void main(String[] args) {
        int[] arr = {4,5,2,25};
        int[] arr1 = {5,4,6,7,2,1,3};
        nextGreater(arr1, arr1.length);
    }
}

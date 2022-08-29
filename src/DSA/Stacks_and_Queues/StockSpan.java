package DSA.Stacks_and_Queues;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] stock = {100, 80, 60, 70, 60, 75, 85};
        int[] res = span(stock);
        System.out.println(Arrays.toString(res));
    }

    static int[] span(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i=0; i<arr.length; i++) {
            while(!st.isEmpty() && arr[st.peek()] <= arr[i])
                st.pop();
            res[i] = st.isEmpty() ? i+1 : i - st.peek();
            st.push(i);
        }
        return res;
    }
}

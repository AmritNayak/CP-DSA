package CodeChef.Practice_and_Learn;

import java.util.*;

public class JNEXT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            Stack<Integer> stack = new Stack<>();
            for (int i=0; i<n; i++) {
                stack.push(sc.nextInt());
            }
            Stack<Integer> stack1 = new Stack<>();
            while (!stack.empty()) {
                int temp = stack.pop();
                stack1.push(temp);
                if (!stack.empty()) {
                    if (temp > stack.peek())
                        break;
                }
            }
            if (stack.empty())
                System.out.println("-1");
            else {
                int swap1 = stack.pop();
                Stack<Integer> stack2 = new Stack<>();
                while (!stack1.empty()) {
                    if (stack1.peek() < swap1)
                        break;
                    int temp1 = stack1.pop();
                    stack2.push(temp1);
                }
                int temp2 = stack2.pop();
                stack2.push(swap1);
                swap1 = temp2;
                stack.push(swap1);
                while (!stack1.empty())
                    stack2.push(stack1.pop());
                Iterator<Integer> iter = stack.iterator();
                while (iter.hasNext())
                    System.out.print(iter.next() + " ");
                while (!stack2.empty())
                    System.out.print(stack2.pop() + " ");
            }
        }
    }
}

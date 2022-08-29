package DSA.Stacks_and_Queues;

import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        String exp1 = "((a+b)+(c+d))";
        String exp2 = "((a+b)+((c+d)))";
        System.out.println(dup(exp1, exp1.length()));
        System.out.println(dup(exp2, exp2.length()));
    }

    static boolean dup(String exp, int n) {
        Stack<Character> stack = new Stack<>();
        char ch;
        for (int i=0; i<n; i++) {
            ch = exp.charAt(i);
            if (ch == ')') {
                if (stack.peek() == '(')
                    return true;
                else {
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            }
            else {
                stack.push(ch);
            }
        }
        return false;
    }
}

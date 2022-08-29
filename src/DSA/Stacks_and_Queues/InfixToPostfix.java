package DSA.Stacks_and_Queues;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String s1 = "a+b*(c^d-e)^(f+g*h)-i";
        String s2 = "a+b*c-d";
        System.out.println(infixToPostfix(s1, s1.length()));
        System.out.println(infixToPostfix(s2, s2.length()));
    }

    static String infixToPostfix(String exp, int n) {
        String res = "";
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<n; i++) {
            char ch = exp.charAt(i);
            if (Character.isLetterOrDigit(ch))
                res += ch;
            else if (ch == '(')
                stack.push(ch);
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    res += stack.pop();
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek()))
                    res += stack.pop();
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            res += stack.pop();
        }
        return res;
    }

    static int precedence(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        if (ch == '*' || ch == '/')
            return 2;
        if (ch == '^')
            return 3;
        return -1;
    }
}

package DSA.RecursionAndBacktracking;

import java.util.HashSet;
import java.util.Stack;

public class InvalidParentheses {
    public static void main(String[] args) {
        String expression = "()())()";
        removeInvalidParentheses(expression, getMin(expression), new HashSet<>());
    }

    static void removeInvalidParentheses(String expression, int minRemoval, HashSet<String> res) {
        if (minRemoval == 0) {
            // if the current expression after min removals is valid
            // then min removals for current expression must be zero
            if (getMin(expression) == 0 && !res.contains(expression)) {
                System.out.println(expression);
                res.add(expression);
            }
            return;
        }

        for (int i = 0; i < expression.length(); i++) {
            // remove ith char
            String left = expression.substring(0, i);
            String right = expression.substring(i + 1);

            removeInvalidParentheses(left + right, minRemoval - 1, res);
        }
    }

    static int getMin(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char c: expression.toCharArray()) {
            if (c == '(')
                stack.push(c);
            else {  // c == ')'
                if (stack.isEmpty() || stack.peek() == ')')
                    stack.push(c);
                else if (stack.peek() == '(')
                    stack.pop();
            }
        }
        return stack.size();
    }
}

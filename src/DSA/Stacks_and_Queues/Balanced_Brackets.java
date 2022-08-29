package DSA.Stacks_and_Queues;

import java.util.Stack;

public class Balanced_Brackets {

    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else {
                if (stack.isEmpty()) return false;
                else {
                    char p = stack.peek();
                    if (ch == ')' && p != '(') return false;
                    else if (ch == ']' && p != '[') return false;
                    else if (ch == '}' && p != '{') return false;
                    else stack.pop();   // pops the matching opening bracket for the corresponding closing bracket
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([])";
        String s1 = "({}[][{}))";
        System.out.println(isValid(s));
        System.out.println(isValid(s1));
    }
}

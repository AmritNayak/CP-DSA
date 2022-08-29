package BulaBuli;

import java.util.Stack;

public class EvalInfixExp {
    public static void main(String[] args) {
        String exp = "8+(7-9)*2";
        EvalInfixExp obj = new EvalInfixExp();
        System.out.println(obj.evalInfix(exp));
    }

    public int evalInfix(String input1) {
        char[] exp = input1.toCharArray();
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        for (int i=0; i<exp.length; i++) {
            if (exp[i] == ' ') continue;
            if (exp[i] >= '0' && exp[i] <= '9') {
                StringBuilder s = new StringBuilder();
                while (i < exp.length && exp[i] >= '0' && exp[i] <= '9')
                    s.append(exp[i++]);
                operands.push(Integer.parseInt(s.toString()));
                i--;
            }
            else if (exp[i] == '(')
                operators.push(exp[i]);
            else if (exp[i] == ')') {
                while (operators.peek() != '(') {
                    operands.push(calc(operators.pop(), operands.pop(), operands.pop()));
                }
                operators.pop();
            }
            else if (exp[i] == '+' || exp[i] == '-' || exp[i] == '*' || exp[i] == '/') {
                while (!operators.empty() && precedence(exp[i], operators.peek()))
                    operands.push(calc(operators.pop(), operands.pop(), operands.pop()));
                operators.push(exp[i]);
            }
        }
        while (!operators.empty()) {
            operands.push(calc(operators.pop(), operands.pop(), operands.pop()));
        }
        return operands.pop();
    }

    public boolean precedence(char operator1, char operator2) {
        if (operator2 == '(' || operator2 == ')')
            return false;
        return !((operator1 == '*' || operator1 == '/') && (operator2 == '+' || operator2 == '-'));
    }

    public int calc(char operator, int b, int a) {
        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };
    }

    // id="add" onClick="add()"
    // id=""multiply onClick="multiply()"
    /*
    add func re lekhe
    let sum = document.getElementById("number1").value +
              document.getElementById("number2").value +
              document.getElementById("number3").value +
              document.getElementById("number4").value;
     document.getElementById("demo").innerHTML = sum;

     multiply re
     add();
     se question ta lekhichi add kara multiply re
     ebe try kare number deiki
     add
     result asilani?
     display result re ?
     console nai
     are number1 upare
     areeee
     script tag
     <script src="index.js"> html end re



     */

}

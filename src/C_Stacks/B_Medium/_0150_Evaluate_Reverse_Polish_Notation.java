package C_Stacks.B_Medium;

import java.util.Stack;

public class _0150_Evaluate_Reverse_Polish_Notation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                switch (s) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                    default:
                        break;
                }
            } else {
                stack.push(Integer.parseInt(s));
            }
        }

        return stack.pop();
    }
}

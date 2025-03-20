package others;

import java.util.Stack;

public class Q23StringStackOperations {
    public int solution(String S) {
        // Implement your solution here
        Stack<Integer> stack = new Stack<>();
        String[] ops = S.split(" ");

        for (String op : ops) {
            if (op.matches("\\d+")) {
                int num = Integer.parseInt(op);
                if (num < 1048575)
                    stack.push(num);
                else
                    return -1;
            } else {
                try {
                    switch (op) {
                        case "POP":
                            if (stack.isEmpty())
                                return -1;
                            stack.pop();
                            break;
                        case "DUP":
                            if (stack.isEmpty())
                                return -1;
                            stack.push(stack.peek());
                            break;
                        case "+":
                            if (stack.size() < 2)
                                return -1;
                            stack.push(stack.pop() + stack.pop());
                            break;
                        case "-":
                            if (stack.size() < 2)
                                return -1;
                            int top = stack.pop();
                            int second = stack.pop();
                            stack.push(top - second);
                            break;
                        default:
                            return -1;
                    }
                } catch (Exception e) {
                    return -1;
                }
            }
        }

        return stack.isEmpty() ? -1 : stack.peek();

    }

    public static void main(String[] args) {
        Q23StringStackOperations obj = new Q23StringStackOperations();
        System.out.println(obj.solution("1048575 DUP +"));
    }

}

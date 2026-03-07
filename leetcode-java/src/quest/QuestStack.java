package quest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class QuestStack
{
    // Stack : Q1. Build an Array With Stack Operations
    public List<String> buildArray(int[] target, int n) {

        List<String> result = new ArrayList<>();
        int iterator = 1;

        for (int targetNumber : target) {
            while (iterator < targetNumber) {
                result.add("Push");
                result.add("Pop");
                iterator++;
            }

            result.add("Push");
            iterator++;
        }

        return result;
    }

    // Stack : Q2. Evaluate Reverse Polish Notation
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();
        int a;
        int b;

        for (String token : tokens) {
            switch (token) {
                case "+":
                    numbers.push(numbers.pop() + numbers.pop());
                    break;
                case "-":
                    a = numbers.pop();
                    b = numbers.pop();
                    numbers.push(b - a);
                    break;
                case "*":
                    numbers.push(numbers.pop() * numbers.pop());
                    break;
                case "/":
                    a = numbers.pop();
                    b = numbers.pop();
                    numbers.push(b / a);
                    break;
                default:
                    numbers.push(Integer.parseInt(token));
            }
        }

        return numbers.pop();
    }
}

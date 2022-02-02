import java.util.Stack;

public class CorrectBracket {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (stack.isEmpty()) return false;

                if (stack.peek() == '(')
                    stack.pop();
            } else stack.push(s.charAt(i));
        }

        return stack.isEmpty();
    }
}

import java.util.Stack;

public class Brackets {
    public int solution(String S) {
        Stack<Character> stack = new Stack<>();

        for (Character c : S.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return 0;
                }
                Character peek = stack.peek();
                if (c == ')' && peek == '(') {
                    stack.pop();
                } else if (c == ']' && peek == '[') {
                    stack.pop();
                } else if (c == '}' && peek == '{') {
                    stack.pop();
                } else {
                    return 0;
                }
            }
        }

        if (stack.isEmpty()) {
            return 1;
        }
        return 0;

    }
}

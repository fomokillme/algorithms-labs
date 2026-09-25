import java.util.Stack;

public class Brackets {

    public boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char bracket = str.charAt(i);

            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            char openBracket = stack.pop();

            if ((bracket == ')' && openBracket != '(')
                    || (bracket == ']' && openBracket != '[')
                    || (bracket == '}' && openBracket != '{')) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}

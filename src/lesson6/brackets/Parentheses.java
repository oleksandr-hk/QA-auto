package lesson6.brackets;

import java.util.Stack;

public class Parentheses {

    public static boolean validParentheses(String s) {
        Stack<Character> brakets = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                brakets.add(s.charAt(i));
            }
            else if (s.charAt(i) == ')' && !brakets.isEmpty() && brakets.peek() == '(') {
                brakets.pop();
            }
            else if (s.charAt(i) == ']' && !brakets.isEmpty() && brakets.peek() == '[') {
                brakets.pop();
            }
            else if (s.charAt(i) == '}' && !brakets.isEmpty() && brakets.peek() == '{') {
                brakets.pop();
            } else {
                return false;
            }
        }

        return brakets.isEmpty();
    }
}

import java.util.Stack;

public class BalancedBrackets {
        public static boolean hasBalancedBrackets(String input) {
            Stack<Character> stack = new Stack<>();

            for (char c : input.toCharArray()) {
                if (isOpenBracket(c)) {
                    stack.push(c);
                } else if (isCloseBracket(c)) {
                    if (stack.isEmpty() || !isMatchingBracket(stack.peek(), c)) {
                        return false;
                    }
                    stack.pop();
                }
            }

            return stack.isEmpty();
        }

        private static boolean isOpenBracket(char c) {
            return c == '(' || c == '{' || c == '[' || c == '<';
        }

        private static boolean isCloseBracket(char c) {
            return c == ')' || c == '}' || c == ']' || c == '>';
        }

        private static boolean isMatchingBracket(char open, char close) {
            return (open == '(' && close == ')') ||
                    (open == '{' && close == '}') ||
                    (open == '[' && close == ']') ||
                    (open == '<' && close == '>');
        }

        public static void main(String[] args) {
            String input1 = "{[()]<>}";
            String input2 = "({[}])";

            boolean result1 = hasBalancedBrackets(input1);
            boolean result2 = hasBalancedBrackets(input2);

            System.out.println("Input 1 has balanced brackets: " + result1);
            System.out.println("Input 2 has balanced brackets: " + result2);
        }
    }





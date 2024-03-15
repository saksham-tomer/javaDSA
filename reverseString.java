import java.util.*;

class reverseString {
    public static void main(String[] args) {
        String str = "saksham";

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());
    }
}

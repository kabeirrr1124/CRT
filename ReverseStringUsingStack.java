import java.util.Stack;
public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String str = "riebaK";
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        System.out.println("Reversed String: " + reversed);
    }
}

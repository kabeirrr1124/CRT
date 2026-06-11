import java.util.Stack;
public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            stack.push(num);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("Reversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
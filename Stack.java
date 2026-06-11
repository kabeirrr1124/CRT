import java.util.Scanner;
class Stacks {
    int top;
    final int CAPACITY;
    int[] stack;
    Stacks(int size) {
        top = -1;
        CAPACITY = size;
        stack = new int[CAPACITY];
    }
    public void push(Scanner sc) {
        if (top == CAPACITY - 1) {
            System.out.println("Stack is Full");
        } else {
            System.out.print("Enter element to push:");
            int value = sc.nextInt();
            stack[++top] = value;
            System.out.println(value + "pushed into stack");
        }
    }
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Empty");
        } else {
            System.out.println(stack[top--] + " popped from stack.");
        }
    }
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element:" + stack[top]);
        }
    }
    public void traverse() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of stack:");
        int n = sc.nextInt();
        Stacks st = new Stacks(n);
        while (true) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Traverse");
            System.out.println("0. Exit");
            System.out.print("Select any choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    st.push(sc);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.peek();
                    break;
                case 4:
                    st.traverse();
                    break;
                case 0:
                    System.out.println("Exiting");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
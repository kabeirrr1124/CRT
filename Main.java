class Stack {
    int arr[] = new int[100];
    int top = -1;
    void push(int data) {
        arr[++top] = data;
    }
    int pop() {
        return arr[top--];
    }
    boolean isEmpty() {
        return top == -1;
    }
    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
class MyQueue {
    int arr[] = new int[100];
    int front = 0;
    int rear = -1;

    void enqueue(int data) {
        arr[++rear] = data;
    }

    int dequeue() {
        return arr[front++];
    }

    boolean isEmpty() {
        return front > rear;
    }

    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class Main {

    static void interchange(Stack s, MyQueue q, int n) {
        for (int i = 0; i < n; i++) {
            s.push(q.dequeue());
        }

        for (int i = 0; i < n; i++) {
            q.enqueue(s.pop());
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();
        MyQueue q = new MyQueue();

        s.push(1);
        s.push(2);
        s.push(3);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.print("Original Stack: ");
        s.display();

        System.out.print("Original Queue: ");
        q.display();

        interchange(s, q, 3);

        System.out.print("After Interchange Stack: ");
        s.display();

        System.out.print("After Interchange Queue: ");
        q.display();
    }
}
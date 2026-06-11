import java.util.Scanner;
public class Queue {
    int front = -1, rear = -1, size = 5;
    int[] queue = new int[size];
    void insert(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Full");
        } else {
            if (front == -1)
                front = 0;
            queue[++rear] = value;
            System.out.println("Inserted: " + value);
        }
    }
    void delete() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Empty");
        } else {
            System.out.println("Deleted: " + queue[front++]);
        }
    }
    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("Queue Elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int choice, value;
        do {
            System.out.println("\n1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    q.insert(value);
                    break;
                case 2:
                    q.delete();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 4);
        sc.close();
    }
}
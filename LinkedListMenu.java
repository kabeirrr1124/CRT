import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}
public class LinkedListMenu {
    static Node head = null;
    static void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    static void addAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    static void addAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    static void deleteMiddle() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            System.out.println("Deleted middle element: " + head.data);
            head = null;
            return;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        System.out.println("Deleted middle element: " + slow.data);
        prev.next = slow.next;
    }
    static void findMin() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        int min = head.data;
        Node temp = head;
        while (temp != null) {
            if (temp.data < min) {
                min = temp.data;
            }
            temp = temp.next;
        }
        System.out.println("Minimum element: " + min);
    }
    static void findMax() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        int max = head.data;
        Node temp = head;
        while (temp != null) {
            if (temp.data > max) {
                max = temp.data;
            }
            temp = temp.next;
        }
        System.out.println("Maximum element: " + max);
    }
    static void traverse() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        append(10);
        append(20);
        append(30);
        append(40);
        int choice;
        do {
            System.out.println("\n1. Append");
            System.out.println("2. Add at Beginning");
            System.out.println("3. Add at Position");
            System.out.println("4. Traverse");
            System.out.println("5. Delete Middle Element");
            System.out.println("6. Find Minimum Element");
            System.out.println("7. Find Maximum Element");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter new value: ");
                    int value = sc.nextInt();
                    append(value);
                    break;
                case 2:
                    System.out.print("Enter value to add at beginning: ");
                    int beginValue = sc.nextInt();
                    addAtBeginning(beginValue);
                    break;
                case 3:
                    System.out.print("Enter value: ");
                    int data = sc.nextInt();
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    addAtPosition(data, pos);
                    break;
                case 4:
                    traverse();
                    break;
                case 5:
                    deleteMiddle();
                    break;
                case 6:
                    findMin();
                    break;
                case 7:
                    findMax();
                    break;
                case 8:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while(choice != 8);
        sc.close();
    }
}
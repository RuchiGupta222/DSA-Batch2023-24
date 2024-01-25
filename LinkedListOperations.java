class Node {
    int data;
    Node next;
    public Node(int data) {
    this.data = data;
    this.next = null;
    }
    }

public class LinkedListOperations {
        public static Node insertAtBeginning(Node head, int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        return newNode;
        }
        public static void printList(Node head) {
        Node current = head;
        while (current != null) {
        System.out.print(current.data + " ");
        current = current.next;
        }
        System.out.println();
        }
        public static void main(String[] args) {
        Node head = null;
        head = insertAtBeginning(head, 3);
        head = insertAtBeginning(head, 2);
        head = insertAtBeginning(head, 1);
        System.out.print("Linked List: ");
        printList(head);
        }
        }

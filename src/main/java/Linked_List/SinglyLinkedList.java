package Linked_List;

public class SinglyLinkedList extends Node {
    private Node head;

    public SinglyLinkedList(int data) {
        super(data);
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode; // New node becomes the head
    }

    // Method to delete a node by value
    public void delete(int data) {
        if (head == null) return; // If list is empty, nothing to delete

        if (head.data == data) {
            head = head.next; // If the head is the node to delete, update head
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next; // Traverse until finding the node to delete
        }

        if (current.next != null) {
            current.next = current.next.next; // Bypass the node to delete it
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
}

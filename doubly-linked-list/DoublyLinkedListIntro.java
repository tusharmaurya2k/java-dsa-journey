/*
Doubly Linked List - Introduction
Purpose:
- Understand structure of doubly linked list
- Learn forward traversal
- Learn backward traversal

This code is written for learning purposes.
*/

class Node {
    int data;
    Node prev;
    Node next;

    // Constructor
    Node(int value) {
        this.data = value;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedListIntro {

    Node head;  // first node
    Node tail;  // last node

    // Insert at end
    void insert(int value) {

        Node newNode = new Node(value);

        // If list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Attach at end
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Traverse forward
    void traverseForward() {

        Node temp = head;

        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Traverse backward
    void traverseBackward() {

        Node temp = tail;

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        DoublyLinkedListIntro dll = new DoublyLinkedListIntro();

        dll.insert(10);
        dll.insert(20);
        dll.insert(30);

        dll.traverseForward();   // 10 20 30
        dll.traverseBackward();  // 30 20 10
    }
}

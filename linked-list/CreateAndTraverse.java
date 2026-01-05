/*
Learning File: Linked List - Create & Traverse
Purpose:
- Understand how a linked list node is created
- Understand how nodes are connected
- Understand how traversal works

This code is written while learning DSA.
*/

class Node {

    int data;        // stores value of the node
    Node next;       // stores reference to next node


    Node(int value) {
        this.data = value;   // assign value to data
        this.next = null;    // next is null initially
    }
}

public class CreateAndTraverse {

    // Function to print linked list
    static void printList(Node head) {

        // temp starts from head
        Node temp = head;

        // move until temp becomes null
        while (temp != null) {

            // print current node data
            System.out.print(temp.data + " ");

            // move to next node (like i++)
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Step 1: Create nodes
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        // Step 2: Connect nodes
        n1.next = n2;
        n2.next = n3;

        // Step 3: Head points to first node
        Node head = n1;

        // Step 4: Traverse and print
        printList(head);
    }
}

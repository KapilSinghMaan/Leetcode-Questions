// Circular Linked List

// A circular linked list is a variation of a linked list where the last node points back to the first node, forming a continuous loop

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedListOperations {
    Node head = null;
    Node tail = null;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; 
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; 
        }
    }

    public void display() {
        Node current = head;
        if (head != null) {
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularLinkedListOperations cll = new CircularLinkedListOperations();
        cll.add(10);
        cll.add(20);
        cll.add(30);
        cll.display(); 
    }

}
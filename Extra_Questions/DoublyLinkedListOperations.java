// Doubly Linked List Operations i.e. Intertion and Deletion.

// A doubly linked list is a type of linked list in which each node contains three parts:
// i) Data – the value stored in the node.
// ii) Pointer to the next node – called next.
// iii) Pointer to the previous node – called prev.

public class DoublyLinkedListOperations {

    class Node {

        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
            prev = null;
            next = null;
        }
    }

    Node HEAD;

    public void insertBeginning(int data) {

        Node newNode = new Node(data);

        if (HEAD != null) {
            HEAD.prev = newNode;
        }

        newNode.next = HEAD;
        HEAD = newNode;
    }    

    public void display() {
        Node temp = HEAD;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        DoublyLinkedListOperations dll = new DoublyLinkedListOperations();

        dll.insertBeginning(45);
        dll.insertBeginning(55);
        dll.insertBeginning(65);
        dll.insertBeginning(75);
        dll.insertBeginning(85);
  
        dll.display();
    }
}

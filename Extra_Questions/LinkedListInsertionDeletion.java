// Linked List

// A linked list is a linear data structure where elements (called nodes) are connected using pointers, allowing dynamic memory allocation and efficient insertions/deletions.

public class LinkedListInsertionDeletion {

    class Node {
        int DATA;
        Node NEXT;

        Node(int data) {
            this.DATA = data;
        }
    }

    Node HEAD;

    public void display() {

        if (this.HEAD == null) {
            System.out.println("There is no elements");
            return;
        }

        Node temp = this.HEAD;

        while (temp != null) {
            System.out.print(temp.DATA + " ");
            temp = temp.NEXT;
        }
        System.out.println();
    }

    public void addBeginning(int data) {
        Node nn = new Node(data);
        nn.NEXT = this.HEAD;
        this.HEAD = nn;
    }

    public void addPosition(int data, int idx) {

        if (idx < 0) {
            System.out.println("Negative index not allowed");
            return;
        }
        if (idx == 0) {
            addBeginning(data);
            return;
        }

        Node nn = new Node(data);
        Node temp = this.HEAD;

        for (int i = 0; i < idx - 1; i++) {
            temp = temp.NEXT;
        }

        Node forward = temp.NEXT;
        temp.NEXT = nn;
        nn.NEXT = forward;
    }

    public void addLast(int data) {
        if (this.HEAD == null) {
            addBeginning(data);
            return;
        }
        Node nn = new Node(data);
        Node temp = this.HEAD;

        while (temp.NEXT != null) {
            temp = temp.NEXT;
        }
        temp.NEXT = nn;
    }

    public int removeFirst(){
        if (this.HEAD==null) {
            return -1;
        }
        int rv=this.HEAD.DATA;
        this.HEAD=this.HEAD.NEXT;
        return rv;
    }

    public static void main(String[] args) {

        LinkedListInsertionDeletion ll = new LinkedListInsertionDeletion();
        ll.addBeginning(10);
        ll.addBeginning(30);
        ll.addBeginning(50);
        ll.display();
        ll.addLast(20);
        ll.addLast(40);
        ll.display();
        ll.addPosition(99, 3);
        ll.display();
        System.out.println("Removed : "+ll.removeFirst());
        ll.display();
    }
}
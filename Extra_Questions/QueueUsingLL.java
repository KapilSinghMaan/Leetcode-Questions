// Queue Using Linked List

// A queue is a linear data structure that follows the First In, First Out (FIFO) principle, meaning the first element added to the queue is the first one to be removed.

public class QueueUsingLL {

    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            next = null;
        }
    }

    Node head;
    Node tail;


    public static void main(String[] args) {
        QueueUsingLL queue = new QueueUsingLL();
    }
}

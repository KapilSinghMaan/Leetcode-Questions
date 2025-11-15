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

    public void enqueue(int x) {
        Node nn = new Node(x);
        if (this.tail == null) {
            this.head = this.tail = nn;
        }

        this.tail.next = nn;
        tail = tail.next;
    }

    public int dequeue() {
        if (this.head == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        int rv = this.head.data;
        this.head = this.head.next;

        return rv;
    }

    public void display() {
        if (this.head == null) {
            System.out.println("Queue is Empty");
            return;
        }
        Node temp = this.head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int peek() {

        if (head == null) {
            System.out.println("Empty Queue");
            return -1;
        }
        int rv = this.head.data;
        return rv;
    }

    public static void main(String[] args) {
        QueueUsingLL queue = new QueueUsingLL();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.display();
        System.out.println("Dequeue : " + queue.dequeue());
        System.out.println("Dequeue : " + queue.dequeue());
        queue.enqueue(90);
        queue.enqueue(100);
        System.out.println("Is queue empty : " + queue.isEmpty());
        queue.display();
        System.out.println("First in queue : " + queue.peek());

    }
}

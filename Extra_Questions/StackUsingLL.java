// Stack Using Linked List

// A stack is a linear data structure that follows the Last In, First Out (LIFO) principle. This means the most recently added item is the first to be removed.

public class StackUsingLL {

    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            next = null;
        }
    }

    Node head;

    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = this.head;
        this.head = newNode;
    }

    public int pop() {
        if (this.head == null) {
            System.out.println("No element in stack");
            return -1;
        }

        int rv = this.head.data;
        this.head = this.head.next;

        return rv;
    }

    public void display() {
        if (this.head == null) {
            System.out.println("Stack is Empty");
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
            System.out.println("Empty Stack");
            return -1;
        }
        int rv = this.head.data;
        return rv;
    }

    public static void main(String args[]) {
        StackUsingLL stk = new StackUsingLL();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.display();
        System.out.println("Element Poped = " + stk.pop());
        System.out.println("Element Poped = " + stk.pop());
        stk.push(90);
        stk.push(100);
        System.out.println("Is stack empty : " + stk.isEmpty());
        stk.display();
        System.out.println("Top of stack : " + stk.peek());
    }
}
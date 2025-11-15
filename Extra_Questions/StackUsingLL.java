// Stack Using Linked List

// A stack is a linear data structure that follows the Last In, First Out (LIFO) principle. This means the most recently added item is the first to be removed.

public class StackUsingLL {

    class Node{
        int data;
        Node next;

        Node(int x){
            data=x;
            next=null;
        }
    }

    Node head;

    public void push(int x){

    }

    public int pop(){
        return -1;
    }

    public void display(){

    }

    public boolean isEmpty(){
        return head==null;
    }

    public int peek(){
        return 0;
    }
    public static void main(String args[])
    {
        StackUsingLL stk =new StackUsingLL();
    }
}
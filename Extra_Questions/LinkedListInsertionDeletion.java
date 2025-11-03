// Linked List

// A linked list is a linear data structure where elements (called nodes) are connected using pointers, allowing dynamic memory allocation and efficient insertions/deletions.

public class LinkedListInsertionDeletion {

    class Node{
        int DATA;
        Node NEXT;

        Node(int data){
            this.DATA=data;
        }
    }

    Node HEAD;

    public void display(){
        Node temp=this.HEAD;

        while (temp!=null) {
            System.out.print(temp.DATA+ " ");
            temp=temp.NEXT;
        }
        System.out.println();
    }

    public void addBeginning(int data){
        Node nn=new Node(data);
        nn.NEXT=this.HEAD;
        this.HEAD=nn;
    }

    public static void main(String[] args) {
        
        LinkedListInsertionDeletion ll=new LinkedListInsertionDeletion();
        ll.addBeginning(10);
        ll.addBeginning(30);
        ll.addBeginning(50);
        ll.addBeginning(70);
        ll.addBeginning(90);
        ll.display();
    }
}
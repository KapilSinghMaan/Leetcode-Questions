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

    
}
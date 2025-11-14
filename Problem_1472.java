// 1472. Design Browser History

// https://leetcode.com/problems/design-browser-history/description/

class DLLNode {
    public String data;
    public DLLNode prev, next;

    DLLNode(String url) {
        data = url;
        prev = null;
        next = null;
    }
}

public class Problem_1472 {
    private DLLNode linkedListHead;
    private DLLNode current;

    public Problem_1472(String homepage) {
        linkedListHead = new DLLNode(homepage);
        current=linkedListHead;
    }

    public void visit(String url) {
        DLLNode newNode = new DLLNode(url);
        current.next=newNode;
        newNode.prev=current;
        current=newNode;
    }

    public String back(int steps) {
        while (steps>0 && current.prev!=null) {
            current=current.prev;
            steps--;
        }

        return current.data;
    }

    public String forward(int steps) {
        while (steps>0&& current.next!=null) {
            current=current.next;
            steps--;
        }

        return current.data;
    }
}

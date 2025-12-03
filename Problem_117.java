// 117. Populating Next Right Pointers in Each Node II

// https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/description/

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}

public class Problem_117 {
    Node prev, leftMost;

    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        this.leftMost = root;
        Node curr = leftMost;

        while (leftMost != null) {
            this.prev = null;
            curr = this.leftMost;
            this.leftMost = null;
            while (curr != null) {
                processChild(curr.left);
                processChild(curr.right);
                curr = curr.next;
            }
        }
        return root;
    }

    public void processChild(Node childNode) {
        if (childNode != null) {
            if (this.prev != null) {
                this.prev.next = childNode;
            } else {
                this.leftMost = childNode;
            }
            this.prev = childNode;
        }
    }
}

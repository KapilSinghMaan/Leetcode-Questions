// 116. Populating Next Right Pointers in Each Node

// https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
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

public class Problem_116 {
    public Node connect(Node root) {
        
    }
}

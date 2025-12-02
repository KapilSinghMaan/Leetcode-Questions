// 144. Binary Tree Preorder Traversal

// https://leetcode.com/problems/binary-tree-preorder-traversal/description/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Problem_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> answer=new ArrayList<>();
        Stack<TreeNode> stack =new Stack<>();

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode currNode=stack.pop();
            if (currNode!=null) {
                answer.add(currNode.val);
                stack.add(currNode.right);
                stack.add(currNode.left);
            }
        }
        return answer;
    }
}

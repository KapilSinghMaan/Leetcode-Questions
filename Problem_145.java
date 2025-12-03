// 145. Binary Tree Postorder Traversal

// https://leetcode.com/problems/binary-tree-postorder-traversal/description/

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

public class Problem_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null;

        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode currNode = stack.peek();

            if ((currNode.left == null && currNode.right == null)
                    || (prev != null && (prev == currNode.left || prev == currNode.right))) {
                stack.pop();
                result.add(currNode.val);
                prev = currNode;
            } else {
                if (currNode.right != null) {
                    stack.push(currNode.right);
                }
                if (currNode.left != null) {
                    stack.push(currNode.left);
                }
            }
        }
        return result;
    }
}

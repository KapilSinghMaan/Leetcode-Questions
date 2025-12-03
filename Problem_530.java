// 530. Minimum Absolute Difference in BST

// https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/

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

public class Problem_530 {
    int minDiff=Integer.MAX_VALUE;
    TreeNode prev;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }

    void inorder(TreeNode node){
        if (node==null) {
            return;
        }
        inorder(node.left);
        if (prev!=null) {
            minDiff=Math.min(minDiff, node.val-prev.val);
        }
        prev=node;
        inorder(node.right);
    }
}

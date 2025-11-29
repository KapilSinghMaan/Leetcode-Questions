// 1038. Binary Search Tree to Greater Sum Tree

// https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/description/

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

public class Problem_1038 {
    int pre = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root.right != null) {
            bstToGst(root.right);
        }
        pre = root.val = pre + root.val;
        if (root.left != null) {
            bstToGst(root.left);
        }
        return root;
    }
}

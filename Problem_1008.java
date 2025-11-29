// 1008. Construct Binary Search Tree from Preorder Traversal

// https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/description/

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

public class Problem_1008 {
    int idx = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public TreeNode helper(int[] preorder, int lower, int upper) {
        if (idx == preorder.length) {
            return null;
        }

        int val = preorder[idx];

        if (val < lower || val > upper) {
            return null;
        }

        idx++;
        TreeNode root=new TreeNode(val);

        root.left=helper(preorder, lower, val);
        root.right=helper(preorder, val, upper);

        return root;
    }
}

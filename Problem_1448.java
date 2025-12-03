// 1448. Count Good Nodes in Binary Tree

// https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/

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

public class Problem_1448 {
    private int numGoodNodes=0;
    public int goodNodes(TreeNode root) {
        dfs(root,Integer.MIN_VALUE);
        return numGoodNodes;
    }

    private void dfs(TreeNode root,int maxSoFar){
        if (maxSoFar<=root.val) {
            numGoodNodes++;
        }

        if (root.left!=null) {
            dfs(root.left, Math.max(root.val, maxSoFar));
        }

        if (root.right!=null) {
            dfs(root.right, Math.max(root.val, maxSoFar));
        }
    }
}

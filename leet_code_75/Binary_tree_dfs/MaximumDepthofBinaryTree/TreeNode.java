package leet_code_75.Binary_tree_dfs.MaximumDepthofBinaryTree;

import java.util.Stack;

public class TreeNode {
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

class Solution {

    public int maxDepth(TreeNode root) {

        // recursive
        // if (root == null)
        // return 0;

        // int deepLeft = maxDepth(root.left);
        // int deepRight = maxDepth(root.right);

        // return 1 + Math.max(deepLeft, deepRight);

        // DFS (stack)

        if (root == null)
            return 0;

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> depthStack = new Stack<>();

        stack.push(root);
        depthStack.push(1);

        int res = 0;

        while (!stack.isEmpty()) {

            TreeNode node = stack.pop();
            int depth = depthStack.pop();

            if (node.left != null) {
                stack.push(node.left);
                depthStack.push(depth + 1);
            }
            if (node.right != null) {
                stack.push(node.right);
                depthStack.push(depth + 1);
            }

            res = Math.max(res, depth);

        }

        return res;

    }
}
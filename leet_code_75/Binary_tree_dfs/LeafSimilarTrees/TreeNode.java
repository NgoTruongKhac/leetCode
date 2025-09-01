package leet_code_75.Binary_tree_dfs.LeafSimilarTrees;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

    // public boolean leafSimilar(TreeNode root1, TreeNode root2) {

    // if (root1 == null || root2 == null)
    // return false;

    // List<Integer> leafValueSequence1 = leafValueSequence(root1);
    // List<Integer> leafValueSequence2 = leafValueSequence(root2);

    // return leafValueSequence1.equals(leafValueSequence2);

    // }

    // private List<Integer> leafValueSequence(TreeNode root) {

    // Stack<TreeNode> stack = new Stack<>();
    // List<Integer> leafValueSequence = new ArrayList<>();

    // stack.push(root);

    // while (!stack.isEmpty()) {

    // TreeNode node = stack.pop();

    // if (node.left == null && node.right == null) {
    // leafValueSequence.add(node.val);
    // }
    // if (node.right != null) {
    // stack.push(node.right);
    // }
    // if (node.left != null) {
    // stack.push(node.left);
    // }

    // }

    // return leafValueSequence;

    // }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();

        dfs(root1, leaves1);
        dfs(root2, leaves2);

        return leaves1.equals(leaves2);

    }

    private void dfs(TreeNode node, List<Integer> leaves) {

        if (node == null)
            return;

        if (node.right == null && node.left == null) {
            leaves.add(node.val);
            return;
        }

        dfs(node.right, leaves);
        dfs(node.left, leaves);

    }

}

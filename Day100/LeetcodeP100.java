package Day100;

import Day61.TreeNode;

// Leetcode 1038. Binary Search Tree to Greater Sum Tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  private int sum = 0;
  
  public TreeNode bstToGst(TreeNode root) {  
      if (root != null) {
          bstToGst(root.right);  // Traverse the right subtree
          sum += root.val;  // Update the sum
          root.val = sum;  // Update the current node's value
          bstToGst(root.left);  // Traverse the left subtree
      }
      return root;
  }
}

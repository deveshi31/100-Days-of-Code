package Day31;

// Leetcode 988. Smallest String Starting From Leaf

/**
 * Definition for a binary tree node.
 */
class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode() {}
  TreeNode(int val) { this.val = val; }
  TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
  }
}

class LeetcodeP31 {
  public String smallestFromLeaf(TreeNode root) {
      dfs(root, new StringBuilder());
      return ans;
  }

  private String ans = null;

  private void dfs(TreeNode root, StringBuilder sb) {
      if (root == null) return;

      sb.append((char) (root.val + 'a'));

      if (root.left == null && root.right == null) {
          final String path = sb.reverse().toString();
          sb.reverse(); // Roll back.
          if (ans == null || ans.compareTo(path) > 0) ans = path;
      }

      dfs(root.left, sb);
      dfs(root.right, sb);

      sb.deleteCharAt(sb.length() - 1);
  }
}



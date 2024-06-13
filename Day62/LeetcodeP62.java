package Day62;

// Leetcode 979. Distribute Coins in Binary Tree

// Definition for a binary tree node.
public class LeetcodeP62 {
  int val;
  LeetcodeP62 left;
  LeetcodeP62 right;
  LeetcodeP62() {}
  LeetcodeP62(int val) { this.val = val; }
  LeetcodeP62(int val, LeetcodeP62 left, LeetcodeP62 right) {
      this.val = val;
      this.left = left;
      this.right = right;
  }
}

class Leetcode {
  public int ans;

  public int distributeCoins(LeetcodeP62 root) {
      ans = 0;
      countSteps(root);
      return ans;
  }

  public int countSteps(LeetcodeP62 root) {
      if (root == null) return 0;
      int leftCoins = countSteps(root.left);
      int rightCoins = countSteps(root.right);
      ans += Math.abs(leftCoins) + Math.abs(rightCoins);
      return (root.val - 1) + leftCoins + rightCoins;
  }
}

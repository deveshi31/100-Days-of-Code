package Day71;

import java.util.Arrays;

// Leetcode 1608. Special Array With X Elements Greater Than or Equal X

class LeetcodeP71 {
  public int specialArray(int[] nums) {
      Arrays.sort(nums);
      int n = nums.length;
      
      if (nums[0] >= n) return n;
      
      for (int i = 1; i <= n; i++) {
          if (nums[n - i] >= i && (n - i - 1 < 0 || nums[n - i - 1] < i)) {
              return i;
          }
      }
      
      return -1;
  }
}

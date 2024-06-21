package Day89;



// Leetcode 945. Minimum Increment to Make Array Unique

import java.util.Arrays;

class LeetcodeP89 {
  public int minIncrementForUnique(int[] nums) {
      Arrays.sort(nums);
      int ans = 0;
      for (int i = 1; i < nums.length; i++) {
          if (nums[i] <= nums[i - 1]) {
              ans += nums[i - 1] - nums[i] + 1;
              nums[i] = nums[i - 1] + 1;
          }
      }
      return ans;
  }
}

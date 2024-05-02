package Day46;

import java.util.Arrays;

// Leetcode 2441. Largest Positive Integer That Exists With Its Negative

class Solution {
  public int findMaxK(int[] nums) {
      Arrays.sort(nums);
      int n = nums.length;
      for (int i = n-1; i >= 0; i--) {
          if (nums[i] > 0 && Arrays.binarySearch(nums, -nums[i]) >= 0) {
              return nums[i];
          }
      }
      return -1;  // If no such pair found
  }
}

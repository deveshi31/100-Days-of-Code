package Day14;

// Leetcode 2444. Count Subarrays With Fixed Bounds

class LeetcodeP14 {
  public long countSubarrays(int[] nums, int minK, int maxK) {
      long res = 0;
      int badIdx = -1, leftIdx = -1, rightIdx = -1;

      for (int i = 0; i < nums.length; ++i) {
          if (!(minK <= nums[i] && nums[i] <= maxK)) {
              badIdx = i;
          }

          if (nums[i] == minK) {
              leftIdx = i;
          }

          if (nums[i] == maxK) {
              rightIdx = i;
          }

          res += Math.max(0, Math.min(leftIdx, rightIdx) - badIdx);
      }

      return res;
  }
}

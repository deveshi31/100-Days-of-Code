package Day97;

// Leetcode 1248. Count Number of Nice Subarrays

class LeetcodeP97 {
  public int numberOfSubarrays(int[] nums, int k) {
      int n = nums.length;
      int[] cnt = new int[n + 1];
      cnt[0] = 1;
      int ans = 0, t = 0;
      for (int v : nums) {
          t += v & 1;
          if (t - k >= 0) {
              ans += cnt[t - k];
          }
          cnt[t]++;
      }
      return ans;
  }
}


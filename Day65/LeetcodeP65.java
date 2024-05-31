package Day65;

import java.util.ArrayList;
import java.util.List;

// Leetcode 78. Subsets

class LeetcodeP65 {
  public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> result = new ArrayList<>();
      backtrack(nums, 0, new ArrayList<>(), result);
      return result;
  }
  
  private void backtrack(int[] nums, int start, List<Integer> path, List<List<Integer>> result) {
      result.add(new ArrayList<>(path));
      for (int i = start; i < nums.length; i++) {
          path.add(nums[i]);
          backtrack(nums, i + 1, path, result);
          path.remove(path.size() - 1);
      }
  }
}

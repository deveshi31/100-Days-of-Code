package Day85;

import java.util.Arrays;

// Leetcode 1051. Height Checker

class LeetcodeP85 {
  public int heightChecker(int[] heights) {
      int[] expected = heights.clone();
      Arrays.sort(expected);
      int count = 0;
      for (int i = 0; i < heights.length; i++) {
          if (heights[i] != expected[i])
              count++;
      }
      return count;
  }
}

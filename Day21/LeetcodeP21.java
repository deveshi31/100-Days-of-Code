package Day21;

// Leetcode 678. Valid Parenthesis String

public class LeetcodeP21 {
  public boolean checkValidString(String s) {
      int leftMin = 0, leftMax = 0;

      for (char c : s.toCharArray()) {
          if (c == '(') {
              leftMin++;
              leftMax++;
          } else if (c == ')') {
              leftMin--;
              leftMax--;
          } else {
              leftMin--;
              leftMax++;
          }
          if (leftMax < 0) return false;
          if (leftMin < 0) leftMin = 0;
      }
      
      return leftMin == 0;
  }
}

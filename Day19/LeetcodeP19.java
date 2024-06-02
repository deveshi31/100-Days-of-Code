package Day19;

import java.util.Stack;

// Leetcode 1544. Make The String Great

class LeetcodeP19 {
  public String makeGood(String s) {
      Stack<Character> stack = new Stack<>();
      
      for (char c : s.toCharArray()) {
          if (!stack.isEmpty() && Math.abs(c - stack.peek()) == 32) {
              stack.pop();
          } else {
              stack.push(c);
          }
      }
      
      StringBuilder result = new StringBuilder();
      while (!stack.isEmpty()) {
          result.insert(0, stack.pop());
      }
      
      return result.toString();
  }
}

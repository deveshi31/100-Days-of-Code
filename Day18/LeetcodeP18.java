package Day18;

// Leetcode 1614. Maximum Nesting Depth of the Parentheses
class S {
  public int maxDepth(String s) {
    int count = 0;
    int maxNum = 0;
    for (char c : s.toCharArray()) {
        if (c == '(') {
            count++;
            if (maxNum < count)
                maxNum = count;
        } else if (c == ')') {
            count--;
        }
    }
    return maxNum;
}

  @Override
  public String toString() {
    return "Solution []";
  }
}
package Day92;

// Leetcode 633. Sum of Square Numbers

class LeetcodeP92 {
  public boolean judgeSquareSum(int c) {
      for (int divisor = 2; divisor * divisor <= c; divisor++) {
          if (c % divisor == 0) {
              int exponentCount = 0;
              while (c % divisor == 0) {
                  exponentCount++;
                  c /= divisor;
              }
              if (divisor % 4 == 3 && exponentCount % 2 != 0) {
                  return false;
              }
          }
      }
      return c % 4 != 3;
  }
}

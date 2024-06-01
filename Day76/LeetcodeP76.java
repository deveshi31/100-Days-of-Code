package Day76;

// Leetcode 3110. Score of a String

public class LeetcodeP76 {
  public int scoreOfString(String s) {
      return java.util.stream.IntStream.range(0, s.length() - 1).map(i -> Math.abs(s.charAt(i) - s.charAt(i + 1))).sum();
  }
}

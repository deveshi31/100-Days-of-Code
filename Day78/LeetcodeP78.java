package Day78;

// Leetcode 2486. Append Characters to String to Make Subsequence


class LeetcodeP78 {
  public int appendCharacters(String s, String t) {
      int sIndex = 0, tIndex = 0;
      int sLength = s.length(), tLength = t.length();
      
      while (sIndex < sLength && tIndex < tLength) {
          if (s.charAt(sIndex) == t.charAt(tIndex)) {
              tIndex++;
          }
          sIndex++;
      }
      
      return tLength - tIndex;
      
  }
}

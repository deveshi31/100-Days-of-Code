package Day45;

// Leetcode 2000. Reverse Prefix of Word

class LeetcodeP45 {
  public String reversePrefix(String word, char ch) {
      int j = word.indexOf(ch);
      if (j != -1) {
          return new StringBuilder(word.substring(0, j + 1)).reverse().toString() + word.substring(j + 1);
      }
      return word;
  }
}

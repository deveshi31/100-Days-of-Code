package Day87;



// GFG Count numbers containing 4


class Solution {
  public static int countNumberswith4(int n) {
      // code here
      int count = 0;
      for (int i = 1; i <= n; i++) {
          if ((i+"").contains("4")) {
              count++;
          }
      }
      return count;
  }
}



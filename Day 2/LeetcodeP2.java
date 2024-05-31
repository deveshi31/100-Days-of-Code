// LEETCODE 621. Task Scheduler

import java.util.Arrays;

class LeetcodeP2 {
  public int leastInterval(char[] tasks, int n) {
      int[] freq = new int[26];
      for (char task : tasks) {
          freq[task - 'A']++;
      }
      Arrays.sort(freq);
      int chunk = freq[25] - 1;
      int idle = chunk * n;

      for (int i = 24; i >= 0; i--) {
          idle -= Math.min(chunk, freq[i]);
      }

      return idle < 0 ? tasks.length : tasks.length + idle;
  }

  public static ListNode mergeLists(ListNode list1, int a, int b, ListNode list2) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'mergeLists'");
  }
}

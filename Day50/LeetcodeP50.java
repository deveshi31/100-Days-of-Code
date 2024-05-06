package Day50;

import java.util.List;
import java.util.Stack;

// Leetcode 2487. Remove Nodes from Linked List

class Solution {
  /**
   * @param head
   * @return
   */
  public List removeNodes(List head) {
      List cur = head;
      Stack<List> stack = new Stack<>();
      
      while (cur != null) {
          while (!stack.isEmpty() && stack.peek().val < cur.val) {
              stack.pop();
          }
          stack.push(cur);
          cur = cur.next;
      }
      
      List nxt = null;
      while (!stack.isEmpty()) {
          cur = stack.pop();
          cur.next = nxt;
          nxt = cur;
      }
      
      return cur;
  }
}

package Day49;

import java.util.List;

// Leetcode 237. Delete Node in a Linked List

class Solution {
  /**
   * @param node
   */
  public void deleteNode(@SuppressWarnings("rawtypes") List node) {
      node.val = node.next.val;
      node.next = node.next.next;
  }
}
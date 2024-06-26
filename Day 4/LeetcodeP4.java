// Leetcode 206. Reverse Linked List

/*class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}*/

class LeetcodeP4 {
  public ListNode reverseList(ListNode head) {
      ListNode prev = null;
      ListNode curr = head;
      ListNode nextNode = null;
      while (curr != null) {
          nextNode = curr.next;
          curr.next = prev;
          prev = curr;
          curr = nextNode;
      }
      return prev;
  }
}


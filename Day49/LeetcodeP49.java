package Day49;

// Leetcode 237. Delete Node in a Linked List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class LeetcodeP49 {
    /**
     * @param node
     */
    public void deleteNode(ListNode node) {
        // Edge case: If the node to be deleted is the last node, do nothing
        if (node.next == null) {
            return;
        }

        // Copy the value of the next node to the current node
        node.val = node.next.val;

        // Traverse to the next node
        ListNode temp = node.next;

        // Update the next pointer of the current node
        node.next = node.next.next;

        // Free the memory occupied by the deleted node
        temp.next = null;
    }
}

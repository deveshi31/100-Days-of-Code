package Day50;

// Leetcode 2487. Remove Nodes from Linked List



/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    /**
     * @param head
     * @return
     */
    public ListNode removeNodes(ListNode head) {
        // Check if the list has only one node or is empty
        if (head == null || head.next == null) {
            return head;
        }

        // Reverse the linked list
        ListNode prevNode = null;
        ListNode currentNode = head;
        while (currentNode != null) {
            ListNode nextNode = currentNode.next; // Store the next node
            currentNode.next = prevNode; // Reverse the link
            prevNode = currentNode; // Move prevNode and currentNode pointers
            currentNode = nextNode;
        }
        head = prevNode; // Update the head to point to the new head of the reversed list

        // Remove nodes with values smaller than the next node's value
        prevNode = head;
        currentNode = head.next;
        while (currentNode != null) {
            if (currentNode.val < currentNode.next.val) { // Check the value of the current node
                prevNode.next = currentNode.next; // Remove the current node
                currentNode = currentNode.next; // Move to the next node
            } else {
                prevNode = currentNode; // Move prevNode
                currentNode = currentNode.next; // Move to the next node
            }
        }

        // Reverse the modified list to restore the original order
        prevNode = null;
        currentNode = head;
        while (currentNode != null) {
            ListNode nextNode = currentNode.next; // Store the next node
            currentNode.next = prevNode; // Reverse the link
            prevNode = currentNode; // Move prevNode and currentNode pointers
            currentNode = nextNode;
        }
        head = prevNode; // Update the head to point to the new head of the reversed list

        return head;
    }
}
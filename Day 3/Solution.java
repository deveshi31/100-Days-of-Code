// Leetcode 1669. Merge In Between Linked Lists

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution {
    public ListNode mergeLists(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy = new ListNode(0);
        dummy.next = list1;
        
        // Step 1: Traverse list1 to find ath node and (b+1)th node
        ListNode prevA = dummy;
        for (int i = 0; i < a; i++) {
            prevA = prevA.next;
        }
        ListNode nodeB = prevA;
        for (int i = a; i <= b; i++) {
            nodeB = nodeB.next;
        }
        
        // Step 2: Attach list2 to list1
        prevA.next = list2;
        
        // Step 3: Traverse list2 to find its last node
        ListNode lastNodeList2 = list2;
        while (lastNodeList2.next != null) {
            lastNodeList2 = lastNodeList2.next;
        }
        
        // Step 4: Attach (b+1)th node of list1 to the last node of list2
        lastNodeList2.next = nodeB.next;
        
        // Step 5: Adjust pointers to remove nodes from ath to bth
        nodeB.next = null;
        
        // Step 6: Return the head of the modified list
        return dummy.next;
    }

    public static void main(String[] args) {
        // Test cases
        Solution solution = new Solution();

        // Example 1
        ListNode list1 = new ListNode(10);
        list1.next = new ListNode(1);
        list1.next.next = new ListNode(13);
        list1.next.next.next = new ListNode(6);
        list1.next.next.next.next = new ListNode(9);
        list1.next.next.next.next.next = new ListNode(5);

        ListNode list2 = new ListNode(1000000);
        list2.next = new ListNode(1000001);
        list2.next.next = new ListNode(1000002);

        int a = 3;
        int b = 4;

        ListNode result = solution.mergeLists(list1, a, b, list2);

        // Print the result
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("null");

        // Example 2
        ListNode list3 = new ListNode(0);
        list3.next = new ListNode(1);
        list3.next.next = new ListNode(2);
        list3.next.next.next = new ListNode(3);
        list3.next.next.next.next = new ListNode(4);
        list3.next.next.next.next.next = new ListNode(5);
        list3.next.next.next.next.next.next = new ListNode(6);

        ListNode list4 = new ListNode(1000000);
        list4.next = new ListNode(1000001);
        list4.next.next = new ListNode(1000002);
        list4.next.next.next = new ListNode(1000003);
        list4.next.next.next.next = new ListNode(1000004);

        int x = 2;
        int y = 5;

        ListNode result2 = solution.mergeLists(list3, x, y, list4);

        // Print the result
        while (result2 != null) {
            System.out.print(result2.val + " -> ");
            result2 = result2.next;
        }
        System.out.println("null");
    }
}



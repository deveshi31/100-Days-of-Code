package Day45;

// GFG Arrange Consonants and Vowels

//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;

class Node {
    char data;
    Node next;
    
    public Node(char data){
        this.data = data;
        next = null;
    }
}

class GFG {
	public static void main (String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
      int t = sc.nextInt();
      while(t-- > 0){
          int n = sc.nextInt();
          Node head = null, tail = null;
          
          char head_c = sc.next().charAt(0);
          head = new Node(head_c);
          tail = head;
          
          while(n-- > 1){
              tail.next = new Node(sc.next().charAt(0));
              tail = tail.next;
          }
          
          Solution obj = new Solution();
          //show(head);
          show(obj.arrangeCV(head));
          
      }
    }
	}
	
	public static void po(Object o){
	    System.out.println(o);
	}
	
	public static void show(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}

// } Driver Code Ends


/*
Structure of node class is:
class Node {
    char data;
    Node next;
    
    public Node(char data){
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    public Node arrangeCV(Node head) {
        if (head == null) {
            return null;
        }

        Node vowelHead = null, vowelTail = null;
        Node consonantHead = null, consonantTail = null;

        Node curr = head;
        while (curr != null) {
            char ch = Character.toLowerCase(curr.data);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                if (vowelHead == null) {
                    vowelHead = curr;
                    vowelTail = curr;
                } else {
                    vowelTail.next = curr;
                    vowelTail = vowelTail.next;
                }
            } else {
                if (consonantHead == null) {
                    consonantHead = curr;
                    consonantTail = curr;
                } else {
                    consonantTail.next = curr;
                    consonantTail = consonantTail.next;
                }
            }
            curr = curr.next;
        }

        if (vowelHead == null || consonantHead == null) {
            return head;
        }

        vowelTail.next = consonantHead;
        consonantTail.next = null;

        return vowelHead;
    }
}

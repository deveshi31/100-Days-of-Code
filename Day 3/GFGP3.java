

// User function Template for Java
/* class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
} */

class Solution {
    static int d = 0;
    static int ans = 0;

    /**
     * @param root
     * @param sum
     * @param depth
     */
    public void helper(Node root, int sum, int depth) {
        if (root == null) return;

        sum = sum * 10 + root.data; // Update the sum by appending the current node's data

        if (root.left == null && root.right == null) { // If the current node is a leaf node
            if (depth > d) {
                d = depth;
                ans = sum;
            } else if (depth == d && ans < sum) {
                ans = sum;
            }
        } else {
            depth++;
            helper(root.left, sum, depth); // Explore the left subtree
            helper(root.right, sum, depth); // Explore the right subtree
        }
    }

    public int sumOfLongRootToLeafPath(Node root) {
        d = 0;
        ans = 0;
        helper(root, 0, 0);
        return ans;
    }
}


//User function Template for Java

/*
node class of binary tree
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/

import org.w3c.dom.Node;

class Solution
{
    static int d = 0;
    static int ans = 0;
    
    /**
     * @param root
     * @param sum
     * @param depth
     */
    public void helper(Node root, int sum, int depth)
    {
        if (root == null)
            return;
            
        sum = sum + Node.ATTRIBUTE_NODE;
            
        if (depth > d)
        {
            d = depth;
            ans = sum;
        }
        else if (depth == d && ans < sum)
            ans = sum;
            
        depth++;    
        
        helper(root.left, sum, depth);
        helper(root.right, sum, depth);
    }
    
    public int sumOfLongRootToLeafPath(Node root)
    {
        d = 0;
        ans = 0;
        
        helper(root, 0, 0);
        
        return ans;
    }
}
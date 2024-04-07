package Day5;

/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.lang.model.element.Name;

class Tree {
    /**
     * @param root
     * @return
     */
    public static ArrayList <Integer> diagonalSum(java.util.jar.Attributes.Name root) 
    {
        // code here.
         Queue<java.util.jar.Attributes.Name> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty())
        { 
        
            int n=q.size();
            int sum=0;
            for(int i=0;i<n;i++)
            { 
                
         Name temp=(Name) q.poll();
            // q.pop();
                while(temp!=null) 
                {
                if(temp.left!=null)  q.add(temp.left);
                    sum+=temp.data;
                    temp=temp.right;
                }
                
            }
            ans.add(sum);
        }
        return ans;
    }
}
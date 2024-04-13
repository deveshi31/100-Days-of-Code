package Day27;

// GFG Reverse Bits

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long X = Long.parseLong(read.readLine());

            System.out.println(Solution.reversedBits(X));
        }
    }
}
// } Driver Code Ends


// User function Template for Java



// User function Template for Java

class Solution {
    static Long reversedBits(Long x) {
        // code here
        
      String s=Long.toBinaryString(x);
    //   System.out.println(s);
      StringBuffer sb=new StringBuffer(s);
      sb.reverse();
      for(int i=sb.length();i<32;i++){
          sb.append("0");
      }
      
    //   System.out.println(sb);
      
      long number = Long.parseLong(sb.toString(), 2);
      
      return number;
    }
};

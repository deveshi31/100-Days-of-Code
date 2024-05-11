package Day55;

// GFG Juggler Sequence

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            long n = Long.parseLong(in.readLine());

            List<Long> ans = new ArrayList<>();
            StringBuilder out = new StringBuilder();
            ans = Solution.jugglerSequence(n);
            for (int i = 0; i < ans.size(); i++) out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends



// User function Template for Java

class Solution {
    
    static List<Long> jugglerSequence(long n) {

      List<Long> ls = new ArrayList<Long>();
    
      ls.add(n);  
      
      while(n > 1) {
       
          n = (long) ((n % 2 == 0) ? Math.pow(n,0.5)
                : Math.pow(n, 1.5));
       
          ls.add(n);
          
      }
      
      return ls;
    }
}

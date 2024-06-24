package Day99;

// GFG Summed Matrix

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");

            long n = Long.parseLong(S[0]);
            long q = Long.parseLong(S[1]);

            System.out.println(Solution.sumMatrix(n, q));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static long sumMatrix(long n, long q) 
    {
        // code here
        if(q < 2 || q > 2*n) {
            return 0;
        } 
        
        if(q + 1 <= n) {
            return q - 1;
        }
        
        return 2*n -q + 1;
    }
}

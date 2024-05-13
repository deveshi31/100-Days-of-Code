package Day56;

// GFG Minimum steps to destination

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int d = Integer.parseInt(in.readLine());

            System.out.println(Solution.minSteps(d));
        }
    }
}
// } Driver Code Ends






// User function Template for Java

class Solution {
    static int minSteps(int d) {
        // code here
        int sum=0,diff=0,steps=0;
        while(sum<d || diff%2!=0){
            steps++;
            sum+=steps;
            diff=sum-d;
        }
        return steps;
    }
}

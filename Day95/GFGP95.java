package Day95;

// GFG Integral Points Inside Triangle


//{ Driver Code Starts
// Initial Template for Java

import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            long p[] = new long[2];
            long q[] = new long[2];
            long r[] = new long[2];
            p[0] = Long.parseLong(S[0]);
            p[1] = Long.parseLong(S[1]);
            q[0] = Long.parseLong(S[2]);
            q[1] = Long.parseLong(S[3]);
            r[0] = Long.parseLong(S[4]);
            r[1] = Long.parseLong(S[5]);
            Solution ob = new Solution();
            long ans = ob.InternalCount(p, q, r);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
    //Find the GCD(a,b).
    long gcd(long a,long b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
    
    long InternalCount(long p[], long q[], long r[]) {
        // code here
         
        //p[x1,y1],  q[x2,y2], r[x3,y3].
        long x1=p[0];
        long x2=q[0];
        long x3=r[0];
        long y1=p[1];
        long y2=q[1];
        long y3=r[1];
        
        //Calculate the Area.
        long area=Math.abs((x1*(y2-y3))+(x2*(y3-y1))+(x3*(y1-y2)));
        
        long B1=gcd(Math.abs((x1)-(x2)),Math.abs((y1)-(y2)));
        long B2=gcd(Math.abs((x2)-(x3)),Math.abs((y2)-(y3)));
        long B3=gcd(Math.abs((x3)-(x1)),Math.abs((y3)-(y1)));
        
        //Calculate the Boundary Points.
        long B=B1+B2+B3;
        
        
        //Substitute the values.
        long internalPoints=((area)-B+2)/2;

        return internalPoints;
    }
};

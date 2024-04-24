package Day38;

// GFG Paths to reach origin

//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

//User function Template for Java


class Solution
{
    public static int ways(int x, int y)
    {
        // complete the function
        if (x == 0 || y == 0) return 1;
        int[] up = new int[y + 1];
        Arrays.fill(up, 0);
        up[0] = 1;
        int mod = 1000000007;
        for (int i = 0; i <= x; i++) {
            int[] newUp = new int[y + 1];
            Arrays.fill(newUp, 0);
            for (int j = 0; j <= y; j++) {
                if (j > 0) newUp[j] += newUp[j - 1] + up[j];
                else newUp[j] = up[j];
                newUp[j] %= mod;
            }
            up = newUp;
        }
        return up[y];
    }
}

//{ Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    int x=Integer.parseInt(elements[0]);
		    int y=Integer.parseInt(elements[1]);
		    System.out.println(Solution.ways(x,y));
		}
	}
}
// } Driver Code Ends



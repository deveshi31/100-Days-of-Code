package Day26;

// GfG Sum of Products

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;

class GFG {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            long Arr[] = new long[N];
            String[] S = read.readLine().split(" ");
            for (int i = 0; i < N; i++) Arr[i] = Long.parseLong(S[i]);
            System.out.println(Solution.pairAndSum(N, Arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java



// User function Template for Java

class Solution {
    static long pairAndSum(int n, long arr[]) {
        // code here
         long result = 0; // Initialize result to store the sum
        
        // Iterate through each bit position from 0 to 31
        for (int bit = 0; bit < 32; bit++) {
            long count = 0; // Initialize count to count the number of elements with the bit set
            
            // Count the number of elements with the bit set at position 'bit'
            for (int i = 0; i < n; i++) {
                if ((arr[i] & (1L << bit)) != 0) { // Check if the bit is set
                    count++;
                }
            }
            
            // Add the contribution of the current bit to the result
            result += (count * (count - 1) / 2) * (1L << bit); // count choose 2 * 2^bit
        }
        
        return result;
    }
}
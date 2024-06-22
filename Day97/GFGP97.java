package Day97;

// GFG Extract the Number from the String


//{ Driver Code Starts
// Initial Template for Java

import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.ExtractNumber(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java


class Solution {
    public long ExtractNumber(String s) {
        long ans = -1; // Initialize the answer as -1
        String[] words = s.split(" "); // Split the string into words
        
        for (String word : words) {
            if (isNumber(word) && !word.contains("9")) { // Check if word is a number and doesn't contain '9'
                long num = Long.parseLong(word);
                ans = Math.max(ans, num); // Update the maximum number found
            }
        }
        
        return ans;
    }
    
    private boolean isNumber(String word) {
        // Check if the given word is a valid number
        for (char c : word.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false; // If any character is not a digit, return false
            }
        }
        return true; // All characters are digits, so return true
    }
}



package Day53;

// GFG Divisor Game

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
          int T = sc.nextInt();
          while (T-- > 0) {
              int n = sc.nextInt();
              String ans = LeetcodeP53.divisorGame(n) ? "True" : "False";
              System.out.println(ans);
          }
        }
    }
}

// } Driver Code Ends



// User function Template for Java

class Solution {
    public static boolean divisorGame(int n) {
       if(n%2==0)
       return true;
       else
       return false;
    }
}

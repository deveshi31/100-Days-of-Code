package Day73;

// GFG Geek and its Game of Coins

//{ Driver Code Starts
  import java.io.*;
  
  class GFG {
      public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int t;
          t = Integer.parseInt(br.readLine());
          while (t-- > 0) {
  
              int n;
              n = Integer.parseInt(br.readLine());
  
              int x;
              x = Integer.parseInt(br.readLine());
  
              int y;
              y = Integer.parseInt(br.readLine());
  
              int res = Solution.findWinner(n, x, y);
  
              System.out.println(res);
          }
      }
  }
  
  // } Driver Code Ends
  
  class Solution {
      public static int findWinner(int n, int x, int y) {
          boolean dp[] = new boolean[n + 1];
          if(n >= 1)
              dp[1] = true;
              
          for(int i = 2; i <= n; i++) {
              if(i - 1 >= 0 && dp[i - 1] == false)
                  dp[i] = true;
              else if(i - x >= 0 && dp[i - x] == false)
                  dp[i] = true;
              else if(i - y >= 0 && dp[i - y] == false)
                  dp[i] = true;
          }
          
          return dp[n] == true ? 1 : 0;
      }
  }
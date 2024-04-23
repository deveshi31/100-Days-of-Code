package Day37;

// GFG Medium Problem: Maximum Product Subarray


//{ Driver Code Starts
  import java.io.*;
  
    public class Main {
  
      public static void main(String[] args) throws Exception {
          BufferedReader br =
              new BufferedReader(new InputStreamReader(System.in));
          int tc = Integer.parseInt(br.readLine());
          while (tc-- > 0) {
              int n = Integer.parseInt(br.readLine());
              int[] arr = new int[n];
              String[] inputLine = br.readLine().split(" ");
              for (int i = 0; i < n; i++) {
                  arr[i] = Integer.parseInt(inputLine[i]);
              }
  
              System.out.println(new Solution().maxProduct(arr, n));
          }
      }
  }
  
  // } Driver Code Ends
  
  
  
  class Solution {
      // Function to find maximum product subarray
        long maxProduct(int[] arr, int n) {
          // code here
          
          long pre=1, suff=1;
          long maxi= Long.MIN_VALUE;
          for(int i=0;i<n;i++)
          {
              if(pre==0)
              pre=1;
              
              if(suff==0)
              suff=1;
              
              pre = pre * arr[i];
              suff = suff* arr[n-i-1];
              
              maxi = Math.max(maxi, Math.max(pre,suff));
              
          }
          
          return maxi;
      }
  
  }

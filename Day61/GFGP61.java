package Day61;

// GFG Find Pair Given Difference 

//{ Driver Code Starts
  import java.io.*;
  import java.util.*;
  
  class IntArray {
      public static int[] input(BufferedReader br, int n) throws IOException {
          String[] s = br.readLine().trim().split(" ");
          int[] a = new int[n];
          for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);
  
          return a;
      }
  
      public static void print(int[] a) {
          for (int e : a) System.out.print(e + " ");
          System.out.println();
      }
  
      public static void print(ArrayList<Integer> a) {
          for (int e : a) System.out.print(e + " ");
          System.out.println();
      }
  }
  
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
  
              int[] arr = IntArray.input(br, n);
  
              Solution obj = new Solution();
              int res = obj.findPair(n, x, arr);
  
              System.out.println(res);
          }
      }
  }
  
  // } Driver Code Ends
  
  
  
  
  
  class Solution {
      public int findPair(int n, int x, int[] arr) {
          // code here
           Arrays.sort(arr);
          int i=0,j=1;
          while(i<n && j<n )
          {
              if(Math.abs(arr[j]-arr[i])==x && i!=j)
              return 1;
              if(arr[j]-arr[i]>x)
              {
                  i++;
              }
              else
              {
                  j++;
              }
          }
          return -1;
      }
  }
  

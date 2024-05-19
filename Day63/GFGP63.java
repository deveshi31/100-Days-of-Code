package Day63;

// GFG Find the Closest Number

//{ Driver Code Starts
  import java.io.*;
  import java.util.*;
  
  
  class IntArray
  {
      public static int[] input(BufferedReader br, int n) throws IOException
      {
          String[] s = br.readLine().trim().split(" ");
          int[] a = new int[n];
          for(int i = 0; i < n; i++)
              a[i] = Integer.parseInt(s[i]);
  
          return a;
      }
  
      public static void print(int[] a)
      {
          for(int e : a)
              System.out.print(e + " ");
          System.out.println();
      }
  
      public static void print(ArrayList<Integer> a)
      {
          for(int e : a)
              System.out.print(e + " ");
          System.out.println();
      }
  }
  
  class GFG {
      public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int t;
          t = Integer.parseInt(br.readLine());
          while(t-- > 0){
              
              int n;
              n = Integer.parseInt(br.readLine());
              
              
              int k;
              k = Integer.parseInt(br.readLine());
              
              
              int[] arr = IntArray.input(br, n);
              
              Solution obj = new Solution();
              int res = obj.findClosest(n, k, arr);
              
              System.out.println(res);
              
          }
      }
  }
  
  // } Driver Code Ends
  
  
  
  
  
  
  class Solution {
      public int findClosest(int n, int k, int[] arr) {
          int diff = Math.abs(arr[0]-k);
          int start = 0;
          int end = n-1;
          int ans=0;
          while(start<=end){
              
              int mid = start + (end-start)/2;
              if(arr[mid]==k){
                  return k;
              }
              else if(arr[mid]>k){
                  if(diff>=Math.abs(arr[mid]-k)){
                      diff = Math.abs(arr[mid]-k);
                      ans = arr[mid];
                  }
                  end = mid-1;
              }
              else{
                  if(diff>Math.abs(k-arr[mid])){
                      diff = Math.abs(k-arr[mid]);
                      ans = arr[mid];
                  }
                  start = mid+1;
              }
              
          }
          return ans;
      }
  }
          
          
  

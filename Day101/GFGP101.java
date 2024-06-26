package Day101;

//GFG Coverage of all Zeros in a Binary Matrix

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.findCoverage(matrix);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int res;
    public int findCoverage(int[][] arr) {
      res=0;
      int n=arr.length;
      int m=arr[0].length;
      boolean [][]visit=new boolean[n][m];
      for(int i=0;i<n;i++)Arrays.fill(visit[i],false);
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              if(!visit[i][j]&&arr[i][j]==0)dfs(arr,visit,m,n,i,j);
          }
          
      }
      return res;
    }


    public void dfs(int[][]arr,boolean[][]visit,int m,int n,int i,int j){
        if(i>=n||j>=m||i<0||j<0||visit[i][j]||arr[i][j]==1)return;
        visit[i][j]=true;
        if(i+1<n&&!visit[i+1][j]&&arr[i+1][j]==0){
            dfs(arr,visit,m,n,i+1,j);
        }
        else if(i+1<n&&!visit[i+1][j]&&arr[i+1][j]==1){
            res++;
        }
           if(i-1>=0&&!visit[i-1][j]&&arr[i-1][j]==0){
            dfs(arr,visit,m,n,i-1,j);
        }
        else if(i-1>=0&&!visit[i-1][j]&&arr[i-1][j]==1){
            res++;
        }
           if(j+1<m&&!visit[i][j+1]&&arr[i][j+1]==0){
            dfs(arr,visit,m,n,i,j+1);
        }
        else if(j+1<m&&!visit[i][j+1]&&arr[i][j+1]==1){
            res++;
        }
             if(j-1>=0&&!visit[i][j-1]&&arr[i][j-1]==0){
            dfs(arr,visit,m,n,i,j-1);
        }
        else if(j-1>=0&&!visit[i][j-1]&&arr[i][j-1]==1){
            res++;
        }
    }
}

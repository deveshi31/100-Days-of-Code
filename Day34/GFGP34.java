package Day34;

// GFG Union of Two Sorted Arrays


//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;

class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t  =Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String st[] = read.readLine().trim().split(" ");
            int N = Integer.parseInt(st[0]);
            int M = Integer.parseInt(st[1]);
            
            int arr1[] = new int[N];
            int arr2[] = new int[M];
            
            st = read.readLine().trim().split(" ");
            for(int i = 0; i < N; i++)
              arr1[i] = Integer.parseInt(st[i]);
            
            st = read.readLine().trim().split(" ");  
            for(int i = 0; i< M; i++)
              arr2[i] = Integer.parseInt(st[i]);
            
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = Solution.findUnion(arr1, arr2, N, M);
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println(); 
        }
    }
}



// } Driver Code Ends


//User function Template for Java

//arr1,arr2 : the arrays
// n, m: size of array

    //Function to return a list containing the union of the two arrays
class Solution {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> li = new ArrayList<>();
        TreeSet<Integer> st = new TreeSet<>();
        for(int i = 0; i<n; i++) {
            st.add(arr1[i]);
        }
        for(int j = 0; j<m; j++) {
            st.add(arr2[j]);
        }
        for(Integer x : st) {
            li.add(x);
        }
        return li;
    }
}





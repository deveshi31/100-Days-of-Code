package Day31;

// GFG Count Pairs in an Array

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG
{
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            System.out.println(Solution.countPairs(a, n));
            
        }
	}
}

// } Driver Code Ends



//User function Template for Java
class Solution {  
    private static int mergeAndCount(int[] arr, int l,
                                     int m, int r)
    {
  
        // Left subarray
        int[] left = Arrays.copyOfRange(arr, l, m + 1);
  
        // Right subarray
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
  
        int i = 0, j = 0, k = l, swaps = 0;
  
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        return swaps;
    }
  
    // Merge sort function
    private static int mergeSortAndCount(int[] arr, int l,
                                         int r)
    {
  
        // Keeps track of the inversion count at a
        // particular node of the recursion tree
        int count = 0;
  
        if (l < r) {
            int m = (l + r) / 2;
  
            // Total inversion count = left subarray count
            // + right subarray count + merge count
  
            // Left subarray count
            count += mergeSortAndCount(arr, l, m);
  
            // Right subarray count
            count += mergeSortAndCount(arr, m + 1, r);
  
            // Merge count
            count += mergeAndCount(arr, l, m, r);
        }
  
        return count;
    }
    static int countPairs(int arr[], int n) 
    {
       for(int i=0; i<n; i++){
           arr[i] *= i;
       }
       
       return mergeSortAndCount(arr, 0, n-1);
    }
}


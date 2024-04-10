package Day24;

// Party of Couples

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            System.out.println(Solution.findSingle(N, arr));
        }
    }
}

// } Driver Code Ends

//User function Template for Java



//User function Template for Java

class Solution{
    static int findSingle(int n, int arr[]){
        
        int ans = 0;
        for(int i=0;i<n;i++){
            ans = ans^arr[i];
        }
        
        return ans;
    }
}

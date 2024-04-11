package Day25;

// Gray to Binary equivalent

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;


// } Driver Code Ends
//User function Template for Java
//User function Template for Java

class Solution{
    
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        
        // Your code here
        ArrayList<Integer> list=new ArrayList<>();
        while(n!=0){
            if((n&1)==1) list.add(1);
            else list.add(0);
            n>>=1;
        }
        Collections.reverse(list);
        for(int i=1;i<list.size();i++){
            int a=list.get(i);
            int b=list.get(i-1);
            list.set(i,b^a);
        }
        int sum=0;int j=0;
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)==1) sum+=Math.pow(2,j);
            j++;
        }
        return sum;
    }
       
}



//{ Driver Code Starts.

class GFG {

	public static void main (String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
      int t = sc.nextInt();//testcases
      while(t-->0){
          int n = sc.nextInt();//initializing n
          
          //calling grayToBinary() function
          System.out.println(Solution.grayToBinary(n));
      }
    }
	}
}

// } Driver Code Ends

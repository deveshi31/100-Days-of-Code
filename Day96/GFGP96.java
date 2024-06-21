

// GFG Compare two fractions


//{ Driver Code Starts
// Initial Template for Java

import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str = read.readLine().trim();
            String ans = ob.compareFrac(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    
    String compareFrac(String str) {
        String[] arr = str.split(",");
        arr[0]=arr[0].trim();
        arr[1]=arr[1].trim();
        String a1 ="",a2="",b1="",b2="";
        int i=0;
        while(arr[0].charAt(i)!='/'){
            a1+=""+arr[0].charAt(i);
            i++;
        }
        i++;
        int n = arr[0].length();
        while(i!=n){
            a2+=""+arr[0].charAt(i);
            i++;
        }
        /////////
        i=0;
        while(arr[1].charAt(i)!='/'){
            b1+=""+arr[1].charAt(i);
            i++;
        }
        i++;
        n = arr[1].length();
        while(i!=n){
            b2+=""+arr[1].charAt(i);
            i++;
        }
        double val1 = Double.parseDouble(a1);
        double val2 = Double.parseDouble(a2);
        double val3 = Double.parseDouble(b1);
        double val4 = Double.parseDouble(b2);
        if(val1/val2 > val3/val4) System.out.print(arr[0]);
        else if(val1/val2 < val3/val4) System.out.print(arr[1]);
        else System.out.print("equal");
        // System.out.println(val1+" "+val2);
        // System.out.println(val3+" "+val4);
        return "";
    }
}


//Possible Paths in a Tree

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 
class GFGP2{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());

            int edges[][] = new int[n-1][3];
            for(int i = 0; i < (n-1); i++){
                String input_line[] = read.readLine().trim().split("\\s+");
                for(int j = 0; j < 3; j++){
                    edges[i][j] = Integer.parseInt(input_line[j]);
                }
            } 
            
            int q = Integer.parseInt(read.readLine());

            String input_line[] = read.readLine().trim().split("\\s+");
            int queries[]= new int[q];
            for(int i = 0; i < q; i++)
                queries[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.maximumWeight(n, edges, q, queries); 
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    } 
} 
// } Driver Code Ends



//User function Template for Java

class GFG { 
     int ans;

    // Function to find the root of the given element in the disjoint set.
    private int root(int i, int[] parent) {
        while (parent[i] != i) {
            parent[i] = parent[parent[i]];
            i = parent[i];
        }
        return i;
    }

    // Function to perform union operation of two sets and return the resulting size of the set.
    private int Union(int a, int b, int[] parent, int[] sz) {
        int ra = root(a, parent);
        int rb = root(b, parent);

        // If the roots are the same, it means they are already in the same set,
        // so return the current size of the set.
        if (ra == rb)
            return sz[ra] * sz[ra];

        // If the size of the set containing a is smaller than the size of the set containing b,
        // then swap a and b.
        if (sz[ra] < sz[rb]) {
            int temp = ra;
            ra = rb;
            rb = temp;

            temp = a;
            a = b;
            b = temp;
        }

        // Merge the two sets by updating the parent and size.
        ans += sz[ra] * sz[rb];
        parent[rb] = ra;
        sz[ra] += sz[rb];

        return ans;
    }

    ArrayList<Integer> maximumWeight(int n, int[][] edges, int q, int[] queries) {
        ans = 0;

        int[] parent = new int[n + 1];
        int[] sz = new int[n + 1];
        Arrays.fill(sz, 1);

        
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }

       
        NavigableMap<Integer, Integer> mp = new TreeMap<>();

       
        Arrays.sort(edges, (a, b) -> Integer.compare(a[2], b[2]));

        
        for (int i = 0; i < n - 1; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            int c = edges[i][2];
    
           
            mp.put(c, Union(a, b, parent, sz));
        }

      
        ArrayList<Integer> res = new ArrayList<>();

       
        for (int query : queries) {
            
            Map.Entry<Integer, Integer> entry = mp.floorEntry(query);
            if (entry == null)
                res.add(0); 
            else
                res.add(entry.getValue()); 
        }
        return res;
    }

    public int[] Series(int n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Series'");
    }
}

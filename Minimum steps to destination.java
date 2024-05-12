//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int d = Integer.parseInt(in.readLine());

            Solution ob = new Solution();
            System.out.println(ob.minSteps(d));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int solve(int d, int i, int j) {
        if(i >= d && (i - d) % 2 == 0)
            return j;
        
        j++;
        return solve(d, i + j, j);
    }

    static int minSteps(int d) {
        return solve(d, 0, 0);
    }
}

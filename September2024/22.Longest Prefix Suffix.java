//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {

            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.lps(s));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int lps(String str) {
        int n = str.length();
        int[] lps = new int[n];  
        
        int len = 0;  
        int i = 1;
         
        lps[0] = 0;
 
        while (i < n) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                
                if (len != 0) {
                    len = lps[len - 1];  
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
 
        return lps[n - 1];
    }
}

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    String compareFrac(String  str) {
        // Code here
        String[] fractions = str.split(", ");
        String[] frac1 = fractions[0].split("/");
        String[] frac2 = fractions[1].split("/");

        int num1 = Integer.parseInt(frac1[0]);
        int den1 = Integer.parseInt(frac1[1]);
        int num2 = Integer.parseInt(frac2[0]);
        int den2 = Integer.parseInt(frac2[1]);

        double value1 = (double) num1 / den1;
        double value2 = (double) num2 / den2;

        if (value1 > value2) {
            return fractions[0];
        } else if (value1 < value2) {
            return fractions[1];
        }
        
        return "equal";
        
  
    }
}

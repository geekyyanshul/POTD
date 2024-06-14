//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.getCount(n));
        }
    }
}
// } Driver Code Ends



class Solution {
    public long getCount(int n) {
        if (n == 1) return 10;  
        
         
        int[][] moves = {
            {0, 8},  
            {1, 2, 4}, 
            {2, 1, 3, 5}, 
            {3, 2, 6}, 
            {4, 1, 5, 7}, 
            {5, 2, 4, 6, 8}, 
            {6, 3, 5, 9},  
            {7, 4, 8},  
            {8, 5, 7, 9, 0}, 
            {9, 6, 8} 
        };
        
        long[][] dp = new long[n + 1][10];
        
        
        for (int i = 0; i <= 9; i++) {
            dp[1][i] = 1;
        }
        
        
        for (int len = 2; len <= n; len++) {
            for (int digit = 0; digit <= 9; digit++) {
                dp[len][digit] = 0;
                for (int move : moves[digit]) {
                    dp[len][digit] += dp[len - 1][move];
                }
            }
        }
        
        long result = 0;
        for (int i = 0; i <= 9; i++) {
            result += dp[n][i];
        }
        
        return result;
    }
     public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getCount(1)); 
        System.out.println(solution.getCount(2)); 
        System.out.println(solution.getCount(3)); 
    }
}
    

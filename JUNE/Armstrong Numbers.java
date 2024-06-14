//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static String armstrongNumber(int n) {
        
        double ans = 0;
        int num = n;
        int remainder = 0;
        if(num > 99) {
            remainder = num % 10;
            ans = ans + Math.pow(remainder,3);
            num = num / 10;
        }
        if(num > 9) {
            remainder = num % 10;
            ans = ans + Math.pow(remainder,3);
            num = num / 10;
        }
        if(num > 0) {
            remainder = num % 10;
            ans = ans + Math.pow(remainder,3);
            num = num / 10;
        }
        if(n == (int)ans) {
            return "true";
        }
        return "false";
    }
}

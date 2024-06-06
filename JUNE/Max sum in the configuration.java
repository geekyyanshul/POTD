//{ Driver Code Starts
import java.util.*;

class Maxsum_Among_All_Rotations_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            System.out.println(new Solution().max_sum(arr, n));

            t--;
        }
    }
}

// } Driver Code Ends


class Solution {
    long max_sum(int a[], int n) {
        // Your code here
        
        long S0 = 0;
        long sum_a = 0;
        
        for (int i = 0; i < n; i++) {
            S0 += (long)i * a[i];
            sum_a += (long)a[i];
        }
        
        long maxSum = S0;
        long currentSum = S0;
    
        for (int i = 1; i < n; i++) {
            long val = currentSum - sum_a +((long) n * a[i-1]);
            currentSum=val;
            maxSum=Math.max(maxSum,val);
        }
        
        return maxSum;
    }
}

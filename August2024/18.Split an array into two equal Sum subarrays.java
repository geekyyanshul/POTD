//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s = br.readLine().trim().split(" ");

            int[] arr = new int[s.length];
            for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(s[i]);

            Solution obj = new Solution();
            boolean res = obj.canSplit(arr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
 public boolean canSplit(int arr[]) {
        
        int right=arr.length-1;
        int left=0;
        
        int leftSum=0;
        int rightSum=0;
        
        while(left<=right) {
            if(leftSum>=rightSum) {
                rightSum+=arr[right];
                right--;
            }
            
            else { 
                leftSum+=arr[left];
                left++;
            }
        }
        
        if(rightSum==leftSum) return true;
        else return false;
    }
}

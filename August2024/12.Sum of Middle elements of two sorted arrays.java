//{ Driver Code Starts
// Initial Template for Java

import java.util.*;


// } Driver Code Ends

class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int low = 0, high = n-1;
        while(low <= high) {
            int mid = (low + high)>>1;
            int mid1 = n-mid;
            int l1=(mid-1>=0) ? arr1[mid-1] : Integer.MIN_VALUE;
            int l2=(mid1-1>=0) ? arr2[mid1-1] : Integer.MIN_VALUE;
            int r1=(mid<n) ? arr1[mid] : Integer.MAX_VALUE;
            int r2=(mid1<n) ? arr2[mid1] : Integer.MAX_VALUE;
            if(l1<=r2 && l2<=r1) return Math.max(l1,l2)+Math.min(r1,r2);
            else if(l1>r2) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
}

//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        while (t-- > 0) {
            String[] input1 = sc.nextLine().split(" ");
            int[] arr = new int[input1.length];
            for (int i = 0; i < input1.length; i++) {
                arr[i] = Integer.parseInt(input1[i]);
            }

            String[] input2 = sc.nextLine().split(" ");
            int[] brr = new int[input2.length];
            for (int i = 0; i < input2.length; i++) {
                brr[i] = Integer.parseInt(input2[i]);
            }

            Solution ob = new Solution();
            int res = ob.SumofMiddleElements(arr, brr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int arr[] = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }

            int[] ans = new Solution().constructLowerArray(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] constructLowerArray(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int[] indices = new int[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        mergeSort(arr, indices, result, 0, n);
        return result;
    }

    private void mergeSort(int[] arr, int[] indices, int[] result, int start, int end) {
        if (end - start <= 1) {
            return;
        }
        
        int mid = (start + end) / 2;
        mergeSort(arr, indices, result, start, mid);
        mergeSort(arr, indices, result, mid, end);
        
        int[] temp = new int[end - start];
        int left = start, right = mid, rightCount = 0, tempIndex = 0;
        
        while (left < mid && right < end) {
            if (arr[indices[right]] < arr[indices[left]]) {
                temp[tempIndex++] = indices[right];
                rightCount++;
                right++;
            } else {
                temp[tempIndex++] = indices[left];
                result[indices[left]] += rightCount;
                left++;
            }
        }
        
        while (left < mid) {
            temp[tempIndex++] = indices[left];
            result[indices[left]] += rightCount;
            left++;
        }
        
        while (right < end) {
            temp[tempIndex++] = indices[right];
            right++;
        }
        
        System.arraycopy(temp, 0, indices, start, end - start);
    }
}

//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int x[] = new int[str.length];
            for (int i = 0; i < str.length; i++) x[i] = Integer.parseInt(str[i]);
            str = (br.readLine()).trim().split(" ");
            int[] y = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                y[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().countPairs(x, y, x.length, y.length));
        }
    }
}

// } Driver Code Ends


 
class Solution {
     
    public long countPairs(int x[], int y[], int M, int N) {
       
        Arrays.sort(y);

      
        int[] count = new int[5];
        for (int i = 0; i < N; i++) {
            if (y[i] < 5) {
                count[y[i]]++;
            }
        }

        long totalPairs = 0;
 
        for (int i = 0; i < M; i++) {
            totalPairs += countPairsUtil(x[i], y, count, N);
        }

        return totalPairs;
    }

    private long countPairsUtil(int x, int[] y, int[] count, int N) {
        
        if (x == 0) return 0;

        
        if (x == 1) return count[0];

         
        int idx = Arrays.binarySearch(y, x);
        if (idx < 0) {
            idx = Math.abs(idx + 1);
        } else {
            while (idx < N && y[idx] == x) {
                idx++;
            }
        }

        long totalPairs = N - idx;

        
        totalPairs += count[0] + count[1];
 
        if (x == 2) {
            totalPairs -= (count[3] + count[4]);
        }
        if (x == 3) {
            totalPairs += count[2];
        }

        return totalPairs;
    }
}

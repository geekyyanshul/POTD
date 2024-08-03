//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M));
            t--;
        }
    }
}
// } Driver Code Ends


class Solution {
   
  public int celebrity(int mat[][]) {
        List<Integer> possCelebs = new ArrayList<>();
        for(int i = 0; i < mat.length; i++) {
            boolean isPossCeleb = true;
            for(int j = 0; j < mat[i].length; j++) {
                if(i != j && mat[i][j] == 1) isPossCeleb = false;
            }
            if(isPossCeleb) possCelebs.add(i);
        }
        
        for(int i = 0; i < mat[0].length; i++) {
            boolean isPossCeleb = true;
            for(int j = 0; j < mat.length; j++) {
                if(i != j && mat[j][i] == 0) isPossCeleb = false;
            }
            if(!isPossCeleb) possCelebs.remove((Integer) i);
        }
        if(possCelebs.isEmpty()) return -1;
        return possCelebs.get(0);
    }
}

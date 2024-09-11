//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases

        while (t-- > 0) {
            String[] input = br.readLine().split(" ");
            long[] a = new long[input.length];

            for (int i = 0; i < input.length; i++) {
                a[i] = Long.parseLong(input[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.minCost(a));
        }
    }
}

// } Driver Code Ends

 
class Solution {
     
    public long minCost(long[] arr) {
        
        Queue<Long> pq=new PriorityQueue<>();
        long total=0;
        for(long i:arr) pq.add(i);
        while(pq.size()>1){
            long a=pq.poll(),b=pq.poll();
            total+=(a+b);
            pq.add(a+b);
        }
        return total;
    }
}

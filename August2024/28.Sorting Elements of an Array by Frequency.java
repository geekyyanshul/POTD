//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Map.Entry;


// } Driver Code Ends
// User function Template for Java

class Solution {
    public ArrayList<Integer> sortByFreq(int arr[]) {
        ArrayList<Integer> al=new ArrayList<>();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        
        for(int a: arr)map.put(a,map.getOrDefault(a,0)+1);
        
        ArrayList<Integer> temp=new ArrayList<>();
        for(int k: map.keySet()) {
        	int t1=map.get(k);
        	if(!temp.contains(t1)) temp.add(t1);
        }
        Collections.sort(temp, Collections.reverseOrder()); 
        for(int v: temp) {
        	  for(int k: map.keySet()) {        		  
        	      		  
        		  if(map.get(k)==v) {
        			  int t=v;
        			  while(t-->0) {
        				  al.add(k);
        			  }
        			  
        			  map.put(k, -1);
        		  }
        	  }
        }
        return al;
    }
}

//{ Driver Code Starts.

class Driverclass {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        while (n != 0) {
            String input = sc.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            ArrayList<Integer> ans = new ArrayList<Integer>();
            ans = new Solution().sortByFreq(arr);
            for (int i = 0; i < ans.size(); i++) System.out.print(ans.get(i) + " ");
            System.out.println();
            n--;
        }
    }
}

// } Driver Code Ends

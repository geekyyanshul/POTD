//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim()); // size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    
		    Solution ob = new Solution();
		    
		    System.out.println(ob.maxIndexDiff(arr, n)); // print the result
		}
	}
}
// } Driver Code Ends


class Solution{
    static int maxIndexDiff(int arr[], int n) { 
        
        int minVal[] = new int[n];
        int maxVal[] = new int[n];
        
       
        minVal[0] = arr[0];
        for(int i=1;i<n;i++){
            minVal[i] = Math.min(arr[i],minVal[i-1]);
        }
        
        
        maxVal[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            maxVal[i] = Math.max(arr[i],maxVal[i+1]);
        }
        int i = 0;
        int j = 0;
        int ans = Integer.MIN_VALUE;
        while(i<n && j<n){
            if(minVal[i]<=maxVal[j]){
                ans = Math.max(ans,j-i);
                j++;
            }else{
                i++;
            }
        }
        return ans;
    }
}



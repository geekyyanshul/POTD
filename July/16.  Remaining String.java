//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            char ch = sc.next().charAt(0);
            int count = sc.nextInt();
            Solution ob = new Solution();
            String result = ob.printString(s, ch, count);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


class Solution {
   public String printString(String s, char ch, int count) {
        int index=0;
        for(int i=0;i<s.length();i++){
            if(count==1 && s.charAt(i)==ch){
                index=i+1;
                break;
            }
            if(s.charAt(i)==ch){
                count--;
            }
        }
        if(index==0){
            return "";
        }
        StringBuilder ans=new StringBuilder();
        while(index<s.length()){
            ans.append(s.charAt(index++));
        }
        return ans.toString();
    }
}

//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String str = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine().trim());
            Solution obj = new Solution();
            if (obj.kPangram(str, k))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    boolean kPangram(String str, int k) {
        int alphaCount = 0;
        int duplicatesCount = 0;
        HashSet<Character> alpha = new HashSet<>();
        
        for (int i = 0; i < str.length(); i++) {
            if (alpha.contains(str.charAt(i))){
                duplicatesCount += 1;
            } else if (str.charAt(i) != ' '){
                alpha.add(str.charAt(i));
            }
        }
    
        
        if (alpha.size() == 26 || ((26 - alpha.size() <= duplicatesCount) && (26 - alpha.size()) <= k)){
            return true;
        } else {
            return false;
        }
        
    }
}

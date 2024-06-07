//{ Driver Code Starts

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

 class Solution {
    String binaryNextNumber(string s) {
        char str[] = s.toCharArray();
        boolean isAllOne = true;
        for(int i=str.length-1;i>=0;i--){
            if(str[i]=='1') str[i] = '0';
            else{
                isAllOne = false;
                str[i] = '1';
                break;
            }
        }
        if(isAllOne) return "1"+new String(str);
        int i = 0;
        for(;i<str.length;i++) if(str[i]=='1') break;
        return new String(Arrays.copyOfRange(str,i,s.length()));
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        string s;
        cin >> s;
        Solution ob;
        cout << ob.binaryNextNumber(s);
        cout << "\n";
    }

    return 0;
}
// } Driver Code Ends

//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
  public:
    string reverseWords(string S) 
 { 
        // code here 
        stringstream s(S);
        string ans, token;
        while(getline(s, token, '.')) {
            token += '.';
            ans.insert(ans.begin(), token.begin(), token.end());
        }
        ans.pop_back();
        return ans;
 }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        string s;
        cin >> s;
        Solution obj;
        cout << obj.reverseWords(s) << endl;
    }
}
// } Driver Code Ends

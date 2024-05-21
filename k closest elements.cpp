//{ Driver Code Starts
// Initial template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function template for C++

class Solution {
  public:
      vector<int> printKClosest(vector<int> arr, int n, int k, int x) {
        
    
         auto compare = [&](pair<int, int>& a, pair<int, int>& b) {
        if (a.first == b.first) {
            return a.second < b.second; 
        }
        return a.first > b.first; 
    };
    

   
    priority_queue<pair<int, int>, vector<pair<int, int>>, decltype(compare)> pq(compare);
    
    
    for(int i = 0; i < n; i++) {
        if (arr[i] != x) {
            int diff = abs(x - arr[i]);
            pq.push({diff, arr[i]});
        }
    }
    

    vector<int> result;
    while (!pq.empty() && k > 0) {
        result.push_back(pq.top().second);
        pq.pop();
        k--;
    }
    
    return result;


    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, k, x;
        cin >> n;
        vector<int> arr(n);
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        cin >> k >> x;
        Solution ob;
        auto ans = ob.printKClosest(arr, n, k, x);
        for (auto e : ans) {
            cout << e << " ";
        }
        cout << "\n";
    }
    return 0;
}

// } Driver Code Ends

//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

class Array {
  public:
    template <class T>
    static void input(vector<T> &a, int n) {
        for (int i = 0; i < n; i++) {
            scanf("%d ", &a[i]);
        }
    }

    template <class T>
    static void print(vector<T> &a) {
        for (int i = 0; i < a.size(); i++) {
            cout << a[i] << " ";
        }
        cout << endl;
    }
};


// } Driver Code Ends

class Solution {
  public:
    long long maxTip(int n, int x, int y, vector<int> &a, vector<int> &b) 
{
    vector<pair<int, int>> diff;

    for (int i = 0; i < n; i++)
    {
        diff.push_back({abs(a[i] - b[i]), i});
    }

    sort(diff.rbegin(), diff.rend());

    long long totalTip = 0;

    for (auto it : diff)
    {
        int index = it.second;

        if (x == 0)
        {
            totalTip += b[index];
            y--;
        }
        else if (y == 0)
        {
            totalTip += a[index];
            x--;
        }
        else
        {
            if (a[index] > b[index])
            {
                totalTip += a[index];
                x--;
            }
            else
            {
                totalTip += b[index];
                y--;
            }
        }
    }

    return totalTip;
}
};


//{ Driver Code Starts.

int main() {
    int t;
    scanf("%d ", &t);
    while (t--) {

        int n;
        scanf("%d", &n);

        int x;
        scanf("%d", &x);

        int y;
        scanf("%d", &y);

        vector<int> arr(n);
        Array::input(arr, n);

        vector<int> brr(n);
        Array::input(brr, n);

        Solution obj;
        long long res = obj.maxTip(n, x, y, arr, brr);

        cout << res << endl;
    }
}

// } Driver Code Ends

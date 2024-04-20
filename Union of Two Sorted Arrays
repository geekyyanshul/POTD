class Solution{
    public: 
    vector<int> findUnion(int arr1[], int arr2[], int n, int m)
    {
        vector<int>ans;
        int i=0, j=0; 
        int last = INT_MAX;
        
        while(i<n and j<m){
            if(arr1[i] == arr2[j] and last != arr1[i]){
                ans.push_back(arr1[i]);
                last = arr1[i];
                i++, j++;
            }else if(arr1[i] < arr2[j]){
                if(last != arr1[i]){
                    ans.push_back(arr1[i]);
                    last = arr1[i];
                }
                i++;
            }else{
                if(last != arr2[j]){
                    ans.push_back(arr2[j]);
                    last = arr2[j];
                }
                j++;
            }
        }
        
        while(i<n){
            if(last != arr1[i]){
                ans.push_back(arr1[i]);
                last = arr1[i];
            }
            i++;
        }
        while(j<m){
            if(last != arr2[j]){
                ans.push_back(arr2[j]);
                last = arr2[j];
            }
            j++;
        }
        return ans;
    }
};

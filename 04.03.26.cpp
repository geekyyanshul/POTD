#include <iostream>
using namespace std;
//
class Solution{
  public:
    void swapElements(int arr[], int n)
    {
          
         for(int i=2;i<n;i++)
        {
            int temp=arr[i]; 
            arr[i]=arr[i-2];
            arr[i-2]=temp;
        }
        
    }
};   

int main() {
	
	int testcase;
	
	cin >> testcase;
	
	while(testcase--){
	    int n;
	    cin >> n;
	    
	    int arr[n];
	    
	    for(int i = 0;i<n;i++){
	        cin >> arr[i];
	    }
        Solution obj;
        
	    obj.swapElements(arr, n);
	  
	    for(int i = 0;i<n;i++){
            cout << arr[i] << " ";
        }
	    
	    cout << endl;
	}
	
	return 0;
}

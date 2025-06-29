class Solution:
    
    def solve(self, arr, val):
        t = 0
        cnt = 1
        for i in arr:
            if t + i <= val:
                t += i
            else:
                cnt += 1
                t = i
            
        return cnt
    
    def splitArray(self, arr, k):
        
        low, high = max(arr), sum(arr)
        
        while low <= high:
            mid = (low + high) // 2
            
            cnt = self.solve(arr, mid)
            
            if cnt <= k:
                high = mid - 1
            else:
                low = mid + 1
                
        return low

class Solution {
    public static boolean checkRedundancy(String s) {
        // code here
        Stack<Integer> st = new Stack<>();
        int j = 0;
        int n = s.length();
        
        while(j < n){
            if(s.charAt(j) == ')'){
                if((!st.isEmpty()) && (s.charAt(st.peek()) == '(')){
                    return true;
                }
                while(!st.isEmpty()){
                    int idx = st.pop();
                    if(s.charAt(idx) == '(' && (j - idx) == 2){
                        return true;
                    }
                    if(s.charAt(idx) == '('){
                        j++;
                        break;
                    }
                }
            }else{
                st.push(j);
                j++;
            }
        }
        return false;
    }
}

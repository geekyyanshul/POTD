class Solution{
    
    int max,res;
    
    public void preorder(Node root,int sum,int height){
        
        if(root==null){
            if(max<height){
                res=sum;
                max=height;
            }
            else if(max==height){
                res=Math.max(res,sum);
            }
            return;
        }
        
        preorder(root.left,sum+root.data,height+1);
        preorder(root.right,sum+root.data,height+1);
        
    }
    
    public int sumOfLongRootToLeafPath(Node root){
        
        max=0;res=0;
        preorder(root,0,1);
        return res;
    }
}

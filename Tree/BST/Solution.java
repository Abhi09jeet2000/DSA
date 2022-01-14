class Solution{
    
    // modify the BST and return its root
    int sum = 0;
    boolean isFirst =false;
    public Node modify(Node root)
    {
        replace(root);
        return root;
    }
    
    public void replace(Node root){
        
        if(root == null) return;
        
        replace(root.right);
        if(!isFirst){
            sum = root.data;
            isFirst = true;
        }else{
            sum +=root.data;
            root.data = sum;
        }
        replace(root.left);
    }
    
}
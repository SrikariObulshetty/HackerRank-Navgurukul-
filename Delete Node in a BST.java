class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
         if(root==null){
            return null;
         }
        if(root.val > key){
            root.left= deleteNode(root.left,  key);
        }
        else if(root.val < key){
            root.right= deleteNode(root.right, key);
        }
        else{ // found the key
             // if has no child or has onlt one child.
             if(root.right==null){
                  return root.left;
             }
             else if(root.left==null){
                 return root.right;
             }
             else{ // has two children
                TreeNode maxNode=root.right;
                while(maxNode.left!=null){
                    maxNode=maxNode.left;
                }
                root.val=maxNode.val;
                root.right=deleteNode(root.right, maxNode.val);
             }
        }
        return root;
    }
}

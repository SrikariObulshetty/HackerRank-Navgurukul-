class Solution {
    private static int sum;
    public TreeNode helper(TreeNode root){
        if(root==null){
            return null;
        }
        helper(root.right);
        sum+=root.val;
        root.val=sum;
        helper(root.left);
        return root;
    }
    public TreeNode bstToGst(TreeNode root) {
        sum=0;
        return helper(root);

    }
}

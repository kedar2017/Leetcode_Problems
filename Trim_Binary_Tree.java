class Solution {
    public TreeNode trimBinaryTree(TreeNode root, int L, int R) {
        if(root==null) return null;

        if(root.val < L) return trimBinaryTree(root.right,L,R)
        if(root.val > R) return trimBinaryTree(root.left,L,R)

        else
            root.left = trimBinaryTree(root.left,L,R);
            root.right= trimBinaryTree(root.right,L,R);

        return root;
    }
}
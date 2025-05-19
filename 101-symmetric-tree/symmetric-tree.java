class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true; // A null tree is symmetric
        return checksame(root.left, root.right);
    }

    public boolean checksame(TreeNode leftroot, TreeNode rightroot) {
        if (leftroot == null && rightroot == null)
            return true;
        if (leftroot == null || rightroot == null)
            return false;
        if (leftroot.val != rightroot.val)
            return false;
        return checksame(leftroot.left, rightroot.right) &&
               checksame(leftroot.right, rightroot.left);
    }
}
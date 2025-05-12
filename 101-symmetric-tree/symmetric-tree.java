class Solution {
    private boolean checkSymmetric(TreeNode left, TreeNode right) {
        if (left == null || right == null)
            return left == right;
        if (left.val != right.val)
            return false;
        return checkSymmetric(left.left, right.right) &&
               checkSymmetric(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        return root == null || checkSymmetric(root.left, root.right);
    }
}
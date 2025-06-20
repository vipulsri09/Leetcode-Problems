public class Codec {

    // Encodes a tree to a single string.
    static TreeNode res;
    public String serialize(TreeNode root) {
        res=root;
        return "";
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return res;
    }
}
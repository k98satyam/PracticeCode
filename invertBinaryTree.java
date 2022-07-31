//https://leetcode.com/problems/invert-binary-tree/

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class invertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;

        invert(root);

        return root;
    }

    public void invert(TreeNode node) {
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        if (node.left != null) {
            invert(node.left);
        }

        if (node.right != null) {
            invert(node.right);
        }
    }

}

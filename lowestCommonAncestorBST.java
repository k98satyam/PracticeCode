//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class lowestCommonAncestorBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null)
            return root;

        if (p.val < q.val) {
            while (true) {
                if (q.val == root.val || p.val == root.val) {
                    return root;
                } else if (p.val < root.val && root.val < q.val) {
                    return root;
                } else if (p.val <= root.val && q.val <= root.val) {
                    root = root.left;
                } else {
                    root = root.right;
                }
            }
        } else {
            while (true) {
                if (q.val == root.val || p.val == root.val) {
                    return root;
                } else if (q.val < root.val && root.val < p.val) {
                    return root;
                } else if (q.val <= root.val && p.val <= root.val) {
                    root = root.left;
                } else {
                    root = root.right;
                }
            }
        }

    }
}
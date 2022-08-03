
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// Better Recursive Solution
class validateBST {
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean check(TreeNode node, long min, long max) {
        // System.out.println(node.val + " " + min + " " + max);
        if (!(min < node.val && node.val < max))
            return false;

        return (node.left != null ? check(node.left, min, node.val) : true) &&
                (node.right != null ? check(node.right, node.val, max) : true);
    }
}

// InOrder Iterative Soluion
// class validateBST {
// public boolean isValidBST(TreeNode root) {
// List<Integer> inOrder = new ArrayList<>();
// findInOrder(root, inOrder);

// for (int i = 1; i < inOrder.size(); i++) {
// if (inOrder.get(i) <= inOrder.get(i - 1))
// return false;
// }
// return true;

// }

// public void findInOrder(TreeNode root, List<Integer> inOrder) {
// if (root.left != null) {
// findInOrder(root.left, inOrder);
// }
// inOrder.add(root.val);
// if (root.right != null) {
// findInOrder(root.right, inOrder);
// }
// }
// }

//https://leetcode.com/problems/symmetric-tree/

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class symmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return true;

        if ((root.left == null && !(root.right == null)) ||
                (!(root.left == null) && root.right == null))
            return false;

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        Boolean ans = true;
        TreeNode temp1 = null;
        TreeNode temp2 = null;

        stack1.push(root.left);
        stack2.push(root.right);

        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            temp1 = stack1.pop();
            temp2 = stack2.pop();

            // stack1
            if (temp1.val == temp2.val) {
                if (temp1.left != null) {
                    stack1.push(temp1.left);
                } else {
                    if (temp1.val == 101) {
                    } else {
                        stack1.push(new TreeNode(101, null, null));
                    }
                }

                if (temp1.right != null) {
                    stack1.push(temp1.right);
                } else {
                    if (temp1.val == 101) {
                    } else {
                        stack1.push(new TreeNode(101, null, null));
                    }
                }

                // stack2
                if (temp2.right != null) {
                    stack2.push(temp2.right);
                } else {
                    if (temp2.val == 101) {
                    } else {
                        stack2.push(new TreeNode(101, null, null));
                    }
                }

                if (temp2.left != null) {
                    stack2.push(temp2.left);
                } else {
                    if (temp2.val == 101) {
                    } else {
                        stack2.push(new TreeNode(101, null, null));
                    }
                }

            } else {
                ans = false;
                break;
            }
        }

        return ans;
    }
}

// https://leetcode.com/problems/binary-tree-level-order-traversal/

import java.util.*;;

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

class levelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> mainList = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();

        if (root == null)
            return mainList;

        if (root.left == null && root.right == null) {
            list.add(root.val);
            mainList.add(list);
            return mainList;
        }

        Queue<TreeNode> q = new LinkedList<>();

        int count = 1;
        int childCount = 1;
        TreeNode node;
        q.add(root);

        while (!q.isEmpty()) {
            list = new ArrayList<>();
            count = childCount;
            childCount = 0;

            while (count != 0) {
                node = q.remove();
                System.out.println(node.val);
                list.add(node.val);
                if (node.left != null) {
                    q.add(node.left);
                    childCount++;
                }
                if (node.right != null) {
                    q.add(node.right);
                    childCount++;
                }
                count--;
            }
            mainList.add(list);
        }

        return mainList;
    }
}
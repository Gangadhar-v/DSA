package problems.Leetcode;

public class BalancedBinaryTree {

    public static class TreeNode {
        int value;
        BTS.TreeNode left, right;

        //constructor
        TreeNode(int value) {
            this.value = value;
            left = right = null;
        }


    }

    public static BTS.TreeNode buildBTS(int[] array, int start, int end) {


        //Base case
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        BTS.TreeNode root = new BTS.TreeNode(array[mid]);
        root.left = buildBTS(array, start, mid - 1);
        root.right = buildBTS(array, mid + 1, end);

        return root;

    }

    public static void preOrderTraverse(BTS.TreeNode node) {


        //Base case
        if (node == null) {
            return;
        }
        //preOrderTraverse -> root left right
        int root = node.value;
        String left = (node.left != null) ? String.valueOf(node.left.value) : ".";
        String right = (node.right != null) ? String.valueOf(node.right.value) : ".";

        System.out.println(left + "<-" + root + "->" + right);
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);

    }
}

package leetcode75;

public class SubtreeofAnotherTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }

        if (areEqualTrees(root, subRoot)) {
            return true;
        }
        return (root != null) && (isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot));
    }

    public static boolean areEqualTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return areEqualTrees(root1.left, root2.left) && areEqualTrees(root1.right, root2.right);
    }

    public static TreeNode createTree(Integer[] values, int index) {
        if (index >= values.length || values[index] == null) {
            return null;
        }
        TreeNode node = new SubtreeofAnotherTree().new TreeNode(values[index]);
        node.left = createTree(values, 2 * index + 1);
        node.right = createTree(values, 2 * index + 2);
        return node;
    }

    public static void main(String[] args) {
        SubtreeofAnotherTree solution = new SubtreeofAnotherTree();

        Integer[] rootArray = { 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1,
                null, 1, 2 };
        TreeNode root = createTree(rootArray, 0);

        Integer[] subRootArray = { 1, null, 1, null, 1, null, 1, null, 1, null, 1, 2 };
        TreeNode subRoot = createTree(subRootArray, 0);

        boolean result = solution.isSubtree(root, subRoot);
        System.out.println("Is subRoot a subtree of root? " + result);
    }
}

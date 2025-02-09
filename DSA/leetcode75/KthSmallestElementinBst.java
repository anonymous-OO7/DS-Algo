package leetcode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthSmallestElementinBst {

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

    public static void inorderTraversaltoList(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorderTraversaltoList(root.left, list);
        list.add(root.val);
        inorderTraversaltoList(root.right, list);
    }

    public static int kthSmallest(TreeNode root, int k) {

        List<Integer> inorderList = new ArrayList<Integer>();
        inorderTraversaltoList(root, inorderList);
        System.out.println(Arrays.toString(inorderList.toArray()));

        return inorderList.get(k - 1);

    }

    public static void main(String[] args) {

        System.out.println("Kth  Smallest element in a bst");
        Integer[] rootArray = { 5, 3, 6, 2, 4, null, null, 1 };
        TreeNode root = createTree(rootArray, 0);
        int k = 3;
        int ans = kthSmallest(root, k);

        System.out.println(ans);

    }

    public static TreeNode createTree(Integer[] values, int index) {
        if (index >= values.length || values[index] == null) {
            return null;
        }
        TreeNode node = new KthSmallestElementinBst().new TreeNode(values[index]);
        node.left = createTree(values, 2 * index + 1);
        node.right = createTree(values, 2 * index + 2);
        return node;
    }
}

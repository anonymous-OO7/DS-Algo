package Tree;

// ### **Search in a Binary Search Tree**

// - We compare the value to be searched with the value of the root.
//     - If it’s equal we are done with the search if it’s smaller we know that we need to go to the left subtree because in
//       a binary search tree all the elements in the left subtree are smaller and all the elements in the right subtree are larger.
// - Repeat the above step till no more traversal is possible
// - If at any iteration, key is found, return True. Else False.

// Node creation
class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTree {

    public static boolean search(TreeNode node, int key) {
        if (node == null) {
            return false;
        }
        if (node.val == key) {
            return true;
        }
        if (key < node.val) {
            return search(node.left, key);
        } else {
            return search(node.right, key);
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting the main");
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        boolean result = search(root, 80);

        System.out.println(result + "---" + "Search result ");

    }

}
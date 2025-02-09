package Tree.bst;

// Imagine we are moving down the tree, and assume we are root node. 
// The comparison yields three possibilities,
// A) Root data is equal to key. We are done, root data is ceil value.
// B) Root data < key value, certainly the ceil value can’t be in left subtree. 
//      Proceed to search on right subtree as reduced problem instance.
// C) Root data > key value, the ceil value may be in left subtree. 
//      We may find a node with is larger data than key value in left subtree, 
//      if not the root itself will be ceil node.

public class CeilBst {

    public static void main(String[] args) {

        System.out.println("Ceil In a BST");
    }
}

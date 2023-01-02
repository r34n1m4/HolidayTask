package BinarySearchTree;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        //create a BST object
        BinarySearchTree bst = new BinarySearchTree();
        /* BST tree example
              50
           /     \
          25      90
         /  \    /
        10   15  80   */
        //insert data into BST
        bst.insert(50);
        bst.insert(25);
        bst.insert(10);
        bst.insert(15);
        bst.insert(90);
        bst.insert(80);
        //print the BST
        System.out.println("The BST Created with input data (Left-root-right):");
        bst.inorder();

        //delete leaf node
        System.out.println("\nThe BST after Delete 15 (leaf node):");
        bst.deleteKey(15);
        bst.inorder();
        //delete the node with one child
        System.out.println("\nThe BST after Delete 90 (node with 1 child):");
        bst.deleteKey(90);
        bst.inorder();

        //delete node with two children
        System.out.println("\nThe BST after Delete 45 (Node with two children):");
        bst.deleteKey(45);
        bst.inorder();
        //search a key in the BST
        boolean returnValue = bst.search (80);
        System.out.println("\nKey 80 found in BST:" + returnValue );
        returnValue = bst.search (15);
        System.out.println("\nKey 15 found in BST:" + returnValue );
    }
}


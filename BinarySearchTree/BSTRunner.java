package BinarySearchTree;

public class BSTRunner {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(8);
        bst.insert(7);
        bst.insert(2);
        bst.insert(5);
        bst.insert(12);
        bst.insert(13);
        bst.inOrder();
        System.out.println();
        bst.preOrder();
        System.out.println();
        bst.postOrder();
    }

}

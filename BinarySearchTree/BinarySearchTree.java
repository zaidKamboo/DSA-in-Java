package BinarySearchTree;

public class BinarySearchTree {
    Node root = null;

    public Node insertRec(Node r, int d) {
        if (r == null) {
            r = new Node(d);
        } else if (d < root.data) {
            r.left = insertRec(r.left, d);
        } else if (d > root.data)
            r.right = insertRec(r.right, d);
        return r;
    }

    public void insert(int d) {
        root = insertRec(root, d);

    }

    public void show() {
        Node n = root;
        while (n.left != null) {
            n = n.left;
            System.out.print(n.data + " ");
        }
        System.out.print(root.data);
        n = root.right;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.right;
        }
    }

    public void inOrder() {
        inOrderRec(root);
    }

    public void inOrderRec(Node r) {
        if (!(r == null)) {
            inOrderRec(r.left);
            System.out.print(r.data + " ");
            inOrderRec(r.right);
        }
    }

    public void preOrder() {
        preOrderRec(root);
    }

    public void preOrderRec(Node r) {
        if (!(r == null)) {
            System.out.print(r.data + " ");
            preOrderRec(r.left);
            preOrderRec(r.right);
        }
    }

    public void postOrder() {
        postOrderRec(root);
    }

    public void postOrderRec(Node r) {
        if (!(r == null)) {
            postOrderRec(r.left);
            postOrderRec(r.right);
            System.out.print(r.data + " ");
        }
    }
}

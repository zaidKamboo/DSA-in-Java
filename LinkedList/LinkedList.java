
public class LinkedList {
    Node head;

    public void insert(int d) {
        Node node = new Node();
        node.data = d;
        node.next = null;
        if (head == null)
            head = node;
        else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public void insetAtStart(int d) {
        Node t = new Node();
        t.data = d;
        t.next = head;
        head = t;
    }

    public void insetAt(int i, int d) {
        if (i == 0)
            insetAtStart(d);
        else {
            Node n = new Node();
            Node t = head;
            n.data = d;
            int j = 0;
            while (j < i - 1) {
                t = t.next;
                j++;
            }
            n.next = t.next;
            t.next = n;
        }
    }

    public void deleteAt(int i) {
        if (i == 0)
            head = head.next;
        else {
            Node t = head;
            for (int j = 0; j < i - 1; j++) {
                t = t.next;
            }
            t.next = t.next.next;
        }
    }
}

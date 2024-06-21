public class LLRunner {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(19);
        l.insert(34);
        l.insert(4);
        l.insetAtStart(23);
        l.insetAt(2, 0);
        l.show();
        l.deleteAt(2);
        System.out.println();
        l.show();
    }
}

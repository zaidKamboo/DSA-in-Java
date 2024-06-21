package Queue;

public class QueueRunner {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(5);
        q.enQueue(5);
        q.enQueue(39);
        q.show();
        q.deQueue();
        q.deQueue();
        q.show();
        q.enQueue(5);
        q.enQueue(5);
        q.enQueue(39);
        q.show();
    }
}

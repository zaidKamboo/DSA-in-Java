package Queue;

public class Queue {
    int queue[] = new int[5];
    int size = 0, f = 0, r = 0;

    public void enQueue(int d) {
        if (!isFull()) {
            queue[r] = d;
            r = (r + 1) % 5;
            size++;
        } else {
            System.out.println("Queue full.");
        }
    }

    public int deQueue() {
        if (!isEmpty()) {
            size--;
            int d = queue[f];
            f = (f + 1) % 5;
            return d;
        } else {
            System.out.println("Queue is empty.");
            return 0;
        }
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(f + i) % 5] + " ");
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public boolean isFull() {
        return getSize() == 5;
    }
}

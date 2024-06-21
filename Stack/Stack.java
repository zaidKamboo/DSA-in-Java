package Stack;

public class Stack {
    int top = 0, size = 2, a[] = new int[2];

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    private void expand() {
        int newS[] = new int[size * 2];
        for (int i = 0; i < size; i++) {
            newS[i] = a[i];
        }
        a = newS;
        size *= 2;
    }

    public void push(int d) {
        if (isFull()) {
            expand();
        }
        a[top++] = d;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow.");
            return 0;
        }
        return a[top--];
    }

    public void show() {
        for (int n : a) {
            System.out.print(n + " ");
        }
    }
}

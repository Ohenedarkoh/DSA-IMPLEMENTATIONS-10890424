import java.util.EmptyStackException;

public class Stack<T> {

    private T[] elements;
    private int top;

    public Stack() {
        elements = (T[]) new Object[10];
        top = -1;
    }

    public void push(T element) {
        if (top == elements.length - 1) {
            grow();
        }
        elements[++top] = element;
    }

    public T pop() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        T element = elements[top];
        elements[top--] = null;
        return element;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private void grow() {
        T[] newElements = (T[]) new Object[elements.length * 2];
        for (int i = 0; i <= top; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }
}

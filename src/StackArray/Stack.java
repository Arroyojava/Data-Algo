package StackArray;

public class Stack<T> {

    private T[] stack;
    private int count;

    public Stack() {
        stack = (T[]) new Object[1];
    }

    // Add the new item to the end of the array O(1)
    public void push(T newData) {

        //Arrays are not dynamic
        // Need to resize the underlying array if needed
        // if there are too many items in the array then we double the size of the array
        // if there are too few items : then we decrease (shrink) the array

        if (count == stack.length)
            reSize(2 * stack.length);

        // Then insert into array
        stack[count++] = newData;
    }

    // Returns and removes last item we inserted O(1)
    public T pop() {

        if (isEmpty()) return null;

        T item = stack[--count];

        //obsolete references - avoid memory leaks
        stack[count] = null;

        // Resize array?
        if (count > 0 && count == stack.length / 4)
            reSize(stack.length/ 2);

        return item;
    }

    // O(1)
    public boolean isEmpty() {
        return count == 0;
    }

    // Size method O(1)
    public int size() {
        return count;
    }

    // This is the bottleneck of the application O(n)
    private void reSize(int capacity) {

        System.out.println("Need to resize array...");

        T[] stackCopy = (T[]) new Object[capacity];

        // Copy items one by one
        for (int i = 0; i < count; i++)
            stackCopy[i] = stack[i];

        // Update references
        stack = stackCopy;
    }


}

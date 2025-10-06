package edu.rit.swen352.tdd.hard;

/**
 * MyStack is a fixed-size, LIFO (last-in-first-out) stack.
 * @see <a href="https://en.wikipedia.org/wiki/Stack_(abstract_data_type)">Stack ADT</a>
 *
 * <p>
 * You must implement these features:
 * <ul>
 *   <li>constructor: with and without the capacity (defaults to 16)</li>
 *   <li>getCapacity: returns the fixed capacity of the stack</li>
 *   <li>isEmpty: queries if the stack is empty</li>
 *   <li>size: queries how many elements in the stack</li>
 *   <li>push: add an element to the stack; throw {@link IllegalStateException} if the stack is full</li>
 *   <li>pop: remove and return the top element of the stack; throw {@link java.util.NoSuchElementException} if the stack is empty</li>
 * </ul>
 *
 * @param <T> the type of elements in the stack.
 */
public class MyStack<T> {
    private Object[] elements;  
    private int size;           
    private int capacity;   

    public MyStack() {
        this.capacity = 16;
        this.elements = new Object[capacity];
        this.size = 0;
    }

    public MyStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.size = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}

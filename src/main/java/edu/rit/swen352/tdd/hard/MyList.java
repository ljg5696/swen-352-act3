package edu.rit.swen352.tdd.hard;

import java.util.NoSuchElementException;

/**
 * MyList is a flexible-sized sequence of elements with no gaps.
 *
 * <p>
 * You must implement these features:
 * <ul>
 *   <li>constructor: with varargs of initial elements</li>
 *   <li>isEmpty: queries if the list is empty</li>
 *   <li>size: queries how many elements in the list</li>
 *   <li>get: returns the element at a specific index;
 *     throw {@link java.util.NoSuchElementException} if the index is outside the size of the list</li>
 *   <li>add: add an element to the end of the list; nulls not allowed</li>
 *   <li>remove: remove an element by index</li>
 *   <li>forEach: iterates over each element and executes the {@link java.util.function.Consumer} parameter</li>
 * </ul>
 *
 * @param <T> the type of elements in the list.
 */
public class MyList<T> {
    private Object[] elements;
    private int size;


    public MyList(){
        this.elements = new Object[10];
        this.size = 0;
        
    }

    public MyList(int capacity){
        if(capacity < 0){
            throw new IllegalArgumentException("Capacity cannot be below 0");
        }
        this.elements = new Object[capacity];
        this.size = 0; 

    }

    public Boolean isEmpty(){

        return size == 0;
    }

    public int size(){
        return size;

    }
    
    public T get(int index){
        if(index < 0  || index > size){

            throw new NoSuchElementException("Index is outside the size of the list");
        }
        return (T) elements[index];
    }

    public void add(T element){
        if(element == null){
            throw new IllegalArgumentException("Cannot add null values");
        }
        elements[size++] = element;
    }

    public void remove(int index){
        throw new UnsupportedOperationException("Not yet implemented");

    }
}

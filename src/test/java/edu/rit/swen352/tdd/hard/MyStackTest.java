package edu.rit.swen352.tdd.hard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the {@link MyStack} component.
 */
class MyStackTest {
    @Test
    @DisplayName("Constructor with capacity returns non-null")
    void testConstructorWithCapacityNotNull() {
        MyStack<Integer> stack = new MyStack<>(5);
        assertNotNull(stack);
    }

    @Test
    @DisplayName("No argument constructor defaults capacity to 16")
    void testNoArgConstructorDefaultCapacity() {
        MyStack<Integer> stack = new MyStack<>();
        assertEquals(16, stack.getCapacity());
    }

    @Test
    @DisplayName("getCapacity returns provided capacity")
    void testGetCapacity() {
        MyStack<Integer> stack = new MyStack<>(5);
        assertEquals(5, stack.getCapacity());
    }
    
    @Test
    @DisplayName("isEmpty returns true for new stack")
    void testIsEmptyForNewStack() {
        MyStack<Integer> stack = new MyStack<>(5);
        assertEquals(true, stack.isEmpty());
    }


}

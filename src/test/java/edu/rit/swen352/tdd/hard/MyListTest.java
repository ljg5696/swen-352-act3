package edu.rit.swen352.tdd.hard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;





/**
 * Test suite for the {@link MyList} component.
 */
class MyListTest {

    @Test
    @DisplayName("1a: Construct MyList with elements")
    public void listConstruct(){
        MyList<Integer> list = new MyList<>();
        assertNotNull(list);

    }

    @Test
    @DisplayName("2a: test for checking if list is empty return true")
    public void isEmptyTrueTest(){
        MyList<Integer> list = new MyList<>();
        assertEquals(true, list.isEmpty());

    }

    @Test
    @DisplayName("3: test for checking the size of the list")
    public void sizeTest(){
        MyList<Integer> list = new MyList<>();
        assertEquals(0, list.size());

    }

    @Test
    @DisplayName("4a: test for getting an element in the list at a specific index")
    public void getElementTest(){
        MyList<Integer> list = new MyList<>();
        list.add(1);
        assertEquals(1, list.get(0));

    }

    @Test
    @DisplayName("4b: test for getting an element in the list at an index outside of the size")
    public void getOutOfBoundsElement(){

        MyList<Integer> list = new MyList<>();
        Exception exception = assertThrows(Exception.class,
        () -> list.get(1));
        assertEquals("Index is outside the size of the list", exception.getMessage());
    }

    @Test
    @DisplayName("5a: test for adding an element to the end of the list")
    public void addOneTest(){
        MyList<Integer> list = new MyList<>();
        list.add(1);
        assertEquals(1, list.get(0));
    
    }

    @Test
    @DisplayName("5b: test for adding null value to end of the list")
    public void addNullTest(){
        MyList<Integer> list = new MyList<>();
        Exception exception = assertThrows(Exception.class,
        () -> list.add(null));
        assertEquals("Cannot add null values", exception.getMessage());

    }

    @Test
    @DisplayName("6: test for removing an element at a specific index")
    public void removeTest(){
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.remove(1);
        assertEquals(1, list.size());

    }
    @Test
    @DisplayName("6b: test for removing an element at a index outside the size")
    public void removeOutOfBoundsIndexTest(){
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        Exception exception = assertThrows(Exception.class,
        () -> list.remove(2));
        assertEquals("Index is outside the size of the list", exception.getMessage());

    }
}

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
        assertEquals(null, list.get(0));

    }

    @Test
    @DisplayName("4b: test for getting an element in the list at an index outside of the size")
    public void getOutOfBoundsElement(){

        MyList<Integer> list = new MyList<>();
        Exception exception = assertThrows(Exception.class,
        () -> list.get(1));
        assertEquals("Index is outside the size of the list", exception.getMessage());
    }

}

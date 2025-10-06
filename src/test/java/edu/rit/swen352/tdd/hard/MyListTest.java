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

}

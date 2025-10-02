package edu.rit.swen352.tdd.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the {@link Counter} component.
 */
class CounterTest {

    @Test
    @DisplayName("1a: Construct Counter w/ given lower and upper bounds (-5, 5)")
    void constructCounter() {
        Counter testCounter = new Counter(-5, 5);
        assertNotNull(testCounter);
    }

    @Test
    @DisplayName("1b: Construct Counter w/ given lower bound only (-5)")
    void constructCounterOnlyLower() {
        Counter testCounter = new Counter(-5);
        assertNotNull(testCounter);
    }

    @Test
    @DisplayName("1c: Construct Counter w/ no given bounds")
    void constructCounterDefaults() {
        Counter testCounter = new Counter();
        assertNotNull(testCounter);
    }

    @Test
    @DisplayName("2: Get value of lower limit")
    void getLowerLimit() {
        Counter testCounter = new Counter(5, 10);
        assertEquals(5, testCounter.getLowerLimit());
    }

    @Test
    @DisplayName("3: Get value of upper limit")
    void getUpperLimit() {
        Counter testCounter = new Counter(5, 10);
        assertEquals(10, testCounter.getUpperLimit());
    }

    @Test
    @DisplayName("4: Get value of current count")
    void getCountTest() {
        Counter testCounter = new Counter(5, 10);
        assertEquals(5, testCounter.getCount());
    }

    @Test
    @DisplayName("5a: successfully increment count")
    void incrementSuccess() {
        Counter testCounter = new Counter(5, 10);
        testCounter.increment();
        assertEquals(6, testCounter.getCount());
    }

    @Test
    @DisplayName("5b: unsuccessfully increment count")
    void incrementFail() {
        Counter testCounter = new Counter(10, 10);
        Exception exception = assertThrows(IllegalStateException.class,
            () -> testCounter.increment());
        assertEquals(exception.getMessage(), testCounter.getCount());
    }
}

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
        assertEquals(5, testCounter.getLower());
    }
}

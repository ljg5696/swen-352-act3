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
    void constructCount() {
        Counter testCounter = new Counter(-5, 5);
        assertNotNull(testCounter);
    }
}

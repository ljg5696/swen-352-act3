package edu.rit.swen352.tdd.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the {@link SimpleBankAccount} component.
 */
class SimpleBankAccountTest {
    
    @Test
    @DisplayName("constructor initializes balance to zero")
    void testSimpleBankAccount() {
        SimpleBankAccount account = new SimpleBankAccount();
        assertEquals(0.0f, account.getBalance());
    }
}

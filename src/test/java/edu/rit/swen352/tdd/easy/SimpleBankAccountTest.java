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
        SimpleBankAccount account = new SimpleBankAccount(0.00f);
        assertEquals(0.0f, account.getBalance());
    }

    @Test
    @DisplayName("constructor initializes with a balance")
    void testSimpleBankAccountInitalBalance() {
        SimpleBankAccount account = new SimpleBankAccount(1000.00f);
        assertEquals(1000.0f, account.getBalance());
    }


    @Test
    @DisplayName("get balance returns the correct balance")
    void testGetBalance() {
        SimpleBankAccount account = new SimpleBankAccount(150.0f);
        assertEquals(150.0f, account.getBalance());
    }


    @Test
    @DisplayName("isAccountEmpty returns true when balance is zero")
    void testIsAccountEmptyWhenZero() {
        SimpleBankAccount account = new SimpleBankAccount(0.00f);
        assertEquals(true, account.isAccountEmpty());
    }
}

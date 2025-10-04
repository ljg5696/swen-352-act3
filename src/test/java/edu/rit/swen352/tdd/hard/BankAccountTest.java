package edu.rit.swen352.tdd.hard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the {@link BankAccount} component.
 */
class BankAccountTest {

    @Test
    @DisplayName("1a: Construct BankAccount with given initial balance")
    void constructBankAccount() {
        BankAccount testAccount = new BankAccount(new Money(1000, 0));
        assertNotNull(testAccount);
    }

    @Test
    @DisplayName("1b: Construct BankAccount with no given initial balance")
    void constructEmptyBankAccount() {
        BankAccount testAccount = new BankAccount();
        assertNotNull(testAccount);
    }

}

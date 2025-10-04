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
        BankAccount testAccount = new BankAccount(new Money());
        assertNotNull(testAccount);
    }

}

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

    @Test
    @DisplayName("2: Get current balance of the account")
    void getTestAccountBalance() {
        BankAccount testAccount = new BankAccount(new Money(150, 31));
        assertEquals(new Money(150, 31), testAccount.getBalance());
    }

    @Test
    @DisplayName("3a: Checking if an account with balance 0 is empty")
    void isEmptyBalanceZero() {
        BankAccount testAccount = new BankAccount();
        assertTrue(testAccount.isAccountEmpty());
    }

    @Test
    @DisplayName("3b: Checking if an account with balance 12.0 is empty")
    void isEmptyBalanceNotZero() {
        BankAccount testAccount = new BankAccount(new Money(12, 0));
        assertFalse(testAccount.isAccountEmpty());
    }

}

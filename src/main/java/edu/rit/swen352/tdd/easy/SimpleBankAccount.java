package edu.rit.swen352.tdd.easy;

/**
 * An American bank account that permits deposits and withdrawals.
 * The balance must never be negative.
 *
 * <p>
 * You must implement these features:
 * <ul>
 *   <li>constructor:
 *     <ul>
 *       <li>with both an initial balance as {@code float} value</li>
 *       <li>a no-arg ctor that sets the value to zero</li>
 *     </ul>
 *   </li>
 *   <li>getBalance: returns the current balance</li>
 *   <li>isAccountEmpty(): queries whether the balance is zero</li>
 *   <li>deposit(amount): add a {@code float} amount to the balance</li>
 *   <li>withdraw(amount): subtract a {@code float} amount from the balance</li>
 * </ul>
 */
public class SimpleBankAccount {
    private float balance; 
    
    public SimpleBankAccount(float initialBalance) {
        this.balance = initialBalance;
    }
    

    public float getBalance() {
        return 0.00f;
    }

    public void withdraw(float amount){

    }

    public void deposit(float amount){
        
    }

    public void isAccountEmpty(){
        
    }
}

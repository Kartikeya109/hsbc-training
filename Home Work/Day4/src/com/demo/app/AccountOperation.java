/**
 * 
 */
package com.demo.app;

/**
 * @author Kartikeya
 *
 */
public interface AccountOperation {

	double Deposit(double amt) throws AccountBlockedException;
	double Withdraw(double amt) throws InsufficientBalanceException, AccountBlockedException;
	double getBalance() throws AccountBlockedException;
	void  blockAccount();
}

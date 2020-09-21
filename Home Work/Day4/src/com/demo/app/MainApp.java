/**
 * 
 */
package com.demo.app;

/**
 * @author Kartikeya
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws  InsufficientBalanceException, AccountBlockedException {
		// TODO Auto-generated method stub

			Account acc = new Account(1000,0);
			System.out.println("Current Balance : "+ acc.Deposit(500));
			
			System.out.println("Current Balance : "+acc.Withdraw(1000));
			
			//System.out.println("Current Balance : "+acc.Withdraw(20000));
			
			acc.blockAccount();
			
			System.out.println("Current Balance : "+ acc.Deposit(500));
//			
			System.out.println("Current Balance : "+acc.Withdraw(1000));
	}

}

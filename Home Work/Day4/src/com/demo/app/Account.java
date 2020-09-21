/**
 * 
 */
package com.demo.app;

/**
 * @author Kartikeya
 *
 */
public class Account implements AccountOperation{
	
	double amt;
	int flag;
	
	public Account(double amt,int flag) {
		this.amt = amt;
		this.flag = flag;
	}
	
	public double Deposit(double deposite) throws AccountBlockedException {
		try {
			if(flag==1)
				{
					throw new AccountBlockedException();
				}
		}
		catch(AccountBlockedException e) {
				
			}
			if(deposite>=0 && flag==0) {
				amt += deposite;
			}
		return amt;
	}
	
	public double Withdraw(double withdraw) throws InsufficientBalanceException, AccountBlockedException {
		try {
			if(flag==1) {
				throw new AccountBlockedException();
			}
			if(amt<withdraw || amt==0) {
				
				throw new InsufficientBalanceException();
			}
			else {
				amt -=withdraw;
				return amt;
			}
		}
		catch(AccountBlockedException e) {
			throw new AccountBlockedException();
		}
		catch(InsufficientBalanceException e) {
			throw new InsufficientBalanceException();
		}
	}
	
	public double getBalance() throws AccountBlockedException {
		try{
			if(flag==1) {
				
				throw new AccountBlockedException();
			}	
		}catch(AccountBlockedException e){
			
			throw new AccountBlockedException();
		}
		return amt;
	}
	
	public void blockAccount() {
		if(flag==0) {
			flag=1;   // blocks the account
		}
	}
}

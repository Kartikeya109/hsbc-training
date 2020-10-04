/**
 * 
 */
package com.hsbc.login;

/**
 * @author Kartikeya
 *
 */
public class loginCode {
	
	private String user;
	public loginCode(String user) {
		this.user = user;
	}

	public boolean checkUser(String name) {
		if(name.equalsIgnoreCase(user)) {
			return true;
		}
		return false;
	}
}

/**
 * 
 */
package com.hsbc.tr.spring;

/**
 * @author Kartikeya
 *
 */
public class NoSpringMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Message message = new Message();
		message.setHeader("Lunch Break");
		message.setBody("No Lunch Today...");
		
		Mail mail = new Mail();
		mail.setFromAddress("you@somewhere.com");
		mail.setMessage(message);
		
		System.out.println(mail.getMessage().getBody());
	}

}

/**
 * 
 */
package com.demo.Application;

/**
 * @author Kartikeya
 * The main purpose of this class is to produce messages
 */
public class Producer {
	
	public static void send(String message) {
		System.out.println("Seding message : "+message);
		
		try {
			Thread.sleep(2000);
		} catch(Exception e) {
			System.out.println("Thread is interrupted");
		}
		System.out.println("\n" + message + "Sent ");
	}
}


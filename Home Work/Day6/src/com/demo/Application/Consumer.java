/**
 * 
 */
package com.demo.Application;

/**
 * @author Kartikeya
 *
 */
public class Consumer extends Thread {
	
	private String msg;
	Producer produce;
	
	public Consumer(String msg, Producer produce)
	{
		this.msg = msg;
		this.produce= produce;
	}
	
	public void run() {
		
		synchronized(produce) {
			Producer.send("Hello");
		}
	}
}

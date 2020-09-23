/**
 * 
 */
package com.demo.Interface;

/**
 * @author Kartikeya
 *
 */
public class MainRunnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyRunnable obj1 = new MyRunnable();
		MyRunnable obj2 = new MyRunnable();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.run();
		
		try {
			Thread.sleep(2000);
			t1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		t2.run();
		
	}

}

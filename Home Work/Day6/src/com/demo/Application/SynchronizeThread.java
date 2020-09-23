/**
 * 
 */
package com.demo.Application;

/**
 * @author Kartikeya
 *
 */
public class SynchronizeThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producer produce = new Producer();
		Consumer consume = new Consumer("Good Morning",produce);
		Thread t1 = new Thread(consume);
		Thread t2 = new Thread(consume);
		Thread t3 = new Thread(consume);
		
		t1.start();
		t2.start();
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		try {
			Thread.sleep(1000);
			t3.start();
			t1.join();
		} catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

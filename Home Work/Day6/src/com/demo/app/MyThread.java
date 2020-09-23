/**
 * 
 */
package com.demo.app;

/**
 * @author Kartikeya
 *
 */
public class MyThread extends Thread {

	/**
	 * @param args
	 */
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	
	public static void main(String args[])
	{
		MyThread thread = new MyThread();
		
		for(int i=0;i<10;i++) {
		thread.run();
		}
	}
}

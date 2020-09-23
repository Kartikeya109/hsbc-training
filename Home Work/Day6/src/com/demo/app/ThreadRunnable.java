/**
 * 
 */
package com.demo.app;

/**
 * @author Kartikeya
 *
 */
public class ThreadRunnable {

	/**
	 * @param args
	 */
	
	public class RunnableImpl implements Runnable{
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i = 0 ; i< 10 ; i++) {
			System.out.println("Hello : "+(i+1)+" "+Thread.currentThread().getName());
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object obj =new Object();
		
		Thread t = new Thread (new ThreadRunnable().new RunnableImpl());
		t.start();
	}

}

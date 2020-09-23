/**
 * 
 */
package com.demo.Interface;

/**
 * @author Kartikeya
 *
 */
public class MyRunnable implements Runnable{
	
	@Override
	public void run() {
		
		System.out.println("Thread Started Running.....");
		for(int i = 0 ; i < 10 ; i++)
		{
			System.out.println("Number is : " + i+1);
		}
		System.out.println("Thread Stoped Running.....");
	}

}

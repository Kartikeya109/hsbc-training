/**
 * 
 */
package com.demo.io.entity;

import java.io.RandomAccessFile;

/**
 * @author Kartikeya
 *
 */
public class RAFDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		RandomAccessFile rf = new RandomAccessFile("d:\\temp\\io\\lion.txt", "r");
		rf.seek(100);
		
		int x = 0;
		while((x=rf.read())!=-1)
		{
			System.out.println((char)x);
		}
	}

}

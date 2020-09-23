/**
 * 
 */
package com.demo.io.entity;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * @author Kartikeya
 *
 */
public class ReadData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("d:\\mydat.dat");
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
			while(true) {
				int id = dis.readInt();
				String name = dis.readUTF();
				String city = dis.readUTF();
				double sal = dis.readDouble();
				System.out.println("Id "+id+" Name "+name+" City "+city+" Salary "+sal);
			}
		} catch(Exception e) {
			System.out.println("Caught an exception");
		}
	}

}

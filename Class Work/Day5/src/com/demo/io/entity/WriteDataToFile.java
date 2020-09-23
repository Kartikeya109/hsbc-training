/**
 * 
 */
package com.demo.io.entity;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * @author Kartikeya
 *
 */
public class WriteDataToFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		FileOutputStream fos = new FileOutputStream("d:\\mydat.dat",true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.writeInt(100);
		dos.writeUTF("Kartikeya");
		dos.writeUTF("Hello");
		dos.writeDouble(5600.012);
		
		dos.close();
	}

}

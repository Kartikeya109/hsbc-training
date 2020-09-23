/**
 * 
 */
package com.demo.io.seri;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.demo.io.entity.Emp;

/**
 * @author Kartikeya
 *
 */
public class MyEmpDeserializer {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("emp.ser");
		ObjectInputStream objIn = new ObjectInputStream(fis);
		
		try {
			//Object obj = objIn.readObject();
		//System.out.println(obj.getClass().getName());
		
			while(true) {
				Emp e = (Emp) objIn.readObject();
		
				System.out.println(e.getEmpId()+" "+e.getName());
			}
		}catch(EOFException e) {
			System.out.println("Done......");
		}
		objIn.close();
	}

}

/**
 * 
 */
package com.demo.io.seri;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.demo.io.entity.Emp;
import java.io.Serializable;

/**
 * @author Kartikeya
 *
 */
public class MyEmpSerializer {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileOutputStream fos = new FileOutputStream("emp.ser");
		ObjectOutputStream objOut = new ObjectOutputStream(fos);
		
		Emp[] empList = new Emp[10];
		
		for(int i=0;i<10;i++) {
			Emp emp = new Emp(100+i+1, "Scott", "London",6500+1+i);
			//empList[i] new Emp();
		}
			objOut.writeObject(emp);
		
		objOut.close();
		
		System.out.println("Emp Serialized...");
	}
}

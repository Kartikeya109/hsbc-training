/**
 * 
 */
package com.demo.io.entity;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Kartikeya
 *
 */
public class ReadWriteEmp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FileReader fr = null;
		//BufferedReader br = new BufferedReader(fr);
		
		try {
			FileReader fr = new FileReader("d:\\temp\\io\\emp.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while((line = br.readLine())!=null) {
				
				//String line = br.readLine();
				System.out.println(line);
				String[] cols = line.split(",");
				int id = Integer.parseInt(cols[0]);
				double sal = Double.parseDouble(cols[3]);
				Emp e = new Emp(id,cols[1],cols[2],sal);
				System.out.println(e.getEmpId()+ " "+e.getName());
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch(IOException e)
		{
			System.out.println(e);
		} 
		
		
	}

}

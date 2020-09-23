/**
 * 
 */
package com.demo.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import com.demo.io.entity.Emp;

//import jdk.internal.org.jline.utils.InputStreamReader;

/**
 * @author Kartikeya
 *
 */
public class EmpDaoImpl implements EmpDao {
	
	@Override
	public String save(Emp e){
		
		FileReader fr = null;
		FileWriter fw = null;
		try {
				
				String message = "emp not written";
				String empData = e.getEmpId() +","+e.getName()+","+e.getCity()+","+e.getSalary();
				fr.write(empData);
				message = "Emp Written to file";
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				if(fr!=null) {
					fr.close();
				}
			} catch(IOException ee) {
				ee.printStackTrace();
			}
		}
		
		return null;
	}
	
}

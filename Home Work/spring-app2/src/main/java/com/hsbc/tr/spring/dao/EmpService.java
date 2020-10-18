/**
 * 
 */
package com.hsbc.tr.spring.dao;

import com.hsbc.tr.spring.entity.Emp;

/**
 * @author Kartikeya
 *
 */
public class EmpService {

	private EmpDao dao;
	
	public void setDao(EmpDao dao) {
		this.dao = dao;
	}
	
	public String registerEmp(int id, String name, String city, double salary)
	{
		String response = dao.save(new Emp(id,name,city,salary));
		return response;
	}
}

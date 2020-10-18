/**
 * 
 */
package com.hsbc.tr.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.hsbc.tr.spring.entity.Emp;

/**
 * @author Kartikeya
 *
 */
@Service
public class EmpService {

	@Autowired
	@Qualifier("mockDao2")
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

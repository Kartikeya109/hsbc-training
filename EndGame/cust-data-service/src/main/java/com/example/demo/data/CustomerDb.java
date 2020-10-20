/**
 * 
 */
package com.example.demo.data;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customer;


/**
 * @author Kartikeya
 *
 */
@Repository
public class CustomerDb {
	
	private static HashMap<Integer, Customer> db = new HashMap<>();
	
	public static HashMap<Integer, Customer> getDb(){
		return db;
	}
	public static void setDb(HashMap<Integer, Customer> db){
		CustomerDb.db = db;
	}
	
	public CustomerDb() {
		db.put(100, new Customer(100, "Kartikeya", 123456789));
		db.put(101, new Customer(101, "Shukla1", 123456789));
		db.put(102, new Customer(102, "Shukla2", 123456789));
		db.put(103, new Customer(103, "Shukla3", 123456789));
		db.put(104, new Customer(104, "Shukla4", 123456789));
	}

}
/**
 * 
 */
package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.data.CustomerDb;
import com.example.demo.entity.Customer;


/**
 * @author Kartikeya
 *
 */
@RestController
@CrossOrigin
public class CustomerRestController {
	
	@Autowired
	private CustomerDb datastore;
	
	@GetMapping(path = "/customer/find/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity getCustomerDetails(@PathVariable("id") int id,HttpServletRequest request)
	{
		if (datastore.getDb().containsKey(id)) {
			System.out.println("Customer was found successfully");
			return ResponseEntity.ok(datastore.getDb().get(id));
		} else {
			System.out.println("Customer not found");
			return ResponseEntity.ok("Customer Not Found");
		}
	}
	
	@GetMapping(path = "/custAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Customer>> listAllCustomer() {
		System.out.println("ListAll called");
		ArrayList<Customer> arr = new ArrayList<>(datastore.getDb().values());
		return ResponseEntity.ok(arr);
	}
	
	@PostMapping(path="/cust/add",produces = MediaType.TEXT_PLAIN_VALUE,consumes =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addCust(@RequestBody  Customer e){
		if(CustomerDb.getDb().containsKey(e.getCustomerId())) {
			return ResponseEntity.ok("Customer Already Exists...."); 
		}else {
			CustomerDb.getDb().put(e.getCustomerId(), e);
			return ResponseEntity.ok("Customer saved successfully");
		}
	}
}

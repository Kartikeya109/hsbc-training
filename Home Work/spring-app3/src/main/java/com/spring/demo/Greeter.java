package com.spring.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 */

/**
 * @author Kartikeya
 *
 */
@Service
public class Greeter {
	
	@Autowired
	Greeting greeting;
	
	public void greet() {
		System.out.println(greeting.greetMessage());
	}
	
}

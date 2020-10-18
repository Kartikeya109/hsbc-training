package com.spring.demo;

import org.springframework.stereotype.Repository;

/**
 * 
 */

/**
 * @author Kartikeya
 *
 */
@Repository
public class GoodMorning implements Greeting {
	
	@Override
	public String greetMessage() {
		return "Good Morning to all";
	}
}

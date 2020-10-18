/**
 * 
 */
package com.demo.computer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Kartikeya
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ComputerService cs = (ComputerService) ctx.getBean(ComputerService.class);
		System.out.println(cs.getSpecs());
	}

}

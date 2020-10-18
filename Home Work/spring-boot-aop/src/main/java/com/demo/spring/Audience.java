/**
 * 
 */
package com.demo.spring;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Kartikeya
 *
 */
@Component
@Aspect
public class Audience {
	
	@Before("execution(* com.demo.spring.Performer.perform(..))")
	public void takeSeat() {
		System.out.println("Audience taking seat..........");
	}
	@Before("execution(* com.demo.spring.Performer.perform(..))")
	public void switchOffMobile() {
		System.out.println("Audience switched off their mobiles..........");
	}
	
	@AfterReturning("execution(* com.demo.spring.Performer.perform(..))")
	public void apploaud() {
		System.out.println("Clap Clap Clap ............");
	}
}

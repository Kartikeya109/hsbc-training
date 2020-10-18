/**
 * 
 */
package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Kartikeya
 *
 */
@Service
public class Singer implements Performer {

	@Autowired
	Audience audience;
	@Override
	public void perform() {
		audience.takeSeat();
		audience.switchOffMobile();
		System.out.println("Singer is now Singing............");
		audience.apploaud();
	}
}

/**
 * 
 */
package com.demo.project;

/**
 * @author Kartikeya
 *
 */
public class App2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Panasonic p = new Panasonic();
		
		System.out.println(p.condition());
		
		LG l = new LG();
		System.out.println(l.condition());
		
		Sony s = new Sony();
		System.out.println(s.condition());
		
		Nokia nokia = new Nokia();
		System.out.println(nokia.condition());
		System.out.println(nokia.years());
		
	}

}

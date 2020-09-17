/**
 * 
 */
package com.demo.project;

/**
 * @author Kartikeya
 *
 */
class Instance{
	
}

class sub extends Instance{
	
}

public class InstanceOf {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance  obj = new Instance();
		
		if(obj instanceof Instance) {
			System.out.println("Yes obj is an Instance class object");
		}
		else {
			System.out.println("Not an object of Instance class");
		}
		
		if(obj instanceof sub) {
			System.out.println("yes obj is an object of sub");
		}
		else {
			System.out.println("Not an object of sub");
		}
		
	}

}

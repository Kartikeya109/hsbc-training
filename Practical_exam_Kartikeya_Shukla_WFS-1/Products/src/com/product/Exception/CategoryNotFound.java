/**
 * 
 */
package com.product.Exception;

/**
 * @author Kartikeya
 * User defined exception for wrong category
 */
public class  CategoryNotFound extends Exception {

	public CategoryNotFound() {
		System.out.println("Wrong Category entered");
	}
}

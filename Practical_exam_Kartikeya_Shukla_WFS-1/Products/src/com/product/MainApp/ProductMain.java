/**
 * 
 */
package com.product.MainApp;

import com.product.Dao.ProductDao;
import com.product.DaoImpl.ProductDaoImpl;
import com.product.Service.ProductService;

/**
 * @author Kartikeya
 * The main layer
 */
public class ProductMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ProductDao dao = new ProductDaoImpl();
		ProductService ps = new ProductService(dao);
		
		String category = args[0];
		
		ps.showTopItems(category);
	}

}

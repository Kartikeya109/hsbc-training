/**
 * 
 */
package com.product.Service;

import com.product.Dao.ProductDao;


/**
 * @author Kartikeya
 * This is the service layer, here the view layer implementation is done
 */
public class ProductService {

	
	private ProductDao dao;
	
	public ProductService(ProductDao dao) {
		this.dao = dao;
	}
	
	public void showTopItems(String category) {
		dao.topItems(category);
	}
}

/**
 * 
 */
package com.product.Other;

import java.util.Comparator;

import com.product.entity.ProductFood;

/**
 * @author Kartikeya
 *  for sorting food entity
 */
public class CustomComparator implements Comparator<ProductFood> {
	
    @Override
    public int compare(ProductFood o1, ProductFood o2) {
        return (o2.getQuantity() - o1.getQuantity()) ;
    }
}
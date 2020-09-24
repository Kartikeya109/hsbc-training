/**
 * 
 */
package com.product.Other;

import java.util.Comparator;

import com.product.entity.ProductApparel;
import com.product.entity.ProductFood;

/**
 * @author Kartikeya
 * for sorting apparel entity
 */
public class CustomComparatorApparel implements Comparator<ProductApparel> {
	
    @Override
    public int compare(ProductApparel o1, ProductApparel o2) {
        return o2.getQuantity() - o1.getQuantity() ;
    }
}
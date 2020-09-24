/**
 * 
 */
package com.product.Other;

import java.util.Comparator;

import com.product.entity.ProductElectronics;
import com.product.entity.ProductFood;

/**
 * @author Kartikeya
 * for sorting electronics entity
 */
public class CustomComparatorElectro implements Comparator<ProductElectronics> {
	
    @Override
    public int compare(ProductElectronics o1, ProductElectronics o2) {
        return o2.getQuantity() - o1.getQuantity() ;
    }
}
/**
 * 
 */
package com.product.DaoImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.product.Dao.ProductDao;
import com.product.Exception.CategoryNotFound;
import com.product.Other.CustomComparator;
import com.product.Other.CustomComparatorApparel;
import com.product.Other.CustomComparatorElectro;
import com.product.entity.ProductApparel;
import com.product.entity.ProductElectronics;
import com.product.entity.ProductFood;

/**
 * @author Kartikeya
 *
 * Here the ArrayList collection is used to store the data and return the value 
 */
public class ProductDaoImpl implements ProductDao {

	//Array list for the items
	static List<ProductElectronics> electronics = new ArrayList<>();
	static List<ProductFood> food = new ArrayList<>();
	static List<ProductApparel> apparel = new ArrayList<>();
	
	// implements the Dao of Products
	public ProductDaoImpl() {
		
		//dummy values to test
		
		food.add(new ProductFood(101,"Milk",50,"10/10/2020","12/10/2020","Veg",40));
		food.add(new ProductFood(102,"Bread",60,"10/10/2020","12/10/2020","Veg",50));
		food.add(new ProductFood(103,"Chocalate",70,"10/10/2020","12/10/2020","Veg",60));
		food.add(new ProductFood(104,"Juice",80,"10/10/2020","12/10/2020","Veg",70));
		food.add(new ProductFood(105,"Rice",90,"10/10/2020","12/10/2020","Veg",80));
		
		electronics.add(new ProductElectronics(106,"TV",47000,24,10));
		electronics.add(new ProductElectronics(107,"Led",47000,24,20));
		electronics.add(new ProductElectronics(108,"LCD",47000,24,30));
		electronics.add(new ProductElectronics(109,"Mobile",47000,24,40));
		electronics.add(new ProductElectronics(110,"Laptop",47000,24,50));
		
		apparel.add(new ProductApparel(111, "T-Shirt", 599, 85, "Cotton", 5));
		apparel.add(new ProductApparel(112, "Shirt", 599, 85, "Cotton", 6));
		apparel.add(new ProductApparel(113, "Sleeve", 599, 85, "Cotton", 7));
		apparel.add(new ProductApparel(114, "Full-Shirt", 599, 85, "Cotton", 8));
		apparel.add(new ProductApparel(115, "Formals", 599, 85, "Cotton", 9));
		
	}
	
	// this gives the top 3 list in the items based on the quantity
	
	@Override
	public void topItems(String category) {
		System.out.println("Top 3 items"+ category + " category are");
		
		
		// if category by user entered is food then show the top 3 quantities in the food list
		
		try {
			
		
		if(category.equalsIgnoreCase("food"))
		{
			// Sort technique in descending order
			Collections.sort(food,new CustomComparator());
			
			int c = 0 ;
			System.out.println("Item Code \t Item Name \t Quantity \t Vegetarian");
			for(ProductFood e : food)
			{
				c++;
				if(c>=3) {
					break; // breaks whenever 3 of the products are printed
				}
				System.out.println(e.getItemCode()+"\t\t"+e.getItemName()+"\t\t"+e.getQuantity()+"\t\t"+e.getVeg());
			}
			
		}
		else if(category.equalsIgnoreCase("electronics"))
		{
			// if category by user entered is food then show the top 3 quantities in the food list
			
			// Sort technique in descending order
			Collections.sort(electronics,new CustomComparatorElectro());
			
			// c variable to print upto 3 only
			int c = 0 ;
			System.out.println("Item Code \t Item Name \t Quantity \t Warranty");
			for(ProductElectronics e : electronics)
			{
				c++;
				if(c>=3) {
					break; // breaks whenever 3 of the products are printed
				}
				System.out.println(e.getItemCode()+"\t\t"+e.getProdName()+"\t\t"+e.getWarranty());
				
			}
			
		}
		else if(category.equalsIgnoreCase("apparel"))
		{
			
			// if category by user entered is food then show the top 3 quantities in the food list
			
			// Sort technique in descending order
			Collections.sort(apparel,new CustomComparatorApparel());
			
			// c variable to print upto 3 only
			int c = 0 ;
			System.out.println("Item Code \t Item Name \t Quantity Sold \t Size \t Material");
			for(ProductApparel e : apparel)
			{
				c++;
				if(c>=3) {
					break; // breaks whenever 3 of the products are printed
				}
				System.out.println(e.getItemCode()+"\t\t"+e.getItemName()+"\t\t"+e.getQuantity()+"\t\t"+e.getSize()+"\t\t"+e.getMaterial());
			}
			
		}
		else {
			throw new CategoryNotFound();
			//generate error if wrong category has been entered
		}
		} catch (CategoryNotFound e) {
			e.printStackTrace();
		}
	}
	
}

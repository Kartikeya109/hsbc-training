/**
 * 
 */
package com.product.entity;

/**
 * @author Kartikeya
 *This is the entity of food
 */
public class ProductFood {

	private int itemCode;
	private String itemName;
	private double price;
	private String dateOfManufacture;  
	private String dateOfExpiry;
	private String Veg;
	private int quantity;
	
	public ProductFood() {
		
	}
	
	public ProductFood(int itemCode, String itemName, double price, String dateOfManufacture, String dateOfExpiry, String Veg, int quantity) {
		
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.Veg =Veg;
		this.quantity = quantity;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(String dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getVeg() {
		return Veg;
	}

	public void setVeg(String veg) {
		Veg = veg;
	}
	
	
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public boolean equals(Object obj) {
		
		ProductFood food = (ProductFood) obj;
		
		if(this.itemCode==food.itemCode) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.itemCode;
	}
	
}

/**
 * 
 */
package com.product.entity;

/**
 * @author Kartikeya
 * This is entity of apparel
 */
public class ProductApparel {
	
	private int itemCode;
	private String itemName;
	private double price;
	private int size;
	private String material;
	private int quantity;
	
	public ProductApparel(int itemCode, String itemName, double price, int size, String material, int quantity) {
	
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price =price;
		this.size = size;
		this.material = material;
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	@Override
	public boolean equals(Object obj) {
		
		ProductApparel apparel = (ProductApparel) obj;
		
		if(this.itemCode== apparel.itemCode) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.itemCode;
	}
	
}

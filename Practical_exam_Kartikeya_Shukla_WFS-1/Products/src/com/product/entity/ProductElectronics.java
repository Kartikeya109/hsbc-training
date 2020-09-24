/**
 * 
 */
package com.product.entity;

/**
 * @author Kartikeya
 *This is the entity of Electronic
 */
public class ProductElectronics {

	private int itemCode;
	private String prodName;
	private double price;
	private int warranty;
	private int quantity;
	
	public ProductElectronics() {
		
	}
	
	public ProductElectronics (int itemCode, String prodName, double price, int warranty,int quantity) {
		this.itemCode = itemCode;
		this.prodName = prodName;
		this.price = price;
		this.warranty =warranty;
		this.quantity =quantity;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		ProductElectronics prod = (ProductElectronics) obj;
		
		if(this.itemCode==prod.itemCode) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.itemCode;
	}
	
}


/**
 * 
 */
package com.project;

/**
 * @author Kartikeya
 *
 */
public class JsonFile {

	/**
	 * @param args
	 */
	
	private int custId;
	private String custName;
	private String addr;
	private double accBalance;
	
	public JsonFile(int custId, String custName, String addr, double accBalance) {
		this.custId = custId;
		this.custName = custName;
		this.addr = addr;
		this.accBalance = accBalance;
	}
	
	public void Json()
	{
		System.out.println("[custId : "+
				custId+ ", custName :"+ custName+ 
				", addr :"+ addr + ", accBalance :" +
				accBalance+"]"
				);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JsonFile obj = new JsonFile(121,"Kartikeya","Allahabad",1200000);
		obj.Json();
	}

}

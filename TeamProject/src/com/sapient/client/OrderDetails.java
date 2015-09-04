/**
 * 
 */
package com.sapient.client;

import java.util.ArrayList;

/**
 * @author cgarg1
 *
 */
public class OrderDetails {

	private int quantity;
	private int taxStatus;
	Order orderDetail;
	ArrayList<Item> item = new ArrayList<Item>();
	public int getQuantity() {
		return quantity;
		
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTaxStatus() {
		return taxStatus;
	}
	public void setTaxStatus(int taxStatus) {
		this.taxStatus = taxStatus;
	}
	public Order getOrderDetail() {
		return orderDetail;
	}
	public void setOrderDetail(Order orderDetail) {
		this.orderDetail = orderDetail;
	}
	
	public ArrayList<Item> getItem() {
		return item;
	}
	public void setItem(ArrayList<Item> item) {
		this.item = item;
	}
	public int calcSubTotal()
	{
		return quantity;
		
	}
	public int calcWeight(){
		return quantity;	
	}
	
}

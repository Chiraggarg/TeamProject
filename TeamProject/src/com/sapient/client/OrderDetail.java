/**
 * 
 */
package com.sapient.client;

import com.sapient.client.Item;
/**
 * @author cgarg1
 *
 */
public class OrderDetail {

	private int quantity;
	private int taxStatus;
	Order orderDetail;
	private Item item;
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
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public double calcSubTotal()
	{	
		double subTotal = item.getPriceForQuantity() * getQuantity() ; 
		return subTotal;
		
	}
	public double calcWeight(){
		double weight = item.getShippingWeight() * getQuantity();
		return weight;	
	}
	
}

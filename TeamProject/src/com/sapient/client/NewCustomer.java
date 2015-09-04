/**
 * 
 */
package com.sapient.client;

import java.util.ArrayList;

/**
 * @author span42
 *
 */
public class NewCustomer {
	
	private String name;
	private String address;
	ArrayList<Order>  order = new ArrayList<Order>();
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Order> getOrder() {
		return order;
	}

	public void setOrder(ArrayList<Order> order) {
		this.order = order;
	}
	
	
	

}

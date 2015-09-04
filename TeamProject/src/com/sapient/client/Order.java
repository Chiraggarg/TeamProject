package com.sapient.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Order {
	private SimpleDateFormat date;
	private String status;
	private NewCustomer customer;
	private Payment payment;
	private ArrayList<OrderDetail> orderdetail;
	Iterator<OrderDetail> iterator;

	public SimpleDateFormat getDate() {
		String date2 =new Date().toString();
		date = new SimpleDateFormat("EEE MMM dd zzz yyyy");
		try {
			System.out.println(date.parseObject(date2));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}

	public void setDate(SimpleDateFormat date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public NewCustomer getCustomer() {

		return this.customer;

	}

	public void setCustomer(NewCustomer customer) {
		this.customer = customer;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public ArrayList<OrderDetail> getOrderdetail() {
		return orderdetail;
	}

	public void setOrderdetail(ArrayList<OrderDetail> orderdetail) {
		this.orderdetail = orderdetail;
	}

	public double calcTax() {

		return 0.0;
	}

	public double calcTotal() {
		
		iterator = orderdetail.listIterator();
		double totalValue = 0.0;
		while (iterator.hasNext()) {
			totalValue += iterator.next().calcSubTotal();
		}

		return totalValue;
	
	}

	public double calcTotalWeight() {

		iterator = orderdetail.listIterator();
		double totalWeight = 0.0;
		while (iterator.hasNext()) {
			totalWeight += iterator.next().calcWeight();
		}

		return totalWeight;
	}
}

package com.sapient.client.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.ListIterator;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.Item;
import com.sapient.client.Order;
import com.sapient.client.OrderDetail;

public class OrderTest {

	ArrayList<OrderDetail> orderDetailsOfOrder = new ArrayList<OrderDetail>();
	Order orderOfCustomer = new Order();

	@Before
	public void setUp() throws Exception {
		// OrderDetail orderDetailof = new OrderDetail();
		// Item itemOf = new Item();
		orderDetailsOfOrder.add(new OrderDetail());
		orderDetailsOfOrder.add(new OrderDetail());
		orderDetailsOfOrder.add(new OrderDetail());

		orderOfCustomer.setOrderdetail(orderDetailsOfOrder);
		// orderDetailof.setQuantity(2);
		// orderDetailof.setItem(itemOf);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetDate() {
	}

	@Test
	public final void testSetDate() {
	}

	@Test
	public final void testGetStatus() {
	}

	@Test
	public final void testSetStatus() {
	}

	@Test
	public final void testGetCustomer() {
	}

	@Test
	public final void testSetCustomer() {
	}

	@Test
	public final void testGetPayment() {
	}

	@Test
	public final void testSetPayment() {
	}

	@Test
	public final void testGetOrderdetail() {
	}

	@Test
	public final void testSetOrderdetail() {

	}

	@Test
	public final void testCalcTax() {
	}

	@Test
	public final void testCalcTotal() {
		double totalOfOrder = 0.0;
		ListIterator<OrderDetail> iterator = orderOfCustomer.getOrderdetail()
				.listIterator();
		while (iterator.hasNext()) {
			OrderDetail x = iterator.next();
			x.setItem(new Item());
			x.getItem().setPriceForQuantity(4500);
			x.setQuantity(2);
		}

		totalOfOrder = orderOfCustomer.calcTotal();
		double expected = 27000;
		assertEquals(expected, totalOfOrder, 0.5);

	}

	@Test
	public final void testCalcTotalWeight() {
		double totalOfOrder = 0.0;
		ListIterator<OrderDetail> iterator = orderOfCustomer.getOrderdetail()
				.listIterator();
		while (iterator.hasNext()) {
			OrderDetail x = iterator.next();
			x.setItem(new Item());
			x.getItem().setShippingWeight(20);
			x.setQuantity(2);
		}

		totalOfOrder = orderOfCustomer.calcTotalWeight();
		double expected = 120;
		assertEquals(expected, totalOfOrder, 0.5);

	}

}

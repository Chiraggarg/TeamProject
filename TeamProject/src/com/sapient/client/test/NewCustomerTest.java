package com.sapient.client.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.NewCustomer;
import com.sapient.client.Order;

public class NewCustomerTest {
	NewCustomer newCustomer = new NewCustomer();
	ArrayList<Order> order = new ArrayList<Order>();
	
	@Before
	public void setUp() throws Exception {
	order.add(new Order());
	}

	@After
	public void tearDown() throws Exception {
		newCustomer =null;
	}

	@Test
	public final void testGetName() {

		assertNull(newCustomer.getAddress());
		newCustomer.setName("Chirag");
		assertEquals("Chirag",newCustomer.getName());
		
	}

	@Test
	public final void testSetName() {
		String name = "Siddhant";
		newCustomer.setName(name);
		assertEquals("Siddhant",newCustomer.getName());
		newCustomer.setName(null);
		assertNull(newCustomer.getName());
		
		
	}

	@Test
	public final void testGetAddress() {
	assertNull(newCustomer.getAddress());
	newCustomer.setAddress("Dundahera Gurgaon");
	assertEquals("Dundahera Gurgaon",newCustomer.getAddress());
	}

	@Test
	public final void testSetAddress() {
		String address = "Sapient Nitro,Dundahera Road,Gurgaon";
		newCustomer.setAddress(address);
		assertEquals("Sapient Nitro,Dundahera Road,Gurgaon",newCustomer.getAddress());
		newCustomer.setAddress(null);
		assertNull(newCustomer.getAddress());
	}

	@Test
	public final void testGetOrder() {
		order.get(0);
		
	}

	@Test
	public final void testSetOrder() {
	newCustomer.setOrder(order);
	assertTrue(newCustomer.getOrder().get(0) instanceof Order);
	
	
	}

}
